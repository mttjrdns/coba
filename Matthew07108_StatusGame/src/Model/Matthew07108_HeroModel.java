package Model;
import Entity.*;
import java.util.*;

public class Matthew07108_HeroModel {
    private ArrayList<Matthew07108_HeroEntity> heroEntityArrayList;
    
    public Matthew07108_HeroModel(){
    heroEntityArrayList = new ArrayList<Matthew07108_HeroEntity>();
    }

    public Matthew07108_HeroModel(int index, Matthew07108_HeroEntity heroEntity) {
        heroEntityArrayList = new ArrayList<Matthew07108_HeroEntity>();
    }

    public ArrayList<Matthew07108_HeroEntity> getHeroEntityArrayList() {
        return heroEntityArrayList;
    }
    
    public void insert(int indexSlot,Matthew07108_HeroEntity heroEntity){
        heroEntityArrayList.add(indexSlot, heroEntity);
    }
    
    public void set(int indexSlot,Matthew07108_HeroEntity heroEntity){
        heroEntityArrayList.set(indexSlot, heroEntity);
    }
    
    public void Warrior(int indexSlot) {
        int exp,lvl,str,intelect,sta,phyatk,magatk,health,expbar,pointstats;       
            exp = 0;
            lvl = 1;
            str=10;
            intelect=10;
            sta=10;
            phyatk = str * 3;
            magatk = intelect * 3;
            health = sta * 100;
            expbar = 100;
            pointstats = 0;
        heroEntityArrayList.add(indexSlot, new Matthew07108_HeroEntity(exp,lvl,str,intelect,sta,phyatk,magatk,health,expbar,pointstats,indexSlot));
    }
    
    public void Archer(int indexSlot){
        int exp,lvl,str,intelect,sta,phyatk,magatk,health,expbar,pointstats;
            exp = 0;
            lvl = 1;
            str=13;
            intelect=10;
            sta=7;
            phyatk = str * 3;
            magatk = intelect * 3;
            health = sta * 100;
            expbar = 100;
            pointstats = 0;
        heroEntityArrayList.add(indexSlot, new Matthew07108_HeroEntity(exp,lvl,str,intelect,sta,phyatk,magatk,health,expbar,pointstats,indexSlot));
    }
    public void Mage(int indexSlot){
        int exp,lvl,str,intelect,sta,phyatk,magatk,health,expbar,pointstats;
            exp = 0;
            lvl = 1;
            str = 8;
            intelect = 12;
            sta = 8 ;
            phyatk = str * 3;
            magatk = intelect * 3;
            health = sta * 100;
            expbar = 100;
            pointstats = 0;
        heroEntityArrayList.add(indexSlot, new Matthew07108_HeroEntity(exp,lvl,str,intelect,sta,phyatk,magatk,health,expbar,pointstats,indexSlot));
    }
    
    public void UpStats(int pil,int indexSlot){
        if(pil == 1){
            heroEntityArrayList.get(indexSlot).setStr(heroEntityArrayList.get(indexSlot).getStr()+1);
            heroEntityArrayList.get(indexSlot).setPointstats(heroEntityArrayList.get(indexSlot).getPointstats()-1);
        }
        else if(pil == 2){
            heroEntityArrayList.get(indexSlot).setIntelect(heroEntityArrayList.get(indexSlot).getIntelect()+1);
            heroEntityArrayList.get(indexSlot).setPointstats(heroEntityArrayList.get(indexSlot).getPointstats()-1);
        }   
        else if(pil == 3){
            heroEntityArrayList.get(indexSlot).setSta(heroEntityArrayList.get(indexSlot).getSta()+1);
            heroEntityArrayList.get(indexSlot).setPointstats(heroEntityArrayList.get(indexSlot).getPointstats()-1);
        }
    }
    
    public Matthew07108_HeroEntity show(int index){
        return heroEntityArrayList.get(index);
    }
}



   
    

    