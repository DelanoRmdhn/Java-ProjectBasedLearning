package OOP03_SistemPemesananTiket;

public class Kursi {
	int[] noKursi;
	int harga;
	String jenisKursi;
	
	
	public Kursi(int[] noKursi) {
		this.noKursi = noKursi;
	}
	
	void tampilkan() {
		for(int i = 0; i < noKursi.length; i++) {
			System.out.println("🔢 Nomor Kursi: " + noKursi[i] + "\n💰 Harga: " + harga);
		}
	}
	
}
