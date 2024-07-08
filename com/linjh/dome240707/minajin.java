package com.linjh.dome240707;

import org.junit.Test;

import java.util.*;

public class minajin {

    @Test
    public void ExampleTest() {

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        HashSet<Object> objects1 = new HashSet<>();

        TreeMap<Object, Object> objectObjectTreeMap = new TreeMap<>();

//        objectObjectTreeMap.

        ArrayList<Object> objects = new ArrayList<>();


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组:");
        System.out.println(arrayList);
// void reverse(List list)：反转
        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arrayList):");
        System.out.println(arrayList);

// void sort(List list),按自然排序的升序排序
        Collections.sort(arrayList);
        System.out.println("Collections.sort(arrayList):");
        System.out.println(arrayList);
// 定制排序的用法
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序后：");
        System.out.println(arrayList);


        ArrayList<PeoPle> peoPle = new ArrayList<>();

        PeoPle linjunhang = new PeoPle("linjunhang", 22);
        PeoPle zhangzexuan = new PeoPle("zhangzexuan", 21);
        PeoPle zhangzexuan2 = new PeoPle("zhangzexuan2", 23);
        peoPle.add(linjunhang);
        peoPle.add(zhangzexuan);
        peoPle.add(zhangzexuan2);

        Collections.sort(peoPle, new Comparator<PeoPle>() {
            @Override
            public int compare(PeoPle o1, PeoPle o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("-----------林俊航------------");
        System.out.println(peoPle);
    }
}
