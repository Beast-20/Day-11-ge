package demo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User{
    String first_name = null;
    String last_name = null;
    String email_id = null;
    String phone_number = null;
    String password = null;

    public User(String first_name, String last_name, String email_id, String phone_number, String password){
        this.first_name = first_name;
        this.last_name = last_name;
        this.email_id = email_id;
        this.phone_number = phone_number;
        this.password = password;
    }

    public User(String email){
           this.email_id = email;
    }

    public boolean first_name_checker(String f){

        String first_name_regex = "[A-Z]{1}+[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(first_name_regex);
        Matcher matcher = pattern.matcher(first_name);
        return matcher.matches();
        
    }

    public boolean last_name_checker(){
        String last_name_regex = "[A-Z]{1}+[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(last_name_regex);
        Matcher matcher = pattern.matcher(last_name);
        return matcher.matches();
    }

    public boolean email_checker(){
        String email_regex = "[A-Za-z0-9_%+-]+(\\.[A-Za-z0-9_%+-]+)*@[A-Za-z0-9]+(\\.[a-zA-Z]{2,}){1,2}";
        Pattern pattern = Pattern.compile(email_regex);
        Matcher matcher = pattern.matcher(email_id);
        return matcher.matches();
    }
    
    public boolean phone_number_checker(){

        String phone_number_regex = "[0-9]{1,2}+\\s{1}[0-9]{10}";
        Pattern pattern = Pattern.compile(phone_number_regex);
        Matcher matcher = pattern.matcher(phone_number);
        return matcher.matches();
    }

    public boolean password_checker(){
        String password_regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!])(.{8,})";
        Pattern pattern = Pattern.compile(password_regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

}
