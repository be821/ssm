/**
 * 文 件 名:  RequestInfo
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/11/28
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.pojo;

import java.io.Serializable;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/11/28
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class RequestInfo implements Serializable
{
	private String name;
	private String password;

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public String getPassword ()
	{
		return password;
	}

	public void setPassword (String password)
	{
		this.password = password;
	}

	@Override
	public String toString ()
	{
		final StringBuffer sb = new StringBuffer ("RequestInfo{");
		sb.append ("name='").append (name).append ('\'');
		sb.append (", password='").append (password).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}