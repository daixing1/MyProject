package com.dx.face.singleton;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 11:57
 */
public class Singleton6 {

    private Singleton6(){

    }

    private static class Inner{
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }

}