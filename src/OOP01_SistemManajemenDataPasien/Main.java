package OOP01_SistemManajemenDataPasien;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\n\n===== Input Data Pasien =====\n");
		System.out.println("Masukan Jumlah Pasien: ");
		int n = input.nextInt();
		
		Pasien[] dataPasien = new Pasien[n];
		input.nextLine();
		
		for(int i = 0; i < dataPasien.length; i++) {
			System.out.println("\nData Pasien ke-" + (i+1));
			
			System.out.println("\nNama Pasien: ");
			String nama = input.nextLine();
			
			
			System.out.println("Jenis Kelamin Pasien: ");
			String jenisKelamin = input.nextLine();
			
			System.out.println("Keluhan Pasien: ");
			String keluhan = input.nextLine();
			
			System.out.println("Umur Pasien: ");
			int usia = input.nextInt();
			input.nextLine();

			dataPasien[i] = new Pasien(nama,jenisKelamin,keluhan,usia);
			
		}
		
		System.out.println("\n\n===== Data Pasien Klinik =====\n");
		for(int i = 0; i < dataPasien.length; i++) {
			System.out.println("Data Pasien ke-" + (i+1));
			dataPasien[i].tampilkanInfo();
		}
		
		
		System.out.println("Total Pasien yang tercatat: " + dataPasien.length);
		
	}

}
