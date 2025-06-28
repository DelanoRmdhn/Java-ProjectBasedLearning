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
		
		int userInput;
		do {
		System.out.println("\n============== 🏥 SISTEM MANAGEMEN PASIEN ==============\n\n");
		System.out.println("1. 👪 Tampilkan Data Pasien \n"
						 + "2. 🔎 Cari Pasien\n"
						 + "9. ⬅ Keluar");
		
		System.out.println("\nMasukan Angka Menu: ");
		userInput = input.nextInt();
		
		
		
		switch(userInput) {
			case 1 : 
				
				System.out.println("\n\n===== Data Pasien Klinik =====\n");
				for(int i = 0; i < dataPasien.length; i++) {
					System.out.println("Data Pasien ke-" + (i+1));
					dataPasien[i].tampilkanInfo();
				}
				
				System.out.println("Total Pasien yang tercatat: " + dataPasien.length);
			
				break;
			
			case 2 : 
				input.nextLine();
				boolean ditemukan = false;
				System.out.println("n\n===== Cari Pasien Klinik =====\n");
				
				System.out.println("Masukan nama Pasien yang ingin dicari: ");
				String namaPasien = input.nextLine();
				
				for(int i = 0; i < dataPasien.length; i++) {
					if(dataPasien[i] != null && dataPasien[i].nama.equalsIgnoreCase(namaPasien)) {
						ditemukan = true;
						dataPasien[i].tampilkanInfo();
						break;
					} 
				}

				if(!ditemukan){
					System.out.println("Pasien dengan nama '" + namaPasien + "' tidak ditemukan dalam data.");
				}
				
				break;
			
			default : 
				System.out.println("Program Berakhir.Terima Kasih!");
		}
		
		
		}while(userInput != 9);
	}

}
