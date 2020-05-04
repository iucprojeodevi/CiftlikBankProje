import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;

//@ManagedBean
// veya
@ManagedBean(name="newClass")

public class NewClass 
{
    public String tckimlik = "";
    public String ad_soyad = "Fatih Yılmaz";

    String a = "deneme";

    
    public NewClass(){
        
    }
    
    public String getTckimlik(){
        return tckimlik;
    }
    
    public String getAd_soyad(){
        return ad_soyad;
    }
    
    public void setTckimlik(String tckimlik){
        this.tckimlik = tckimlik;
    }
}