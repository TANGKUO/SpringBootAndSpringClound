package com.tk.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tk.user.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerUserApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {

		userService.hello();
	}

}
