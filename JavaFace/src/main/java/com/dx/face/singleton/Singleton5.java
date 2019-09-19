package com.dx.face.singleton;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 11:56
 */
public class Singleton5 {

    private Singleton5(){

    }
    static Singleton5 instence;

    public synchronized static Singleton5 getInstance(){
        if (instence == null){
            instence = new Singleton5();
        }
        return instence;
    }

}