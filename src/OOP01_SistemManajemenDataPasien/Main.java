package OOP01_SistemManajemenDataPasien;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		int n = 0;
		
		Pasien[] dataPasien = new Pasien[10];
		
		do {
		System.out.println("\n============== 🏥 SISTEM MANAGEMEN PASIEN ==============\n\n");
		System.out.println("1. 👪 Tampilkan Data Pasien \n"
						 + "2. 🔎 Cari Pasien\n"
						 + "3. ➕ Tambah Data Pasien \n"
						 + "4. ✏ Update Data Pasien \n"
						 + "5. 🗑 Hapus Data Pasien  \n"
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
						if (dataPasien[i] != null && dataPasien[i].namaSamaDengan(namaPasien)) {
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

				System.out.println("\n👩 Masukan Nama Pasien: ");
				String nama = input.nextLine();
				
				System.out.println("🚹🚺 Masukan Jenis Kelamin: ");
				String jenisKelamin = input.nextLine();
				
				System.out.println("📩 Masukan Keluhan Pasien: ");
				String keluhan = input.nextLine();
				
				System.out.println("🔢 Masukan Usia Pasien: ");
				int usia = input.nextInt();
				input.nextLine();
				
				System.out.println("📅 Masukan Tanggal Kunjungan (tanggal-bulan-tahun): ");
				String tanggalKunjungan = input.nextLine();
				
				

				dataPasien[n] = new Pasien(nama,jenisKelamin,keluhan,usia,tanggalKunjungan);
				n++;
				
				System.out.println("✅ Data Berhasil disimpan");
				break;
				
			case 4 :
				input.nextLine();
				
				boolean cekNama = false;
				Pasien pasienTerpilih = null;
				
				System.out.println("\n===== Ubah data Pasien Klinik =====\n");
				System.out.println("🔄 Masukan nama pasien yang ingin diupdate: ");
				String namaPasien = input.nextLine();
				
				for(int i = 0; i < dataPasien.length; i++) {
					if(dataPasien[i] != null && dataPasien[i].namaSamaDengan(namaPasien)) {
						cekNama = true;
						pasienTerpilih = dataPasien[i];
						break;
					}
				}
				
				if(cekNama) {
					System.out.println("✅ Data ditemukan. Masukan Data baru: ");
					System.out.println("Masukan keluhan Baru: ");
					String keluhanBaru = input.nextLine();
					
					System.out.println("Masukan Usia Baru: ");
					int usiaBaru = input.nextInt();
					input.nextLine();
					
					System.out.println("Masukan Tanggal Kunjungan Baru: ");
					String tanggalBaru = input.nextLine();
					
					pasienTerpilih.updateData(keluhanBaru,usiaBaru,tanggalBaru);
					System.out.println("✅ Data Pasien Berhasil dirubah.");
					
				} else {
					System.out.println("❌ Tidak ada Pasien dengan nama " + namaPasien);
				}
				
				break;
			
			case 5 :
				
				System.out.println("\n===== Hapus Pasien Klinik =====\n");
				input.nextLine();
				System.out.println("🔄 Masukan nama pasien yang ingin dihapus: ");
				String hapusPasien = input.nextLine();
				
				int deleteIndex = -1;
				
				for(int i = 0; i < dataPasien.length; i++) {
					if(dataPasien[i] != null && dataPasien[i].namaSamaDengan(hapusPasien)) {
						deleteIndex = i;
					}
				}
				
				if (deleteIndex != -1) {
					for(int i = deleteIndex; i < dataPasien.length-1; i++) {
						dataPasien[i] = dataPasien[i+1];
					}
				
					dataPasien[dataPasien.length - 1] = null;
					n--;
				}else {
					System.out.println("❌ Tidak ada Pasien dengan nama " + hapusPasien);
				}
				
				
				break;
				
			default : 
				System.out.println("Program Berakhir.Terima Kasih!");
		}
		
		
		}while(userInput != 9);

	}

}
