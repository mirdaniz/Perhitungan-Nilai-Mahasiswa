import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Hitung hitung = new Hitung();
        //input Nama
        System.out.print("Masukan Nama Anda :");
        String nama = input.nextLine();
        //input Nim
        System.out.print("Masukan Nim Anda: ");
        int nim = input.nextInt();
        //input nilai tubes
        System.out.print("Masukan Nilai Tubes: ");
        double nilaitubes = input.nextDouble();
        //input nilai quiz
        System.out.print("Masukkan Nilai Quiz: ");
        double nilaiquiz = input.nextDouble();
        //input nilai tugas
        System.out.print("Masukan Nilai Tugas: ");
        double nilaitugas= input.nextDouble();
        //input nilai uts
        System.out.print("Masukkan Nilai Uts: ");
        double nilaiuts=input.nextDouble();
        //input nilai uas
        System.out.print("Masukkan Nilai Uas: ");
        double nilaiuas=input.nextDouble();
        //Nilai total
        double Total = hitung.Total(nilaitubes,nilaiquiz,nilaitugas,nilaiuts,nilaiuas);
        //print tampilan
        System.out.println("Nama : " + nama);
        System.out.println("Nim :" + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek:" + Total);
        input.close();
    }
}