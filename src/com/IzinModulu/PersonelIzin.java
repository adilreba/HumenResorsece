package com.IzinModulu;

public class PersonelIzin {
//personel izin
    private String TCnumarasi;
    private String izinTuru;
    private String izinKulanacakAdres;
    private String izinBaslangicTarihi;
    private String izinBitisTarihi;
    private String iseBaslamaTarihi;
    private String kulanilanIzinGunSayisi;
    private int tatileDenkGelenIzinGunSayisi;
    private String yillikIzinDisindaKulLanilanIzinGunSayisi;


    public PersonelIzin(String TCnumarasi, String izinTuru, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi, String iseBaslamaTarihi, String kulanilanIzinGunSayisi, int tatileDenkGelenIzinGunSayisi, String yillikIzinDisindaKulLanilanIzinGunSayisi) {
        this.TCnumarasi = TCnumarasi;
        this.izinTuru = izinTuru;
        this.izinKulanacakAdres = izinKulanacakAdres;
        this.izinBaslangicTarihi = izinBaslangicTarihi;
        this.izinBitisTarihi = izinBitisTarihi;
        this.iseBaslamaTarihi = iseBaslamaTarihi;
        this.kulanilanIzinGunSayisi = kulanilanIzinGunSayisi;
        this.tatileDenkGelenIzinGunSayisi = tatileDenkGelenIzinGunSayisi;
        this.yillikIzinDisindaKulLanilanIzinGunSayisi = yillikIzinDisindaKulLanilanIzinGunSayisi;
    }

    public String getTCnumarasi() {
        return TCnumarasi;
    }

    public void setTCnumarasi(String TCnumarasi) {
        this.TCnumarasi = TCnumarasi;
    }

    public String getIzinTuru() {
        return izinTuru;
    }

    public void setIzinTuru(String izinTuru) {
        this.izinTuru = izinTuru;
    }

    public String getIzinKulanacakAdres() {
        return izinKulanacakAdres;
    }

    public void setIzinKulanacakAdres(String izinKulanacakAdres) {
        this.izinKulanacakAdres = izinKulanacakAdres;
    }

    public String getIzinBaslangicTarihi() {
        return izinBaslangicTarihi;
    }

    public void setIzinBaslangicTarihi(String izinBaslangicTarihi) {
        this.izinBaslangicTarihi = izinBaslangicTarihi;
    }

    public String getIzinBitisTarihi() {
        return izinBitisTarihi;
    }

    public void setIzinBitisTarihi(String izinBitisTarihi) {
        this.izinBitisTarihi = izinBitisTarihi;
    }

    public String getIseBaslamaTarihi() {
        return iseBaslamaTarihi;
    }

    public void setIseBaslamaTarihi(String iseBaslamaTarihi) {
        this.iseBaslamaTarihi = iseBaslamaTarihi;
    }

    public String getKulanilanIzinGunSayisi() {
        return kulanilanIzinGunSayisi;
    }

    public void setKulanilanIzinGunSayisi(String kulanilanIzinGunSayisi) {
        this.kulanilanIzinGunSayisi = kulanilanIzinGunSayisi;
    }
    public int getTatileDenkGelenIzinGunSayisi() {
        return tatileDenkGelenIzinGunSayisi;
    }

    public void setTatileDenkGelenIzinGunSayisi(int tatileDenkGelenIzinGunSayisi) {
        this.tatileDenkGelenIzinGunSayisi = tatileDenkGelenIzinGunSayisi;
    }

    public String getYillikIzinDisindaKulLanilanIzinGunSayisi() {
        return yillikIzinDisindaKulLanilanIzinGunSayisi;
    }

    public void setYillikIzinDisindaKulLanilanIzinGunSayisi(String yillikIzinDisindaKulLanilanIzinGunSayisi) {
        this.yillikIzinDisindaKulLanilanIzinGunSayisi = yillikIzinDisindaKulLanilanIzinGunSayisi;
    }
}
