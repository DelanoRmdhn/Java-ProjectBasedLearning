package OOP02_SistemReservasiKamarHotel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array dependency dari Class Reservasi
		Reservasi[] daftarReservasi = new Reservasi[10];
		int counter = 0;
		
		StandardRoom room1 = new StandardRoom(101, 300000, "Standard Room");
		DeluxeRoom	room2 = new DeluxeRoom(201, 500000, "Deluxe Room");
		SuiteRoom room3 = new SuiteRoom(301, 750000, "Suite Room");
		
		Pelanggan p1 = new Pelanggan("Delano Bariq","0821-6937-2548");
		Pelanggan p2 = new Pelanggan("Andi Prasetyo","0812-3456-7890");
		Pelanggan p3 = new Pelanggan("Hanah Smith","0899-9991-1119");
		
		Reservasi r1 = new Reservasi(p1,room1,3);
		Reservasi r2 = new Reservasi(p2,room2,2);
		Reservasi r3 = new Reservasi(p3,room3,5);
		
		
		//Tambah data ke array
		daftarReservasi[counter] = r1;
		counter++;
		
		daftarReservasi[counter] = r2;
		counter++;
		
		daftarReservasi[counter] = r3;
		counter++;
		
		//OUTPUT
		System.out.println("🏨 Daftar Reservasi Hotel\n\n");
		System.out.println("===================================");
		
		for(int i = 0; i < counter; i++) {
			daftarReservasi[i].tampilkanDetail();
			System.out.println("===================================");

		}
		
	}

}
