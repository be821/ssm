/**
 * 文 件 名:  UserSerivce
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/11/3
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.service;

import com.compliers.dao.UserDao;
import com.compliers.entity.User;
import com.compliers.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/11/3
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Service
public class UserSerivce
{
	@Autowired
	private UserDao userDao;

	public UserInfo gainUser(String id){

		UserInfo result =new UserInfo();

		User res = userDao.getUser (id);

		result.setAccount (res.getAccount ());
		result.setAccountIcon (res.getAccountIcon ());
		result.setAccountName (res.getAccountName ());
		result.setRegisterTime (res.getRegisterTime ());
		result.setChannel (res.getChannel ());

		return result;
	}

}