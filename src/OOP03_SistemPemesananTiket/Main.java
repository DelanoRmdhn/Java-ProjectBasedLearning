package OOP03_SistemPemesananTiket;
import java.util.Scanner;

public class Main {

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
				System.out.println("*************************************************\n");
				
				System.out.println("*************** Jam Tayang Film *****************\n");
				for(int i = 0; i < daftarJamTayang.length; i++) {
					System.out.print("[" + (i+1) + "]");
					daftarJamTayang[i].tampilkanJadwal();
				}
				System.out.println("*************************************************\n");
				
				System.out.println("📃 Masukan Nama film yang ingin ditonton: \n");
				String pilihFilm = input.nextLine();
				
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
