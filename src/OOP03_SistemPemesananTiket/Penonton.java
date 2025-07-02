package OOP03_SistemPemesananTiket;

public class Penonton {
	String nama,noHp;
	
	public Penonton(String nama,String noHp) {
		this.nama = nama;
		this.noHp = noHp;
	}
	
	void tampilkan() {
		System.out.println("👤 Nama: " + nama + "\n📱 No Hp: " + noHp + "\n");
	}
}
