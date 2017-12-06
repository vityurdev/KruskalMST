package com.vityur;

import java.util.ArrayList;
import java.util.HashSet;

public class VerticesSetsArray extends ArrayList<HashSet<Integer>> {
    public void mergeSetsWithElements(Integer element1, Integer element2) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (HashSet<Integer> hashSet : this) {
            if (hashSet.contains(element1))
                hashSet1.addAll(hashSet);

            if (hashSet.contains(element2))
                hashSet2.addAll(hashSet);
        }

        this.remove(hashSet1);
        this.remove(hashSet2);

        HashSet<Integer> mergedHashSet = new HashSet<>();
        mergedHashSet.addAll(hashSet1);
        mergedHashSet.addAll(hashSet2);

        this.add(mergedHashSet);
    }

    public boolean areInDifferentSets(Integer element1, Integer element2) {
        for (HashSet<Integer> hashSet : this) {
            if (hashSet.contains(element1) && hashSet.contains(element2))
                return false;
        }
        return true;
    }
}
