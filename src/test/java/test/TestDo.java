package test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.store.bean.User;
import cn.tedu.store.mapper.UserMapper;

public class TestDo {
	/**
	 * ���Գ־ò����һ���û���Ϣ
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
	 * ���Ը����û���������Ϣ��������ע��ʱ�첽��֤�û����Ƿ����
	 */
	@Test
	public void test2() {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper",UserMapper.class);
		System.out.println(um.selectByUsername("admin12"));
		ac.close();
	}
	/**
	 * ���Ը��������ȡ��ѯ������������
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
	 * ���ݵ绰��ѯ������ƥ���������
	 */
	@Test
	public void test4() {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("application-dao.xml");
		UserMapper um=ac.getBean("userMapper",UserMapper.class);
		System.out.println(um.selectByPhone("138001380001"));
		ac.close();
	}
}
