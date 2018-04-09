package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> ll = new ArrayList<Integer>();
        int ran =random.nextInt(3);
        System.out.println(ran);
        for (int num = number-ran; num >=0 ; num=num-ran) {
            ll.add(num);
        }
        return ll;
    }
}
