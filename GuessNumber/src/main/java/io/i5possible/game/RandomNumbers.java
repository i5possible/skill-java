package io.i5possible.game;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by lianghong on 21/09/2017.
 */
public class RandomNumbers {
    private static Set<Integer> createdNumbers = new HashSet();

    private RandomNumbers() {

    }

    public static NumberSeq newRandomNumbers() {
        return InputNumbers.newInputNumbers(
                IntStream.range(0, NumberSeq.size)
                        .boxed()
                        .map(n -> newNumber())
                        .collect(Collectors.toList()));
    }

    public static Integer newNumber() {
        Integer randomNumber = getRandomNumber();
        while (createdNumbers.contains(randomNumber)) {
            randomNumber = getRandomNumber();
        }
        createdNumbers.add(randomNumber);
        return randomNumber;
    }

    private static int getRandomNumber() {
        return (int) (Math.random() * 10) % 10;
    }
}
