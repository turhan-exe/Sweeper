
package mayintarlasi;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class resimler{
    
    
    
  public ImageIcon mayin(){
   java.net.URL dosyaYolu = getClass().getResource("mayin.jpg");
   ImageIcon resim = new ImageIcon(dosyaYolu);
   
   return resim;
 }  
  public ImageIcon bayrak(){
   java.net.URL dosyaYolu1 = getClass().getResource("bayrak.png");
   ImageIcon resim1 = new ImageIcon(dosyaYolu1);
   
   return resim1;
 }  
  
}
