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
public class Skill extends Akatsuki{
    public String keahlian;

    @Override
    public void keahlian(int i) {
       
        switch (i) {
            case 1:
                setNama("Obito Uchiha");
                setDesa("Konohagakure");
                keahlian="Rinnegan, ngebug gabisa di sentuh";
                break;
            case 2:
                setNama("Itachi Uchiha");
                setDesa("Konohagakure");
                keahlian="ahli kunai, Mangekyō Sharingan, Dj gagak";
                break;
            case 3:
                setNama("Konan");
                setDesa("Amegakure");
                keahlian="buat origami, Terbang ";
                break;
            case 4:
                setNama("Deidara");
                setDesa("Iwagakure");
                keahlian="Bom, Bisa buat naga dll tapi gabisa buat jodoh :( ";
                break;
            case 5:
                setNama("Sasori");
                setDesa("Sunagakure");
                keahlian="Main Boneka doang si";
                break;
            case 6:
                setNama("Hidan");
                setDesa("Yugakure");
                keahlian="Pedang, Santet";
                break;
            default:
                System.out.println("Masukan 1-6 !!");
                break;
        }
        
        System.out.println("Nama\t: "+getNama());
        System.out.println("Desa\t: "+getDesa());
         super.keahlian(i); //To change body of generated methods, choose Tools | Templates.
        System.out.println(keahlian);
        
    }
    
}
