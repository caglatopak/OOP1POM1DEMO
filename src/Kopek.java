public class Kopek extends Hayvan{

    // encapsulation in en temel ozelligi bu siniftaki degiskenlerin private
   // olarak tanimlanmasi ve daha sonra bu degsiknelere getter ve setter methodu ile ulasilmasidir. boylece kodun guvenligi saglanmis olur
  // extends diyerek ust sinif olan hayvan sinifina baglandik ve ortadaki methodlr bu alt sinif icinde gecerli oldu

       private String isim;
       private String cins;
       private int yas;



// cons . olusturulur

       public Kopek(String isim , String cins, int yas ){

                this.isim= isim;    // this ile burdaki degiskenin bu sinif icinde oldugu belirtilir
                this.cins = cins;
                this.yas = yas;

       }


       public String getIsim(){       // bu get ile ozel olan isim degiskenine diger siniflardan ulasilabilir hale getirildi.
           return this.isim;

       }

       public String getCins(){
           return this.cins;
       }

      public int getYas(){
           return this.yas;

      }

       public String setIsim(String yeniIsim) {
      return this.isim = yeniIsim;
      }

       public  String setCins(String cins) {
       return this.cins = cins;
    }

    public int setYas(int yas) {
       return this.yas = yas;
    }


    @Override
    void sesCikar() {
        System.out.println("hav hav ");
    }
}
