package OOP02_SistemReservasiKamarHotel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardRoom room1 = new StandardRoom(101, 300000, "Standard Room");
		DeluxeRoom	room2 = new DeluxeRoom(201, 500000, "Deluxe Room");
		SuiteRoom room3 = new SuiteRoom(301, 750000, "Suite Room");
		
		Pelanggan p1 = new Pelanggan("Delano Bariq","0821-6937-2548");
		
		Reservasi r1 = new Reservasi(p1,room1,3);
		System.out.println("🏨 Daftar Reservasi Hotal\n");
		r1.tampilkanDetail();
		
		
		
		
	}

}
