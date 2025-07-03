# 📘 Java - Project Based Learning

Repository ini berisi kumpulan proyek yang saya kerjakan berdasarkan materi pemrograman Java yang telah saya pelajari.  
Setiap konsep diterapkan langsung ke dalam bentuk proyek nyata untuk memperkuat pemahaman dan membangun portofolio pribadi.

---

## 🎯 Tujuan Repository

- 📌 Menyimpan dan mendokumentasikan seluruh proyek pembelajaran Java  
- 📌 Melatih logika pemrograman melalui penerapan kasus nyata  
- 📌 Menjadi portofolio coding pribadi yang terus berkembang  

---

## 📂 Daftar Proyek

### **01. 📊 Project Kalkulator Nilai Mahasiswa**

#### 🧾 Deskripsi Proyek
Simulasi sistem input dan analisis nilai mahasiswa berbasis Java.  
Data disimpan dalam **array 2 dimensi**, di mana setiap baris mewakili satu mahasiswa dan setiap kolom menyimpan nilai dari berbagai mata kuliah.

#### ✨ Fitur-Fitur Utama
- 📥 Input Nilai Mahasiswa menggunakan array 2D  
- 🔁 Perulangan Bersarang (Nested Loop) untuk memproses data  
- ➕ Kalkulasi Total dan Rata-Rata Nilai  
- 🏆 Menentukan Mahasiswa Terbaik  
- 📋 Menampilkan Data dalam Format Tabel

#### 🎯 Tujuan Pembelajaran
- ✅ Memahami konsep dan penggunaan array dua dimensi  
- ✅ Meningkatkan pemahaman tentang perulangan bersarang  
- ✅ Menerapkan logika kalkulasi dan pengambilan keputusan  
- ✅ Melatih format output rapi di console Java

#### 🧑‍💻 Bahasa Pemrograman
- Java (Tanpa OOP – menggunakan struktur dasar: array, loop, kondisi)

---

### **02. 📚 Project Sistem Manajemen Perpustakaan**

#### 🧾 Deskripsi Proyek
Simulasi sistem manajemen perpustakaan berbasis console menggunakan Java.  
Pengguna dapat melihat daftar buku, melakukan peminjaman, dan pengembalian buku.  
Data disimpan menggunakan **array satu dimensi** (judul, pengarang, dan status).

#### ✨ Fitur-Fitur Utama
- 📃 Menampilkan Daftar Buku  
- ⚖ Fitur Peminjaman Buku  
- 🔁 Fitur Pengembalian Buku  
- 🖨 Output ditampilkan dalam bentuk tabel yang rapi (`System.out.printf()`)

#### 🎯 Tujuan Pembelajaran
- ✅ Memahami konsep penggunaan array paralel (`String[]`, `boolean[]`)  
- ✅ Menerapkan logika interaktif (menu dengan `switch-case` dan `do-while`)  
- ✅ Melatih manipulasi status (tersedia/dipinjam)  
- ✅ Menampilkan output tabel sejajar dengan `printf()`  
- ✅ Mensimulasikan sistem dunia nyata secara sederhana

#### 🧑‍💻 Bahasa Pemrograman
- Java (Tanpa OOP – menggunakan struktur dasar: array, loop, kondisi)

#### 🛠 Catatan
> Fitur "Tambah Buku Baru" **belum diimplementasikan** agar fokus tetap pada manajemen data yang sudah tersedia.

---

### **03. 🏥 Project Sistem Manajemen Data Pasien Klinik**

#### 🧾 Deskripsi Proyek
Simulasi sistem pencatatan data pasien di sebuah klinik berbasis console menggunakan Java.  
Setiap pasien memiliki data nama, jenis kelamin, keluhan, usia, dan tanggal kunjungan.  
Data pasien disimpan dalam bentuk **array of object** menggunakan class `Pasien`.

#### ✨ Fitur-Fitur Utama
- 🧍 Menyimpan data beberapa pasien menggunakan class dan object  
- 📋 Menampilkan informasi lengkap setiap pasien  
- 🔍 Mencari data pasien berdasarkan nama  
- ✏ Mengubah informasi pasien  
- 🗑 Menghapus data pasien dari array  
- 🖨 Output ditampilkan dengan format rapi menggunakan `System.out.println()`

#### 🎯 Tujuan Pembelajaran
- ✅ Memahami dan mengimplementasikan `class`, `constructor`, dan `object`  
- ✅ Menerapkan konsep `array of object` dalam studi kasus nyata  
- ✅ Melatih pemanggilan `method` di dalam `loop`  
- ✅ Menggunakan keyword `this` untuk membedakan parameter dan atribut  
- ✅ Menyusun program OOP sederhana dari nol

#### 🧩 Konsep OOP yang Digunakan
- 🏷 Class: Struktur data pasien dengan atribut dan method  
- 🧱 Constructor: Untuk inisialisasi objek `Pasien` saat dibuat  
- ⚙️ Method: Menampilkan dan memperbarui informasi pasien  
- 👤 Object: Mewakili tiap pasien sebagai instance dari class `Pasien`  
- 📦 Array of Object: Menyimpan banyak objek pasien dalam satu array  
- 🔄 Keyword `this`: Membedakan atribut dan parameter

#### 🧑‍💻 Bahasa Pemrograman
- Java (menggunakan dasar-dasar OOP: class, object, method, constructor)

---

### **04. 🏨 Project Sistem Reservasi Kamar Hotel**

#### 🧾 Deskripsi Proyek
Sistem reservasi kamar hotel berbasis console menggunakan konsep **Inheritance** dan **Dependency Injection**.  
Proyek ini memungkinkan pencatatan data pelanggan dan pemesanan kamar berdasarkan tipe kamar dan durasi.

#### ✨ Fitur-Fitur Utama
- 🛌 Menyimpan informasi berbagai tipe kamar: `StandardRoom`, `DeluxeRoom`, dan `SuiteRoom`  
- 🤵 Mencatat data pelanggan hotel  
- 🧾 Membuat reservasi dengan informasi lengkap pelanggan dan kamar  
- 📋 Menampilkan seluruh daftar reservasi  
- 💰 Menghitung total harga berdasarkan durasi menginap

#### 🎯 Tujuan Pembelajaran
- ✅ Memahami konsep inheritance dan penggunaan `super()`  
- ✅ Menerapkan dependency injection melalui constructor  
- ✅ Menyimpan dan menampilkan data berbasis `array of object`  
- ✅ Menerapkan relasi antar class (`is-a`, `has-a`, `dependency`)  
- ✅ Melatih integrasi antara banyak class untuk membangun sistem nyata

#### 🧩 Konsep OOP yang Digunakan
- 🧬 Inheritance: `StandardRoom`, `DeluxeRoom`, `SuiteRoom` merupakan turunan dari class `Kamar`  
- 🧪 Dependency Injection: `Reservasi` menerima `Pelanggan` dan `Kamar` sebagai dependency melalui constructor  
- 📦 Array of Object: Digunakan untuk menyimpan daftar reservasi  
- 🔄 Method Chaining: Beberapa method saling memanggil untuk menampilkan informasi lengkap

#### 🧑‍💻 Bahasa Pemrograman
- Java (OOP – menggunakan konsep inheritance, dependency injection, array of object)

---


### **05. 🎟️ Project Sistem Pemesanan Tiket Bioskop**

#### 🧾 Deskripsi Proyek
Sistem pemesanan tiket bioskop berbasis console yang memungkinkan pengguna melakukan registrasi, memilih film, menentukan jadwal tayang, memilih jenis kursi, dan melakukan pemesanan tiket. Sistem ini menerapkan berbagai konsep relasi antar class dalam OOP serta penggunaan array of object.

#### ✨ Fitur-Fitur Utama
- 👤 Registrasi pengguna sebelum memesan tiket  
- 🎬 Menampilkan daftar film dan jadwal tayang  
- 💺 Memilih jenis kursi (Reguler atau VIP) dan nomor kursi  
- 🧾 Melakukan pemesanan tiket dengan informasi lengkap  
- 📋 Menyimpan dan menampilkan riwayat pemesanan

#### 🎯 Tujuan Pembelajaran
- ✅ Memahami relasi antar class: `association`, `aggregation`, dan `dependency`  
- ✅ Menerapkan inheritance pada class `KursiReguler` dan `KursiVIP` dari `Kursi`  
- ✅ Mengelola data menggunakan `array of object`  
- ✅ Membuat alur interaktif untuk pengguna dalam sistem berbasis teks  
- ✅ Memahami pentingnya modularisasi dengan method terpisah untuk setiap proses

#### 🧩 Konsep OOP yang Digunakan
- 🧬 Inheritance: `KursiReguler` dan `KursiVIP` merupakan turunan dari class `Kursi`  
- 🧱 Association: `Pemesanan` memiliki relasi dengan `Penonton`, `Film`, `JadwalTayang`, dan `Kursi`  
- 🧪 Dependency: `Pemesanan` menerima objek lain sebagai parameter di constructor (tanpa menyimpan beberapa relasi secara permanen di class tertentu)  
- 📦 Array of Object: digunakan untuk menyimpan daftar penonton dan pemesanan  
- 🔄 Method Modular: proses seperti pemilihan kursi dan input user dipisahkan ke method terstruktur

#### 🧑‍💻 Bahasa Pemrograman
- Java (OOP – menggunakan konsep inheritance, aggregation, dependency, array of object)
