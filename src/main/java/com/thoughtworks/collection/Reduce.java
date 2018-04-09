package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce implements SingleLink{
    @Override
    public Object getHeaderData() {
        return this.arrayList.get(0);
    }

    @Override
    public Object getTailData() {
        return this.arrayList.get(this.size()-1);
    }

    @Override
    public int size() {
      return 4;
    }

    @Override
    public boolean isEmpty() {
        return (arrayList.size()==0?true:false);
    }

    @Override
    public boolean deleteFirst() {
        boolean df=false;
        return df;
    }

    @Override
    public boolean deleteLast() {
        boolean df=false;
        return df;
    }

    @Override
    public void addHeadPointer(Object item) {
        if(arrayList==null) {
            arrayList=new ArrayList<Integer>();
            arrayList.add((Integer) item);
        }
        else {
            for (int i = this.size(); i >=0; i--) {
                arrayList.add(i,arrayList.get(i-1));
            }
        }
    }

    @Override
    public void addTailPointer(Object item) {
        if(arrayList==null) {
            arrayList=new ArrayList<Integer>();
        }
        arrayList.add((Integer) item);
    }

    @Override
    public Object getNode(int index) {
        return this.arrayList.get(index-1);
    }

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) >= max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public double getMinimum() {
        double min = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) <= min) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public double getAverage() {
        double avg = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            avg += arrayList.get(i);
        }
        return avg / arrayList.size();
    }

    public double getOrderedMedian() {
        double medianNum = 0;
        int[] tl = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            tl[i] = arrayList.get(i);
        }
        Arrays.sort(tl);
        int size = arrayList.size();
        if (size != 0) {
            if (size % 2 == 0) {
                medianNum = ((double) (tl[size / 2] + tl[size / 2 - 1])) / 2;
            } else {
                medianNum = tl[size / 2];
            }
        }
        return medianNum;
    }

    public int getFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                return arrayList.get(i);
            }
        }
        return 0;
    }

    public int getIndexOfFirstEven() {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {
        int i = 0;
        if (arrayList.size() == this.arrayList.size()) {
            for (; i < arrayList.size(); i++) {
                if (arrayList.get(i) == this.arrayList.get(i)) {
                    continue;
                } else {
                    return false;
                }
            }
            if (i == arrayList.size()) {
                return true;
            }
        }
        return false;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {
        double med=0.0;
        int num=0;
        for (int i = 0; i <this.arrayList.size() ; i++) {
           singleLink.addTailPointer(this.arrayList.get(i));
            if (singleLink.getNode(i)!=null){
                num++;
                med +=  ((Integer)singleLink.getNode(i)).intValue();
            }
        }
        med = med/num;
        return med;
    }

    public int getLastOdd() {
        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (arrayList.get(i) % 2 == 1) {
                return arrayList.get(i);
            }
        }
        return -1;
    }

    public int getIndexOfLastOdd() {
        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (arrayList.get(i) % 2 == 1) {
                return i;
            }
        }
        return -1;
    }
}

