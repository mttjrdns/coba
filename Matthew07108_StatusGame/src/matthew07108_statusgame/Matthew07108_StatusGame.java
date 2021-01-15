package matthew07108_statusgame;
import Controller.*;
import Entity.*;
import java.util.Scanner;
import java.util.InputMismatchException;
import View.Matthew07108_GUI;

public class Matthew07108_StatusGame {
    private static Matthew07108_UserController user = new Matthew07108_UserController();
    private static Matthew07108_SlotController slotc = new Matthew07108_SlotController();
    private static Matthew07108_HeroController hero = new Matthew07108_HeroController();
    private static Matthew07108_MonsterController monster = new Matthew07108_MonsterController();
    private static Matthew07108_CombatController cmbt = new Matthew07108_CombatController();
    private static Scanner input = new Scanner(System.in);
    private static int cekUser;
    private static int slot;
    private static int indexSlot;

    public static void main(String[] args) {
        Matthew07108_GUI gui = new Matthew07108_GUI();
        int pil;        
        do{
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Account");
            System.out.println("4. Delete Account");
            System.out.println("5. Exit");
            System.out.print("Pilih = ");
            pil = input.nextInt();
            switch(pil){
                case 1:
                    Daftar();                 
                    break;   
                case 2:
                    Login();
                    break;
                case 3:
                    ViewUser();                 
                    break;
                case 4:
                    Delete(0);
                    break;
            }
        }while (pil!=5);
    }
    
    static void Daftar(){
        try{
        System.out.print("Input Nama User = ");
        String nama = input.next();
        System.out.print("Input Password = ");
        String password = input.next();
        user.insert(nama, password);        
        }catch(InputMismatchException e){
            System.out.println("Format Salah");
        }
    }
    
    static void Login(){
        int pilih,buat,cek;
        System.out.println("Login User");
        System.out.print("Nama = ");
        String nama = input.next();
        System.out.print("Password = ");
        String password = input.next();
        
        try{
        user.login(nama, password);
        }catch(Exception e){
            System.out.println("Nama atau password salah");
        }
        do{
            System.out.println("1. Make New Slot");
            System.out.println("2. Chose Slot");
            System.out.println("3. Exit");
            System.out.print("Pilih = ");
            buat = input.nextInt();
            switch(buat){
                case 1:
                    MakeSlots();
                    break;
                case 2:
                    System.out.println("List SLOT");
                    ViewSlot();
                    System.out.print("Chose Slot = ");
                    int slot1 = input.nextInt();
                    indexSlot = slotc.cek(slot1);
                    do{
                        System.out.println("1. Chose CLass");
                        System.out.println("2. Show Stats");
                        System.out.println("3. Combat");
                        System.out.println("4. Exit");
                        System.out.print("Pilih = ");
                        pilih = input.nextInt();
         
                        switch(pilih){
                            case 1:
                                System.out.println("-------------");
                                System.out.println("Slot ke - "+indexSlot);
                                System.out.println("-------------");
                                indexSlot = slotc.cek(slot1);
                                ChoseClass(indexSlot);
                                break;
                            case 2:
                                System.out.println("-------------");
                                System.out.println("Slot ke - "+indexSlot);
                                System.out.println("-------------");
                                indexSlot = slotc.cek(slot1);
                                Stats(indexSlot);
                                break;
                            case 3:
                                System.out.println("--------------");
                                System.out.println("Slot ke - "+indexSlot);
                                System.out.println("---------------");
                                indexSlot = slotc.cek(slot1);
                                monster.goblin(indexSlot);
                                Combat(indexSlot);
                                break;
                        } 
                    }while(pilih!=4);
            }
        }while(buat!=3);
}
            
    static void Delete(int index){
        user.delete(index);
        System.out.println("User dihapus");
    }
     
    public static void ViewUser(){
        for(Matthew07108_UserEntity user : user.view()){
            System.out.println("Nama : " + user.getNama());
            System.out.println("Pass : "+ user.getPassword());
        }
    }
    
    public static void ViewSlot(){
        for(Matthew07108_SlotEntity slotEntity : slotc.getSlotArrayList()){
            System.out.println(slotEntity.getSlot());
        }
    }
    
    static void MakeSlots(){
        slot++;
        slotc.insert(slot);
        System.out.println("============");
        System.out.println("SLOT "+ slotc.getSlotArrayList().get(slot-1).getSlot() +" Created");
        System.out.println("============");     
}
   
    static void ChoseClass(int indexSlot) {
        System.out.println("1. Warrior");
        System.out.println("2. Archer");
        System.out.println("3. Mage");
        System.out.print("Pilih = ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                hero.warrior(indexSlot);
                break;
            case 2:
                hero.archer(indexSlot);
                break;
            case 3:
                hero.mage(indexSlot);
                break;
        } 
    }
   
    public static void Stats(int indexSlot){
        System.out.println("EXP Bar = "+hero.show(indexSlot).getExpbar());
        System.out.println("Experience = "+hero.show(indexSlot).getExp());
        System.out.println("Level = "+hero.show(indexSlot).getLvl());
        System.out.println("Strength = "+hero.show(indexSlot).getStr());
        System.out.println("Intelegent = "+hero.show(indexSlot).getIntelect());
        System.out.println("Stamina = "+hero.show(indexSlot).getSta());
        System.out.println("Physical Attack = "+hero.show(indexSlot).getPhyatk());
        System.out.println("Magic Attack = "+hero.show(indexSlot).getMagatk());
        System.out.println("Health = "+hero.show(indexSlot).getHealth());
        System.out.println("Point = "+hero.show(indexSlot).getPointstats());
    }
    
    public static void UpStats(int indexSlot){
        int pilih,pil;
        System.out.println("Slot ke - "+indexSlot);
        System.out.println("Apakah anda ingin menaikan Stats ?");
        System.out.println("1. Yes!");
        System.out.println("2. No!");
        System.out.print("Pilihan = ");
        pilih = input.nextInt();
        if(pilih == 1){
            System.out.println("Stats apa yang ingin anda naikan ?");
            System.out.println("1. Strength");
            System.out.println("2. Intelegent");
            System.out.println("3. Stamina");
            System.out.print("Pilihan = ");
            pil = input.nextInt();
            hero.upstats(pil, indexSlot);
            }
        else if(pilih == 2){
            System.out.println("Point Stats yang anda miliki = "+hero.show(indexSlot).getPointstats());//heroModel.show(indexSlot).getPointstats());           
        }
    }
    
    public static void Combat(int indexSlot){
            boolean naikLevel;
        do{
            if(monster.show(indexSlot).getHealth() > 0){
                cmbt.atk(indexSlot, cmbt.getHero(), cmbt.getMonster());
                System.out.println("Goblin Health = "+monster.show(indexSlot).getHealth());
                System.out.println("Hero Health = "+hero.show(indexSlot).getHealth());
            }
            
            if(monster.show(indexSlot).getHealth() < 0){
                cmbt.updateExp(indexSlot, cmbt.getHero(), cmbt.getMonster());
                System.out.println("Goblin Death");
                System.out.println("Exp = "+hero.show(indexSlot).getExp()); //update exp
                System.out.println("======================");
            }
             
        }while(hero.show(indexSlot).getExp() < hero.show(indexSlot).getExpbar());
            naikLevel = true;
            if(naikLevel == true){
                if(hero.show(indexSlot).getExp() == hero.show(indexSlot).getExpbar()){
                    cmbt.lvlUp(indexSlot, cmbt.getHero(), cmbt.getMonster());
                    System.out.println("Level Hero = "+hero.show(indexSlot).getLvl());//level up
                    UpStats(indexSlot);                    
                }
            }
    }
}


