abstract class Hayvan {

    // sinfilarin abstrak sinifa katilim yapmasi icin inheritance etmesi gerekir.
    // abstract siniflrdan nesne olusturulmaz.
    // bir sinifin sadece 1 ust sinifi olabilir . bir annesi olabilir

    private String isim;
    private String cins;
    private int yas;

// cons . olusturulur

    public Hayvan (String isim , String cins, int yas ) {

        this.isim = isim;    // this ile burdaki degiskenin bu sinif icinde oldugu belirtilir
        this.cins = cins;
        this.yas = yas;
    }


    public String getIsim(){       // bu get ile ozel olan isim degiskenine diger siniflardan ulasilabilir hale getirildi.
        return isim;
    }

    public String getCins(){
        return cins;
    }

    public int getYas(){
        return yas;

    }

    public String setIsim(String yeniIsim) {
        return isim = yeniIsim;
    }


    abstract void sesCikar();// bu method body icermez

    public void uyku(){

        System.out.println("hayvan uyuyor");



    }



}

