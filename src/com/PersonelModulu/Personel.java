package com.PersonelModulu;

import com.IzinModulu.PersonelIzin;

import java.util.ArrayList;
import java.util.List;

public class Personel {

//personel
   private String adiSoyadi;
   private String TCnumarasi;
   private String dogumTarihi;
   private String iseGirisTarihi;
   private String izinHakEdisTarihi;
   private int calismaGunSayisi;
   private int hakEttigiIzinGunSayisi;
   private int kullanilanIzinGunSayisi;
   private int kalanizinGunSayisi;
   private String bolum;

   private List<PersonelIzin> personelIzinList;


    public Personel(String adiSoyadi, String TCnumarasi, String dogumTarihi, String iseGirisTarihi, String izinHakEdisTarihi, int calismaGunSayisi, int hakEttigiIzinGunSayisi, int kullanilanIzinGunSayisi, int kalanizinGunSayisi, String bolum) {
        this.adiSoyadi = adiSoyadi;
        this.TCnumarasi = TCnumarasi;
        this.dogumTarihi = dogumTarihi;
        this.iseGirisTarihi = iseGirisTarihi;
        this.izinHakEdisTarihi = izinHakEdisTarihi;
        this.calismaGunSayisi = calismaGunSayisi;
        this.hakEttigiIzinGunSayisi = hakEttigiIzinGunSayisi;

        this.kullanilanIzinGunSayisi = kullanilanIzinGunSayisi;
        this.kalanizinGunSayisi = kalanizinGunSayisi;
        this.bolum = bolum;

        personelIzinList = new ArrayList<PersonelIzin>();
    }
//
    public void eklePersonelIzin(PersonelIzin personelIzin){
        this.personelIzinList.add(personelIzin);
    }

    public List<PersonelIzin> getPersonelIzinList() {
        return personelIzinList;
    }

    public String getAdiSoyadi() {
        return adiSoyadi;
    }

    public void setAdiSoyadi(String adiSoyadi) {
        this.adiSoyadi = adiSoyadi;
    }

    public String getTCnumarasi() {
        return TCnumarasi;
    }

    public void setTCnumarasi(String TCnumarasi) {
        this.TCnumarasi = TCnumarasi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getIseGirisTarihi() {
        return iseGirisTarihi;
    }

    public void setIseGirisTarihi(String iseGirisTarihi) {
        this.iseGirisTarihi = iseGirisTarihi;
    }

    public String getIzinHakEdisTarihi() {
        return izinHakEdisTarihi;
    }

    public void setIzinHakEdisTarihi(String izinHakEdisTarihi) {
        this.izinHakEdisTarihi = izinHakEdisTarihi;
    }

    public int getCalismaGunSayisi() {
        return calismaGunSayisi;
    }

    public void setCalismaGunSayisi(int calismaGunSayisi) {
        this.calismaGunSayisi = calismaGunSayisi;
    }

    public int getHakEttigiIzinGunSayisi() {
        return hakEttigiIzinGunSayisi;
    }

    public void setHakEttigiIzinGunSayisi(int hakEttigiIzinGunSayisi) {
        this.hakEttigiIzinGunSayisi = hakEttigiIzinGunSayisi;
    }

    public int getKullanilanIzinGunSayisi() {
        return kullanilanIzinGunSayisi;
    }

    public void setKullanilanIzinGunSayisi(int kullanilanIzinGunSayisi) {
        this.kullanilanIzinGunSayisi = kullanilanIzinGunSayisi;
    }

    public int getKalanizinGunSayisi() {
        return kalanizinGunSayisi;
    }

    public void setKalanizinGunSayisi(int kalanizinGunSayisi) {
        this.kalanizinGunSayisi = kalanizinGunSayisi;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }


    // class içindeki
    @Override
    public String toString() {
        return "Personel{" +
                "adiSoyadi='" + adiSoyadi + '\'' +
                ", TCnumarasi='" + TCnumarasi + '\'' +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", iseGirisTarihi='" + iseGirisTarihi + '\'' +
                ", izinHakEdisTarihi='" + izinHakEdisTarihi + '\'' +
                ", calismaGunSayisi=" + calismaGunSayisi +
                ", hakEttigiIzinGunSayisi=" + hakEttigiIzinGunSayisi +
                ", kullanilanIzinGunSayisi=" + kullanilanIzinGunSayisi +
                ", kalanizinGunSayisi=" + kalanizinGunSayisi +
                ", bolum='" + bolum + '\'' +
                ", personelIzinList=" + personelIzinList +
                '}';
    }
}
