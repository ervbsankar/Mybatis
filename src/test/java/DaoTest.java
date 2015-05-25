import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mybatis.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/servlet-context.xml")
public class DaoTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testUser(){
		System.out.println(userService.getAllUsers2());
		System.out.println(userService.getAllUsersSP());
	}

}
