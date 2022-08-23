package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int parseFirst = Integer.parseInt(a);
        int parseSecond = Integer.parseInt(b);
        int first = 5 * (parseFirst * parseFirst) + 3;
        int second = 5 * (parseSecond * parseSecond) + 3;

        return first == second ? parseFirst - parseSecond : first - second;
    }
}
