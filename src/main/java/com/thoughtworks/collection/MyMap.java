package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {
        List<Integer> ll =new ArrayList<Integer>();
        for (int i = 0; i < array.size(); i++) {
            ll.add(array.get(i)*3);
        }
        return ll;
    }

    public List<String> mapLetter() {
        List<String> ll =new ArrayList<String>();
        for (int i = 0; i < array.size(); i++) {
            //ll.add((char)(array.get(i)+96)+"");
            ll.add(letterList.get(array.get(i)-1));
        }
        return ll;
    }

    public List<String> mapLetters() {
        List<String> ll =new ArrayList<String>();
        for (int i = 0; i < array.size(); i++) {
            int firstNum=array.get(i)/26;
            int secondNum=array.get(i)%26;
            String first ="";
            String second="";
            if (firstNum> 0) {
                if (secondNum == 0) {
                    firstNum-=1;
                    secondNum=26;
                }
                first += letterList.get(firstNum-1);
            }
            second+=letterList.get(secondNum-1);
            ll.add(first+second);
        }
        return ll;

    }

    public List<Integer> sortFromBig() {
        Integer[] arrNum= (Integer[])array.toArray();
        Arrays.sort(arrNum, new Comparator<Object>(){
            public int compare(Object arg0,Object arg1){
                Integer a=(Integer)arg0;
                Integer b=(Integer)arg1;
                int temp=Integer.compare(a,b);
                return -temp;
            }
        });
        return Arrays.asList(arrNum);
    }

    public List<Integer> sortFromSmall() {
        Integer[] arrNum= (Integer[])array.toArray();
        Arrays.sort(arrNum);
        return Arrays.asList(arrNum);
    }
}
