package Controller;
import java.util.*;
import Entity.*;

public class Matthew07108_MonsterController {
    public Matthew07108_MonsterController(){
    }
    
    public void insert(int lvl,int strength,int intelect,int stamina,int phyatk,int magatk,int health,int dropexp,int indexSlot){
        Matthew07108_AllObjectModel.monsterModel.insert(indexSlot, new Matthew07108_MonsterEntity(lvl, strength, intelect, stamina, phyatk, magatk, health, dropexp, indexSlot));
    }
    
    public void stats(int index){
        Matthew07108_AllObjectModel.monsterModel.stats(index);
    }
    
    public void goblin(int index){
        Matthew07108_AllObjectModel.monsterModel.goblin(index);
    }
    
    public Matthew07108_MonsterEntity show(int index){
        return Matthew07108_AllObjectModel.monsterModel.show(index);
    }
    
    public ArrayList<Matthew07108_MonsterEntity> monsterArrayList(){
        return Matthew07108_AllObjectModel.monsterModel.getMonsterEntityArrayList();
    }
}
