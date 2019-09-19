package com.dx.face.InitClass;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 14:28
 *
 *  父类初始化<clinit>
 *      （1）j = method()
 *      （2）父类静态代码块
 *      （（1），（2）按从上到下的顺序）
 *  父类实例化方法：
 *      （1）super() 最前
 *      （2）i = test()
 *      （3）父类非静态代码块
 *      （4）父类构造器
 *      （（2），（3）安代码从上到下执行）
 *  非静态方法前面有一个默认的this对象
 *  this在构造器（或<init>）它表示的事正在创建的对象，因为这里创建的是Son对象，
 *  所以这里的test调用的事子类重载的test方法
 *
 */
public class Father {

    private int i = test();
    static {
        System.out.println("(0)");
    }

    private static int j = method();

    {
        System.out.println("(1)");
    }

    static {
        System.out.println("(2)");
    }

    Father(){
        System.out.println("(3)");
    }

    public int test(){
        System.out.println("(4)");
        return 1;
    }

    public static int method(){
        System.out.println("(5)");
        return 1;
    }


}