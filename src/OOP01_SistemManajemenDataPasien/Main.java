package OOP01_SistemManajemenDataPasien;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pasien p1 = new Pasien("Delano Bariq","Laki-Laki","Demam",19);
		Pasien p2 = new Pasien("Farah Aulia","Perempuan","Batuk",22);
		
		Pasien[] dataPasien = {p1,p2};
		
		System.out.println("\n\n===== Data Pasien Klinik =====\n");
		
		for(int i = 0; i < dataPasien.length; i++) {
			System.out.println("Pasien " + (i+1) + ":");
			dataPasien[i].tampilkanInfo();
		}
		
		System.out.println("Total Pasien yang tercatat: " + dataPasien.length);
		
	}

}
