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
public class bai14_1 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println(" mời nhập vào số nguyên 1-99");
         int n = sc.nextInt();
         while (n<1 || n> 99) {
             System.out.println(" mời nhập lại");
             n=sc.nextInt();
        }
         System.out.println(" bạn đã nhập n");
    } 
}
