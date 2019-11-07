/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan60.akatsuki;

/**
 *
 * @author USER
 */
public class Akatsuki {
    private String nama,desa;

    public Akatsuki() {
        System.out.println("1. Obito / Tobi");
        System.out.println("2. Itachi Uchiha");
        System.out.println("3. Konan");
        System.out.println("4. Deidara");
        System.out.println("5. Sasori");
        System.out.println("6. Hidan");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDesa() {
        return desa;
    }

    public void setDesa(String desa) {
        this.desa = desa;
    }
    
    public void keahlian(int i){
        System.out.print("Skill\t: Gelud, ");
    }
    
}
