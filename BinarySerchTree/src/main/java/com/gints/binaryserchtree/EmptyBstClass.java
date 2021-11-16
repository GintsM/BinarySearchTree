/*
 * made by gintsmis
 */
package com.gints.binaryserchtree;

/**
 */
public class EmptyBstClass<D extends Comparable> implements Tree<D> {

    public EmptyBstClass() {

    }

    public boolean isEmpty() {
        return true;
    }

    public int cardinality() {
        return 0;
    }

    public boolean member(D elt) {
        return false;
    }

    public NonEmptyBST<D> add(D elt) {
        return new NonEmptyBST<D>(elt);
    }

}
