package com.leecode.week01;

import java.util.HashMap;
import java.util.Map;

/**
 * 509. Fibonacci Number https://leetcode.com/problems/fibonacci-number/ F(0) = 0,   F(1) = 1 F(N) =
 * F(N - 1) + F(N - 2), 其中 N > 1.
 */
public class Leetcode_509_35 {

    Map<Integer, Integer> cache = new HashMap<>();

    public int fib(int N) {
        return f(N);
    }

    public int f(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int val = 0;
        if (cache.containsKey(n)) {
            val = cache.get(n);
        } else {
            val = f(n - 1) + f(n - 2);
            cache.put(n, val);
        }
        return val;
    }
}
