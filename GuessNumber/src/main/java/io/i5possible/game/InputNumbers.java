package io.i5possible.game;


import io.i5possible.game.exception.IllegalNumberException;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static io.i5possible.game.InputUtils.in;


/**
 * Created by lianghong on 21/09/2017.
 */
public class InputNumbers {
    private InputNumbers() {
    }

    public static NumberSeq getInputNums() throws IllegalNumberException {
        int[] numbers = new int[4];
        int i = 0;
        while (in.hasNext()) {
            numbers[i++] = in.nextInt();
            if (i > 3) {
                break;
            }
        }
        return newInputNumbers(numbers);
    }

    public static NumberSeq newInputNumbers(int[] numbers) throws IllegalNumberException {
        NumberSeq numberSeq = new NumberSeq(
                Arrays.stream(numbers).boxed()
                        .filter(InputNumbers::isSingleNum)
                        .collect(Collectors.toList()));
        if (isIllegalNumbers(numberSeq)) {
            throw new IllegalNumberException();
        }
        return numberSeq;
    }


    private static boolean isLegalNumberSeq(NumberSeq numberSeq) {
        return numberSeq.size() == NumberSeq.size;
    }

    private static boolean isIllegalNumbers(NumberSeq numberSeq) {
        return !isLegalNumberSeq(numberSeq);
    }

    private static boolean isSingleNum(Integer n) {
        return n >= 0 && n < 10;
    }

    public static NumberSeq newInputNumbers(List<Integer> numberList) {
        return new NumberSeq(numberList);
    }

}
