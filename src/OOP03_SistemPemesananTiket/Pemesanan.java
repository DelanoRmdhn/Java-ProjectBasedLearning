package OOP03_SistemPemesananTiket;

public class Pemesanan {
	Penonton penonton;
	Film film;
	Kursi kursi;
	JadwalTayang jadwal;
	int jumlahTiket;
	
	public Pemesanan(Penonton penonton,Film film, JadwalTayang jadwal,Kursi kursi,int jumlahTiket) {
		this.penonton = penonton;
		this.film = film;
		this.jadwal = jadwal;
		this.kursi = kursi;
		this.jumlahTiket = jumlahTiket;
	}
	
	
	int hitungTotal(int jumlahTiket) {
		return kursi.harga * jumlahTiket;
	}
	
	void tampilkan() {
		penonton.tampilkan();
		film.tampilkanFilm();
		System.out.println("Jenis Kursi: " + kursi.jenisKursi);
		System.out.println("💰 Harga per tiket: " + kursi.harga);
		System.out.println("💵 Tota Bayar: " + hitungTotal(jumlahTiket));
	}
	
}
