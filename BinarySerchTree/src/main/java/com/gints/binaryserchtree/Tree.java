/*
 * made by gintsmis
 */
package com.gints.binaryserchtree;

/**
 *
 * @author User
 */
public interface Tree<D extends Comparable> {

    public boolean isEmpty();

    public int cardinality();

    public boolean member(D elt);

    public NonEmptyBST<D> add(D elt);

}
