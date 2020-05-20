package mayintarlasi;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.internal.org.jline.utils.ShutdownHooks;
public class mayinYerlestirme implements ActionListener   { 
 protected int boyut;
 protected int mayinSayisi; 
 JButton [][] buttons;
 int[][] mayin;
 int hak;
 int kalanhak;
public static boolean bitti=false;

  public static boolean suregoster=false;
        public static int gosterilcek;
 
 boolean bayrak=false;
    public static boolean bittimi() 
    {
        return bitti;
    }
 
  public static boolean suredondur()
                     {
                        
                             
                             return  suregoster;

                     
                     }
 public static int dondur()
                     {
                     
                     return  gosterilcek;
                     }
 
// ActionEvent e;
 MouseListener mouseListener = new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JButton btn=(JButton)e.getSource();
     Point point=getArrayLocation(btn); 
               
                int modifiers = e.getModifiers();
                if ((modifiers & InputEvent.BUTTON1_MASK) == InputEvent.BUTTON1_MASK) {                                                        
                    if (buttons[point.x][point.y].getIcon()==null) 
                    {
                        if(mayin[point.x][point.y]<0){
        buttons[point.x][point.y].setText(""); 
        oyunBitti();
     }
     else if(mayin[point.x][point.y]>0){
         if(buttons[point.x][point.y].getActionCommand()=="doldur"){                     
         if(mayin[point.x][point.y]==1){
           buttons[point.x][point.y].setText(""+mayin[point.x][point.y]);
           buttons[point.x][point.y].setOpaque(true);
           buttons[point.x][point.y].setBackground(Color.YELLOW);
         }
         if(mayin[point.x][point.y]==2){
           buttons[point.x][point.y].setText(""+mayin[point.x][point.y]);;
           buttons[point.x][point.y].setOpaque(true);
           buttons[point.x][point.y].setBackground(Color.GREEN);
         }
         if(mayin[point.x][point.y]==3){
           buttons[point.x][point.y].setText(""+mayin[point.x][point.y]);
           buttons[point.x][point.y].setOpaque(true);
           buttons[point.x][point.y].setBackground(Color.RED);
         }
         if(mayin[point.x][point.y]>3) {
           buttons[point.x][point.y].setText(""+mayin[point.x][point.y]);
           buttons[point.x][point.y].setOpaque(true);
           buttons[point.x][point.y].setBackground(Color.CYAN);
         }
          hak--;
       if(hak==0){
           for (int i = 0; i < mayin.length; i++) 
             {
                 for (int j = 0; j < mayin[i].length; j++) {
                     
                     buttons[i][j].setEnabled(false);
                      
                 }
             }
         // JOptionPane.showMessageDialog(null,"Kazandın","Sonuc", JOptionPane.INFORMATION_MESSAGE);
             
      
       suregoster=true;
       }
       
          
    
       } 
     }
     else if(mayin[point.x][point.y]==0){
        kareAcma(point.x,point.y); 
     }
                    }
                }              
                if ((modifiers & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK) {   
                    if (buttons[point.x][point.y].getIcon()==null) { 
                        if (gosterilcek>0) 
                        {
                         resimler rs=new resimler();
                       ImageIcon bayrak=rs.bayrak();
                       buttons[point.x][point.y].setText(null);
                       buttons[point.x][point.y].setIcon(bayrak);
                       
                       gosterilcek--;
                        if (mayin[point.x][point.y]<0) 
                        {
                            kalanhak--;
                        }   
                        }
                        if (kalanhak<=0) 
                        {
                            for (int i = 0; i < mayin.length; i++) 
             {
                 for (int j = 0; j < mayin[i].length; j++) {
                     
                     buttons[i][j].setEnabled(false);
                      
                 }
             }
       //   JOptionPane.showMessageDialog(null,"Kazandın","Sonuc", JOptionPane.INFORMATION_MESSAGE);
             
      
       suregoster=true;
                            
                        }
                     
                        
                    }
                    
                    else
                    {
                     buttons[point.x][point.y].setText("  ");
                     buttons[point.x][point.y].setIcon(null);
                 gosterilcek++;
                     bayrak=true;
                    }     
                }
            }

  };

 @Override
  public void actionPerformed(ActionEvent e) { 
      
     
  }
   
  public void oyunBitti(){
     
      resimler rs=new resimler();
      for(int i=0;i<mayin.length;i++){
        for(int j=0;j<mayin.length;j++){
          if(mayin[i][j]<0){
            buttons[i][j].setText("");
            ImageIcon mayin=rs.mayin();
            buttons[i][j].setOpaque(true);
            buttons[i][j].setBackground(Color.RED);
            buttons[i][j].setIcon(mayin);
          }
          else if(mayin[i][j]==0){
            buttons[i][j].setText(" ");
            buttons[i][j].setOpaque(true);
            buttons[i][j].setBackground(Color.WHITE);
          }
          else{
            buttons[i][j].setText(""+mayin[i][j]);
            if(mayin[i][j]==1){
              buttons[i][j].setText(""+mayin[i][j]);
              buttons[i][j].setOpaque(true);
              buttons[i][j].setBackground(Color.yellow);
           }    
           if(mayin[i][j]==2){
              buttons[i][j].setText(""+mayin[i][j]);
              buttons[i][j].setOpaque(true);
              buttons[i][j].setBackground(Color.GREEN);
           }  
           if(mayin[i][j]==3){
              buttons[i][j].setText(""+mayin[i][j]);
              buttons[i][j].setOpaque(true);
              buttons[i][j].setBackground(Color.RED);
           }
           if(mayin[i][j]>3){
              buttons[i][j].setText(""+mayin[i][j]);
              buttons[i][j].setOpaque(true);
              buttons[i][j].setBackground(Color.cyan);
           }
          }
        }  
      }
     
      JOptionPane.showMessageDialog(null,"Kaybettiniz","Mayin",JOptionPane.INFORMATION_MESSAGE);
                     for (int i = 0; i < mayin.length; i++) 
             {
                 for (int j = 0; j < mayin[i].length; j++) {
                     
                     buttons[i][j].setEnabled(false);
                      
                 }
             }
      bitti=true;
      
      
  }
  
    
  public void kareAcma(int x,int y){
    if(x<0 || y<0 || x>buttons.length-1 ||y>buttons.length-1)
       return;
     if(buttons[x][y].getText()=="  "){
        
       if(mayin[x][y]>0){
         if(mayin[x][y]==1){
           buttons[x][y].setText(""+mayin[x][y]);
           buttons[x][y].setOpaque(true);
           buttons[x][y].setBackground(Color.yellow);
         }
         if(mayin[x][y]==2){
           buttons[x][y].setText(""+mayin[x][y]);
           buttons[x][y].setOpaque(true);
           buttons[x][y].setBackground(Color.GREEN);
         }
         if(mayin[x][y]==3){
           buttons[x][y].setText(""+mayin[x][y]);
           buttons[x][y].setOpaque(true);
           buttons[x][y].setBackground(Color.RED);
         }
         if(mayin[x][y]>3){
           buttons[x][y].setText(""+mayin[x][y]);
           buttons[x][y].setOpaque(true);
           buttons[x][y].setBackground(Color.cyan);
         }
         hak--;
         if(hak==0){
           for (int i = 0; i < mayin.length; i++) 
             {
                 for (int j = 0; j < mayin[i].length; j++) {
                     
                     buttons[i][j].setEnabled(false);
                      
                 }
             }
         // JOptionPane.showMessageDialog(null,"Kazandın","Sonuc", JOptionPane.INFORMATION_MESSAGE);
             
      
       suregoster=true;
         }
       }
       
       if(mayin[x][y]==0){
           buttons[x][y].setText(" ");
           buttons[x][y].setOpaque(true);
           buttons[x][y].setBackground(Color.WHITE);
           hak--;
         if(hak==0){
           for (int i = 0; i < mayin.length; i++) 
             {
                 for (int j = 0; j < mayin[i].length; j++) {
                     
                     buttons[i][j].setEnabled(false);
                      
                 }
             }
          //JOptionPane.showMessageDialog(null,"Kazandın","Sonuc", JOptionPane.INFORMATION_MESSAGE);
             
      
       suregoster=true;
         }
         kareAcma(x-1, y-1); kareAcma(x-1, y+1); kareAcma(x+1, y); kareAcma(x+1, y-1);
         kareAcma(x-1, y); kareAcma(x, y+1); kareAcma(x, y-1); kareAcma(x+1, y+1);
       }
       
     }     
  }
 
  public Point getArrayLocation(JButton btn){
     Point pt=new Point(-1, -1);
     for(int j=0;j<buttons.length;j++){
       for(int k=0;k<buttons[j].length;k++){
         if(buttons[j][k]==btn){
           pt.setLocation(j, k);
           return pt;
         }
       }
     }
     return pt; 
  }
   
  
  public JPanel getContent(){
        
        JPanel panel  = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weighty = 1.0;
        gbc.weightx = 1.0;
        
        for(int j = 0; j < buttons.length; j++) {
            for(int k = 0; k < buttons[j].length; k++) {
                int n = j*buttons[j].length + k + 1;
                buttons[j][k] = new JButton("  ");
                buttons[j][k].addActionListener(this);             
                buttons[j][k].addMouseListener(mouseListener);
                buttons[j][k].setActionCommand("doldur");
                gbc.gridwidth = (k < buttons[j].length-1) ? 1 :GridBagConstraints.REMAINDER;
                panel.add(buttons[j][k], gbc);
                
            }
        }
        
        
        return panel;
  }
  
  public mayinYerlestirme(int boyut,int mayinSayisi){
     this.boyut=boyut;    
     this.mayinSayisi=mayinSayisi;
     kalanhak=this.mayinSayisi;
     gosterilcek=this.mayinSayisi;
     buttons=new JButton[boyut][boyut];  
     mayin=new int[boyut][boyut]; 
     hak=this.boyut*this.boyut-this.mayinSayisi;
     Random rnd=new Random();
     int x,y;
     for(int i=0;i<mayin.length;i++){
       for(int j=0;j<mayin.length;j++){
          mayin[i][j]=0;
       }
     }
     
     for(int j=0;j<mayinSayisi;j++){
       x=rnd.nextInt(boyut);
       y=rnd.nextInt(boyut);
       if(mayin[x][y]<0){
         j--;
         continue;
       }
       mayin[x][y]=-100;
       try{mayin[x-1][y]++;}catch(Exception e){}
       try{mayin[x+1][y]++;}catch(Exception e){}
       try{mayin[x][y-1]++;}catch(Exception e){}
       try{mayin[x][y+1]++;}catch(Exception e){}
       try{mayin[x-1][y-1]++;}catch(Exception e){}
       try{mayin[x-1][y+1]++;}catch(Exception e){}
       try{mayin[x+1][y-1]++;}catch(Exception e){}
       try{mayin[x+1][y+1]++;}catch(Exception e){}
     }  
  }
}

  
