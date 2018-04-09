package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int count = 0;
        if (leftBorder <= rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 0) {
                    count = count + i;
                }
            }
        }
        else {
            for (int i = leftBorder; i >= rightBorder; i--) {
                if (i % 2 == 0) {
                    count = count + i;
                }
            }
        }
        return count;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int count = 0;
        if (leftBorder <= rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 1) {
                    count = count + i;
                }
            }
        }
        else {
            for (int i = leftBorder; i >= rightBorder; i--) {
                if (i % 2 == 1) {
                    count = count + i;
                }
            }
        }
        return count;

    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            count = count + arrayList.get(i) * 3 + 2;
        }
        return count;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        int count = 0;
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                arr.add(arrayList.get(i) * 3 + 2);
            } else {
                arr.add(arrayList.get(i));
            }
        }
        return arr;

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                count = count + arrayList.get(i) * 3 + 5;
            }
        }
        return count;
    }

    public static double getMedianOfEvenIndex(List<Integer> arrayList) {
        double medianNum = 0;
        int j = 0;
        Integer[] tl = new Integer[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                tl[j++] = arrayList.get(i);
            }
        }
        Arrays.sort(tl,0,j-1);
        int size = j ;
        if (size != 0) {
            if (size % 2 == 0) {
                medianNum = (tl[size/2] + tl[size/2 - 1]) / 2;
            } else {
                medianNum = tl[size/2];
            }
        }
        return medianNum;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double avg = 0;
        int count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                avg = avg + arrayList.get(i);
                count++;
            }
        }
        return (avg / count);
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                ll.add(arrayList.get(i));
            }
        }
        if (ll.contains(specialElment)) {
            return true;
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        List<Integer> ll = new ArrayList<Integer>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                while (!ll.contains(arrayList.get(i))) {
                    ll.add(arrayList.get(i));
                }
            }
        }
        return ll;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        Integer[] sortNum = new Integer[arrayList.size()];
        Integer[] sortNum1 = new Integer[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            sortNum[i] = arrayList.get(i);
        }
        Arrays.sort(sortNum);
        for (int i = 0, m = 0, n = sortNum.length - 1; i < sortNum.length; i++) {
            if (sortNum[i] % 2 == 0) {
                sortNum1[m++] = sortNum[i];
            } else {
                sortNum1[n--] = sortNum[i];
            }
        }
        return Arrays.asList(sortNum1);
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        Integer[] num = new Integer[arrayList.size() - 1];
        for (int i = 0; i < arrayList.size() - 1; i++) {
            num[i] = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
        }
        return Arrays.asList(num);
    }
}
