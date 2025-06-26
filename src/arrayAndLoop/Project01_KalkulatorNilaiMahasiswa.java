package arrayAndLoop;
import java.util.Scanner;

public class Project01_KalkulatorNilaiMahasiswa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("################### SISTEM PENGELOLAAN NILAI MAHASISWA ###################");
		
		System.out.println("\n👨‍🎓 Masukan Jumlah Mahasiswa: ");
		int jumlahMahasiswa = input.nextInt();
		
		System.out.println("📚 Masukan Jumlah Mata Kuliah : ");
		int jumlahMatkul = input.nextInt();
		
		//array
		String[] mahasiswa = new String [jumlahMahasiswa];
		String[] namaMatakuliah = new String [jumlahMatkul];
		int[][] nilaiMahasiswa = new int [jumlahMahasiswa][jumlahMatkul];
		
		System.out.println("\n------- INPUT MAHASISWA -------");
		for(int i = 0; i < jumlahMahasiswa; i++) {
			System.out.println("\nMasukan Nama Mahasiswa ke-" + (i+1) + ":");
			mahasiswa[i] = input.next();
		}
		
		System.out.println("\n------- INPUT NAMA MATA KULIAH -------");
		for(int i = 0; i < namaMatakuliah.length; i++) {
			System.out.println("\nMasukan Nama Matkul ke-" + (i+1) + ":");
			namaMatakuliah[i] = input.next();
		}
		
		input.nextLine();
		System.out.println("\n------- INPUT NILAI MAHASISWA -------");
		for(int i = 0; i < nilaiMahasiswa.length; i++) {
			for(int j = 0; j < nilaiMahasiswa[i].length; j++) {
				System.out.println("\nInput Nilai Mata Kuliah " + namaMatakuliah[j] + " [MAHASISWA] " + mahasiswa[i] + ":");
				nilaiMahasiswa[i][j] = input.nextInt();
			}
		}
		
		
		System.out.println("\n\n#################### DAFTAR NILAI MAHASISWA ####################\n");

		// Header tabel
		System.out.printf("%-15s", "Nama Mahasiswa");
		for (int i = 0; i < namaMatakuliah.length; i++) {
		    System.out.printf("%-15s", namaMatakuliah[i]);
		}
		System.out.printf("%-15s%-15s\n", "Total Nilai", "Rata-Rata");

		// Isi data
		for (int i = 0; i < nilaiMahasiswa.length; i++) {
		    int totalNilai = 0;

		    System.out.printf("%-15s", mahasiswa[i]);

		    for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
		        System.out.printf("%-15d", nilaiMahasiswa[i][j]);
		        totalNilai += nilaiMahasiswa[i][j];
		    }

		    double rataRata = (double) totalNilai / namaMatakuliah.length;
		    System.out.printf("%-15d%-15.2f\n", totalNilai, rataRata);
		}

		//Mencari Mahasiswa dengan nilai terbaik
		int nilaiTertinggi = 0;
		String mahasiswaTerbaik = "";

		for (int i = 0; i < nilaiMahasiswa.length; i++) {
		    int totalNilai = 0;

		    for (int j = 0; j < nilaiMahasiswa[i].length; j++) {
		        totalNilai += nilaiMahasiswa[i][j];
		    }

		    if (totalNilai > nilaiTertinggi) {
		        nilaiTertinggi = totalNilai;
		        mahasiswaTerbaik = mahasiswa[i];
		    }
		}

		double rataRataTerbaik = (double) nilaiTertinggi / namaMatakuliah.length;

		System.out.println("\n🏆 Mahasiswa dengan Nilai Tertinggi:");
		System.out.println("Nama: " + mahasiswaTerbaik);
		System.out.println("Total Nilai: " + nilaiTertinggi);
		System.out.printf("Rata-Rata: %.2f\n", rataRataTerbaik);

		
		
		
	}
}