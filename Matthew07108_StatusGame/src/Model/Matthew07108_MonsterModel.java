package Model;

import Entity.*;
import java.util.*;

public class Matthew07108_MonsterModel {
    private ArrayList<Matthew07108_MonsterEntity> monsterEntityArrayList;
    
    public Matthew07108_MonsterModel(){
        monsterEntityArrayList = new ArrayList<>();
    }
    
    public ArrayList<Matthew07108_MonsterEntity> getMonsterEntityArrayList(){
        return monsterEntityArrayList;
    }
              
    public void insert(int indexSlot, Matthew07108_MonsterEntity monsterEntity){
        monsterEntityArrayList.add(indexSlot, monsterEntity);
    }
    
    public void set(int indexSlot, Matthew07108_MonsterEntity monsterEntity){
        monsterEntityArrayList.set(indexSlot,monsterEntity);
    }
        
    public void stats(int indexSlot){
        System.out.println("HP = "+monsterEntityArrayList.get(indexSlot).getHealth());
        System.out.println("Physical ATk = "+monsterEntityArrayList.get(indexSlot).getPhyatk());
        System.out.println("Magic Atk = "+monsterEntityArrayList.get(indexSlot).getMagatk());
    }
    
    public void goblin(int indexSlot){
        int lvl,str,intelect,sta,phyatk,magatk,health,dropexp;
            lvl = 1;
            str=1;
            intelect=1;
            sta=1;
            phyatk = str * 3;
            magatk = intelect * 3;
            health = sta * 100;
            dropexp = 5;
            monsterEntityArrayList.add(indexSlot,new Matthew07108_MonsterEntity(lvl,str,intelect,sta,phyatk,magatk,health,dropexp,indexSlot));
    }
    
    public Matthew07108_MonsterEntity show(int idx){
        return monsterEntityArrayList.get(idx);
}
}

