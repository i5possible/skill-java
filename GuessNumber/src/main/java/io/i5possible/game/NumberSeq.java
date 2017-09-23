package io.i5possible.game;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lianghong on 21/09/2017.
 */
public class NumberSeq {
    protected static final int size = 4;
    protected List<Integer> numberSeq;

    public NumberSeq(List<Integer> integerList) {
        this.numberSeq = integerList;
    }

    public int size() {
        return numberSeq.size();
    }

    @Override
    public String toString() {
        return numberSeq.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

    }
}
