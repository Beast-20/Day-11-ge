package demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class Mytest {
    
    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before Class Execution Check");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After class Execution check");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Before execution of each test");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("After execution of each test");
    }
    
    User user1 = new User("Himanshu", "Agrawal", "himanshu2002@gmail.com", "91 7744870900", "himH@123");
    User user2 = new User("himanmshu", "agrawal","himanshu@gmail.i","9177559898","hij@45");
    @Test
    public void firstname_validation(){
        assertTrue(user1.first_name_checker(null)); //Happy
        assertTrue(user2.first_name_checker(null)); //Sad
        

    }

    @Test
    public void lastname_validation() {
        assertTrue(user1.first_name_checker(null)); //Happy
        assertTrue(user2.first_name_checker(null)); //Sad
}
    
    @Test
    public void phone_number_validation(){
        assertTrue(user1.phone_number_checker()); //Happy
        assertTrue(user2.phone_number_checker()); //Sad
    }

    @Test 
    public void password_validation(){
        assertTrue(user1.password_checker()); //Happy
        assertTrue(user2.password_checker()); //Sad

    }

    @ParameterizedTest
    @ValueSource(strings = {"himanshu@gmail","Himanshu123@gmail.com.in","himanshu.ag@ge.i"})
    public void email_validation(String mail){
        User usertemp = new User(mail);
        assertTrue(usertemp.email_checker());
    }
}

