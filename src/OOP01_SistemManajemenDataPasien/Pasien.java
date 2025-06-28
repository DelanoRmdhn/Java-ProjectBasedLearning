package OOP01_SistemManajemenDataPasien;

public class Pasien {
	String nama,jenisKelamin,keluhan;
	int usia;
	
	public Pasien(String nama, String jenisKelamin, String keluhan, int usia) {
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.keluhan = keluhan;
		this.usia = usia;
	}
	
	void tampilkanInfo() {
		System.out.println("Nama \t\t\t:" + nama + "\n"
						 + "Usia \t\t\t:" + usia + "\n"
						 + "Jenis Kelamin \t\t:" + jenisKelamin + "\n"
						 + "Keluhan \t\t:" + keluhan);
		
		System.out.println("\n");
	}
	
}
