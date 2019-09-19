package com.dx.face.singleton;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 11:55
 */
public class Singleton4 {

    private Singleton4(){

    }
    static Singleton4 instence;

    public static Singleton4 getInstance() throws InterruptedException {
        if (instence == null){
            Thread.sleep(1000);
            instence = new Singleton4();
        }
        return instence;
    }

}