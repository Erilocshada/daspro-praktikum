import java.util.Scanner;
public class Siakad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim,kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
    System.out.println("Masukkan Nama");
    nama = sc.nextLine();
    System.out.println("Masukkan NIM");
    nim = sc.nextLine();
    System.out.println("Masukkan Kelas");
    kelas = sc.nextLine();
    System.out.println("Masukkan Absen");
    absen = sc.nextByte();
    System.out.println("Masukkan nilai kuis");
    nilaiKuis = sc.nextDouble();
    System.out.println("Masukkan nilai tugas");
    nilaiTugas = sc.nextDouble();
    System.out.println("Masukkan nilai ujian");
    nilaiUjian = sc.nextDouble();
    nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;
    System.out.println("mahasiswa dengan nama " + nama + " nim " + nim + " kelas " + kelas + " nomor absen " + absen + " Nilai Akhir :" + nilaiAkhir);


    sc.close();
    }
}