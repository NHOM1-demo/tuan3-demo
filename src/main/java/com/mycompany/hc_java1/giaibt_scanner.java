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
public class giaibt_scanner {
    public static void main(String[] args) {
       /*
        // giai bt hinh tròn 
        Scanner sc= new Scanner(System.in);
        System.out.println(" moi nhap vao bán kính đường tròn r:");
        double r=sc.nextDouble();
        double cv= 2 *Math.PI * r ;
        double dt = Math.PI * Math.pow(r, 2);
        System.out.println(" chu vi hình tròn là " +cv);
        System.out.println(" dien tich  hình tròn là " +dt);   
*/
       /*
        System.out.println(" nhap chieu dai hcn");
        float cd= new Scanner(System.in).nextFloat();
        System.out.println(" nhap chieu rong");
        float cr = new Scanner(System.in).nextFloat();
        float dt= cd * cr ;
        System.out.println(" dien tich la " + dt);
        */
       // tinh chu ki con lắc
        Scanner sc= new Scanner(System.in);
        System.out.println(" moi nhap chu ky ");
        float chuky= sc.nextFloat();
        System.out.println(" moi nhap chieu dai ");
        float cd= sc.nextFloat();
        float g=10;
        double kq = 2*Math.PI *Math.sqrt(cd*1.0/g);
        System.out.println("ket qua la "+kq);
    }
    
}
