package cn.tedu.store.mapper;

import cn.tedu.store.bean.User;

public interface UserMapper {
	/**
	 * 插入一条用户信息
	 * @param user
	 */
	void insertUser(User user);
	/**
	 * 根据用户名查询用户
	 * 用以在注册页面异步验证用户名
	 * @param username
	 * @return 若查询到返回User对象，查询不到返回null
	 */
	User selectByUsername(String username);
	/**
	 * 
	 * @param Email
	 * @return
	 */
	Integer selectByEmail(String Email);
	/**
	 * 
	 * 
	 * @param phone
	 * @return
	 */
	Integer selectByPhone(String phone);
}
