/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hc_java1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class bai12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" mời nhập số nguyên a");
        int a= sc.nextInt();
        String  kt=(a%2==0)? " chẵn" : " lẻ";
        System.out.println(" "+kt);
    }
}
