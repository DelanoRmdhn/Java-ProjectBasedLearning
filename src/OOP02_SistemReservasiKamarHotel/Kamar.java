package OOP02_SistemReservasiKamarHotel;

public class Kamar {
	int noKamar,harga;
	String tipeKamar;
	
	Kamar(int noKamar,int harga,String tipeKamar){
		this.noKamar = noKamar;
		this.harga = harga;
		this.tipeKamar = tipeKamar;
	}
	void tampilInfo() {
		System.out.println("🛌 Nomor Kamar: \t" + noKamar + "\n"
				+ "🏩 Tipe Kamar: \t" + tipeKamar + "\n" 
				+ "💰 Harga: \tRp." + harga);
		
	}
}
