package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        System.out.println(lowerBound + "|" + upperBound);
        for (int num : sourceList) {
            System.out.println(num);
            treeSet.add(num * num);
        }
        return treeSet.subSet(lowerBound, true,upperBound, true);
    }
}
