package com.example.sekolahlist.model;

import com.google.gson.annotations.SerializedName;

public class SchollEntity {

    @SerializedName("_id")
    private String _id;
    @SerializedName("kode_prop")
    private String kode_prop;
    @SerializedName("propinsi")
    private String  propinsi;
    @SerializedName("kode_kab_kota")
    private String  kode_kab_kota;
    @SerializedName("kabupaten_kota")
    private String kabupaten_kota;
    @SerializedName("kode_kec")
    private String kode_kec;

    @SerializedName("kecamatan")
    private String kecamatan;

    @SerializedName("id")
    private String id;

    @SerializedName("npsn")
    private String npsn;

    @SerializedName("sekolah")
    private String sekolah;

    @SerializedName("bentuk")
    private String bentuk;
    @SerializedName("status")
    private String status;

    @SerializedName("alamat_jalan")
    private String alamat_jalan;

    @SerializedName("lintang")
    private String lintang;
    @SerializedName("bujur")
    private String bujur;

    public SchollEntity(String _id, String kode_prop, String propinsi, String kode_kab_Kota, String kabupaten_kota, String kode_kec, String kecamatan, String id, String npsn, String sekolah, String bentuk, String status, String alamat_jalan, String lintang, String bujur) {
        this._id = _id;
        this.kode_prop = kode_prop;
        this.propinsi = propinsi;
        this.kode_kab_kota = kode_kab_Kota;
        this.kabupaten_kota = kabupaten_kota;
        this.kode_kec = kode_kec;
        this.kecamatan = kecamatan;
        this.id = id;
        this.npsn = npsn;
        this.sekolah = sekolah;
        this.bentuk = bentuk;
        this.status = status;
        this.alamat_jalan = alamat_jalan;
        this.lintang = lintang;
        this.bujur = bujur;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getKode_prop() {
        return kode_prop;
    }

    public void setKode_prop(String kode_prop) {
        this.kode_prop = kode_prop;
    }

    public String getPropinsi() {
        return propinsi;
    }

    public void setPropinsi(String propinsi) {
        this.propinsi = propinsi;
    }

    public String getKode_kab_kota() {
        return kode_kab_kota;
    }

    public void setKode_kab_kota(String kode_kab_kota) {
        this.kode_kab_kota = kode_kab_kota;
    }

    public String getKabupaten_kota() {
        return kabupaten_kota;
    }

    public void setKabupaten_kota(String kabupaten_kota) {
        this.kabupaten_kota = kabupaten_kota;
    }

    public String getKode_kec() {
        return kode_kec;
    }

    public void setKode_kec(String kode_kec) {
        this.kode_kec = kode_kec;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNpsn() {
        return npsn;
    }

    public void setNpsn(String npsn) {
        this.npsn = npsn;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAlamat_jalan() {
        return alamat_jalan;
    }

    public void setAlamat_jalan(String alamat_jalan) {
        this.alamat_jalan = alamat_jalan;
    }

    public String getLintang() {
        return lintang;
    }

    public void setLintang(String lintang) {
        this.lintang = lintang;
    }

    public String getBujur() {
        return bujur;
    }

    public void setBujur(String bujur) {
        this.bujur = bujur;
    }
}
