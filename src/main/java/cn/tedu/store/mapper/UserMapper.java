package cn.tedu.store.mapper;

import cn.tedu.store.bean.User;

public interface UserMapper {
	/**
	 * ����һ���û���Ϣ
	 * @param user
	 */
	void insertUser(User user);
	/**
	 * �����û�����ѯ�û�
	 * ������ע��ҳ���첽��֤�û���
	 * @param username
	 * @return ����ѯ������User���󣬲�ѯ��������null
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
