package OOP03_SistemPemesananTiket;

public class JadwalTayang {
	Film film;
	String waktu;

	JadwalTayang(Film film, String waktu) {
		this.film = film;
		this.waktu = waktu;
	}
	
	void tampilkanJadwal() {
		film.tampilkanFilm();
		System.out.println("\nJam Tayang: " + waktu + "\n");
	}
	
	
	
}
