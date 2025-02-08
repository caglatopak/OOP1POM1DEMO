public class Kopek extends Hayvan {



// encapsulation in en temel ozelligi bu siniftaki degiskenlerin private
   // olarak tanimlanmasi ve daha sonra bu degsiknelere getter ve setter methodu ile ulasilmasidir. boylece kodun guvenligi saglanmis olur
  // extends diyerek ust sinif olan hayvan sinifina baglandik ve ortadaki methodlr bu alt sinif icinde gecerli oldu


// cons . olusturulur

      public Kopek (String isim , String cins, int yas ){
          super(isim, cins, yas);

       }

    @Override
    void sesCikar() {
        System.out.println("hav hav ");
    }
    @Override
    public void uyku(){
        super.uyku();    // main siniftaki anaislemi yapar
        System.out.println("kopek uyurken horluyor");
    }


}
