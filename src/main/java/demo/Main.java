package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static boolean first_name_checker(String first_name){

            String first_name_regex = "[A-Z]{1}+[a-zA-Z]{2,}";
            Pattern pattern = Pattern.compile(first_name_regex);
            Matcher matcher = pattern.matcher(first_name);
            return matcher.matches();
            
        }

    public static boolean last_name_checker(String last_name){
        String last_name_regex = "[A-Z]{1}+[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(last_name_regex);
        Matcher matcher = pattern.matcher(last_name);
        return matcher.matches();
    }

    public static boolean email_checker(String email){
        String email_regex = "[A-Za-z0-9_%+-]+(\\.[A-Za-z0-9_%+-]+)*@[A-Za-z0-9]+(\\.[a-zA-Z]{2,}){1,2}";
        Pattern pattern = Pattern.compile(email_regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean phone_number_checker(String phone_number){

        String phone_number_regex = "[0-9]{1,2}+\\s{1}[0-9]{10}";
        Pattern pattern = Pattern.compile(phone_number_regex);
        Matcher matcher = pattern.matcher(phone_number);
        return matcher.matches();
    }

    public static boolean password_checker(String password){
        String password_regex = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!])(.{8,})";
        Pattern pattern = Pattern.compile(password_regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //String first_name = "[A-Z]{1}+[a-zA-Z]{2,}";
        // System.out.println("Himanshu".matches(first_name));
        // System.out.println("himanshu".matches(first_name));
        // System.out.println("Agrawal".matches(last_name));
        // System.out.println("agrawal".matches(last_name));
        // System.out.println("919356421230".matches(phone_number));
        // System.out.println("91 9356421".matches(phone_number));
        // System.out.println("91 9356421230".matches(phone_number));

        System.out.println("Email database checking");
        System.out.println(email_checker("himanshuagrawal20042002@gmail.com"));
        System.out.println(email_checker("abc@yahoo.com"));
        System.out.println(email_checker("abc-100@yahoo.com"));
        System.out.println(email_checker("abc.100@yahoo.com"));
        System.out.println(email_checker("abc111@abc.com"));
        System.out.println(email_checker("abc-100@abc.net"));
        System.out.println(email_checker("abc.100@abc.com.au"));
        System.out.println(email_checker("abc@1.com"));
        System.out.println(email_checker("abc@gmail.com.com"));
        System.out.println(email_checker("abc+100@gmail.com"));
        System.out.println(email_checker("abc-100@ams.i"));

    }
}
