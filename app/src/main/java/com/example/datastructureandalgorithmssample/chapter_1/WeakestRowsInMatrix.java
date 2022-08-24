package com.example.datastructureandalgorithmssample.chapter_1;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class WeakestRowsInMatrix {

    /*You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
    The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the
    left of all the 0's in each row.

    A row i is weaker than a row j if one of the following is true:

    The number of soldiers in row i is less than the number of soldiers in row j.
    Both rows have the same number of soldiers and i < j.
    Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

    Example 1:
    Input: mat =
            [[1,1,0,0,0],
            [1,1,1,1,0],
            [1,0,0,0,0],
            [1,1,0,0,0],
            [1,1,1,1,1]],
    k = 3
    Output: [2,0,3]
    Explanation:
    The number of soldiers in each row is:
            - Row 0: 2
            - Row 1: 4
            - Row 2: 1
            - Row 3: 2
            - Row 4: 5
    The rows ordered from weakest to strongest are [2,0,3,1,4].

    Example 2:
    Input: mat =
            [[1,0,0,0],
            [1,1,1,1],
            [1,0,0,0],
            [1,0,0,0]],
    k = 2
    Output: [0,2]
    Explanation:
    The number of soldiers in each row is:
            - Row 0: 1
            - Row 1: 4
            - Row 2: 1
            - Row 3: 1
    The rows ordered from weakest to strongest are [0,2,3,1].

    Constraints:
    m == mat.length
    n == mat[i].length
    2 <= n, m <= 100
    1 <= k <= m
    matrix[i][j] is either 0 or 1.*/

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        int k = 2;
        int[] result = kWeakestRows(arr, k);
        System.out.println(Arrays.toString(result));
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static int[] kWeakestRows(int[][] mat, int k) {
        int row = mat.length;
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt((int[] o) -> o[1]).thenComparingInt(o -> o[0]));
        for (int i = 0; i < row; i++) {
            int j = getNumberOfSolders(mat[i]);
            priorityQueue.add(new int[]{i, j});
        }
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = Objects.requireNonNull(priorityQueue.poll())[0];
        }
        return result;
    }

    private static int getNumberOfSolders(int[] mat) {
        int solLength = 0;
        for (int solders : mat) {
            if (solders == 1) {
                solLength += 1;
            }
        }
        return solLength;
    }
}
