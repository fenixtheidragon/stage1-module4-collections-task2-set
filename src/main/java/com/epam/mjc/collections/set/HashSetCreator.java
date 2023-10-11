package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : sourceList) {
            if (num % 2 != 0) {
                hashSet.add(num);
                hashSet.add(num * 2);
            } else {
                while (num % 2 == 0) {
                    hashSet.add(num);
                    num /= 2;
                }
                hashSet.add(num);
            }
        }
        return hashSet;
    }
}
