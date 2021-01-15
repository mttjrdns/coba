package View;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
import java.util.*;

public class Matthew07108_CombatGUI {
    JFrame serang = new JFrame();
    JTextArea areacombat;
    JButton attack,updatestats,back;
    JRadioButton yes,strength,intelegent,stamina;
    JScrollPane scrollattack;
    int cek,cek1;
    private static Scanner input = new Scanner(System.in);
    
    public Matthew07108_CombatGUI(final int indexSlot){
        serang.setSize(900,900);
        serang.setLayout(null);
        serang.getContentPane().setBackground(Color.CYAN);
        
        attack = new JButton("Attack");
        attack.setBounds(320,30,100,30);
        serang.add(attack);
        
        updatestats = new JButton("Update Stats");
        updatestats.setBounds(320,60,100,30);
        serang.add(updatestats);
        
        yes = new JRadioButton("YES !");
        yes.setBounds(570,100,100,30);
        yes.setBackground(Color.CYAN);
        serang.add(yes);
        
        strength = new JRadioButton("Strength");
        strength.setBounds(570,140,100,30);
        strength.setBackground(Color.CYAN);
        serang.add(strength);
        
        intelegent = new JRadioButton("Intelegent");
        intelegent.setBounds(570,160,100,30);
        intelegent.setBackground(Color.CYAN);
        serang.add(intelegent);
        
        stamina = new JRadioButton("Stamina");
        stamina.setBounds(570,180,100,30);
        stamina.setBackground(Color.CYAN);
        serang.add(stamina);
        
        back = new JButton("Back");
        back.setBounds(570,220,100,30);
        serang.add(back);
        
        areacombat = new JTextArea();
        scrollattack = new JScrollPane(areacombat);
        serang.add(scrollattack);
        scrollattack.setBounds(50,0,250,500);
               
        serang.setVisible(true);
        serang.setLocationRelativeTo(null);
        serang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        attack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {  
                boolean naiklevel;                             
                do{
                    if(Matthew07108_allobjctrl.monster.show(indexSlot).getHealth() > 0){
                        Matthew07108_allobjctrl.combat.atk(indexSlot, Matthew07108_allobjctrl.combat.getHero(), Matthew07108_allobjctrl.combat.getMonster());
                        areacombat.append(attack(indexSlot));
                    }
                    
                    if(Matthew07108_allobjctrl.monster.show(indexSlot).getHealth() < 0){
                            Matthew07108_allobjctrl.combat.updateExp(indexSlot, Matthew07108_allobjctrl.combat.getHero(), Matthew07108_allobjctrl.combat.getMonster());
                            areacombat.append(Exp(indexSlot));
                    }
                }while(Matthew07108_allobjctrl.hero.show(indexSlot).getExp() < Matthew07108_allobjctrl.hero.show(indexSlot).getExpbar());
                naiklevel = true;
                if(naiklevel == true){
                    if(Matthew07108_allobjctrl.hero.show(indexSlot).getExp() == Matthew07108_allobjctrl.hero.show(indexSlot).getExpbar()){
                        Matthew07108_allobjctrl.combat.lvlUp(indexSlot, Matthew07108_allobjctrl.combat.getHero(), Matthew07108_allobjctrl.combat.getMonster());
                        areacombat.append(lvl(indexSlot));
                    }
                }
            }
        });
        
        updatestats.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {              
                if(cek == 1){
                    if(cek1 == 1){
                        Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).setStr(Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).getStr()+1);
                        Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).setPointstats(Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).getPointstats()-1);

                    }
                    else if(cek1 == 2){
                        Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).setIntelect(Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).getIntelect()+1);                        
                        Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).setPointstats(Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).getPointstats()-1);                       
                    }
                    
                    else if(cek1 == 3){
                        Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).setSta(Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).getSta()+1);                    
                        Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).setPointstats(Matthew07108_allobjctrl.hero.heroArrayList().get(indexSlot).getPointstats()-1);                                   
                    }
                }
            }
        });
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Matthew07108_ALLGUI b = new Matthew07108_ALLGUI(indexSlot);
                serang.dispose();
            }
        });
        
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                yes.isSelected();
                cek = 1;
            }
        });
        
        strength.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                strength.isSelected();
                cek1 = 1;
            }
        });
        
        intelegent.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                intelegent.isSelected();
                cek1 = 2;
            }
        });
        
        stamina.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                stamina.isSelected();
                cek1 = 3;
            }
        });
    }
    
    String StatsHero(int indexSlot){
    String text = "Exp Bar"+Matthew07108_allobjctrl.hero.show(indexSlot).getExpbar()+"\n"
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
    
    String attack(int indexSlot){
        String text = "Goblin Health = "+Matthew07108_allobjctrl.monster.show(indexSlot).getHealth()+"\n"
                +"Hero Health = "+Matthew07108_allobjctrl.hero.show(indexSlot).getHealth()+"\n";
        return text;
    }
    
    String Exp(int indexSlot){
        String text = "Goblin Death"+"\n"
                +"Experience = "+Matthew07108_allobjctrl.hero.show(indexSlot).getExp()+"\n";
        return text;
    }
    
    String lvl(int indexSlot){
        String text = "Level Hero = "+Matthew07108_allobjctrl.hero.show(indexSlot).getLvl()+"\n";
        return text;
    }
    
    String PointStats(int indexSlot){
        String text = "Point stats yang dimiliki = "+Matthew07108_allobjctrl.hero.show(indexSlot).getPointstats();
        return text;
    }
}
