/**
 * Write a description of class Main here.
 *
 * @author (fikriadinarta)
 * @version (0.1)
 */public class Main{
    
    public static void main(String args[]){
        // menciptakan objek baru dari class kalkulator
        kalkulator kalkul = new kalkulator();
        
        kalkul.name = "Operator ";

        //author
        System.out.println("--- OPERATOR DASAR PADA JAVA ---");
        //inputan oprator yg dijalankan
        System.out.println("nilai 1 = "+ kalkul.a);
        System.out.println("nilai 1 = "+ kalkul.b);
        //memanggil atribut hasil
        System.out.println(kalkul.name + "penjumlahan 4 + 5 = "+ kalkul.penjumlahan);
        System.out.println(kalkul.name + "pengurangan 4 - 5 = "+ kalkul.pengurangan);
        System.out.println(kalkul.name + "perkalian 4 * 5 = "+ kalkul.perkalian);
        System.out.println(kalkul.name + "pembagian 4 / 5 = "+ kalkul.pembagian);        
    }

}