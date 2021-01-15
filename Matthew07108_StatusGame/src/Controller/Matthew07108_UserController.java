package Controller;
import Entity.*;
import java.util.ArrayList;
public class Matthew07108_UserController {
    int indexLogin = 0;
    
    public Matthew07108_UserController(){
    }
    
    public Matthew07108_UserEntity getData(){
        return Matthew07108_AllObjectModel.userModel.getUserEntityArrayList(indexLogin);
    }
    
    public void login(String nama,String password){
        indexLogin = Matthew07108_AllObjectModel.userModel.cekData(nama, password);
    }
    
    public void insert(String nama,String password){
        Matthew07108_UserEntity userEntity = new Matthew07108_UserEntity();
        userEntity.setNama(nama);
        userEntity.setPassword(password);
        Matthew07108_AllObjectModel.userModel.insert(userEntity);      
    }
    
    public void delete(int indexLogin){
        Matthew07108_AllObjectModel.userModel.delete(indexLogin);
    }
    
    public ArrayList<Matthew07108_UserEntity> view(){
        return Matthew07108_AllObjectModel.userModel.view();
    }
}
