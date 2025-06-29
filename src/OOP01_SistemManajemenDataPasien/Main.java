package OOP01_SistemManajemenDataPasien;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int userInput;
		Pasien[] dataPasien = new Pasien[10];
		
		do {
		System.out.println("\n============== 🏥 SISTEM MANAGEMEN PASIEN ==============\n\n");
		System.out.println("1. 👪 Tampilkan Data Pasien \n"
						 + "2. 🔎 Cari Pasien\n"
						 + "3. ➕ Tambah Data Pasien \n"
						 + "9. ⬅ Keluar");
		
		System.out.println("\nMasukan Angka Menu: ");
		userInput = input.nextInt();
		
		
		
		switch(userInput) {
			case 1 : 
				System.out.println("\n\n===== Data Pasien Klinik =====\n");
				boolean adaData = false;

				for (int i = 0; i < dataPasien.length; i++) {
					if (dataPasien[i] != null) {
						System.out.println("Data Pasien ke-" + (i + 1));
						dataPasien[i].tampilkanInfo();
						adaData = true;
					}
				}

				if (!adaData) {
					System.out.println("❌ Tidak ada data Pasien saat ini.");
				}
				
				break;
			
			case 2 : 
				input.nextLine();
				boolean ditemukan = false;

				boolean cariData = false;
				for (int i = 0; i < dataPasien.length; i++) {
					if (dataPasien[i] != null) {
						cariData = true;
						break;
					}
				}

				if (!cariData) {
					System.out.println("❌ Tidak ada data Pasien saat ini.");
				} else {
					System.out.println("\n===== Cari Pasien Klinik =====\n");
					System.out.print("Masukkan nama Pasien yang ingin dicari: ");
					String namaPasien = input.nextLine();

					for (int i = 0; i < dataPasien.length; i++) {
						if (dataPasien[i] != null && dataPasien[i].nama.equalsIgnoreCase(namaPasien)) {
							ditemukan = true;
							dataPasien[i].tampilkanInfo();
							break;
						}
					}

					if (!ditemukan) {
						System.out.println("🔍 Pasien dengan nama '" + namaPasien + "' tidak ditemukan dalam data.");
					}
				}

				
				break;
				
			case 3 : 
				input.nextLine();
				int n = 0;

				System.out.println("\n👩 Masukan Nama Pasien: ");
				String nama = input.nextLine();
				
				System.out.println("🚹🚺 Masukan Jenis Kelamin: ");
				String jenisKelamin = input.nextLine();
				
				System.out.println("📩 Masukan Keluhan Pasien: ");
				String keluhan = input.nextLine();
				
				System.out.println("🔢 Masukan Usia Pasien: ");
				int usia = input.nextInt();
				
				input.nextLine();
				

				dataPasien[n] = new Pasien(nama,jenisKelamin,keluhan,usia);
				n++;
					
				
				break;
			
			default : 
				System.out.println("Program Berakhir.Terima Kasih!");
		}
		
		
		}while(userInput != 9);

		

		
		
	}

}
