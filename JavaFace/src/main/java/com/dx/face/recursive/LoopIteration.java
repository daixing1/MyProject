package com.dx.face.recursive;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 15:39
 *
 * 循环迭代
 *  优点：代码运行效率好，时间只因循环次数增加而增加，没有额外空间开销
 *  缺点：代码不如递归简洁，可读性差
 *
 */
public class LoopIteration {

    public static void main(String[] args) {
        LoopIteration loopIteration = new LoopIteration();
        System.out.println(loopIteration.f(40));
    }

    public int f(int n){
        if ( n < 1){
            throw new IllegalArgumentException("n不能小于1");
        }
        if(n==1 || n==2){
            return n;
        }
        int one = 1;
        int two = 2;
        int sum = 0;
        for (int i = 3; i <= n; i++){
            sum = one + two;
            one = two;
            two = sum;
        }
        return sum;
    }

}