package com.knubisoft.base.arrays;

import java.util.*;

public class ArraysTasksImpl implements ArraysTasks {

    @Override
    public int[] reverse(int[] array) {
        int[] tempArray = new int[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            tempArray[j - 1] = array[i];
            j = j - 1;
        }
        return tempArray;
    }

    @Override
    public int[] mergeArrays(int[] array1, int[] array2) {
        int size = array1.length + array2.length;
        int[] resultArray = new int[size];
        for (int i = 0; i < array1.length; i++) {
            resultArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            resultArray[array1.length+i] = array2[i];
        }
        return resultArray;
    }

    @Override
    public int[] findMax3InArray(int[] array) {
        int [] resultArray = new int[3];
        if(array.length<3){
            return array;
        }
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = array[array.length-1-i];
        }
        return resultArray;
    }

    @Override
    public int findLongestIncreasingContinuesSubsequence(int[] array) {
        if (array == null || array.length == 0) return 0;
        int n = array.length, windowStart = 0;
        int max = 1;
        for (int i = 1; i < n; i++) {
            if (array[i] <= array[i - 1]) windowStart = i;
            max = Math.max(max, i - windowStart + 1);
        }
        return max;
    }

    @Override
    public int sumOfAllUniqueElements(int[] array) {
        Set<Integer> list = new HashSet<>();
        for (int value: array) {
            list.add(value);
        }
        int result = 0;
        for (int value : list) {
            result += value;
        };
        return result;
    }

    @Override
    public int[] moveZeroes(int[] array) {
        int count = 0;


        for (int i = 0; i < array.length; i++)
            if (array[i] != 0)
                array[count++] = array[i];



        while (count < array.length)
            array[count++] = 0;
        return array;
    }

    @Override
    public int findFinalValue(int[] nums, int original) {

        boolean exist = true;

        while(exist){
            exist = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == original){
                    original = 2 * original;
                    exist = true;
                    break;
                }
            }

        }
        return original;
    }

    @Override
    public String longestCommonPrefix(String[] words) {
        int size = words.length;

        if (size == 0)
            return "";

        if (size == 1)
            return words[0];

        Arrays.sort(words);

        int end = Math.min(words[0].length(), words[size-1].length());

        int i = 0;
        while (i < end && words[0].charAt(i) == words[size-1].charAt(i) )
            i++;

        String prefix = words[0].substring(0, i);
        return prefix;
    }

    @Override
    public int missingNumber(int[] array) {
        int size = array.length;
        int missnumber = 0;

        for (int i = 0; i < size; i++) {
            if((array[i]!=i) || (array[i]!=size)){
                missnumber = i;
            }
        }
        return missnumber;
    }

    @Override
    public boolean containsDuplicate(int[] array) {
        if(array==null || array.length==0)
            return false;

        Set<Integer> list = new HashSet<Integer>();
        for(int i: array){
            if(!list.add(i)){
                return true;
            }
        }
        return false;
    }
}
