# 📦 Aplikasi Koperasi

Aplikasi ini dibuat sebagai tugas akhir mata kuliah **Pemrograman 1**. Sistem koperasi ini berbasis desktop dan dirancang untuk mengelola data nasabah, simpanan, dan transaksi lainnya secara efisien.

## 👥 Anggota Kelompok

- Adrian Yudhaswara
- Amr Emirate Abdurahman
- Andika Galih Pangestu
- Muhammad Aziz Mufashshal
- Muhammad Rifqy Pratama

## ⚙️ Teknologi yang Digunakan

- **Java** — Bahasa pemrograman utama
- **Swing (Java GUI)** — Antarmuka pengguna
- **MySQL** — Basis data
- **JDBC** — Koneksi database
- **Apache Ant** — Sistem build
- **NetBeans** — IDE untuk pengembangan dan build project

## 🚀 Fitur Utama

- Manajemen data **Nasabah** (CRUD)
- Manajemen **Jabatan**
- Input dan pencatatan **Simpanan**
- Validasi data & login berbasis hashing password
- Tampilan GUI yang interaktif
- Penanganan status nasabah (**Aktif**, **Suspend**)

## 🖥️ System Requirement
- ✅ **Java Runtime Environment (JRE) 17 atau lebih tinggi**
- ✅ MySQL

## 🛠️ Langkah-Langkah Instalasi & Penggunaan Aplikasi

### 1️⃣ Download Aplikasi
📦 Unduh installer dari link berikut:

🔗 [Koperasi_RBB_Setup.exe](https://github.com/ayu-dash/aplikasi-koperasi/releases/download/Release/Koperasi_RBB_Setup.exe)

---

### 2️⃣ Pastikan Java Terinstal
☕ Aplikasi membutuhkan **Java Runtime Environment (JRE) versi 17 atau lebih tinggi**.

- Download JRE: [https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- Setelah diinstal, pastikan perintah `java -version` di terminal/command prompt menunjukkan versi 17+

---

### 3️⃣ Aktifkan XAMPP (MySQL)
1. Buka aplikasi **XAMPP**
2. Klik **Start** pada module **MySQL**
3. Pastikan MySQL berjalan (ikon berubah hijau ✅)

---

### 4️⃣ Import Database SQL
1. Akses browser ke 👉 [http://localhost/phpmyadmin](http://localhost/phpmyadmin)
2. Buat database baru, contoh: `koperasi`
3. Masuk ke tab **Import**
4. Download file SQL dari link berikut:
   - 📄 [koperasi_rbb.sql](https://github.com/ayu-dash/aplikasi-koperasi/blob/main/koperasi_rbb.sql)
5. Pilih file tersebut dan klik **Go** untuk memulai impor

---

### 5️⃣ Jalankan Aplikasi & Login
1. Buka file `Koperasi_RBB_Setup.exe`
2. Pilih **Role: Admin**
3. Login menggunakan:
   - 👤 Username: `admin`
   - 🔑 Password: `admin1234`

---

### 6️⃣ Tambah Data Nasabah
1. Masuk ke menu **Manajemen Nasabah**
2. Klik **Tambah Nasabah**
3. Isi data seperti:
   - NIK, Nama, Username, Password, dll
4. Klik **Simpan**

---

### 7️⃣ Gunakan Fitur Aplikasi 🎯
- 🧾 Pengajuan & Pembayaran Pinjaman
- 💳 Riwayat Pembayaran Nasabah
- 📊 Dashboard Keuangan Nasabah
- 👤 Akses Login Multi-Role (Admin, Nasabah)

---

🚨 **Catatan:** Jika aplikasi tidak berjalan, pastikan:
- MySQL XAMPP aktif
- JRE 17+ sudah terinstal
- Database `koperasi_rbb` sudah diimpor

---
