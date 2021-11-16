/*
 * made by gintsmis
 */
package com.gints.binaryserchtree;

import java.util.Random;

/**
 */
public class Tester {

    //random integers
    public static int rndInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    //random binary serch tree
    public static Tree rndTree(int count) {
        if (count == 0) {
            return new EmptyBstClass();
        } else {
            return rndTree(count - 1).add(rndInt(0, 50));
        }
    }

    public static void checkIsEmpty(Tree t) throws Exception {
        // if the tree is an instance of EmptyBST ---> t.isEmpty---> true
        // if the tree is an instance of NonEmpty---> t.isEmpty--->false
        if (t instanceof EmptyBstClass) {
            if (!t.isEmpty()) {
                throw new Exception("All is not good emtybstclass tree is not empty");
            } else {
                System.out.println("Everything is ready to work!");
            }
        } else if (t instanceof NonEmptyBST) {
            if (t.isEmpty()) {

                throw new Exception("All is not good NonEmpty tree is empty");
            }
        }
    }

    public static void checkAddMemberCardinality(Tree t, int x) throws Exception {
        int nT = (t.add(x)).cardinality();
        // Either something was added and the cardinality increased by one
        if (nT == (t.cardinality() + 1)) {
            if (t.member(x)) {
                throw new Exception("The cardinality increased by 1, but the thing"
                        + "that was added was already a member of the tree ");
            }
        } else if (nT == t.cardinality()) {
            if (!t.member(x)) {
                throw new Exception("The cardinality didn't increased by 1, but"
                        + "we added a new thing");
            }
        } else {
            throw new Exception("Something is wrong with our programm");
        }
        //Or the thing was added was already there and therefor not really added
        // so the cardinality stayed the same
    }
}
