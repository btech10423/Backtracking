import java.util.*;
public class Findsubsets{
    public static void findsubsets(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        
        findsubsets(str, ans+str.charAt(i), i+1);
        findsubsets(str, ans, i+1);
       
    }
    
    public static void main(String args[]){
        String str = "abc";
        findsubsets(str, "", 0);
        
    }
}