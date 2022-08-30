
package bunyamin_goymen;


public class Meyve {
    String isim;
    String renk;
    int DoluBos;
    float Agirlik;
    int BirSonraki;
    
    public Meyve(){
        isim = "";
        renk = "";
        DoluBos = -1;
        Agirlik = (float) 0.0;
        BirSonraki = -1;
    }
    
    
    public Meyve(String a, String b, float c){
        isim = a;
        renk = b;
        DoluBos = 1;
        Agirlik = (float) c;
        BirSonraki = -1;
    }
    
    public Meyve(String isim, String renk, float agirlik,  int birsonraki){
        this.isim = isim;
        this.renk = renk;
        DoluBos = 1;
        Agirlik = (float) agirlik;
        BirSonraki = birsonraki;
    }


}
