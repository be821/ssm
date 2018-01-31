/**
 * 文 件 名:  MainClass
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/12/4
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/12/4
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class MainClass
{
	private static Connection conn = gainConnection();

	private static Connection gainConnection ()
	{
		Connection conn_ = null;
		try
		{
			//<1>加载驱动类
			Class.forName ("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/tws?autoReconnect=true&useSSL=false";
			String username = "root";
			String password = "123";
			conn_ = DriverManager.getConnection (url, username, password);
		}
		catch (ClassNotFoundException e)
		{
			System.out.println ("class not found");
		}
		catch (SQLException e)
		{
			System.out.println ("sql exception");
		}
		return conn_;
	}

	public static Connection gainInstance()
	{
		return conn;
	}
}