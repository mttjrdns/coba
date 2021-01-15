package Model;

import Entity.*;
import java.util.*;

public class Matthew07108_SlotModel{ 
    private ArrayList<Matthew07108_SlotEntity> slotEntityArrayList;
 
    public Matthew07108_SlotModel(){
    slotEntityArrayList = new ArrayList<>();
    }
    
    public ArrayList <Matthew07108_SlotEntity> getSlotEntityArrayList(){
        return slotEntityArrayList;
    }
    
    public void insert(Matthew07108_SlotEntity slotEntity){
        slotEntityArrayList.add(slotEntity);
    }
    
    public int cekSlot(int slot){
        int loop = 0;
        while(slotEntityArrayList.get(loop).getSlot() != slot)
            loop++;
        return loop;
    }
    
    public Matthew07108_SlotEntity show(int idx){
        return slotEntityArrayList.get(idx);
}
}
