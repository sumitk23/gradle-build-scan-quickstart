package com.coursera.algorithms;

import com.couresera.algorithms.MergeSort;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sumikum3 on 20:28 2018-11-05
 */

public class MergeSortTest {

    @Test
    public void testMergeSort() {

        int[] numbers = {2,22,11,33,44};
        int[] sortedArray = MergeSort.mergeSort(numbers);
        String numbersString = ArrayUtils.toString(numbers);
        assertEquals("{2,11,22,33,44}", numbersString);
    }
}

