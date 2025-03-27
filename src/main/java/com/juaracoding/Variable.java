package com.juaracoding;

import java.awt.*;

public class Variable {

    public static void main(String[] args) {

        byte rating = 127;
        short stock = 1000;

        char a = 'A';

        String path = "\"C:\\Users\\yngwi\\Downloads\\KK.jpg\"";
        System.out.println(path);

        boolean isLogin = true;
        boolean isStockAvailable = false;

        // user profile
        int id;
        String Name;
        String Email;
        String Phone;
        String Adress;
        int ZipCode = 95123;
        char level = 'A';
        boolean isActive = true;

        //casting implicit
        int price = 100000000;
        long total = 300000000L+price;
        System.out.println(total);
        int intLevel = level;
        System.out.println(intLevel);

        //casting explicit
        long l = 9223372036854775000L;
        int i = (int) l;
        System.out.println(i);

        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;

        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);

        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());
    }
}
