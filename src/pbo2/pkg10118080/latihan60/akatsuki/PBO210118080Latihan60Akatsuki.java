/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan60.akatsuki;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO210118080Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("====Anggota Akatsuki====");
        Skill s = new Skill();
        System.out.println("Masukan Nomor [1-6] : ");
        Scanner a = new Scanner(System.in);
        s.keahlian(a.nextInt());
       
       
    }
    
}
