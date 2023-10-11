package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> resultingSet = new HashSet<>();
        HashSet<String> firstSourceSet = new HashSet<>(firstSet);
        HashSet<String> thirdSourceSet = new HashSet<>(thirdSet);

        firstSourceSet.retainAll(secondSet);
        firstSourceSet.removeAll(thirdSet);
        thirdSourceSet.removeAll(firstSet);
        thirdSourceSet.removeAll(secondSet);
        resultingSet.addAll(firstSourceSet);
        resultingSet.addAll(thirdSourceSet);

        return resultingSet;
    }
}
