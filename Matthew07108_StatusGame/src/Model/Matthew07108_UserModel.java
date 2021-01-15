package Model;

import Entity.*;
import java.util.*;

public class Matthew07108_UserModel {
    private ArrayList<Matthew07108_UserEntity> userEntityArrayList;
    
    public Matthew07108_UserModel(){
        userEntityArrayList = new ArrayList<Matthew07108_UserEntity>();
    }
    
    public void insert(Matthew07108_UserEntity userEntity){
        userEntityArrayList.add(userEntity);
    }
    
    public void delete(int index){
        userEntityArrayList.remove(index);
    }

    public ArrayList<Matthew07108_UserEntity> view() {
            return userEntityArrayList;
    }
   
    public int cekData(String nama,String password){
        int loop = 0;
        while(!userEntityArrayList.get(loop).getNama().equals(nama) && !userEntityArrayList.get(loop).getPassword().equals(password) )
                loop++;
        return loop;
}
    
    public Matthew07108_UserEntity getUserEntityArrayList(int index){
        return userEntityArrayList.get(index);
    }
}