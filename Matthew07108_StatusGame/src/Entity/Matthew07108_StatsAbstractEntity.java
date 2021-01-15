package Entity;

public abstract class Matthew07108_StatsAbstractEntity {
    protected int lvl,str,intelect,sta,phyatk,magatk,health;

public Matthew07108_StatsAbstractEntity(int lvl,int strength,int intelect,int stamina,int phyatk,int magatk,int health){
    this.lvl = lvl;
    this.str = strength;
    this.intelect = intelect;
    this.sta = stamina;
    this.phyatk = phyatk;
    this.magatk = magatk;
    this.health = health;
}

public Matthew07108_StatsAbstractEntity(){
}

public abstract int getLvl();

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setIntelect(int intelect) {
        this.intelect = intelect;
    }

    public void setSta(int sta) {
        this.sta = sta;
    }

    public void setPhyatk(int phyatk) {
        this.phyatk = phyatk;
    }

    public void setMagatk(int magatk) {
        this.magatk = magatk;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStr() {
        return str;
    }
    
    public int getIntelect() {
        return intelect;
    }

    public int getSta() {
        return sta;
    }

    public int getPhyatk() {
        return phyatk;
    }

    public int getMagatk() {
        return magatk;
    }

    public int getHealth() {
        return health;
    }


    
}