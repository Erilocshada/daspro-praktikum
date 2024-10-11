import java.util.Scanner;
public class latihan1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //inputan
        int angka;
        System.out.println("masukkan angka ");
        angka = sc.nextInt();
        //pemilihan8
        if (angka %2 ==0) {
            System.out.println("genap");
        }else{
            System.out.println("ganjil");
        }
        sc.close();
    }
}