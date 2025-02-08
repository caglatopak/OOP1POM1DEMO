//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


       /*  Insan ilkinsan = new Insan(); // insan class kullanarak insan objesi olusturuldu.

        ilkinsan.konsolaYazdir();
        ilkinsan.konsolaYazdir();
*/

        //OOP==>
         // oop gercek dunya nesnelerini hem veri hemde kod iceren yazilim nesneleri olarak modellemenin yolurudur.
        //
        // oop kodun daha moduler yeniden kullanilabilir ve yonetilebilir olmnasini sgalar
        // siniflar ve nesneler yemel bilesendir claas based programlama olarak gecer.

        // nesne: ayni sinifin ozelleiklerine ve davrnaislarina sahiptir ancak farkli verilere sahip olabilir
        // nesnenin 2 ozelligi vardir : durum ve davranis(behavor)

         // oop nin 4 temel prensibi vardir // encapsulation(kapsulleme) abstraction(soyutlama) inheritance (kalitim)polymorphism (cok bicimlilik)

        // encapsulation: kapsulleme: verilerin disaridan erisime kapatilip yalnizca belirlenen metotlarla kullanilmasini saglar.
        // birlestirme islemi , getter setter ile okuama ve yazma yetkisi verir

        // abstraction = uygulamanin karmasikligini gizler ve daha basit arayuzler ortaya cikarir.
        // genel kullanilan metotlar bu siniflta yer alir ve karsaiklik ortadan kalkar.kullaniciya yalnizca gerekli bilgileri gosterme islemidir

        // inheritance = miras alma= bir sinifin baska bir sinifin ozelliklerini ve metotlarini devralmasini saglar. [arent en child.
        // uygulamalarin daha sade ve okunakli olmasini saglar

        // polimorfizm = ayni isimde farkli islevlere sahip metotlar olusturmayi saglar.
        // uygulamanin girdi turlerine bagli olarak verileri farkli sekilde isleme yetenegidir. metot overloading* asiri yukleme*

         // overriding = (gecersiz kilma) bir sinifa ait bir methodun o siniftan turetilmis
        // bir sinif icerisinde ayni isimli bir metod tanimlayarak bu methodun temel siniftaki metodun yerine gecirmeye denir

        // super/ana sinifta bulunan ayni isimli metotlara erisilebilir
        // super/ana sinif constructor/yapicicisina erisilebilir
        // super/ana sinifta bulunan farkli degiskenlere erisilebilir

        // interface / arayuz :  soyutlama polimorfizm ve coklu katilim elde etmek icin kullanilir interface ler sozlesmeler gibidir.





        // avantajlari=
        // kodun tekrar kullanilabiorligi= miras alma ile kod tekrarini azaltir.
        // modulerlik= buyuk projeleri yonetmeyi kolaylastir.
        // guvenlik= kapsulleme ile verilerin dogrudan degistirilmesini onler.
        // bakim kolayligi= poliformz sayesinde kod daha esnek olur


        // OOP python, java. c++ ve c# gibi bircok modern programlama dilinde kullamnilir

        //page object model == sayfa nesne modeli

       // nesne1
/*       salonLambasi.lambadurumu("salon lambasi ");
       salonLambasi.durumu = true;
       salonLambasi.lambadurumu("salon lambasi ");

        //nesne2

       Lamba yatakOdasi= new Lamba("yatak odasi ");

       yatakOdasi.durumu= true;
       yatakOdasi.lambadurumu("yatak odasi lambasi ");
       yatakOdasi.durumu = false;
       yatakOdasi.lambadurumu("yatak odasi son ");

*/

   //nesne1

         Kopek ilkKopegim= new Kopek("suzi", "golden", 10);

        System.out.println(" kopegimin adi " + ilkKopegim.getIsim() + " -cinsi "+ ilkKopegim.getCins() + " -yasi " + ilkKopegim.getYas());

        ilkKopegim.setIsim("karabas");

        System.out.println("kopegin yeni ismi " + ilkKopegim.getIsim());

        ilkKopegim.sesCikar(); // inheritance yani katilim yapildi hayvan sinifindan
        ilkKopegim.uyku();



     //nesne2


        Kopek ikinciKopegim = new Kopek("mavi" , " labrador", 2);

        ikinciKopegim.setIsim("pamuk");

        System.out.println("ikinci kopegimin yeni ismi " + ikinciKopegim.getIsim());


   //nesne3

      Kedi yeniKedi = new Kedi("kirmizi", "tekir", 3);

      yeniKedi.sesCikar();   // ayni isimli methodlar kullanarak farkli islemler gercelestirmek polymorfizm dir
      yeniKedi.uyku();


    }
}