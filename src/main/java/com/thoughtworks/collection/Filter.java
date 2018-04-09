package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i <array.size() ; i++) {
            if (array.get(i)%2 == 0) {
                ll.add(array.get(i));
            }
        }
        return ll;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i <array.size() ; i++) {
            if (array.get(i)%3 == 0) {
                ll.add(array.get(i));
            }
        }
        return ll;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < firstList.size(); i++) {
            if (secondList.contains(firstList.get(i))) {
                ll.add(firstList.get(i));
            }
        }
        return ll;

    }

    public List<Integer> getDifferentElements() {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i <array.size() ; i++) {
            if (!ll.contains(array.get(i))) {
                ll.add(array.get(i));
            }
        }
        return ll;
    }
}