package level1.exercise2.model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListReverImplement implements ListReverser {

    @Override
    public <T> List<T> reverseList(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        ListIterator<T> iterator = list.listIterator(list.size());

        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }

        return reversedList;
    }
}

