package Entity;

public class Matthew07108_HeroEntity extends Matthew07108_StatsAbstractEntity{
   private int exp,expbar,pointstats,indexSlot;
    
    public Matthew07108_HeroEntity(int exp,int lvl,int strength,int intelect,int stamina,int phyatk,int magatk,int health,int expbar,int pointstats,int indexSlot){
           super(lvl,strength,intelect,stamina,phyatk,magatk,health);
           this.exp = exp;
           this.expbar = expbar;
           this.pointstats = pointstats;
           this.indexSlot = indexSlot;
           this.health = health;
        }
    
    @Override
    public int getLvl() {
        return lvl;
    }
    
    public int getExp() {
        return exp;
    }

   @Override
    public int getStr() {
        return str;
    }

    public int getExpbar(){
        return expbar;   
    }
    public int getPointstats() {
        return pointstats;
    }

    public int getIndexSlot() {
        return indexSlot;
    }

    public void setIndexSlot(int indexSlot) {
        this.indexSlot = indexSlot;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setExpbar(int expbar) {
        this.expbar = expbar;
    }

    public void setPointstats(int pointstats) {
        this.pointstats = pointstats;
    }
    @Override
    public void setHealth(int health){
        this.health = health;
    }
}
