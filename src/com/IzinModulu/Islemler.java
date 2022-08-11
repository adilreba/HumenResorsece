package com.IzinModulu;

import com.PersonelModulu.Personel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Islemler {
    private static List<Personel> personelListesi= new ArrayList<Personel>();

    public static void menu() throws ParseException {
        //başlangiçta 4 tane personel tanimlanmiştir

        Personel personel1 = new Personel("Nil Ozis","34972731792","08/01/1991","01/05/2021","01/05/2022",577,14,6,8,"Idari Isler");
        personelListesi.add(personel1);
        Personel personel2 = new Personel("adile mihriban","22222222222","05/07/1992","11/08/2020","11/08/2021",600,14,0,0,"Insaat Isler");
        personelListesi.add(personel2);
        Personel personel3 = new Personel("Ali kaya","33333333333","18/01/1990","18/12/2019","18/12/2020",550,14,4,0,"Buro");
        personelListesi.add(personel3);
        Personel personel4 = new Personel("suleyman Nc","44444444444","28/09/1993","18/05/2018","18/05/2019",1200,14,14,0,"Satis ve Pazarlama");
        personelListesi.add(personel4);
        System.out.println("------------------------------------------------- ");


        Scanner sc = new Scanner(System.in);
        System.out.println("Menü");
        String izinTurleri = " 1: yillk izin\n"
                + " 2.hasta izin\n"
                + " 3.dogum izin\n"
                + " 4.cenaze izin\n"
                + " 5.personel izinilerini listele\n"
                + " 6.personelleri listele\n"
                + " 7.personel ekle\n"
                + " 8.personel guncelle\n"
                + " 9.personel sil\n"
                + " sonlandirmak için C ye bas";

        System.out.println("-------------------------------------------------");
        System.out.println(izinTurleri);
        System.out.println("-------------------------------------------------");


        while (true) {

            System.out.println("işlem türünü seçiniz");
            String secim = sc.nextLine();

            if (secim.equals("c")) {
                System.out.println("işlem  sonlaniyor");
                break;

            }
            if (secim.equals("1")) {

                System.out.println("yillik izin");
                System.out.println("TC Numranizi Giriniz");


                String TCno = sc.nextLine();

                System.out.println("izin kullannilacak adres  : ");

                String izinKullanacakAdres = sc.nextLine();


                System.out.println("izin başlangiç tarihi : ");
                String izinBaslangicTarihi = sc.nextLine();

                System.out.println("izin Bitiş tarihi : ");
                String izinBitisTarihi = sc.nextLine();

                yillikIzinKullandir(secim,  TCno, izinKullanacakAdres, izinBaslangicTarihi, izinBitisTarihi );


            } else if (secim.equals("2")) {
                System.out.println("hasta izni");
                System.out.println("TC Numranizi Giriniz");


                String TCno = sc.nextLine();

                System.out.println("izin kullannilacak adres  : ");

                String izinKullanacakAdres = sc.nextLine();


                System.out.println("izin başlangiç tarihi : ");
                String izinBaslangicTarihi = sc.nextLine();

                System.out.println("izin Bitiş tarihi : ");
                String izinBitisTarihi = sc.nextLine();
                hastaIzniKullandir(secim,  TCno, izinKullanacakAdres, izinBaslangicTarihi, izinBitisTarihi );

            } else if (secim.equals("3")) {
                System.out.println("doğum izni");
                System.out.println("TC Numranizi Giriniz");


                String TCno = sc.nextLine();

                System.out.println("izin kullannilacak adres  : ");

                String izinKullanacakAdres = sc.nextLine();


                System.out.println("izin başlangiç tarihi : ");
                String izinBaslangicTarihi = sc.nextLine();

                System.out.println("izin Bitiş tarihi : ");
                String izinBitisTarihi = sc.nextLine();

                dogumIzniKullandir(secim,  TCno, izinKullanacakAdres, izinBaslangicTarihi, izinBitisTarihi );

            } else if (secim.equals("4")) {
                System.out.println("cenaze izni");
                System.out.println("TC Numranizi Giriniz");


                String TCno = sc.nextLine();

                System.out.println("izin kullannilacak adres  : ");

                String izinKullanacakAdres = sc.nextLine();


                System.out.println("izin başlangiç tarihi : ");
                String izinBaslangicTarihi = sc.nextLine();

                System.out.println("izin Bitiş tarihi : ");
                String izinBitisTarihi = sc.nextLine();
                cenazeIzni(secim,  TCno, izinKullanacakAdres, izinBaslangicTarihi, izinBitisTarihi );


            } else if (secim.equals("5")) {
                System.out.println("personel izinlerini listele");
                System.out.println("TC Numaranizi Giriniz");
                String TCno = sc.nextLine();
                personelIzinleriniListele(TCno);

            }

            else if (secim.equals("6")) {
                System.out.println("Personel Listesi");
                personelListesi();
            }

            else if (secim.equals("7")) {
                System.out.println("Personel ekle");
                personelEkle(sc);
            }

            else if (secim.equals("8")) {
                System.out.println("Personel güncelle");
                personelGuncelle(sc);
            }

            else if (secim.equals("9")) {
                System.out.println("Personel sil");
                personelSil(sc);
            }

            else {
                System.out.println("yanliş giriş yaptiniz");
            }
        }
    }

    public static void personelEkle(Scanner sc){

        System.out.println("ad Soyadinizi giriniz");
        String adSoyad = sc.nextLine();

        System.out.println("TC Numranizi Giriniz");
        String TCno = sc.nextLine();

        System.out.println("Dogum tariginizi giriniz");
        String dogumTarihi = sc.nextLine();

        System.out.println("işe giris tarihinizi Giriniz");
        String iseGirisTarihi = sc.nextLine();

        System.out.println(" izin hak ediş tarihinizi Giriniz");
        String izinHakEdisTarihi = sc.nextLine();

        System.out.println("calisma gunsayinizi giriniz Giriniz");
        String calismaGunSayisi = sc.nextLine();

        System.out.println("hak ettiniz izin gun gunsayinizi  Giriniz");
        String hakEtigiIzinGunSayisi = sc.nextLine();

        System.out.println("kullanilan  izin gun gunsayinizi  Giriniz");
        String kullanilanIzinGunSayisi = sc.nextLine();

        System.out.println("kalan izin gun gunsayinizi  Giriniz");
        String kalanIzinGunSayisi = sc.nextLine();

        System.out.println("bolumunuzu  Giriniz");
        String bolumum = sc.nextLine();

        Personel personel4 = new Personel(adSoyad,TCno,dogumTarihi,iseGirisTarihi,izinHakEdisTarihi,Integer.parseInt(calismaGunSayisi),Integer.parseInt(hakEtigiIzinGunSayisi),Integer.parseInt(kullanilanIzinGunSayisi),Integer.parseInt(kalanIzinGunSayisi),bolumum);
        personelListesi.add(personel4);
    }

    public static void personelGuncelle(Scanner sc){

        System.out.println("ad Soyadinizi giriniz");
        String adSoyad = sc.nextLine();

        System.out.println("TC Numranizi Giriniz");
        String TCno = sc.nextLine();

        System.out.println("Dogum tariginizi giriniz");
        String dogumTarihi = sc.nextLine();

        System.out.println("işe giris tarihinizi Giriniz");
        String iseGirisTarihi = sc.nextLine();

        System.out.println(" izin hak ediş tarihinizi Giriniz");
        String izinHakEdisTarihi = sc.nextLine();

        System.out.println("calisma gunsayinizi giriniz Giriniz");
        String calismaGunSayisi = sc.nextLine();

        System.out.println("hak ettiniz izin gun gunsayinizi  Giriniz");
        String hakEtigiIzinGunSayisi = sc.nextLine();

        System.out.println("kullanilan  izin gun gunsayinizi  Giriniz");
        String kullanilanIzinGunSayisi = sc.nextLine();

        System.out.println("kalan izin gun gunsayinizi  Giriniz");
        String kalanIzinGunSayisi = sc.nextLine();

        System.out.println("bolumunuzu  Giriniz");
        String bolumum = sc.nextLine();


        // personeli ariyorum bulduysam index değeri personelin listedeki index değerini tutar
        int index = -1;

        for (int i= 0; i<personelListesi.size(); i++){
          if (personelListesi.get(i).getTCnumarasi().equals(TCno)) {
              index = i;
              break;
          }
        }
        //personel nesnesi değerleri güncellenir
        if (index != -1) {
            Personel personel = personelListesi.get(index);
            personel.setAdiSoyadi(adSoyad);
            personel.setDogumTarihi(dogumTarihi);
            personel.setIseGirisTarihi(iseGirisTarihi);
            personel.setIzinHakEdisTarihi(izinHakEdisTarihi);
            personel.setCalismaGunSayisi(Integer.parseInt(calismaGunSayisi));
            personel.setHakEttigiIzinGunSayisi(Integer.parseInt(hakEtigiIzinGunSayisi));
            personel.setKullanilanIzinGunSayisi(Integer.parseInt(kullanilanIzinGunSayisi));
            personel.setKalanizinGunSayisi(Integer.parseInt(kalanIzinGunSayisi));
            personel.setBolum(bolumum);

            personelListesi.set(index, personel);
        }
    }

    public static void personelSil(Scanner sc){

        System.out.println("TC Numranizi Giriniz");
        String TCno = sc.nextLine();


        int index = -1;

        for (int i= 0; i<personelListesi.size(); i++){
            if (personelListesi.get(i).getTCnumarasi().equals(TCno)) {
                index = i;
                break;
            }
        }
        if (index != -1) {

            personelListesi.remove(index);
        }
    }
    public static void personelListesi(){
        for(Personel personel : personelListesi){
            System.out.println(personel);
        }
    }

    // once personeli bulucam sonra personeli listeleyicem
    public static void personelIzinleriniListele(String TCno){
        int index=-1;
        Personel personel = null;

        for (int i=0; i<personelListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getTCnumarasi().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz tc numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli tc numrasi giriniz");
            return;
        }
        List<PersonelIzin> personelIzinList= personel.getPersonelIzinList();
        if(personelIzinList.size()==0){
            System.out.println(TCno+" Tc numarali personelin izin kaydi bulunmakmaktadir");
            return;
        }
        // personel izin listesini gösteriyor
        for(PersonelIzin personelIzin : personelIzinList){
            System.out.print("izin türü : "+personelIzin.getIzinTuru()+" , ");
            System.out.print("Adi soyadi: "+personel.getAdiSoyadi()+" , ");
            System.out.print("TC no: "+personel.getTCnumarasi()+" , ");
            System.out.print("izin Adresi : "+personelIzin.getIzinKulanacakAdres()+" , ");
            System.out.print("Dogum tarihi: "+personel.getDogumTarihi()+" , ");
            System.out.print("işe giriş tarihi : "+personel.getIseGirisTarihi()+" , ");
            System.out.print("yillik izin hak ediş tarihi : "+personel.getIzinHakEdisTarihi()+" , ");
            System.out.print("Bügünün tarihi: "+IzinLibrary.bugununTarihi()+" , ");
            System.out.print("çalişma gün sayisi: "+personel.getCalismaGunSayisi()+" , ");
            System.out.print("Hak ettiği gün sayisi : "+personel.getHakEttigiIzinGunSayisi()+" , ");
            System.out.print("Bügüne kadar kulanılan izin  : "+personel.getKullanilanIzinGunSayisi()+" , ");
            System.out.print("kalan izin gün sayi: "+personel.getKalanizinGunSayisi()+" , ");
            System.out.print("çalişan bölüm : "+personel.getBolum()+" , ");
            System.out.print("izin başlangiç tarihi : "+personelIzin.getIzinBaslangicTarihi()+" , ");
            System.out.print("izin bitiş tarihi : "+personelIzin.getIzinBitisTarihi()+" , ");
            System.out.print("işe başlama tarihi : "+personelIzin.getIseBaslamaTarihi()+" , ");
            System.out.print("kullanilan izin gün : "+personelIzin.getKulanilanIzinGunSayisi()+" , ");
            System.out.print("resmi / haftalik tatil güne denk gelen izin gün sayisi : "+personelIzin.getTatileDenkGelenIzinGunSayisi()+" , ");
            System.out.print("yillik izin dişinda kullanilan izin gün sayisi : "+personelIzin.getYillikIzinDisindaKulLanilanIzinGunSayisi()+" ");

            System.out.println();
        }
    }


    public static void yillikIzinKullandir(String izinTuru , String TCno, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi ) throws ParseException {
        // personel listesi gezdik
        int index=-1;
        Personel personel = null;

        for (int i=0; i<personelListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getTCnumarasi().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz tc numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli tc numrasi giriniz");
            return;
        }

        int toplamIzinGunSayisi =  IzinLibrary.tarihHesapla(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= IzinLibrary.getWorkingDays(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanizinGunSayisi());

        if(haftaIciIzinGunSayisi>personel.getKalanizinGunSayisi()){
            System.err.println("KulLanilacak izin gün sayisi kalan izin gün sayisindan büyük olamaz!");
            return;
        }
        personel.setKalanizinGunSayisi(personel.getKalanizinGunSayisi()-haftaIciIzinGunSayisi);
        personel.setKullanilanIzinGunSayisi(personel.getKullanilanIzinGunSayisi()+haftaIciIzinGunSayisi);

        //
        PersonelIzin personelIzin = new PersonelIzin(personel.getTCnumarasi(),"Yillik",izinKulanacakAdres,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }

    // hasta izni yiillik izin gibi değildir mazaret izni olduğu için yiillik izinden düşmez
    public static void hastaIzniKullandir(String izinTuru , String TCno, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi ) throws ParseException {

        // personel listesi gezdik
        int index=-1;
        Personel personel = null;

        for (int i=0; i<personelListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getTCnumarasi().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz tc numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli tc numrasi giriniz");
            return;
        }
        int toplamIzinGunSayisi = IzinLibrary.tarihHesapla(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= IzinLibrary.getWorkingDays(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanizinGunSayisi());
        //
        PersonelIzin personelIzin = new PersonelIzin(personel.getTCnumarasi(),"Hasta",izinKulanacakAdres,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }

    // hasta izni yiillik izin gibi değildir mazaret izni olduğu için yiillik izinden düşmez
    public static void dogumIzniKullandir(String izinTuru , String TCno, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi ) throws ParseException {

        // personel listesini gezdik
        int index=-1;
        Personel personel = null;

        for (int i=0; i<personelListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getTCnumarasi().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz tc numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli tc numrasi giriniz");
            return;
        }//toplam izin gün sayisina bakiyor
        int toplamIzinGunSayisi = IzinLibrary.tarihHesapla(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= IzinLibrary.getWorkingDays(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanizinGunSayisi());

        //
        PersonelIzin personelIzin = new PersonelIzin(personel.getTCnumarasi(),"Dogum",izinKulanacakAdres,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }


    // hasta izni yiillik izin gibi değildir mazaret izni olduğu için yiillik izinden düşmez
    public static void cenazeIzni(String izinTuru , String TCno, String izinKulanacakAdres, String izinBaslangicTarihi, String izinBitisTarihi ) throws ParseException {

        // personel listesi gezdik
        int index=-1;
        Personel personel = null;

        for (int i=0; i<personelListesi.size(); i++){
            personel = personelListesi.get(i);
            if (personel.getTCnumarasi().equals(TCno)){
                index = i;
                break;
            }
        }

        if(index==-1){
            System.err.println("girdiniz TC numrasi personel listesinde bulunamadi. izin kulanabilmek için lütfen geçerli TC numrasi giriniz");
            return;
        }
        int toplamIzinGunSayisi = IzinLibrary.tarihHesapla(izinBaslangicTarihi,izinBitisTarihi);
        int haftaIciIzinGunSayisi= IzinLibrary.getWorkingDays(izinBaslangicTarihi,izinBitisTarihi);
        int haftaSonuIzinGunSayisi = toplamIzinGunSayisi-haftaIciIzinGunSayisi;
        System.out.println("toplam izin gün sayisi : "+ toplamIzinGunSayisi+", hafta içi izin gün sayisi: "+haftaIciIzinGunSayisi+", hafta sonu izin gün sayisi : "+haftaSonuIzinGunSayisi+" , kalan izin gün sayisi : "+personel.getKalanizinGunSayisi());
        //
        PersonelIzin personelIzin = new PersonelIzin(personel.getTCnumarasi(),"Cenaze",izinKulanacakAdres,izinBaslangicTarihi,izinBitisTarihi,izinBitisTarihi,""+haftaIciIzinGunSayisi,haftaSonuIzinGunSayisi,"0");
        personel.eklePersonelIzin(personelIzin);
        personelListesi.set(index,personel);

        System.out.println("izin kaydi başariyla eklendi.\n");
    }



}
