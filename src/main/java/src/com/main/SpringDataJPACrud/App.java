package src.com.main.SpringDataJPACrud;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sp.resources.SpringConfig;
import com.sp.service.AccountService;

import src.com.entity.Account;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Account acc=new  Account();
    	acc.setAcc_num(1);
    	acc.setAcc_type("Saving");
    	acc.setBalace(10000);
    	acc.setFirst_name("Rohitash");
    	acc.setLast_name("Choudhayr");
    	acc.setPin_code(3343);
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService as=(AccountService) context.getBean("accountService");
        
        as.InsertAccDetailService(acc);
        
    }
}
