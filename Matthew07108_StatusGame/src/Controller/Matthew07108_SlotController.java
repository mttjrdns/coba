package Controller;
import Entity.*;
import java.util.ArrayList;
public class Matthew07108_SlotController {

    public Matthew07108_SlotController(){
    }
    
    public void insert(int slot){
        Matthew07108_AllObjectModel.slotModel.insert(new Matthew07108_SlotEntity(slot));
    }
    
    public int cek(int slot){
        int slot1 = Matthew07108_AllObjectModel.slotModel.cekSlot(slot);
        return slot1;
    }
    
    public Matthew07108_SlotEntity show(int index){
        return Matthew07108_AllObjectModel.slotModel.show(index);
    }
    
    public ArrayList <Matthew07108_SlotEntity> getSlotArrayList(){
        return Matthew07108_AllObjectModel.slotModel.getSlotEntityArrayList();
    }
}
