package View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import java.util.*;
public class Matthew07108_ALLGUI {
    JFrame all = new JFrame();
    JRadioButton chosehero,statshero;
    JRadioButton warrior,archer,mage;
    JButton check,back,attack,updateexp,combat;
    JTextArea areastats;
    private static Scanner input = new Scanner(System.in);
    int cek,cek1;
    
    public Matthew07108_ALLGUI(final int indexSlot){
        all.setSize(700,700);
        all.setLayout(null);
        all.getContentPane().setBackground(Color.CYAN);
        
        chosehero = new JRadioButton("Chose Class");
        chosehero.setBounds(20,20,100,30);
        chosehero.setBackground(Color.CYAN);
        all.add(chosehero);
        
        statshero = new JRadioButton("Stats Hero");
        statshero.setBounds(20,40,100,30);
        statshero.setBackground(Color.CYAN);
        all.add(statshero);        
        
        warrior = new JRadioButton("Warrior");
        warrior.setBounds(130,20,100,30);
        warrior.setBackground(Color.CYAN);
        all.add(warrior);
                    
        archer = new JRadioButton("Archer");
        archer.setBounds(130,40,100,30);
        archer.setBackground(Color.CYAN);
        all.add(archer);
                    
        mage = new JRadioButton("Mage");
        mage.setBounds(130,60,100,30);
        mage.setBackground(Color.CYAN);
        all.add(mage);              
        
        check = new JButton("Go");
        check.setBounds(20,300,100,30);
        all.add(check);
        
        back = new JButton("Back");
        back.setBounds(20,340,100,30);
        all.add(back);
        
        combat = new JButton("Combat");
        combat.setBounds(20,380,100,30);
        all.add(combat);
        
        areastats = new JTextArea();
        areastats.setBounds(20,90,200,200);
        all.add(areastats);
        
        all.setVisible(true);
        all.setLocationRelativeTo(null);
        all.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        chosehero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                chosehero.isSelected();
                cek = 1;
            }
        });
        
        statshero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                statshero.isSelected();
                cek=2;
            }
        });
       
        warrior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                warrior.isSelected();
                cek1 = 1;
            }
        });
         
        archer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                archer.isSelected();
                cek1 = 2;
            }
        });
        
        mage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mage.isSelected();
                cek1 = 3;
            }
        });
        
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(cek == 1){       
                    
                    if(cek1 == 1){
                        Matthew07108_allobjctrl.hero.warrior(indexSlot);
                    }
                    
                    else if(cek1 == 2){
                        Matthew07108_allobjctrl.hero.archer(indexSlot);
                    }
                    
                    else if(cek1 == 3){
                         Matthew07108_allobjctrl.hero.mage(indexSlot);
                    }
                }
                
                else if(cek == 2){                    
                    //Matthew07108_allobjctrl.hero.heroArrayList();
                    areastats.setText(StatsHero(indexSlot));
                }
               
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {        
                Matthew07108_SlotGUI a = new Matthew07108_SlotGUI();
                all.dispose();
            }
        });
        
        combat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Matthew07108_allobjctrl.monster.goblin(indexSlot);  
                Matthew07108_CombatGUI coba = new Matthew07108_CombatGUI(indexSlot);
                all.dispose();
            }   
        });
    }
      
    String StatsHero(int indexSlot){
    String text = "Exp Bar = "+Matthew07108_allobjctrl.hero.show(indexSlot).getExpbar()+"\n"
        +"Experience = "+Matthew07108_allobjctrl.hero.show(indexSlot).getExp()+"\n"
        +"Level = "+Matthew07108_allobjctrl.hero.show(indexSlot).getLvl()+"\n"
        +"Strength = "+Matthew07108_allobjctrl.hero.show(indexSlot).getStr()+"\n"
        +"Intelegent = "+Matthew07108_allobjctrl.hero.show(indexSlot).getIntelect()+"\n"
        +"Stamina = "+Matthew07108_allobjctrl.hero.show(indexSlot).getSta()+"\n"
        +"Physical Attack = "+Matthew07108_allobjctrl.hero.show(indexSlot).getPhyatk()+"\n"
        +"Magic Attack = "+Matthew07108_allobjctrl.hero.show(indexSlot).getMagatk()+"\n"
        +"Health = "+Matthew07108_allobjctrl.hero.show(indexSlot).getHealth()+"\n"
        +"Point = "+Matthew07108_allobjctrl.hero.show(indexSlot).getPointstats();
    return text;
    }
}
