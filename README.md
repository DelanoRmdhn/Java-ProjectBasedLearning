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

---

### **01. 📊 Project Kalkulator Nilai Mahasiswa**

#### 🧾 Deskripsi Proyek:
Simulasi sistem input dan analisis nilai mahasiswa berbasis Java. Data disimpan dalam **array 2 dimensi**, di mana setiap baris mewakili satu mahasiswa dan setiap kolom menyimpan nilai dari berbagai mata kuliah.

#### ✨ Fitur-Fitur Utama:
- 📥 Input Nilai Mahasiswa menggunakan array 2D  
- 🔁 Perulangan Bersarang (Nested Loop) untuk memproses data  
- ➕ Kalkulasi Total dan Rata-Rata Nilai  
- 🏆 Menentukan Mahasiswa Terbaik  
- 📋 Menampilkan Data dalam Format Tabel

#### 🎯 Tujuan Pembelajaran:
- ✅ Memahami konsep dan penggunaan array dua dimensi  
- ✅ Meningkatkan pemahaman tentang perulangan bersarang  
- ✅ Menerapkan logika kalkulasi dan pengambilan keputusan  
- ✅ Melatih format output rapi di console Java

#### 🧑‍💻 Bahasa Pemrograman:
- Java (Tanpa OOP – menggunakan struktur dasar: array, loop, kondisi)

---

### **02. 📚 Project Sistem Manajemen Perpustakaan**

#### 🧾 Deskripsi Proyek:
Simulasi sistem manajemen perpustakaan berbasis console menggunakan Java. Pengguna dapat melihat daftar buku, melakukan peminjaman, dan pengembalian buku. Data disimpan menggunakan **array satu dimensi** (judul, pengarang, dan status).

#### ✨ Fitur-Fitur Utama:
- 📃 Menampilkan Daftar Buku  
- ⚖ Fitur Peminjaman Buku  
- 🔁 Fitur Pengembalian Buku  
- 🖨 Output ditampilkan dalam bentuk tabel yang rapi (`System.out.printf()`)

#### 🎯 Tujuan Pembelajaran:
- ✅ Memahami konsep penggunaan array paralel (`String[]`, `boolean[]`)  
- ✅ Menerapkan logika interaktif (menu dengan `switch-case` dan `do-while`)  
- ✅ Melatih manipulasi status (tersedia/dipinjam)  
- ✅ Menampilkan output tabel sejajar dengan `printf()`  
- ✅ Mensimulasikan sistem dunia nyata secara sederhana

#### 🧑‍💻 Bahasa Pemrograman:
- Java (Tanpa OOP – menggunakan struktur dasar: array, loop, kondisi)

#### 🛠 Catatan:
> Fitur "Tambah Buku Baru" **belum diimplementasikan** agar fokus tetap pada manajemen data yang sudah tersedia.

---

### **03. 🏥 Project Sistem Manajemen Data Pasien Klinik**

#### 🧾 Deskripsi Proyek:
Simulasi sistem pencatatan data pasien di sebuah klinik berbasis console menggunakan Java. Setiap pasien memiliki data nama, jenis kelamin, keluhan, usia, dan tanggal kunjungan. Data pasien disimpan dalam bentuk **array of object** menggunakan class `Pasien`.

#### ✨ Fitur-Fitur Utama:
- 🧍 Menyimpan data beberapa pasien menggunakan class dan object  
- 📋 Menampilkan informasi lengkap setiap pasien  
- 🔍 Mencari data pasien berdasarkan nama  
- ✏ Mengubah informasi pasien  
- 🗑 Menghapus data pasien dari array  
- 🖨 Output ditampilkan dengan format rapi menggunakan `System.out.println()`

---

## 🎯 Tujuan Pembelajaran

- ✅ **Memahami dan mengimplementasikan** `class`, `constructor`, dan `object`  
- ✅ **Menerapkan konsep** `array of object` dalam studi kasus nyata  
- ✅ **Melatih pemanggilan** `method` di dalam `loop`  
- ✅ **Menggunakan keyword** `this` untuk membedakan parameter dan atribut  
- ✅ **Menyusun program OOP sederhana dari nol**

---

## 🧩 Konsep OOP yang Digunakan

- 🏷 **Class**: Mendefinisikan struktur data pasien dengan atribut dan method  
- 🧱 **Constructor**: Untuk menginisialisasi objek `Pasien` saat dibuat  
- ⚙️ **Method (Function)**: Menampilkan dan memperbarui informasi pasien  
- 👤 **Object**: Mewakili tiap pasien sebagai instance dari class `Pasien`  
- 📦 **Array of Object**: Menyimpan banyak objek `Pasien` dalam satu array  
- 🔄 **Keyword `this`**: Digunakan untuk membedakan antara atribut dan parameter

## 🧑‍💻 Bahasa Pemrograman

- **Java** (menggunakan dasar-dasar OOP: `class`, `object`, `method`, `constructor`)
---

#### 📁 Struktur Kelas:
```text
📦 OOP01_SistemManajemenDataPasien
├── 🧾 Pasien.java
│   ├── String nama
│   ├── String jenisKelamin
│   ├── String keluhan
│   ├── int usia
│   ├── String tanggalKunjungan
│   ├── void tampilkanInfo()
│   ├── void updateData(String keluhanBaru, int usiaBaru, String tanggalBaru)
│   └── boolean namaSamaDengan(String nama)
│
└── 🖥 Main.java
    ├── Scanner input
    ├── Pasien[] dataPasien = new Pasien[10]
    ├── do-while loop → menampilkan menu interaktif
    ├── switch-case:
    │   ├── 1 → Tampilkan semua data
    │   ├── 2 → Cari pasien berdasarkan nama
    │   ├── 3 → Tambah data pasien baru
    │   ├── 4 → Update data pasien
    │   └── 5 → Hapus data pasien
    └── Validasi & logika pengelolaan array
