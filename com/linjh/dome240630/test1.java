package com.linjh.dome240630;

import org.junit.Test;

import static com.linjh.util.MethodTool.unSortArrays;

public class test1 {


    /**
     *@author: junhang
     *@createtime: 2024/6/30 14:05
     *@description: 快速排序
     **/

    @Test
    public void quickSortResult() {
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
        if (low >= high) {
            return;
        } else {
            int pi = partition(array , low , high);

            quickSort(array , low , pi - 1);
            quickSort(array , pi + 1 , high);
        }
    }


    // 分区函数
    private int partition(int[] array, int low, int high) {

        int pivot = array[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                array[i] = array[j] + array[i] - (array[j] = array[i]);
            }
        }

        array[i + 1] = array[i + 1] + array[high]
                - (array[high] = array[i + 1]);

        return i + 1;
    }
}
