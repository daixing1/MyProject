package com.dx.face.singleton;

import java.io.IOException;
import java.util.Properties;

/**
 * @author 戴兴
 * @description TODO
 * @date 2019/9/19 11:25
 */
public class Singleton3 {

    public static final Singleton3 sineleton3;

    static {
        Properties pro = new Properties();
        try {
            pro.load(Singleton3.class.getClassLoader().getResourceAsStream("single.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        sineleton3 = new Singleton3(pro.getProperty("info"));
    }

    private String info;

    private Singleton3(String info){
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Singleton3{" +
                "info='" + info + '\'' +
                '}';
    }
}