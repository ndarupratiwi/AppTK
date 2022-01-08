package com.example.apptk.Model;

import com.google.gson.annotations.SerializedName;

public class Siswa {
    @SerializedName("id")
    private String id;
    @SerializedName("username")
    private String username;
    @SerializedName("no_induk")
    private String no_induk;
    @SerializedName("nama_lengkap")
    private String nama_lengkap;
    @SerializedName("kelompok")
    private String kelompok;
    @SerializedName("ttl")
    private String ttl;
    @SerializedName("jenkel")
    private String jenkel;
    @SerializedName("agama")
    private String agama;
    @SerializedName("nama_ayah")
    private String nama_ayah;
    @SerializedName("pekerjaan_ayah")
    private String pekerjaan_ayah;
    @SerializedName("nama_ibu")
    private String nama_ibu;
    @SerializedName("pekerjaan_ibu")
    private String pekerjaan_ibu;
    @SerializedName("anak_ke")
    private String anak_ke;
    @SerializedName("hobi")
    private String hobi;
    @SerializedName("hubungan_keluarga")
    private String hubungan_keluarga;
    @SerializedName("pend_terakhir_ayah")
    private String pend_terakhir_ayah;
    @SerializedName("pend_terakhir_ibu")
    private String pend_terakhir_ibu;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("email")
    private String email;
    @SerializedName("telp")
    private String telp;
    @SerializedName("tapel")
    private String tapel;
    @SerializedName("foto")
    private String foto;

    private Siswa(){}
    public Siswa(String id, String username, String no_induk, String nama_lengkap, String kelompok, String jenkel, String ttl, String agama, String nama_ayah, String pekerjaan_ayah, String nama_ibu, String pekerjaan_ibu, String anak_ke, String hobi, String pend_terakhir_ayah, String pend_terakhir_ibu, String hubungan_keluarga, String alamat, String email, String telp, String foto, String tapel){
        this.id = id;
        this.username = username;
        this.no_induk = no_induk;
        this.nama_lengkap = nama_lengkap;
        this.kelompok = kelompok;
        this.jenkel = jenkel;
        this.ttl = ttl;
        this.agama = agama;
        this.nama_ayah = nama_ayah;
        this.pekerjaan_ayah = pekerjaan_ayah;
        this.nama_ibu = nama_ibu;
        this.pekerjaan_ibu = pekerjaan_ibu;
        this.anak_ke = anak_ke;
        this.hobi = hobi;
        this.hubungan_keluarga = hubungan_keluarga;
        this.pend_terakhir_ayah = pend_terakhir_ayah;
        this.pend_terakhir_ibu = pend_terakhir_ibu;
        this.alamat = alamat;
        this.email = email;
        this.telp = telp;
        this.tapel = tapel;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNo_induk() {
        return no_induk;
    }

    public void setNo_induk(String no_induk) {
        this.no_induk = no_induk;
    }

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getKelompok() {
        return kelompok;
    }

    public void setKelompok(String kelompok) {
        this.kelompok = kelompok;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getNama_ayah() {
        return nama_ayah;
    }

    public void setNama_ayah(String nama_ayah) {
        this.nama_ayah = nama_ayah;
    }

    public String getPekerjaan_ayah() {
        return pekerjaan_ayah;
    }

    public void setPekerjaan_ayah(String pekerjaan_ayah) {
        this.pekerjaan_ayah = pekerjaan_ayah;
    }

    public String getNama_ibu() {
        return nama_ibu;
    }

    public void setNama_ibu(String nama_ibu) {
        this.nama_ibu = nama_ibu;
    }

    public String getPekerjaan_ibu() {
        return pekerjaan_ibu;
    }

    public void setPekerjaan_ibu(String pekerjaan_ibu) {
        this.pekerjaan_ibu = pekerjaan_ibu;
    }

    public String getAnak_ke() {
        return anak_ke;
    }

    public void setAnak_ke(String anak_ke) {
        this.anak_ke = anak_ke;
    }

    public String getHobi() {
        return hobi;
    }

    public void setHobi(String hobi) {
        this.hobi = hobi;
    }

    public String getHubungan_keluarga() {
        return hubungan_keluarga;
    }

    public void setHubungan_keluarga(String hubungan_keluarga) {
        this.hubungan_keluarga = hubungan_keluarga;
    }

    public String getPend_terakhir_ayah() {
        return pend_terakhir_ayah;
    }

    public void setPend_terakhir_ayah(String pend_terakhir_ayah) {
        this.pend_terakhir_ayah = pend_terakhir_ayah;
    }

    public String getPend_terakhir_ibu() {
        return pend_terakhir_ibu;
    }

    public void setPend_terakhir_ibu(String pend_terakhir_ibu) {
        this.pend_terakhir_ibu = pend_terakhir_ibu;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getTapel() {
        return tapel;
    }

    public void setTapel(String tapel) {
        this.tapel = tapel;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


}
