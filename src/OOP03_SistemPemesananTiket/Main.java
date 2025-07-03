package OOP03_SistemPemesananTiket;
import java.util.Scanner;

public class Main {

	public static void spacer() {
		System.out.println("*************************************************\n");
	}
	
	public static String pemilihanKursi(Scanner input) {
		System.out.println("💺 Pilih Jenis Kursi (Kursi Reguler/VIP): ");
		String pilihKursi = input.nextLine();
		return pilihKursi;
	}
	
	public static int pesanKursi(Scanner input) {
		System.out.println("\n👫 Jumlah Kursi yang ingin dipesan: ");
		int jumlahKursi = input.nextInt();
		return jumlahKursi;
	}
	
	public static void cetakPemesananKursiReguler(Scanner input,int jumlahKursi) {
		int pilihNomor;
		for(int i = 1; i <= jumlahKursi; i++) {
			System.out.println("\n🔢 Masukan Nomor Kursi " + i +": ");
			pilihNomor = input.nextInt();
			 
			if(pilihNomor > 100 && pilihNomor < 106) {
				System.out.println("\n✅ Berhasil memesan kursi nomor " + pilihNomor);
			}else{
				System.out.println("\n❌ Pilih nomor yang tersedia.");
				break;
			}					
		}
	}
	
	public static void cetakPemesananKursiVip(Scanner input,int jumlahKursi) {
		int pilihNomor;
		for(int i = 1; i <= jumlahKursi; i++) {
			System.out.println("\n🔢 Masukan Nomor Kursi " + i +": ");
			pilihNomor = input.nextInt();
			 
			if(pilihNomor > 200 && pilihNomor < 206) {
				System.out.println("\n✅ Berhasil memesan kursi nomor " + pilihNomor);
			}else{
				System.out.println("\n❌ Pilih nomor yang tersedia.");
				break;
			}					
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;	
		
		//Array DaftarPenonton
		Penonton[] daftarPenonton = new Penonton[10];
		int totalPenonton = 0;
		
		//Object Film
		Film f1 = new Film("Interstellar","Thriller");
		Film f2 = new Film("Oppenheimer","Documenter");
		Film f3 = new Film("Iron Man 3","Fiction");
		
		//Array DaftarFilm
		Film[] daftarFilm = {f1,f2,f3};
		
		//Object JadwalTayang
		JadwalTayang jt1 = new JadwalTayang(f1, "10:00");
		JadwalTayang jt2 = new JadwalTayang(f2, "20:00");
		JadwalTayang jt3 = new JadwalTayang(f3, "13:45");
		
		//Array JadwalTayang
		JadwalTayang[] daftarJamTayang = {jt1,jt2,jt3};
		
		//Array Pemesanan
		Pemesanan[] daftarPemesanan = new Pemesanan[10];
		int totalPemesananTiket = 0;
		
		//Array Kursi
		int[] kursiReguler = {101,102,103,104,105};
		int[] kursiVip = {201,202,203,204,205};
		

		do {
			System.out.println("\n==================== 🎟 SISTEM PEMESANAN TIKET BIOSKOP ====================\n");
			System.out.println("1. ➕ Registrasi Pengunjung\n"
							 + "2. 🎥 Pemesanan Tiket\n"
							 + "3. x Keluar dari Sistem\n");
			
			System.out.println("Masukan Menu (1-3): ");
			userInput = input.nextInt();
			input.nextLine();
			
			switch(userInput) {
			case 1 : 
				System.out.println("-------------------- Menu Registrasi Pengunjung --------------------\n");
				
				System.out.println("👤 Masukan Nama Anda: \n");
				String namaPemesan = input.nextLine();
				
				System.out.println("📱 Masukan Nomor Telepon: ");
				String noHp = input.nextLine();
				
				System.out.println("✅ Registrasi Berhasil, Selamat datang!");
				
				daftarPenonton[totalPenonton] = new Penonton(namaPemesan, noHp);
				totalPenonton++;
				
				break;
				
			case 2 : 
				System.out.println("-------------------- Menu Pemesanan Tiket --------------------\n");
				if(totalPenonton == 0) {
					System.out.println("❌ Kamu Belum Registrasi! Harap Registrasi terlebih dahulu 🙏");
					break;
				}
				
				//Tampilin Film-Film yang tersedia
				System.out.println("*************** Daftar Film Putar ***************\n");
				for(int i = 0; i < daftarFilm.length; i++) {
					System.out.print("[F" + (i+1)+ "]. ");
					daftarFilm[i].tampilkanFilm();
				}
				spacer();
				
				
				System.out.println("*************** Jam Tayang Film *****************\n");
				for(int i = 0; i < daftarJamTayang.length; i++) {
					System.out.print("[" + (i+1) + "]");
					daftarJamTayang[i].tampilkanJadwal();
				}
				spacer();
				
				System.out.println("📃 Masukan Nama film yang ingin ditonton: \n");
				String pilihFilm = input.nextLine();
				
				if(pilihFilm.equalsIgnoreCase("Interstellar")) {
					
					String pilihKursi = pemilihanKursi(input);
					
					if(pilihKursi.equalsIgnoreCase("Reguler")) {
						
						KursiReguler kReguler = new KursiReguler(kursiReguler);
						kReguler.tampilkan();

						int jumlahKursiDipesan = pesanKursi(input);
						cetakPemesananKursiReguler(input, jumlahKursiDipesan);
						
						daftarPemesanan[totalPemesananTiket] = new Pemesanan(daftarPenonton[totalPenonton-1],f1,jt1,kReguler,jumlahKursiDipesan);
						daftarPemesanan[totalPemesananTiket].tampilkan();
						totalPemesananTiket++;
						
					} else if(pilihKursi.equalsIgnoreCase("VIP")) {
						
						KursiVIP kVip= new KursiVIP(kursiVip);
						kVip.tampilkan();
						
						int jumlahKursiDipesan = pesanKursi(input);
						cetakPemesananKursiVip(input, jumlahKursiDipesan);
						
						daftarPemesanan[totalPemesananTiket] = new Pemesanan(daftarPenonton[totalPenonton-1],f1,jt1,kVip,jumlahKursiDipesan);
						daftarPemesanan[totalPemesananTiket].tampilkan();
						totalPemesananTiket++;
						
					}
				}
				
				else if(pilihFilm.equalsIgnoreCase("Oppenheimer")) {
					
					String pilihKursi = pemilihanKursi(input);
					
					if(pilihKursi.equalsIgnoreCase("Reguler")) {
						
						KursiReguler kReguler = new KursiReguler(kursiReguler);
						kReguler.tampilkan();

						int jumlahKursiDipesan = pesanKursi(input);
						cetakPemesananKursiReguler(input, jumlahKursiDipesan);
						
						daftarPemesanan[totalPemesananTiket] = new Pemesanan(daftarPenonton[totalPenonton-1],f2,jt2,kReguler,jumlahKursiDipesan);
						daftarPemesanan[totalPemesananTiket].tampilkan();
						totalPemesananTiket++;
						
					} else if(pilihKursi.equalsIgnoreCase("VIP")) {
						
						KursiVIP kVip= new KursiVIP(kursiVip);
						kVip.tampilkan();
						
						int jumlahKursiDipesan = pesanKursi(input);
						cetakPemesananKursiVip(input, jumlahKursiDipesan);
						
						daftarPemesanan[totalPemesananTiket] = new Pemesanan(daftarPenonton[totalPenonton-1],f2,jt2,kVip,jumlahKursiDipesan);
						daftarPemesanan[totalPemesananTiket].tampilkan();
						totalPemesananTiket++;
						
					}
					
				} else if(pilihFilm.equalsIgnoreCase("Iron Man 3")) {
					
					String pilihKursi = pemilihanKursi(input);
					
					if(pilihKursi.equalsIgnoreCase("Reguler")) {
						
						KursiReguler kReguler = new KursiReguler(kursiReguler);
						kReguler.tampilkan();

						int jumlahKursiDipesan = pesanKursi(input);
						cetakPemesananKursiReguler(input, jumlahKursiDipesan);
						
						daftarPemesanan[totalPemesananTiket] = new Pemesanan(daftarPenonton[totalPenonton-1],f2,jt2,kReguler,jumlahKursiDipesan);
						daftarPemesanan[totalPemesananTiket].tampilkan();
						totalPemesananTiket++;
						
					} else if(pilihKursi.equalsIgnoreCase("VIP")) {
						
						KursiVIP kVip= new KursiVIP(kursiVip);
						kVip.tampilkan();
						
						int jumlahKursiDipesan = pesanKursi(input);
						cetakPemesananKursiVip(input, jumlahKursiDipesan);
						
						daftarPemesanan[totalPemesananTiket] = new Pemesanan(daftarPenonton[totalPenonton-1],f2,jt2,kVip,jumlahKursiDipesan);
						daftarPemesanan[totalPemesananTiket].tampilkan();
						totalPemesananTiket++;
						
					}
					
					
				} else {
					System.out.println("❌ Tidak ada Film dengan nama " + pilihFilm + ".");
				}
				
				break;
				
			case 3 : 
				System.out.println("🙏 Terima Kasih sudah Berkunjung");
				break;
				
			default :
				System.out.println("⚠ Inputan tidak valid!");
			}
			
			
		} while(userInput != 3);
	}

}
