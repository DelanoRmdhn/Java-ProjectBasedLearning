package OOP02_SistemReservasiKamarHotel;

public class Reservasi {
	Pelanggan pelanggan;
	Kamar kamar;
	int durasi;
	
	Reservasi(Pelanggan pelanggan,Kamar kamar,int durasi){
		this.pelanggan = pelanggan;
		this.kamar = kamar;
		this.durasi = durasi;
	}
	
	int hitungTotal() {
		return durasi * kamar.harga;
	}
	
	void tampilkanDetail() {
		pelanggan.tampilkanProfil();
		kamar.tampilInfo();
		System.out.println("Durasi Menginap \t: " + durasi + "\n"
				+ "Total Biaya \t: " + hitungTotal());
	}
	
	
}
