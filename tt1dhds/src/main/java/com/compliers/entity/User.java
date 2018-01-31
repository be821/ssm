/**
 * 文 件 名:  User
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/11/3
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.entity;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/11/3
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public class User
{
	private String account;
	private String accountName;
	private String accountIcon;
	private String registerTime;
	private String password;
	private String channel;

	@Override
	public String toString ()
	{
		final StringBuffer sb = new StringBuffer ("TestDemo{");
		sb.append ("account='").append (account).append ('\'');
		sb.append (", accountName='").append (accountName).append ('\'');
		sb.append (", accountIcon='").append (accountIcon).append ('\'');
		sb.append (", registerTime='").append (registerTime).append ('\'');
		sb.append (", password='").append (password).append ('\'');
		sb.append (", channel='").append (channel).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}

	public String getAccount ()
	{
		return account;
	}

	public void setAccount (String account)
	{
		this.account = account;
	}

	public String getAccountName ()
	{
		return accountName;
	}

	public void setAccountName (String accountName)
	{
		this.accountName = accountName;
	}

	public String getAccountIcon ()
	{
		return accountIcon;
	}

	public void setAccountIcon (String accountIcon)
	{
		this.accountIcon = accountIcon;
	}

	public String getRegisterTime ()
	{
		return registerTime;
	}

	public void setRegisterTime (String registerTime)
	{
		this.registerTime = registerTime;
	}

	public String getPassword ()
	{
		return password;
	}

	public void setPassword (String password)
	{
		this.password = password;
	}

	public String getChannel ()
	{
		return channel;
	}

	public void setChannel (String channel)
	{
		this.channel = channel;
	}
}