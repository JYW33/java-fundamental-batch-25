package com.juaracoding;

import java.util.Random;
import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {

        boolean isLogin;
        String username = "yngwie";
        String password = "root";
        isLogin = false;


        //simple login
        System.out.println("username");
        if (username.equals("yngwie") && password == "root") {
            isLogin = true;
            System.out.println("Login berhasil");
        } else {
            System.out.println("Username atau password salah");
        }

        if (isLogin == true){
            //otp
            Random otp = new Random();
            System.out.printf("%04d%n", otp.nextInt(9999));
        }

    }
}
