package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> ll = new ArrayList<Integer>();
        if (left < right) {
            if (left < 0) {
                left = 0;             //left<0时，将left置0
            }
            for (int i = left; i <= right; i++) {
                ll.add(i);
            }
        }
        if (left > right) {
            if (right < 0) {
                right = 0;             //right<0时，将right置0
            }
            for (int i = left; i >= right; i--) {
                ll.add(i);
            }
        }

        return ll;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> ll = new ArrayList<Integer>();
        if (left < right) {
            if (left < 0) {
                left = 0;             //left<0时，将left置0
            }
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    ll.add(i);
                }
            }
        }
        if (left > right) {
            if (right < 0) {
                right = 0;             //right<0时，将right置0
            }
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    ll.add(i);
                }
            }
        }
        return ll;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ll.add(array[i]);
            }
        }
        return ll;
    }

    public int popLastElment(int[] array) {
        return array[array.length - 1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i] == firstArray[j]) {
                    ll.add(secondArray[i]);
                }
            }
        }
        return ll;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        ArrayList<Integer> first=new ArrayList<Integer>(Arrays.asList(firstArray));
        for (int i = 0; i < secondArray.length; i++) {
            if (first.contains(secondArray[i])==false) {
                first.add(secondArray[i]);
            }
        }
        return first;
    }
}
