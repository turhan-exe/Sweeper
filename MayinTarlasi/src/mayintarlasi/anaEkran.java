package mayintarlasi;

import com.sun.tools.javac.util.Convert;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import sun.awt.RepaintArea;


public class anaEkran{
    JPanel panel;
    protected int kareSayisi=10;
    protected int mayin=12;
    boolean res=true;
    double zaman=0;
    int goster;
    String gosters;
    String zaman1;
    JFrame frm=new JFrame("Oyun");
    JPanel num=new JPanel(new GridLayout());
    JPanel kose1=new JPanel();
    JPanel kose2=new JPanel();
    JPanel kose3=new JPanel();
    JLabel lbl=new JLabel(" Sn");
    String adamınadı;
    double adamınzamanı;
    String adamınkaydı;
   public JLabel lbl1=new JLabel("Kalan Mayın : ");
   JButton restart=new JButton("Yeniden Başlat");
   public static void DosyaYaz(String veri)
    {
        File file=new File("Belgeler");   
        try 
        {          
            FileOutputStream dosya=new FileOutputStream(file,true);
            veri=veri+"\n";
            dosya.write(veri.getBytes());
            dosya.flush();
            dosya.close();
        } 
        catch (Exception e) {
            
            
            e.printStackTrace();
        }
    }
   public static void DosyaSİl()
    {
        File file=new File("Belgeler");   
        try 
        {
            //FileOutputStream dosya=new FileOutputStream(file);
            FileOutputStream dosya=new FileOutputStream(file);
            dosya.write("".getBytes());
            dosya.flush();
            dosya.close();
        } 
        catch (Exception e) {
            
            
            e.printStackTrace();
        }
    }
   public static void DosyaOku()
    {
    DefaultListModel dlm=new DefaultListModel();
        File file=new File("Belgeler");
		JList list;
        try 
        {
            Scanner sc=new Scanner(file);
            String bab = "";
            while(sc.hasNextLine()){
                //jList1.setToolTipText(sc.nextLine());
                //System.out.println(sc.nextLine());
                dlm.addElement(sc.nextLine()+"\n");
               
               
                
            }
            bab=dlm.toString();
            if (bab.length()<3 )
                    {
                bab="Boş";
            }
            JOptionPane.showMessageDialog(null, bab, "Top", 0);
            
            
            sc.close();
        } 
        catch (FileNotFoundException e) {
        e.printStackTrace();
        }
    
    }
   public void kral()
   {
   if (mayinYerlestirme.suredondur()==true) 
                {
                    System.out.println(zaman);
                    mayinYerlestirme.suregoster=false;
                    adamınzamanı=zaman;
                    adamınadı=JOptionPane.showInputDialog(null, "Kazandınız Adını Gir Süreniz : "+adamınzamanı, "Win", JOptionPane.INFORMATION_MESSAGE);                  
                    zaman=0; 
                 lbl.setText("0 Sn");
           task.cancel();
           task2.cancel();
           task3.cancel();
           task4.cancel();
           task5.cancel();
           task1.cancel();      
           panel.setEnabled(false);  
           adamınkaydı=adamınadı+"  :  "+adamınzamanı+"  Sn";
                    DosyaYaz(adamınkaydı);
                } 
   }
   public void vezir()
   {
   if (mayinYerlestirme.bittimi()==true) 
       {
          // panel.setEnabled(false);
           //mayinYerlestirme.bitti=false;
       }
   }
   
    java.util.Timer tmer = new java.util.Timer(); 
        TimerTask task = new TimerTask() {
            @Override
            public  void run() {
               goster=mayinYerlestirme.dondur();
               gosters=String.valueOf(goster);
                lbl1.setText("Kalan Mayın : "+gosters);
                zaman=zaman+0.5;
                zaman1=String.valueOf(zaman);
                lbl.setText(zaman1+" Sn");
                kral();
                vezir();
            }
        };  
         TimerTask task1 = new TimerTask() {
            @Override
            public  void run() {
               goster=mayinYerlestirme.dondur();
               gosters=String.valueOf(goster);
                lbl1.setText("Kalan Mayın : "+gosters);
                zaman=zaman+0.5;
                zaman1=String.valueOf(zaman);
                lbl.setText(zaman1+" Sn");
                kral();
                vezir();
            }
        };  
         TimerTask task2 = new TimerTask() {
            @Override
            public  void run() {
               goster=mayinYerlestirme.dondur();
               gosters=String.valueOf(goster);
                lbl1.setText("Kalan Mayın : "+gosters);
                zaman=zaman+0.5;
                zaman1=String.valueOf(zaman);
                lbl.setText(zaman1+" Sn");
               kral();
               vezir();
            }
        }; 
         TimerTask task3 = new TimerTask() {
            @Override
            public  void run() {
               goster=mayinYerlestirme.dondur();
               gosters=String.valueOf(goster);
                lbl1.setText("Kalan Mayın : "+gosters);
                zaman=zaman+0.5;
                zaman1=String.valueOf(zaman);
                lbl.setText(zaman1+" Sn");
                kral();
                vezir();
            }
        }; 
         TimerTask task4 = new TimerTask() {
            @Override
            public  void run() {
               goster=mayinYerlestirme.dondur();
               gosters=String.valueOf(goster);
                lbl1.setText("Kalan Mayın : "+gosters);
                zaman=zaman+0.5;
                zaman1=String.valueOf(zaman);
                lbl.setText(zaman1+" Sn");
                kral();
                vezir();
            }
        }; 
         TimerTask task5 = new TimerTask() {
            @Override
            public  void run() {
               goster=mayinYerlestirme.dondur();
               gosters=String.valueOf(goster);
                lbl1.setText("Kalan Mayın : "+gosters);
                zaman=zaman+0.5;
                zaman1=String.valueOf(zaman);
                lbl.setText(zaman1+" Sn");
                kral();
                vezir();
            }
        };        
    public static void main(String [] args){
         
        anaEkran al=new anaEkran();
      
          al.ilkFrame();
        
        
   }
   public void ilkFrame(){
       
       tmer.scheduleAtFixedRate(task, 500, 500);      
     
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel=new mayinYerlestirme(10,12).getContent();
      frm.getContentPane().add(panel,BorderLayout.PAGE_END);
      frm.getContentPane().add(num,BorderLayout.NORTH);
      
      
      num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);  
      num.setVisible(true);
      frm.setSize(560,350);
      frm.setLocation(300,100);
      frm.setVisible(true);
      JMenuBar menuBar=new JMenuBar();
      menuBar.setSize(550,100);
      oyunMenubar(menuBar);
      frm.setJMenuBar(menuBar);
      frm.repaint();
      frm.revalidate();
      frm.setResizable(false);  
   }
  public void oyunMenubar(JMenuBar menuBar){
   
        JMenu dosya=new JMenu("Oyun");
        JMenu dosya1=new JMenu("Yardım");
         JMenu dosya2=new JMenu("Kayıtlar");
        menuBar.add(dosya);
        menuBar.add(dosya2);
        menuBar.add(dosya1);
        JMenuItem yeniOyun=new JMenuItem("Yeni oyun Başlangıç");
        dosya.add(yeniOyun);
        JMenuItem baslangic=new JMenuItem("Baslangic");
        dosya.add(baslangic);
        JMenuItem orta=new JMenuItem("Orta");
        dosya.add(orta);
        JMenuItem zor=new JMenuItem("Zor");
        dosya.add(zor);
        JMenuItem custom=new JMenuItem("Göreceli");
        dosya.add(custom);
        JMenuItem cikis=new JMenuItem("Cıkıs");
        dosya.add(cikis);
        JMenuItem kayıtlarıgoster=new JMenuItem("Kayıtları Goster");
        dosya2.add(kayıtlarıgoster);
        JMenuItem kayıtlarısil=new JMenuItem("Kayıtların Tamamını Sİl");
        dosya2.add(kayıtlarısil);
        
        kayıtlarısil.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent e) {
                DosyaSİl();
                  }
            }); 
        kayıtlarıgoster.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent e) {
                DosyaOku();
                  }
            }); 
        
        cikis.addActionListener(new ActionListener() {
          
            @Override
             public void actionPerformed(ActionEvent e) {
               System.exit(0);                      
                  }
            }); 
        
        
        restart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                zaman=0;
                lbl.setText("0 Sn");       
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);          
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Yeni Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel=new mayinYerlestirme(10,12).getContent();
      frm.getContentPane().add(panel,BorderLayout.PAGE_END);
      frm.getContentPane().add(num,BorderLayout.NORTH);
     
      num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);     
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
      num.setVisible(true);
     
               frm.setSize(560,350);
                frm.setLocation(300,100); 
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
                
                frm.setResizable(false);
                
                
                
            }
        } );
        
        
        
        
        
        
        
        yeniOyun.addActionListener(new ActionListener() {
            
            @Override
             public void actionPerformed(ActionEvent e) {
             
             
          zaman=0;
           lbl.setText("0 Sn");
           task.cancel();
           task2.cancel();
           task3.cancel();
           task4.cancel();
           task5.cancel();
          tmer.schedule(task1, 500, 500);
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);          
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Yeni Oyun");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel=new mayinYerlestirme(10,12).getContent();
      frm.getContentPane().add(panel,BorderLayout.PAGE_END);
      frm.getContentPane().add(num,BorderLayout.NORTH);
     num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
      num.setVisible(true);
                frm.setSize(560,350);
                frm.setLocation(300,100); 
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
           
                frm.setResizable(false);
                  }
            }); 
            
        
        baslangic.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                 task.cancel();
           task1.cancel();
           task3.cancel();
           task4.cancel();
           task5.cancel();
               tmer.schedule(task2, 500, 500);
           zaman=0;
           lbl.setText("0");
                   
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Başlangıç");
                
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel=new mayinYerlestirme(10,12).getContent();
      frm.getContentPane().add(panel,BorderLayout.PAGE_END);
      frm.getContentPane().add(num,BorderLayout.NORTH);
      num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
      num.setVisible(true);
               
                
                
                frm.setSize(560,350);
                frm.setLocation(300,100);
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar); 
                al.frm=frm;
                frm.setResizable(false);
                  }
            }); 
        
        orta.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {        
           zaman=0;
           lbl.setText("0");
           task.cancel();
           task2.cancel();
           task1.cancel();
           task4.cancel();
           task5.cancel();
           tmer.schedule(task3, 500, 500);
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Orta");
               
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel=new mayinYerlestirme(15,25).getContent();
      frm.getContentPane().add(panel,BorderLayout.PAGE_END);
      frm.getContentPane().add(num,BorderLayout.NORTH);
       num.add(lbl1);
       num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
      num.setVisible(true);         
                
               
                frm.setSize(810,480);
                frm.setLocation(300,50);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);  
                al.frm=frm;
                frm.setResizable(false);
                  }
            }); 
        
        zor.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
              
           zaman=0;
           task.cancel();
           task2.cancel();
           task3.cancel();
           task1.cancel();
           task5.cancel();
           tmer.schedule(task4, 500, 500);
          lbl.setText("0"); 
                 
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Zor");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                
               
       panel=new mayinYerlestirme(20,60).getContent();
      frm.getContentPane().add(panel,BorderLayout.PAGE_END);
      frm.getContentPane().add(num,BorderLayout.NORTH);
      num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
        
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
      num.setVisible(true);
                ;
                
                frm.setSize(1080,610);
                frm.setLocation(200,30);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);   
                al.frm=frm;
                frm.setResizable(false);
                  }
            });
        custom.addActionListener(new ActionListener() {
            
            @Override
             public void actionPerformed(ActionEvent e) {
                 task.cancel();
           task2.cancel();
           task3.cancel();
           task4.cancel();
           task1.cancel();
                 tmer.schedule(task5, 500, 500);
               
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
            
                
            String boyuts="-1" ,mayıns="-1";
            int  boyutı=-1,mayını=-1;
                do 
                {   boyuts=JOptionPane.showInputDialog("Boyut Giriniz giriniz(6-20)");                 
                     boyutı=Integer.parseInt(boyuts);                   
                } while (boyutı<6 || boyutı>20);
                
                
                
                
                 do 
                 {   mayıns=JOptionPane.showInputDialog("Mayın Giriniz giriniz");                 
              mayını=Integer.parseInt(mayıns);                          
                } while (mayını<0 || mayını>boyutı*boyutı);
                 
                 
                 
                 
                 
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("Custom");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       panel=new mayinYerlestirme(boyutı,mayını).getContent();
      frm.getContentPane().add(panel,BorderLayout.PAGE_END);
      frm.getContentPane().add(num,BorderLayout.NORTH);

           zaman=0;
           lbl.setText("0"); 
                   
      
    
                
                if (boyutı==6)
                {
                   
                   num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(330,250);
                    
                    frm.setLocation(300,100); 
                }
                
                else if (boyutı==7)
                {
                     num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
     num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(350,280);
                    
                    frm.setLocation(300,100); 
                }
                 else if (boyutı==8)
                {
                    num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
     num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(390,300);
                    
                    frm.setLocation(300,100); 
                }
               else if (boyutı==9)
                {  num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(420,350);
                    
                    frm.setLocation(300,100); 
                }
               else if (boyutı==10) 
                {
                    num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(480,360);
                    frm.setLocation(300,100); 
                }
               else if (boyutı==11) 
                { 
                     num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(520,390);
                    frm.setLocation(300,100); 
                }
               else if (boyutı==12) 
                {
                     num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
     num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(580,410);
                    frm.setLocation(300,100); 
                }
               else if (boyutı==13) 
                {  
                  num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(640,440);
                    frm.setLocation(300,100); 
                }
               else if (boyutı==14) 
                {
                   num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
     num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(700,460);
                    frm.setLocation(300,100); 
                }
               
               
               else if (boyutı==15) 
                {
                 num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                    frm.setSize(780,480);
                    frm.setLocation(300,100); 
                }
               else if (boyutı==16) 
                {
                    num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                      num.setVisible(true);
                    frm.setSize(830,510);
                    frm.setLocation(300,100); 
                }
               else if (boyutı==17) 
                {
                    num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                      num.setVisible(true);
                    frm.setSize(860,530);
                    frm.setLocation(300,100); 
                }
               else if (boyutı==18) 
                {
                     num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
    num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                      num.setVisible(true);
                    frm.setSize(890,560);
                    frm.setLocation(300,100); 
                }
                else if (boyutı==19) 
                {
                    num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
   num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                      num.setVisible(true);
                    frm.setSize(920,590);
                    frm.setLocation(300,100); 
                }
                else if (boyutı==20) 
                {
                  num.add(kose1);   
      kose1.add(lbl1,BorderLayout.CENTER);
      kose1.setVisible(true);
      
      num.add(kose2);
      kose2.add(restart,BorderLayout.CENTER);
      kose2.setVisible(true);
      
      num.add(kose3);
      kose3.add(lbl,BorderLayout.CENTER);
      kose3.setVisible(true);
                      num.setVisible(true);
                    frm.setSize(950,620);
                    frm.setLocation(300,100); 
                }
                
                
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
                frm.setResizable(false);
                  }
            }); 
            
  }}