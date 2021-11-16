/*
 * made by gintsmis
 */
package com.gints.binaryserchtree;

/**
 */
public class BinarySearchTree {

    public static void main(String[] args) throws Exception {
        EmptyBstClass n = new EmptyBstClass();
        NonEmptyBST d = new NonEmptyBST(5);
        Tester.checkIsEmpty(n);
        Tester.checkIsEmpty(d);
        Tester.checkAddMemberCardinality(n, 5);
        Tester.checkAddMemberCardinality(d, 5);
        Tester.checkAddMemberCardinality(d, 6);

        int tests = 1000;
        for (int i = 0; i < tests; i++) {
            Tree t;
            if (i % 10 == 0) {
                t = Tester.rndTree(0);
            } else {
                t = Tester.rndTree(10);
            }
            Tester.checkAddMemberCardinality(t, i);
        }
    }

}
