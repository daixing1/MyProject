package com.dx.face.ParamPass;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 15:09
 *
 * String, 包装类型不可变性，改变后就是重新创建对象将新地址指向它，传递的事地址
 *
 */
public class ParamPass {

    public static void main(String[] args) {
        int j = 1;
        String s = "hello";
        Integer b = 1;
        Integer n = 200;
        int[] a = {1,2,3,4,5};
        MyData m = new MyData();
        change(j, s, n, a, m, b);

        System.out.println("j = " + j);
        System.out.println("s = " + s);
        System.out.println("n = " + n);
        System.out.println("a = " + a);
        System.out.println("m = " + m);
        System.out.println("b = " + b);

    }

    public static void change(int j, String s, Integer n, int[] a, MyData m,Integer b){
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;
        b += 1;
    }

}

class MyData{
    int a = 10;
}