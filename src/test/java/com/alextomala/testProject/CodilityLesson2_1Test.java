package com.alextomala.testProject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CodilityLesson2_1Test {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        final int[] arr = {1, 1, 2};

        assertEquals(2, solution.solution(arr));
    }

    @Test
    public void test2() {
        final int[] arr = {};

        assertEquals(-1, solution.solution(arr));
    }

    @Test
    public void test3() {
        final int[] arr = {9, 3, 9, 3, 9, 7, 9};

        assertEquals(7, solution.solution(arr));
    }
}


class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 11
        if (A.length == 0) {
            return -1;
        }

        final Set<Integer> ints = new HashSet<>(A.length / 2 + 1);

        for (int a : A) {
            if (ints.contains(a)) {
                ints.remove(a);
            } else {
                ints.add(a);
            }
        }

        return ints.iterator().next();
    }
}
