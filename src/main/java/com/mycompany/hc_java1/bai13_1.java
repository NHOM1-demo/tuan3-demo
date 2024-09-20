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
public class bai13_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" mời bấm phím để chọn");
        System.out.println(" bấm 1 tìm theo tên");
        System.out.println(" bấm 2 tìm theo tác giả");
        System.out.println(" bấm 3 tìm theo nhà xuất bản");
        System.out.println(" bấm 4 tìm theo tiêu đề ");
        int so=sc.nextInt() ;
        switch (so) {
            case 1: System.out.println(" tim theo ten ");
                
                break;
            case 2 : System.out.println(" tim theo tác giả");
            break; 
            case 3 : System.out.println(" tìm theo nhà xuất bản ");
            break;
            case 4 : System.out.println(" tìm theo tiêu đề");
            break; 
            default: System.out.println(" phím bấm ko hợp lệ");
            break; 
        }
    }
}
