import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class marketProject {
    static Scanner scanner = new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;
    static int urunMiktari;

    static int urunKodu;
    static String sepet = "";

    static double toplam;

    static boolean ekUrun = false;


    public static void main(String[] args) {
        anamenu();


    }

    public static void anamenu() {

        System.out.printf("=========MYS MARKET PLACE==========\n");
        System.out.printf("=========HOSGELDINIZ===========\n");
        System.out.printf("Lutfen alisveris yapmak istediginiz reyonu secin \n");

        System.out.printf("1-SARKUTERI\n" + "2-MANAV\n" + "3-MARKET\n" + "4-FIS YAZDIR\n" + "CIKIS");

        int kullanici = scanner.nextInt();

        if (kullanici < 1 && kullanici > 5) {

            System.out.printf("Yanlis deger girdiniz");
        } else {
            switch (kullanici) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;

                case 3:
                    market();
                    break;
                case 4:
                    fisyazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:

            }


        }


    }

    private static void cikis() {
        System.exit(0);
    }

    private static void market() {
        System.out.println("===============MARKET REYONUNA HOSGELDINIZ==========================");
        System.out.println(("Lutfen almak istediginiz urunun urun kodunuz giriniz \n 70-Cikolata :10 TL \n 71-CİPS : 60 TL \n 72-DONDURMA:90 Tl \n 73-BAKLAVA:200 TL "));
        while (!ekUrun) {
            urunKodu = scanner.nextInt();

            if (urunKodu >= 70 && urunKodu <= 73) {
                System.out.println("Kac tane alacaksaniz?");
                urunMiktari = scanner.nextInt();
                switch (urunKodu) {
                    case 70:
                        urunAdi = "Cikolata";
                        urunFiyati = 10;
                        System.out.println(urunMiktari + "  adet " + urunAdi + "    " + urunMiktari * urunFiyati + " ₺ ' dir");
                        break;
                    case 71:
                        urunAdi = "Cips";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "  adet " + urunAdi + "    " + urunMiktari * urunFiyati + " ₺ ' dir");

                        break;

                    case 72:
                        urunAdi = "Dondurma";
                        urunFiyati = 90;
                        System.out.println(urunMiktari + "  adet " + urunAdi + "    " + urunMiktari * urunFiyati + " ₺ ' dir");
                        break;

                    case 73:
                        urunAdi = "Baklava";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + "  adet " + urunAdi + "    " + urunMiktari * urunFiyati + " ₺ ' dir");
                        break;


                }

                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println("Olusan sepet tutari" + toplam);
                sepet += urunAdi + "  :  " + urunFiyati + "      TL ";
                System.out.println("Başka ürün almak isterseniz kodunu giriniz. Ana menüye dönmek için 0 tuşuna basınız.");


            } else if (urunKodu == 0) {
                anamenu();
            }


        }

    }

    private static void manav() {
        System.out.println("===============MANAV REYONUNA HOSGELDINIZ==========================");
        System.out.println("Almak istediginiz urunun kodunuz giriniz UK :  81: ELma : 10 TL \n  82 Karpuz : 20 TL \n 83 Kavun 25 Tl");

        while (!ekUrun){
            urunKodu=scanner.nextInt();
            if (81<=urunKodu && urunKodu<=83){
                System.out.println("Kac kg almak istiyorsunuz");
                urunMiktari=scanner.nextInt();
                switch (urunKodu){

                    case 81:
                        urunAdi="Elma";
                        urunFiyati=10;
                        System.out.println(urunMiktari + "kg " +  urunAdi + " : "+ urunMiktari*urunFiyati +" TL");
                        break;

                    case 82:
                        urunAdi="Karpuz";
                        urunFiyati=20;
                        System.out.println(urunMiktari + "kg " +  urunAdi + " : "+ urunMiktari*urunFiyati + " TL");
                        break;
                    case 83:
                        urunAdi="Kavun";
                        urunFiyati=25;
                        System.out.println(urunMiktari + "kg " +  urunAdi + " : "+ urunMiktari*urunFiyati + " TL");
                        break;



                }
                urunFiyati=urunMiktari*urunFiyati;
                toplam+=urunFiyati;
                sepet += urunAdi + " : " + urunFiyati + " : ₺\n";
                System.out.println("Sepet tutari " + "    " + toplam);
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin.\n Ana Menüye dönmek için 0 tuşuna basınız.");


            } else if (urunKodu==0) {
anamenu();
            }


        }



    }

    private static void fisyazdir() {
        System.out.println("FIS YAZDIRILIYOR....");
        System.out.println("================= MYS -  MARKET =================");
        System.out.println("=====    Bizi Tercih Ettiğiniz İçin Teşekkür Ederiz     ======");
        System.out.println("----------      Alışveriş Bilgileriniz         -------------");
        System.out.println(" \n \n");
        System.out.println(" Alışveriş Listeniz\n " + sepet);
        System.out.println(" ");
        System.out.println("Toplam Tutar: " + toplam);
        System.out.println(" \n \n");
        System.out.println("------------      İyi Günler Dileriz         --------------");
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");
        String newfFormatDateTime = currentTime.format(formatter);
        System.out.println("Yeni Zaman Biçimi: " + newfFormatDateTime);
        System.out.println("ana menüye dönmek için 0 tuşuna basınız. Çıkış yapmak için 5 tuşuna basınız");
        if (urunKodu == 0) {
            anamenu();
        } else if (urunKodu == 5) {
            cikis();

        }
    }


    public static void sarkuteri() {

        System.out.println("SARKUTERI REYONUNA HOSGELDINIZ");
        System.out.println("Lutfen almak istediginiz urunun urun kodunuz giriniz \n 61-KasarPeyniri :130 TL \n 62-Zeytin : 60 TL \n 63-Salam:60 Tl \n 64-Sucuk:200 TL ");
        while (!ekUrun) {
            urunKodu = scanner.nextInt();
            if (urunKodu >= 61 && urunKodu <= 64) {
                System.out.println("Kaç kg alacaksınız?");
                urunMiktari = scanner.nextInt();

                switch (urunKodu) {
                    case 61:
                        urunAdi = "Kasar Peyniri";
                        urunFiyati = 130;
                        System.out.println(urunMiktari + "kg" + urunAdi + " : " + (urunFiyati * urunMiktari) + "TL ");
                        break;
                    case 62:
                        urunAdi = "Zeytin";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg" + urunAdi + " : " + (urunFiyati * urunMiktari) + "TL ");
                        break;
                    case 63:
                        urunAdi = "Salam";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "kg" + urunAdi + " : " + (urunFiyati * urunMiktari) + "TL ");
                        break;

                    case 64:
                        urunAdi = "Sucuk";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + "kg" + urunAdi + " : " + (urunFiyati * urunMiktari) + "TL ");
                        break;


                }


                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                sepet += urunAdi + " : " + urunFiyati + " : ₺\n";
                System.out.println("Sepet tutari " + "    " + toplam);
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin.\n Ana Menüye dönmek için 0 tuşuna basınız.");


            } else if (urunKodu == 0) {
                anamenu();


            }

        }

    }


}




