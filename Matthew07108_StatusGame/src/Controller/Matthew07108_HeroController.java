package Controller;
import Entity.*;
import java.util.ArrayList;
public class Matthew07108_HeroController {
    int indexLogin = 0;
    public Matthew07108_HeroController(){
    }
    
    public void insert(int exp,int lvl,int strength,int intelect,int stamina,int phyatk,int magatk,int health,int expbar,int pointstats,int indexSlot){
        Matthew07108_AllObjectModel.heroModel.insert(indexSlot, new Matthew07108_HeroEntity(exp, lvl, strength, intelect, stamina, phyatk, magatk, health, expbar, pointstats, indexSlot));
    }
    
    public void warrior(int index){
        Matthew07108_AllObjectModel.heroModel.Warrior(index);
    }
    
    public void archer(int index){
        Matthew07108_AllObjectModel.heroModel.Archer(index);
    }
    
    public void mage(int index){
        Matthew07108_AllObjectModel.heroModel.Mage(index);
    }
    
    public void upstats(int pil, int index){
        Matthew07108_AllObjectModel.heroModel.UpStats(pil, index);
    }
    
    public Matthew07108_HeroEntity show(int index){
        return Matthew07108_AllObjectModel.heroModel.show(index);
    }
    
    public ArrayList<Matthew07108_HeroEntity> heroArrayList(){
        return Matthew07108_AllObjectModel.heroModel.getHeroEntityArrayList();
    }
    
}
