package edu.illinoisstate.nickbeard;

public class rec2Correct {
    private static final int baseHealth = 10;
    private static final int difficultyModifier = 5;
    //these constants allow for calculations later in the program to occur smoothly and those looking in will be able
    //to determine the context behind what they mean and are doing

    public void determineEnemyHealth(int baseHealth) {

        int enemyHealth = 20 * baseHealth - difficultyModifier;
        int playerHealth = 5 * baseHealth - difficultyModifier;
        int npcHealth = 2000 * baseHealth - difficultyModifier;
        //all these calculations can be misunderstood by others who look at it, as they won't have the context for the
        //numbers and what they mean. And if those constants need to be changed at some point, the only need to be changed once
        //and all calculations will continue to function without editing every single one
    }
}
