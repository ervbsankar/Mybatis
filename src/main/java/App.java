import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.models.User;
import com.mybatis.service.UserService;

public class App 
{
  private static Log log = LogFactory.getLog(App.class);
 
    public static void main( String[] args )
    {
    	
    	 ClassLoader cl = ClassLoader.getSystemClassLoader();

    	    URL[] urls = ((URLClassLoader)cl).getURLs();

    	    for(URL url: urls){
    	        System.out.println(url.getFile());
    	    }
    	
    	    PrimeNumber prime = new PrimeNumber();
    	    for(int n=0;n <= 100; n++){
    	    	boolean flag = prime.isPrime(n);
    	    	if(flag){
    	     System.out.println(n + "is prime:" + flag);
    	    	}
    	    }
 
     /* ApplicationContext cxt = new ClassPathXmlApplicationContext("servlet-context.xml");
      UserService service = (UserService) cxt.getBean("userService");
     
      log.info("Running App...");
 
        System.out.println("List<Person> persons = service.getAllUsers()");
        List<User> user = service.getAllUsers();
        List<User> user = service.getAllUsers2();
        System.out.println("-> "+user+"\n");
        for(User obj : user) {
        	System.out.println(obj.getUsername());
        	System.out.println(obj.getPassword());
        }
       System.out.println(service.getAllUsersSP());
        List<User> userSP = service.getAllUsersSP();
        System.out.println("-> "+userSP+"\n");
        for(User obj : userSP) {
        	System.out.println(obj.getUsername());
        	System.out.println(obj.getPassword());
        }
        */
 
    }
}