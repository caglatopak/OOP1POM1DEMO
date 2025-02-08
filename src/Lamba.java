public class Lamba {


    public boolean durumu= false;
    private String konum;

//----------------------------------------------------------------------------------------------------------------------
     // / constructor/kurucu = nesneleri olusturmak icin kullanilan ozel bir yontemdir. bir sinifin nesnesi
    //  olusturulduigunda kullanilir. nesne ozellikleri icin baslangic degerl;erini ayarlamak icin kullanilir.
    // 3 cesittir= varsayilan(default) , parametresi olmayan (no arg) parametresi olan( parameterised)
    // consturctur= . sinif ismi ile ayni olmalidir. degiskenlerden sonra yani variabllerdan sonra methodlardan once yazilir
    //
     public Lamba(String odaKonumu){

         konum= odaKonumu;

         System.out.println("odaminizin konumu"+ konum);

    }
//---------------------------------------------------------------------------------------------------------------------------------



    public void lambadurumu(String konum ){

        if (durumu){
            System.out.println( konum+ "lamba acik");
        }else{
            System.out.println( konum + "lamba kapali");
        }



    }
}
