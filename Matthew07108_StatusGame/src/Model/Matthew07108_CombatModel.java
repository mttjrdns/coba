package Model;

import Entity.*;
import java.util.ArrayList;

public class Matthew07108_CombatModel { 
    public void Attack(int indexSlot,ArrayList<Matthew07108_HeroEntity> getHero,ArrayList<Matthew07108_MonsterEntity> getMonster){
        int dmgHero;
        dmgHero = getHero.get(indexSlot).getPhyatk() + getHero.get(indexSlot).getMagatk(); 
        getMonster.get(indexSlot).setHealth(getMonster.get(indexSlot).getHealth() - dmgHero);  
        getHero.get(indexSlot).setHealth(getHero.get(indexSlot).getHealth() - getMonster.get(indexSlot).getPhyatk());
    }
    
    public void UpdateExp(int indexSlot,ArrayList<Matthew07108_HeroEntity> getHero,ArrayList<Matthew07108_MonsterEntity> getMonster){
        getHero.get(indexSlot).setExp(getHero.get(indexSlot).getExp() + getMonster.get(indexSlot).getDropexp());
        getMonster.get(indexSlot).setHealth(100); 
    }
    
    public void LevelUp(int indexSlot,ArrayList<Matthew07108_HeroEntity> getHero,ArrayList<Matthew07108_MonsterEntity> getMonster){
        getHero.get(indexSlot).setLvl(getHero.get(indexSlot).getLvl() + 1);
        getHero.get(indexSlot).setExpbar(getHero.get(indexSlot).getExpbar()+100);
        getHero.get(indexSlot).setPointstats(getHero.get(indexSlot).getPointstats()+1);
    }
}
