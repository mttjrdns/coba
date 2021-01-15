package Entity;

public class Matthew07108_UserEntity{
private String nama,password;
    public Matthew07108_UserEntity(String nama,String password){
        this.nama = nama;
        this.password = password;
}

    public Matthew07108_UserEntity(){
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNama(){
        return this.nama;
    }
       
    public String getPassword(){
        return this.password;
    }
      
 }     

