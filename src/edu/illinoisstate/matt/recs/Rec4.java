package edu.illinoisstate.matt.recs;

public class Rec4 {

    public static void main(String[] args) {
        CryptographyKey aKey = new CryptographyKey("Nick's key");
        CryptographyKey anotherKey = new CryptographyKey("Matt's key");

        boolean isEqual = checkIfEqualNonCompliant(aKey, anotherKey);

        boolean isEqualCompliant = checkIfEqualCompliant(aKey, anotherKey);
    }

    private static boolean checkIfEqualNonCompliant(CryptographyKey firstKey, CryptographyKey secondKey) {
        return firstKey.equals(secondKey);
    }

    private static boolean checkIfEqualCompliant(CryptographyKey firstKey, CryptographyKey secondKey) {
        if (firstKey.equals(secondKey)) {
            return true;
        }

        if (firstKey.getEncoded() == secondKey.getEncoded()) {
            return true;
        }

        /*
        Additional checks would go here
         */
        return false;
    }

    /*
    Example class
     */
    static class CryptographyKey {
        private final String name;

        public CryptographyKey(String name) {
            this.name = name;
        }

        public Object getEncoded() {
            return null;
        }

    }

}
