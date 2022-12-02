import java.util.*;
public class concatination {
public static void main(String args[]) {
    String Firstname = "ram";
    String Lastname = "Shyam";
    String FullName = Firstname + "@" + Lastname;
    System.out.println(FullName.length());
    for(int i=0;i<Firstname.length();i++){
        System.out.println(FullName.charAt(i));
    }
}    
}
