package com.dx.face.recursive;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 15:26
 *
 * 一次只能走一步或者两步阶梯，n节阶梯有多少种走法
 *递归
 *  优点：大问题转化为小问题，可以减少代码量，同时代码精简，可读性好
 *  缺点：递归调用浪费了空间，递归太深容易造成堆栈溢出
 */
public class Recursive {

    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        System.out.println(recursive.f(100));
    }

    public int f(int n){
        if ( n < 1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if(n==1 || n==2){
            return n;
        }
        return f(n-2) + f(n-1);
    }

}