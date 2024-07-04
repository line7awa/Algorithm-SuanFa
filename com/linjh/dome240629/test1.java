package com.linjh.dome240629;

import org.junit.Test;

import java.util.Random;

import static com.linjh.util.MethodTool.unSortArrays;

public class test1 {



    /**
     *@author: junhang
     *@createtime: 2024/6/29 15:54
     *@description: 冒泡排序
     **/
    @Test
    public void bubbleSort() {
        int[] tosorted = unSortArrays(1000 , 0 , 1000);

        for (int i = 0; i < tosorted.length; i++) {
            for (int j = i; j < tosorted.length; j++) {
                if (tosorted[i] > tosorted[j]){
                    tosorted[i] = tosorted[j] + tosorted[i] - (tosorted[j] = tosorted[i]);
                }
            }
        }
        for (int i : tosorted) {
            System.out.print(i + "\t");
        }
    }

    /**
     *@author: junhang
     *@createtime: 2024/6/29 17:47
     *@description: 插入排序
     **/
    @Test
    public void insertSort() {
        int[] ints = unSortArrays(1000, 0, 1000);

        for (int i = 1; i < ints.length; i++) {
            int j = i - 1;
            while (j >= 0 && ints[j] > ints[j + 1]) {
                ints[j] = ints[j] + ints[j + 1] - (ints[j + 1] = ints[j]);
                j--;
            }
        }

        for (int i : ints) {
            System.out.print(i + "\t");
        }
    }

    /**
     *@author: junhang
     *@createtime: 2024/6/29 21:18
     *@description: 希尔排序
     **/
    @Test
    public void ShellSort() {
        long startTime = System.nanoTime();
        int[] ints = unSortArrays(1000, 0, 1000);

        int gap = ints.length;

        while (gap > 1) {
            gap = gap / 2;
            for (int i = 0; i < ints.length - gap; ++i) {
                int end = i;
                int tem = ints[end + gap];
                while (end >= 0) {
                    if (tem < ints[end]) {
                        ints[end + gap] = ints[end];
                        end -= gap;
                    } else {
                        break;
                    }
                }
                ints[end + gap] = tem;
             }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("执行时间: " + duration + "纳秒");
        for (int i : ints) {
            System.out.print(i + "\t");
        }
    }

    /**
     *@author: junhang
     *@createtime: 2024/6/29 21:45
     *@description: 选择排序
     **/
    @Test
    public void SelectSort() {
        int[] ints = unSortArrays(1000, 0, 1000);

        int begin = 0 , end = ints.length - 1;
        while(begin < end) {
            int maxi = begin;
            int mini = begin;

            for (int i = begin; i <= end; i++) {
                if (ints[i] < ints[mini]) {
                    mini = i;
                }
                if (ints[i] > ints[maxi]) {
                    maxi = i;
                }
            }
            ints[begin] = ints[mini] + ints[begin] - (ints[mini] = ints[begin]);
            if (begin == maxi) {
                maxi = mini;
            }
            ints[end] = ints[maxi] + ints[end] - (ints[maxi] = ints[end]);
            begin++;
            end--;
        }

        for (int i : ints) {
            System.out.print(i + "\t");
        }
    }

    /**
     *@author: junhang
     *@createtime: 2024/6/29 21:59
     *@description: 快速排序
     **/
    @Test
    public void quickSortResult(){
        long startTime = System.nanoTime();
        int[] ints = unSortArrays(1000, 0, 1000);
        quickSort(ints , 0 , ints.length - 1);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("执行时间: " + duration + "纳秒");
        for (int i : ints) {
            System.out.print(i + "\t");
        }
    }



    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            // 递归地对划分点的左右两侧进行快速排序
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }

    }
    // 分区函数
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // 交换array[i]和array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 交换array[i+1]和array[high] (或者pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
