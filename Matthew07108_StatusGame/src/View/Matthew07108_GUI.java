package View;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Matthew07108_GUI {
    JFrame logreg = new JFrame();
    JLabel login,daftar,top;
    JTextField textnamadaftar,textnamalogin;
    JLabel labelnamalogin,labelpasswordlogin,labelnamadaftar,labelpassworddaftar;
    JButton check,daftarButton;
    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    
    public Matthew07108_GUI(){
        logreg.setSize(550,380);
        logreg.setLayout(null);
        logreg.getContentPane().setBackground(Color.CYAN);
        
        top = new JLabel("Game");
        top.setBounds(210,10,600,50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        logreg.add(top);
        
        login = new JLabel("Login");
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        login.setBounds(350,50,150,100);
        logreg.add(login);
        
        daftar = new JLabel("Register");
        daftar.setFont(new Font("Times New Roman",Font.BOLD,30));
        daftar.setBounds(80,50,200,100);
        logreg.add(daftar);
        
        labelnamalogin = new JLabel("Nama");
        labelnamalogin.setBounds(300,150,100,30);
        logreg.add(labelnamalogin);
        
        textnamalogin = new JTextField();
        textnamalogin.setBounds(300,180,200,30);
        logreg.add(textnamalogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(300,210,100,30);
        logreg.add(labelpasswordlogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(300,240,200,30);
        logreg.add(passwordlogin);
        
        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(30,150,100,30);
        logreg.add(labelnamadaftar);
        
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(30,180,200,30);
        logreg.add(textnamadaftar);
        
        labelpassworddaftar = new JLabel("Password");
        labelpassworddaftar.setBounds(30,210,100,30);
        logreg.add(labelpassworddaftar);
        
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(30,240,200,30);
        logreg.add(passworddaftar);
        
        check = new JButton("Login");
        check.setBounds(340,280,100,40);
        logreg.add(check);
        
        daftarButton = new JButton("Daftar");
        daftarButton.setBounds(80,280,100,40);
        logreg.add(daftarButton);
        
        logreg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        logreg.setVisible(true);
        logreg.setLocationRelativeTo(null);
        
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //try{
                    Matthew07108_allobjctrl.user.login(textnamalogin.getText(),passwordlogin.getText());
                    String nama = Matthew07108_allobjctrl.user.getData().getNama();
                    JOptionPane.showMessageDialog(null,"Selamat Datang "+nama,"Information",JOptionPane.INFORMATION_MESSAGE);
                    Matthew07108_SlotGUI slot = new Matthew07108_SlotGUI();
                    logreg.dispose();
                //}catch(Exception exception){
//                    JOptionPane.showMessageDialog(null,"Nama atau Password salah ","information",JOptionPane.INFORMATION_MESSAGE);
//                    kosong();
//                }
            }
        });
        
        daftarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String nama = textnamadaftar.getText();
                    String password = passworddaftar.getText();
                    Matthew07108_allobjctrl.user.insert(nama, password);
                    JOptionPane.showMessageDialog(null,"Registrasi Sukses","Information",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"Format Penulisan Salah","Registrasi Gagal",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    
    void kosong(){
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
    }
}
