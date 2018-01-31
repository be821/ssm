/**
 * 文 件 名:  UserDao
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/11/3
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.dao;

import com.compliers.entity.User;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/11/3
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public interface UserDao
{
	User getUser (String id);
}