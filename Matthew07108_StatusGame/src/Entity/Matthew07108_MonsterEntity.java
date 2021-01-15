package Entity;

public class Matthew07108_MonsterEntity extends Matthew07108_StatsAbstractEntity {
    protected int dropexp,indexSlot;
    public Matthew07108_MonsterEntity(int lvl,int strength,int intelect,int stamina,int phyatk,int magatk,int health,int dropexp,int indexSlot){        
        super(lvl,strength,intelect,stamina,phyatk,magatk,health);
        this.dropexp = dropexp;
        this.indexSlot = indexSlot; 
    }

    @Override
    public int getLvl() {
        return lvl;
    }

    public int getDropexp() {
        return dropexp;
    }

    public void setDropexp(int dropexp) {
        this.dropexp = dropexp;
    }

    public int getIndexSlot() {
        return indexSlot;
    }

    public void setIndexSlot(int indexSlot) {
        this.indexSlot = indexSlot;
    }
}
