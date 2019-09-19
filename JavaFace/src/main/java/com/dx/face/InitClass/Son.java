package com.dx.face.InitClass;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 14:30
 *
 * *  子类初始化<clinit>
 *      （1）j = method()
 *      （2）子类静态代码块
 *      （1），（2）按从上到下的顺序）
 *   子类实例化方法：
 *      （1）super() 最前
 *      （2）i = test()
 *      （3）子类非静态代码块
 *      （4）子类构造器
 *      （（2），（3）安代码从上到下执行）
 *
 */
public class Son extends Father {

    private int i = test();

    static {
        System.out.println("(11)");
    }

    private static int j = method();

    {
        System.out.println("(6)");
    }

    static {
        System.out.println("(7)");
    }

    Son(){
        System.out.println("(8)");
    }

    public int test(){
        System.out.println("(9)");
        return 1;
    }

    public static int method(){
        System.out.println("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println();
        Son son2 = new Son();
    }

}