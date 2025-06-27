package arrayAndLoop;
import java.util.Scanner;

public class Project02_ManagemenPerpustakaan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userInput;
		
		
		String [] buku = {"Laskar Pelangi","Atomic Habits","Tentang Kita"};
		String [] pengarangBuku = {"Andrea H","James Clear","Tere Liye"};
		boolean [] status = {true,false,false};
		
		
		do {
		System.out.println("============== 📚 SISTEM MANAJEMEN PERPUSTAKAAN ==============\n\n");
		System.out.println("1. 📃 Lihat Daftar Buku\n"
						 + "2. ⚖ Pinjam Buku\n"
						 + "3. 🔁 Kembalikan Buku\n"
						 + "9. ⬅ Keluar");
	
		System.out.println("\nMasukan Angka Menu : ");
		userInput = input.nextInt();
		
		switch(userInput) {
			case 1 : 
				
				for(int i = 0; i < buku.length; i++) {
					if(buku[i] == null) {
						System.out.println("❌ Buku di Perpustakaan Masih Kosong !");
						break;
					}
				}
				
				System.out.println("\n📚 Daftar Buku:\n");
				System.out.printf("%-4s| %-30s| %-20s| %-10s\n", "No", "Judul Buku", "Pengarang", "Status");
				System.out.println("----------------------------------------------------------------------------");

				for (int i = 0; i < buku.length; i++) {
				    System.out.printf("%-4d| %-30s| %-20s| %-10s\n", 
				        (i + 1), 
				        buku[i], 
				        pengarangBuku[i], 
				        status[i] ? "Tersedia" : "Dipinjam"
				    );
				}
				System.out.println("----------------------------------------------------------------------------\n");

				
			break;
			
			case 2 :
				input.nextLine();
				System.out.println("======= PINJAM BUKU =======");
				System.out.println("Masukan nomor buku yang ingin dipinjam :");
				
				int indexPinjamBuku = input.nextInt() - 1;
				
				if(status[indexPinjamBuku] == true) {
					System.out.println("📗 Buku '" + buku[indexPinjamBuku] + "' Berhasil Dipinjam.");
					status[indexPinjamBuku] = false;
				} else {
					System.out.println("❌ Buku '" + buku[indexPinjamBuku] + "' Sedang dipinjam. Silahkan pilih buku lain.");
				}
						
			break;
			
			case 3 :
				System.out.println("======= KEMBALIKAN BUKU =======");
				System.out.println("Masukan nomor buku yang ingin dikembalikan :");
				
				int indexKembalikanBuku = input.nextInt() - 1;
				
				if(status[indexKembalikanBuku] == false) {
					System.out.println("📘 Buku '" + buku[indexKembalikanBuku] + "' berhasil dikembalikan. Terima Kasih!");
					status[indexKembalikanBuku] = true;
				} else {
					System.out.println("❗ Buku '" + buku[indexKembalikanBuku] + "' belum dipinjam. Tidak Perlu dikembalikan.");
				}
				
			break;
			
			case 9 :
				System.out.println("📌 Program Selesai. Terima Kasih telah menggunakan sistem!");
				
			break;
			
			default : 
				System.out.println("Harap Masukan Angka Sesuai yang ada pada Menu (1-5).");
		}
		
		
		}
		while(userInput != 9);
	}

}
