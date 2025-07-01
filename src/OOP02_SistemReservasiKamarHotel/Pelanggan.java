package OOP02_SistemReservasiKamarHotel;

public class Pelanggan {
	String nama,noHp;	

	Pelanggan(String nama,String noHp){
		this.nama = nama;
		this.noHp = noHp;
	}
	
	void tampilkanProfil() {
		System.out.println("🤵 Nama Pelanggan: \t" + nama);
		System.out.println("📱 No HP: \t" + noHp);
	}
}
