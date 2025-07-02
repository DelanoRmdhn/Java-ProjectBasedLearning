package OOP03_SistemPemesananTiket;

public class Film {
	String judul,genre;
	
	Film(String judul,String genre){
		this.judul = judul;
		this.genre = genre;
	}
	
	void tampilkanFilm() {
		System.out.println("🎬 Judul Film: " + judul + "\n📃 Genre: " + genre);
		System.out.println("");
	}
}
