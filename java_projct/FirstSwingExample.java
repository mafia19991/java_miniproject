import javax.swing.*;
import java.awt.Color;


public class FirstSwingExample {  

public static void main(String[] args) {  
JFrame f = new JFrame("Recipe Book");//creating instance of JFrame  
f.getContentPane().setBackground(Color.decode("#85efff"));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(460,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setResizable(false);

//---------------------ADDING TOPP BUTTONS ---------------

JButton breakfast = new JButton("BREAK");    
breakfast.setBounds(10,3,100, 40);   
f.add(breakfast); 
breakfast.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        breakfast.setBackground(Color.decode("#ff9ee0"));
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        breakfast.setBackground(UIManager.getColor("control"));
    }
});  


JButton lunch  = new JButton("Lunch");    
lunch.setBounds(120,3,100, 40);    
f.add(lunch);   
lunch.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        lunch.setBackground(Color.decode("#ff9ee0"));
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        lunch.setBackground(UIManager.getColor("control"));
    }
});  


JButton dinner= new JButton("Dinner");    
dinner.setBounds(230,3,100, 40);    
f.add(dinner);   
dinner.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        dinner.setBackground(Color.decode("#ff9ee0"));
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        dinner.setBackground(UIManager.getColor("control"));
    }
});  


JButton sweet= new JButton("Sweet");    
sweet.setBounds(340,3,100, 40);    
f.add(sweet);   
sweet.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        sweet.setBackground(Color.decode("#ff9ee0"));
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        sweet.setBackground(UIManager.getColor("control"));
    }
});  

//-------------    CREATING PURANPOLI POPUP banner -------------------------

JButton banner = new JButton(new ImageIcon("puranpoli.jpg"));    
banner.setBounds(9,46,440,150);    
f.add(banner);    

//-------------label--------
JLabel l1;
l1=new JLabel("Popular Recipes");  
l1.setBounds(5,199, 200,30); 
l1.setForeground(Color.BLACK);
f.add(l1);

JButton l2;
l2=new JButton("See All...");  
l2.setBounds(350,199,100,30);  
l2.setForeground(Color.BLACK); 
l2.setBackground(Color.decode("#ff9ee0"));
f.add(l2);


//----------------creating--------popular dishes---------------

JButton dumbiryani = new JButton(new ImageIcon("biryani.jpg"));    
dumbiryani.setBounds(5,239,146,214);   
dumbiryani.setBackground(Color.decode("#85efff")); 
dumbiryani.setBorderPainted(false);
f.add(dumbiryani);    


JButton pannertikka = new JButton(new ImageIcon("panner.jpg"));    
pannertikka.setBounds(156,239,146,214);   
pannertikka.setBackground(Color.decode("#85efff")); 
pannertikka.setBorderPainted(false);
f.add(pannertikka); 

JButton idli = new JButton(new ImageIcon("idli.jpg"));    
idli.setBounds(308,239,146,214);   
idli.setBackground(Color.decode("#85efff")); 
idli.setBorderPainted(false);
f.add(idli); 


























f.setVisible(true);//making the frame visible  
}  
}  