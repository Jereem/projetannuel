package tools;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
/**
 *
 * @author Teddy Delavallee
 */
public class Tools {
    
    /**
     *prend une date au format java et la convertie au format SQL
     * @param datejava (dd-mm-aaaa)
     * @return dateSQl (aaaa-mm-dd)
     */
    public String dateJavaToSQL(Date datejava){
        String convert = datejava.toString();
         String dd =convert.substring(0,2);
         String mm= convert.substring(3,5);
         String aa= convert.substring(6,10);
       
         String dateSQL=aa+"-"+mm+"-"+dd;
        
         System.out.println(dateSQL);
        return dateSQL;
    }
    
    /**
     * prend une date au format SQL et la convertie au format date de java
     * @param dateSQL (aaaa-mm-dd)
     * @return dateJava (dd-mm-aaaa)
     */
    public Date dateSQLToJava(String dateSQL){
         String aaaa= dateSQL.substring(0,4);
         String mm= dateSQL.substring(5,7);
         String dd= dateSQL.substring(8,10);
       
         Date dateJava = null;
         dateJava.setYear(Integer.parseInt(aaaa));
         dateJava.setMonth(Integer.parseInt(mm));
         dateJava.setDate(Integer.parseInt(dd));
     
        return dateJava;
    }
    
}

