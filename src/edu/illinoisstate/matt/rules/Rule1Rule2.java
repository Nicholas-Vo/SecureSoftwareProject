package edu.illinoisstate.matt.rules;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Rule1Rule2 {

    public static void unsafeFunction(Integer value) throws NullPointerException {
        if (value == null) {
            throw new NullPointerException("Value is null\n");
        }
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Rule1Rule2.class.getName());

        try {
            unsafeFunction(null);
        } catch (NullPointerException npe) {
            // This will show any possible security info in the terminal.
            System.err.println(npe);
        }

        try {
            unsafeFunction(null);
        } catch (NullPointerException npe) {
            // This allows us a better error logging system, more specfic to a developer and more obfuscated to an attacker.
            logger.log(Level.SEVERE, "Error encountered running unsafe function.");
        }
    }


}
