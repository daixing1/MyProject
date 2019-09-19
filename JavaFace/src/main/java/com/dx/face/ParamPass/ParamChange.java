package com.dx.face.ParamPass;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 16:27
 */
public class ParamChange {

    static int s;
    int i;
    int j;

    {
        int i = 1;
        i++;
        j++;
        s++;
    }

    public void test(int j){
        this.j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        ParamChange paramChange1 = new ParamChange();
        ParamChange paramChange2 = new ParamChange();
        paramChange1.test(10);
        paramChange1.test(20);
        paramChange2.test(30);
        System.out.println("paramChange1.i = " + paramChange1.i + ", paramChange1.j = " + paramChange1.j + ", ParamChange.s = " + ParamChange.s);
        System.out.println("paramChange2.i = " + paramChange2.i + ", paramChange2.j = " + paramChange2.j + ", ParamChange.s = " + ParamChange.s);
    }



}