package com.juaracoding;

import java.util.Random;
import java.util.Scanner;

public class Percabangan {

    public static void main(String[] args) {

        String username;
        String password;
        Scanner uscanner = new Scanner(System.in);
        Scanner pscanner = new Scanner(System.in);
        boolean isLogin;



        //simple login

        System.out.print("username: ");
        username = uscanner.nextLine();
        System.out.print("password: ");
        password = pscanner.nextLine();
        isLogin = false;
        if (username.equals("yngwie") && password.equals("root")) {
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
