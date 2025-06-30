package OOP01_SistemManajemenDataPasien;



public class Pasien {
	String nama,jenisKelamin,keluhan,tanggalKunjungan;
	int usia;
	
	public Pasien(String nama, String jenisKelamin, String keluhan, int usia, String tanggalKunjungan) {
		this.nama = nama;
		this.jenisKelamin = jenisKelamin;
		this.keluhan = keluhan;
		this.usia = usia;
		this.tanggalKunjungan = tanggalKunjungan;
	}
	
	void tampilkanInfo() {
		System.out.println("\nNama \t\t\t:" + nama + "\n"
						 + "Usia \t\t\t:" + usia + "\n"
						 + "Jenis Kelamin \t\t:" + jenisKelamin + "\n"
						 + "Keluhan \t\t:" + keluhan  + "\n"
						 + "Tanggal Kunjungan \t:" + tanggalKunjungan);
		
		System.out.println("\n");
	};
	
	
	
	void updateData(String keluhan,int usia,String tanggalKunjungan) {
		this.keluhan = keluhan;
		this.usia = usia;
		this.tanggalKunjungan = tanggalKunjungan;
	}
	
	boolean namaSamaDengan(String nama) {
		return this.nama.equalsIgnoreCase(nama);
	}
	
}
