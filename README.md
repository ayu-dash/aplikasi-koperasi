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

## 🛠️ Langkah-Langkah Instalasi & Penggunaan

### 1️⃣ Download Aplikasi
📦 Unduh installer dari link berikut:

🔗 [Koperasi_RBB_Setup.exe](https://github.com/ayu-dash/aplikasi-koperasi/releases/download/Release/Koperasi_RBB_Setup.exe)

---

### 2️⃣ Aktifkan MySQL via XAMPP
1. Jalankan **XAMPP**
2. Klik tombol **Start** di bagian **MySQL**
3. Pastikan MySQL aktif (warna hijau ✅)

---

### 3️⃣ Import Database SQL
1. Buka browser ke: [http://localhost/phpmyadmin](http://localhost/phpmyadmin)
2. Masuk ke tab **Import**
3. Pilih file SQL berikut:
   - 📄 [koperasi_rbb.sql](https://github.com/ayu-dash/aplikasi-koperasi/blob/main/koperasi_rbb.sql)
4. Klik **Go**
   > File akan otomatis membuat database `koperasi_rbb` dan seluruh tabelnya

---

### 4️⃣ Jalankan Aplikasi
1. Install & buka aplikasi **Koperasi RBB**
2. Pilih **Role: Admin**
3. Masukkan kredensial:
   - 👤 Username: `admin`
   - 🔑 Password: `admin1234`
4. Klik **Login**

---

### 5️⃣ Tambah Nasabah
1. Masuk menu **Pembuatan Akun**
2. Isi data: nama, username, password, dll.
3. Klik **Register**

---

### 6️⃣ Fitur-Fitur Utama 🧾
- Pengajuan & Pembayaran Pinjaman
- Riwayat Simpanan & Angsuran
- Login Multi Role (Admin, Nasabah)

---

## ⚠️ Catatan
- Pastikan MySQL aktif **sebelum** menjalankan aplikasi
- Database otomatis dibuat saat import file `.sql`
- **JRE 17+** wajib agar aplikasi berjalan normal

