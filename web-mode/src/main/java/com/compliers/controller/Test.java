/**
 * 文 件 名:  Test
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/12/18
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.controller;

import com.compliers.connectAccess.ConnectTool;

import javax.resource.spi.ConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/12/18
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class Test
{
	/**
	*  main
	**/
	public static void main(String[] args) throws SQLException
	{
		String a = new String("1") + new String("1");
		a.intern ();

		String xx = "11";

		System.out.println(a == xx);
	}

}
