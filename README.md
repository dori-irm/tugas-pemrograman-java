# Tugas Pemrograman Java Dasar

![Java CI](https://github.com/dori-irm/tugas-pemrograman-java/actions/workflows/java-ci.yml/badge.svg)

Kumpulan program dasar menggunakan bahasa pemrograman Java untuk memenuhi tugas perkuliahan.

## Identitas Mahasiswa

- **Nama:** Dori Irmawan
- **NIM:** 2510075 (Ganjil)
- **GitHub:** [@dori-irm](https://github.com/dori-irm)

## Daftar File Program

1. **`Main.java`**
   Program utama berisi menu interaktif menggunakan percabangan `switch-case` dan perulangan `do-while` untuk menjalankan ketiga program sekaligus dalam satu aplikasi.
2. **`BilanganGenap.java`**
   Menampilkan deret bilangan genap antara `1` hingga `100` menggunakan perulangan `for` (sesuai ketentuan NIM/NIK Ganjil).
3. **`LuasPersegiPanjang.java`**
   Menghitung luas persegi panjang dengan nilai `panjang = 5` dan `lebar = 8` (menghasilkan luas `40`).
4. **`hitung_nilai.java`**
   Menentukan predikat nilai (`Grade A` hingga `Grade E`) berdasarkan input pengguna menggunakan struktur kondisi `if-else`.

## Cara Menjalankan Program

### 1. Melalui Terminal Lokal (Komputer/Laptop)
Pastikan **JDK (Java Development Kit)** sudah terinstal, lalu jalankan perintah berikut:

```bash
# Menjalankan menu interaktif (semua program)
javac Main.java
java Main
```

Atau jalankan secara terpisah per file:

```bash
# Kompilasi
javac BilanganGenap.java LuasPersegiPanjang.java hitung_nilai.java

# Eksekusi
java BilanganGenap
java LuasPersegiPanjang
java hitung_nilai
```

### 2. Langsung di Browser (GitHub Codespaces)
1. Klik tombol hijau **Code** di halaman repositori ini.
2. Pilih tab **Codespaces**, lalu klik **Create codespace on main**.
3. Setelah terminal terbuka, ketik `javac Main.java && java Main`.
