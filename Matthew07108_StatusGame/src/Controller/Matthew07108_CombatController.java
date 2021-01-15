package Controller;
import Entity.*;
import java.util.ArrayList;

public class Matthew07108_CombatController {
    public Matthew07108_CombatController(){
    }
    
     public ArrayList<Matthew07108_HeroEntity> getHero(){
        return Matthew07108_AllObjectModel.heroModel.getHeroEntityArrayList();
    }
    
    public ArrayList<Matthew07108_MonsterEntity> getMonster(){
        return Matthew07108_AllObjectModel.monsterModel.getMonsterEntityArrayList();
    }
    
    public void atk(int index,ArrayList<Matthew07108_HeroEntity> getHero,ArrayList<Matthew07108_MonsterEntity> getMonster){
        Matthew07108_AllObjectModel.combatModel.Attack(index, getHero, getMonster);
    }
    
    public void lvlUp(int index,ArrayList<Matthew07108_HeroEntity> getHero,ArrayList<Matthew07108_MonsterEntity> getMonster){
        Matthew07108_AllObjectModel.combatModel.LevelUp(index, getHero, getMonster);
    }
    
    public void updateExp(int index,ArrayList<Matthew07108_HeroEntity> getHero,ArrayList<Matthew07108_MonsterEntity> getMonster){
        Matthew07108_AllObjectModel.combatModel.UpdateExp(index, getHero, getMonster);
    }
}
