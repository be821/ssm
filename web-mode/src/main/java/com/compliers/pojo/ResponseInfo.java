/**
 * 文 件 名:  ResponseInfo
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
public class ResponseInfo implements Serializable
{
	private String resultCode ;
	private String description;

	@Override
	public String toString ()
	{
		final StringBuffer sb = new StringBuffer ("ResponseInfo{");
		sb.append ("resultCode='").append (resultCode).append ('\'');
		sb.append (", description='").append (description).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}

	public String getResultCode ()
	{
		return resultCode;
	}

	public void setResultCode (String resultCode)
	{
		this.resultCode = resultCode;
	}

	public String getDescription ()
	{
		return description;
	}

	public void setDescription (String description)
	{
		this.description = description;
	}
}