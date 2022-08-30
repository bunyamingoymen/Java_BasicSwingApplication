/*
02180201041
Bünyamin Göymen
Normal Öğretim - A şubesi
*/

package bunyamin_goymen;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class bunyamin_goymen {


    public static void main(String[] args) {
      
        char[] harf = new char[32];
        char[] rakam = new char[10];
        int[] bironceki = new int[1]; //Bir öncekini tutabilmemiz için değişken belirliyoruz. (normal int bironceki değeri tanımlarsak butona bastığımızdaq bu değişkeni deşiştiremiyoruz. Bu yüzden bir boyutluk bir dizi oluşturup bunun içine attım.)
        Meyve dizi[] = new Meyve[1000]; 
        bironceki[0] = 0; 
        harf[0] = 'q'; harf[1] = 'w'; harf[2] = 'e'; harf[3] = 'r'; harf[4] = 't'; harf[5] = 'y'; harf[6] = 'u'; harf[7] = 'ı'; harf[8] = 'o'; harf[9] = 'p'; harf[10] = 'ğ'; harf[11] = 'ü'; harf[12] = 'a'; harf[13] = 's'; harf[14] = 'd'; harf[15] = 'f';
        harf[16] = 'g'; harf[17] = 'h'; harf[18] = 'j'; harf[19] = 'k'; harf[20] = 'l'; harf[21] = 'ş'; harf[22] = 'i'; harf[23] = 'z'; harf[24] = 'x'; harf[25] = 'c'; harf[26] = 'v'; harf[27] = 'b'; harf[28] = 'n'; harf[29] = 'm'; harf[30] = 'ö'; harf[31] = 'ç';
        rakam[0] = '0'; rakam[1] = '1'; rakam[2] = '2'; rakam[3] = '3'; rakam[4] = '4'; rakam[5] = '5'; rakam[6] = '6'; rakam[7] = '7'; rakam[8] = '8'; rakam[9] = '9';
        for (int i = 0; i < 1000; i++) {
            dizi[i] = new Meyve(); //Dizinin bütün elemanlarını boş olarak ayarlıyoruz.
        }
        
        
        JFrame f=new JFrame(); //ilk başta ekran oluşturuyoruz.
        
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Programı kapattığımızda arkapalnda çalışmaya devam eder. Bu satır arka planda çalışmasını engelleyip direk kapatıyor.
        
        JButton b1=new JButton("Ekle"); JButton b2=new JButton("Baştan Sona Listele"); JButton b3=new JButton("Bir Sonrakine Göre Listele"); // 3 tane buton oluşturuyoruz. Bir tanesi eklemek. Diğer ikisi de yazdırmak için.
        
        JTextArea list=new JTextArea(); // Yazılanları listelemek için JTextArea oluşturuyoruz.
        
        JLabel l1 = new JLabel("Meyve İsmi"); JLabel l2 = new JLabel("Renk"); JLabel l3 = new JLabel("Ağırlık(KG)"); JLabel l4 = new JLabel("Sıra No"); JLabel l5 = new JLabel("Lütfen Değerleri Giriniz."); JLabel l6 = new JLabel("İlk Deger = 0"); // Burada lablelleri oluşturuyoruz. Kullanıcıya uyarıları veya söylememiz gerekenleri söylüyoruz.
       
        JTextField t1= new JTextField(); JTextField t2= new JTextField(); JTextField t3= new JTextField(); JTextField t4= new JTextField(); // Kullanıcının istediği bilgileri girebilmesi için JTextField oluşturuyoruz.
        
        b1.setBounds(255,300,60,20); b2.setBounds(380,38,150,30); b3.setBounds(570,38,200,30); //Butonların nerede bulunacağını belirliyoruz.
        
        list.setBounds(380,88,390,232); //listenin nerede bulunacağını belirliyoruz.
        
        l1.setBounds(100,58,80,15); l2.setBounds(100,125,80,15); l3.setBounds(100,190,80,15); l4.setBounds(100,259,80,15); l5.setBounds(100, 350, 400, 30); l6.setBounds(190, 254, 130, 25); //Labellerin nerede bulunacağını belirliyoruz.
        
        t1.setBounds(185, 53, 130, 25); t2.setBounds(185, 120, 130, 25); t3.setBounds(185, 185, 130, 25); t4.setBounds(185, 254, 130, 25); //TextFieldlerin nerede olacağını belirliyoruz.

        f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(b1); f.add(list); f.add(b2); f.add(b3); f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); f.add(l6); // Her şeyi oluşturduğumuz ekrana ekliyoruz.
        
        f.setSize(800,500); f.setLayout(null); f.setVisible(true); f.setLocation(280,100); f.setResizable(false); //Oluşturduğumuz ekranın görünürlüğünü, nerede açılacağını, boyutunu belirliyoruz ve Büyütülüp küçültülmesini engelliyoruz.
        
        t4.setVisible(false); t4.setText("0"); ////Burada programın ilk çalıştığında hata vermemesi için olması gereken birkaç şeyi ayarlıyoruz.
      
        
        
        
        l1.setForeground(Color.BLACK); l2.setForeground(Color.BLACK); l3.setForeground(Color.BLACK); l4.setForeground(Color.BLACK); l5.setForeground(Color.BLACK);  l6.setForeground(Color.BLACK); //Labele yeni renkler belirliyoruz.
        
        f.getContentPane().setBackground(Color.getHSBColor((float)5.33, (float) 88.24, (float) 100.0)); //Arkaplan değiştirme kodu. (HSB / HSV) koduna göre tasarlanmışır.
        
        ActionListener al1;
        al1 = new ActionListener(){
            public void actionPerformed(ActionEvent e) { //b1 butonuna(Ekle butonu) basılırsa ne olacağını belirlemek için fonksiyon oluşturuyoruz.
                
                int hata = 0;
                int[] girilen = new int[5]; //Bu değişkeni toplam kaç değer girildiğini hesaplamak için yapıyoruz. Maksimum değere ulaşırsa hata verebilmek için ve harf ve rakam kontrolü yapabilmek için dizi şeklinde oluşturuyoru. 1.textfield 1.indekste, 2.textfield 2.indekste tutuyoruz. İlk dört indeks textfield, son bir indeks ise toplam kaç tane değer girildiğini hesaplamak için.
                girilen[0] = t1.getText().length(); //meyve isminin boyutunu alıyoruz.
                girilen[1] = t2.getText().length(); //meyve renginin boyutunu alıyoruz.
                girilen[2] = t3.getText().length(); //meyve ağırlığının boyutunu alıyoruz
                girilen[3] = t4.getText().length(); //meyve sıra numarasının boyutunu alıyoruz.
                
                for (int i = 0; i < 10; i++) girilen[4]++; //diziye kaç tane değer girildiğini alıyoruz.
                char kontrol;
                for (int i = 0; (i<girilen[0])&&(hata == 0); i++) { // bu for döngüsü meyve ismine harf girilip girilmediğini kotrol ediyor. eğer girilirse hata kodu '1' olarak atanıyor.
                    kontrol = t1.getText().charAt(i);
                    for (int j = 0; j < 32; j++) {
                        
                        if(kontrol == harf[j]){
                        hata = 0;
                        j = 32;
                        }
                        else hata = 1;       
                        
                    }
                }
                for (int i = 0; (i<girilen[1])&&(hata == 0); i++) { // eğer meyve ismine sadece harf girilmişse bu for döngüsüne girecek aksi taktirde bu döngüye girilmeyecek. bu döngüde de meyve renginin harflerden oluşup oluşmadığını kontrol ediyor. Eğer meyve rengi harflerden başka birşeyden oluşuyorsa hata kodu '2' olarak.
                    kontrol = t2.getText().charAt(i);
                    for (int j = 0; j < 32; j++) {
                        if(kontrol == harf[j]){
                        hata = 0;
                        j = 32;
                        }
                        else hata = 2;       
                        
                    }
                }
                
                
                
                for (int i = 0; (i<girilen[3])&&(hata == 0); i++) { //Eğer yukarıdaki hatayla da karşılaşılmadıysa bu döngüye gelip sıra noyu kontrol edecek. 
                    kontrol = t4.getText().charAt(i);
                    for (int j = 0; j < 10; j++) {
                        if(kontrol == rakam[j]){
                        hata = 0;
                        j = 10;
                        }
                        else hata = 3;       
                        
                    }
                }
                if(hata== 1){ //Eğer hata kodu 1 ise meyve ismi harften başka birşey girilmiş demektir. Onun için kullanıcıya uyarı veriyoruz.
                    l5.setForeground(Color.RED);
                    l5.setText("Lütfen Meyve İsmine Harf giriniz.");
                }
                else if(hata == 2){ //Eğer hata kodu 2 ise meyve rengi harften başka birşey girilmiş demektir. Onun için kullanıcıya uyarı veriyoruz.
                    l5.setForeground(Color.RED);
                    l5.setText("Lütfen Meyve Rengini Harf giriniz.");
                }
                
                
                
                else if(hata == 3){ //Eğer hata kodu 3 ise meyve sıra numarası rakamdan başka birşey girilmiş demektir. Onun için kullanıcıya uyarı veriyoruz.
                    l5.setForeground(Color.RED);
                    l5.setText("Lütfen Meyve Sıra Numarasını Rakam giriniz.");
                }
                
                
                else if("".equals(t1.getText())){ //Bu else if'te de girilmesi gerekilen yerlerin boş olup olmadığını kontrol ediyoruz. Eğer boş ise uyarı veriyoruz.
                    l5.setForeground(Color.RED);
                    l5.setText("Lütfen Boş Yerleri Doldurunuz!");
                }
                
                else if("".equals(t2.getText())){ //Bu else if'te de girilmesi gerekilen yerlerin boş olup olmadığını kontrol ediyoruz. Eğer boş ise uyarı veriyoruz.
                    l5.setForeground(Color.RED);
                    l5.setText("Lütfen Boş Yerleri Doldurunuz!");
                
                }
                
                else if("".equals(t3.getText())){ //Bu else if'te de girilmesi gerekilen yerlerin boş olup olmadığını kontrol ediyoruz. Eğer boş ise uyarı veriyoruz.
                    l5.setForeground(Color.RED);
                    l5.setText("Lütfen Boş Yerleri Doldurunuz!");
                
                }
                
                else if(("".equals(t4.getText()))&& (dizi[0].DoluBos != -1)){ //Bu else  if'te de girilmesi gerekilen yerlerin boş olup olmadığını kontrol ediyoruz. Eğer boş ise uyarı veriyoruz.
                    l5.setForeground(Color.RED);
                    l5.setText("Lütfen Boş Yerleri Doldurunuz!");
                }
                
                else if(Integer.parseInt(t3.getText()) <= 0){ //Bu else if'te Ağırlığın 0'dan küçük veya eşil olup olmadığını kontrol ediyoruz. Çünkü Ağırlık 0 veya negatif bir sayı olamaz.
                        l5.setForeground(Color.RED);
                        l5.setText("Ağırlık 0'dan küçük veya eşit olamaz!");
                    
                    }
                
                
                else if (girilen[4] == 1000){ //Girilen değer sayısı 1000 ise daha fazla değer girilmesini engellememiz gerek o yüzden üste girilen değerleri saymıştık eğer o değerler 1000'e ulaşmışsa maksimum değerler girilmiş demektir.
                         l5.setForeground(Color.RED);
                         l5.setText("Maksimum değerleri girdiniz! Daha fazla giremezsiniz.");
                }
               
                
                else{//Eğer yukarıdaki hiçbir hata ile karşılaşılmadıysa buna giriyoruz ve işlemlerimizi yapmaya başlıyoruz.
                    l6.setVisible(false); //Bu iki satır "ilk değer = 0" adlı labeli kaldırıp sıra numarasını girebilmek için gerekli olan textfield'i aktifleştiriyor.
                    t4.setVisible(true);
                    String meyve_ismi = t1.getText(); //Bu değişkenlere kullanıcının girdiği değerleri atıyoruz. Tabi ağırlık'a float, sıra no'ya da int değişkenini tanımlıyoruz.
                    String meyve_rengi = t2.getText();
                    float meyve_agirligi= Float.parseFloat(t3.getText());
                    int meyve_sira_no = Integer.parseInt(t4.getText());
                     
                    
                    
                    
                    
                    if(meyve_sira_no < 0){
                        l5.setForeground(Color.RED);
                        l5.setText("Sıra Numarası 0'dan küçük olamaz!"); //Sıra numarasının sıfırdan küçük olup olmadığını kontrol ediyoruz. Çünkü sıra numarası bizim indeksimiz olacağından kaynaklı olarak. 0 dan küçük olmaması gerekiyotr.
                    
                    }
                    
                    else if(meyve_sira_no>1000){
                        l5.setForeground(Color.RED);
                        l5.setText("Sıra Numarası 1000'den büyük olamaz!"); // Dizimiz 1000 elemanlı olduğu için indeksimiz de 1000 den fazla olamaz eğer 1000 den fazla ise kullanıcıya uyarı gönderiyoruz.
                    
                    }
                    
                    else if(dizi[0].DoluBos == -1){ //Bu else if'e girerse daha ilk eleman ekleniyor anlamına geliyor. Çünkü her eleman eklediğimizde DoluBos değerini 1 olarak atıyoruz. Eğer eklenmemiş ise DoluBos değeri -1 olarak kalıyor.
                        dizi[0] = new Meyve(meyve_ismi,meyve_rengi,meyve_agirligi);
                        
                        l5.setForeground(Color.BLUE);
                        l5.setText("İşlem Başarıyla gerçekleştirildi.");
                    }
                    
                    
                
                    else{
                        if(dizi[meyve_sira_no].DoluBos != 1){ //Eğer yukarıdaki hatalar da çıkmamış ise ve ilk değer girilmiş ve daha sonraki değerler giriliyorsa bu else'e ulaşıyor. Ve burada girilen sıra numarasının indeksini kontrol edip ona daha önce değer girilip girilmediğini kotrol ediyoruz.
                            dizi[meyve_sira_no] = new Meyve(meyve_ismi, meyve_rengi,meyve_agirligi); //Girilen değerleri dizinin o indeksinine atıyoruz
                            dizi[bironceki[0]] = new Meyve(dizi[bironceki[0]].isim,dizi[bironceki[0]].renk,dizi[bironceki[0]].Agirlik,meyve_sira_no); //bironceki ile tuttuğumuz elemanın bir sonrakisini şuan girilen indeks olarak ayarlıyoruz. Diğer değerlerin de null olmaması için o değerleri bir daha gönderiyoruz. Kısacası bağlı liste mantığına benzer bir mnatık geliştiriyoruz. Ama tam olarak Bağlı liste değil.
                            bironceki[0] = meyve_sira_no; // Bir önceki değerimizi artık değiştirip. Şuan girilen değer yapıyoruz. Bunun sebebi de eğer bir tane daha değer girerse şuanki değerin Bir sonraki değerini değiştirmemiz gerekeceğinden o değeri tutmamız gerekiyor.
                            l5.setForeground(Color.BLUE);
                            l5.setText("İşlem Başarıyla gerçekleştirildi."); //Kullanıcıya işlemin başarıyla olduğunu söylüuoruz.
                        }
                        else{
                            l5.setForeground(Color.RED);
                            l5.setText("Lütfen Daha Önce Girilmeyen Sıra Numarasını Giriniz."); //Bu else de eğer DoluBos 1 ise o indekse daha önce değer girildiğini göstereceğinden Kullanıcıya uyarı veriyoruz.
                        
                        }
                    
                    }
                    
                    t1.setText(""); //Bu dört satırda kullanıcının girdiği değerlerin bulundu textfieldleri siliyoruz ki kullanıcı başka bir değer girmek isterse o an hemen hazır oluyor.
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    
                } // else sonu
                
                
            }
        };
        
        
        
        
        
        b1.addActionListener(al1);
        
        ActionListener al2 = new ActionListener(){
            public void actionPerformed(ActionEvent e) { //b2 butonuna(Baştan sona listele) tıklanırsa ne olacağına belirlemek için bir fonksiyon oluşturuyoruz.
               if(dizi[0].DoluBos == -1){
                   l5.setForeground(Color.RED);
                   l5.setText("Lütfen İlk Değeri Giriniz!"); // Kullanıcı daha önce bir değer girmediyse onu listeleyemeyeceğimizden dolayı kullanıcıya bir uyarı veriyoruz.
               
               }
               else{
                   
                   list.setText("");
                   for (int i = 999; 0 <= i; i--) {
                       if(dizi[i].DoluBos == 1) list.insert(i + "  -  " + dizi[i].isim + "  -  " + dizi[i].renk + "  -  "  + dizi[i].Agirlik + "\n", 0); //Bu for dongüsü girilen bütün değerleri list'e ekliyor. TextArea mantığına göre tersten eklendiği için i değerini 0 dan başlatmak yerine 999 dan başlatıp terten yazdırıyoruz. Böylece düzeliyor.
                   }
                   list.insert("S.N  -  Meyve İsmi  -  Meyve Rengi  -  Meyve Ağırlığı(KG): \n\n",0); 
               }
                
            }
    };
        
        b2.addActionListener(al2);
        
        ActionListener al3 = new ActionListener(){
            public void actionPerformed(ActionEvent e) { //b3 butonuna(Bir sonrakine göre listele) basıldığında ne işlem yapılacağını belirlemek için bu fonksiyonu oluşturoyurz
                if(dizi[0].DoluBos == -1){
                   l5.setForeground(Color.RED);
                   l5.setText("Lütfen İlk Değeri Giriniz!"); // Kullanıcı daha önce bir değer girmediyse onu listeleyemeyeceğimizden dolayı kullanıcıya bir uyarı veriyoruz.
               
               }
                else{
                list.setText("");
                int yazdirma = 0;
                    
                    while (yazdirma != -1) {
                        list.insert(yazdirma + "  -  " + dizi[yazdirma].isim + "  -  " + dizi[yazdirma].renk + "  -  " + dizi[yazdirma].Agirlik + "\n", 0); //Teker TekerBir sonrakine göre (Bağlı liste mantığına göre) yazdırıyor.
                        yazdirma = dizi[yazdirma].BirSonraki;
                    }
                list.insert("S.N  -  Meyve İsmi  -  Meyve Rengi  -  Meyve Ağırlığı(KG): \n\n",0); 
                
                }
                
            }
    };
        
        b3.addActionListener(al3);
        
        
    }

    
}
