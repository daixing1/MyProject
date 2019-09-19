package com.dx.face.singleton;

import org.apache.catalina.Executor;
import org.springframework.core.task.support.ExecutorServiceAdapter;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 11:30
 * 饿汉式：
 *      直接创建实例对象，不管你是否需要这个对象都会被创建
 *      直接实例化饿汉式（简洁直观）singleton1
 *      枚举类（最简洁）singleton2
 *      静态代码块饿汉式（适合复杂实例化）singleton3
 *      （1）构造器私有化
 *      （2）自行创建并用静态变量储存
 *      （3）向外提供这个实例
 *      （4）强调这是一个单例，用final修饰
 * 懒汉式：
 *      线程不安全（适用于单线程）
 *      线程安全（适用于多线程）
 *      静态内部类形式（适用于多线程，最简洁）
 */
public class TestSingleton {

    public static void main(String[] args) throws Exception {
        //饿汉式
        Singleton1 instance = Singleton1.INSTANCE;
        System.out.println("Singleton1 : " + instance);
        Singleton2 singleton2 = Singleton2.INSTANCE;
        System.out.println("singleton2 : " + singleton2);
        Singleton3 sineleton3 = Singleton3.sineleton3;
        System.out.println("sineleton3 : " + sineleton3);

        //懒汉式
        System.out.println("懒汉式");
        Callable<Singleton4> c = new Callable<Singleton4>() {
            @Override
            public Singleton4 call() throws Exception {
                return Singleton4.getInstance();
            }
        };
//        Callable<Singleton4> c1 = new Callable<Singleton4>() {
//            @Override
//            public Singleton4 call() throws Exception {
//                return Singleton4.getInstance();
//            }
//        };
        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Singleton4> submit = es.submit(c);
        Future<Singleton4> submit1 = es.submit(c);
        Singleton4 singleton41 = submit.get();
        Singleton4 singleton42 = submit1.get();
        System.out.println(singleton41==singleton42);
        System.out.println(singleton41);
        System.out.println(singleton42);
        Callable<Singleton5> c5 = new Callable<Singleton5>() {
            @Override
            public Singleton5 call() throws Exception {
                return Singleton5.getInstance();
            }
        };
        ExecutorService es1 = Executors.newFixedThreadPool(2);
        Future<Singleton5> submit5 = es1.submit(c5);
        Future<Singleton5> submit51 = es1.submit(c5);
        Singleton5 singleton51 = submit5.get();
        Singleton5 singleton52 = submit51.get();
//        Singleton5 singleton51 = c5.call();
//        Singleton5 singleton52 = c5.call();
        System.out.println(singleton51==singleton52);
        Singleton6 singleton6 = Singleton6.getInstance();
        System.out.println("singleton6" + singleton6);

    }

}