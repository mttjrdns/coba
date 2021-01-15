package View;
import javax.swing.*;
import Entity.*;
import java.awt.*;
import java.awt.event.*;
import Controller.*;
public class Matthew07108_SlotGUI {
    private static Matthew07108_SlotController slotc = new Matthew07108_SlotController();
    int slot=0,indexSlot, isiData =3;
    JFrame Slot = new JFrame();
    JLabel createslot,pilslot;
    JButton choseslot,buttoncreate;
    JRadioButton RadioSlot;
    JComboBox makeslot;
    int []a = new int[50];
    private DefaultComboBoxModel mdl = new DefaultComboBoxModel();
    public Matthew07108_SlotGUI(){
        
        Slot.setSize(550,380);
        Slot.setLayout(null);
        Slot.getContentPane().setBackground(Color.CYAN);
        
        createslot = new JLabel("Add Slot");
        createslot.setFont(new Font("Times New Roman",Font.BOLD,30));
        createslot.setBounds(80,50,200,100);
        Slot.add(createslot);
        
        buttoncreate = new JButton("Create Slot");
        buttoncreate.setBounds(80,280,100,30);
        Slot.add(buttoncreate);
        
        pilslot = new JLabel("Chose Slot");
        pilslot.setFont(new Font("Times New Roman",Font.BOLD,30));
        pilslot.setBounds(350,50,150,100);
        Slot.add(pilslot);
        
        choseslot = new JButton("Chose");
        choseslot.setBounds(80,230,100,30);
        Slot.add(choseslot);
        
        
        makeslot = new JComboBox();

        makeslot.setBounds(300,180,100,30);
        Slot.add(makeslot);
        
        Slot.setVisible(true);
        Slot.setLocationRelativeTo(null);
        Slot.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttoncreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                slot++; //1
                mdl.removeAllElements();
                Matthew07108_allobjctrl.slot.insert(slot);//1
                indexSlot = indexSlot = Matthew07108_allobjctrl.slot.cek(slot);       //0     
                for(int i=0;i<Matthew07108_allobjctrl.slot.getSlotArrayList().size();i++){
                    mdl.addElement(Matthew07108_allobjctrl.slot.getSlotArrayList().get(i).getSlot());
                }
                makeslot.setModel(mdl);
                
            }
        });
        
        choseslot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                indexSlot = Matthew07108_allobjctrl.slot.cek(slot);
                Matthew07108_ALLGUI all = new Matthew07108_ALLGUI(indexSlot);
                Slot.dispose();
            }
        });
        
    }
}
