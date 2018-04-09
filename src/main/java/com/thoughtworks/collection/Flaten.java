package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                ll.add(array[i][j]);
            }
        }
        return ll;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(!ll.contains(array[i][j])) {
                    ll.add(array[i][j]);
                }
            }
        }
        return ll;

    }
}
