package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.store.bean.User;
import cn.tedu.store.mapper.UserMapper;

public class TestDo {
	/**
	 * 测试持久层插入一条用户信息
	 */
	@Test
	public void test1() {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper",UserMapper.class);
		User user=new User();
		user.setUsername("admin2");
		user.setPassword("123456");
		user.setEmail("test2@tedu.cn");
		user.setPhone("14000133000");
		um.insertUser(user);
		ac.close();
	}
	/**
	 * 测试根据用户名查找信息。用以在注册时异步验证用户名是否存在
	 */
	@Test
	public void test2() {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper",UserMapper.class);
		System.out.println(um.selectByUsername("admin12"));
		ac.close();
	}
	/**
	 * 测试根据邮箱获取查询到的数据行数
	 */
	@Test
	public void test3() {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper",UserMapper.class);
		Integer n=um.selectByEmail("test10@tedu.cn");
		System.out.println(n);
		ac.close();
	}
	/**
	 * 根据电话查询数据中匹配的行数。
	 */
	@Test
	public void test4() {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper",UserMapper.class);
		System.out.println(um.selectByPhone("138001380001"));
		ac.close();
	}
}
