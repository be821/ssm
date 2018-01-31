/**
 * 文 件 名:  ConnectTool
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/12/15
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.connectAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/12/15
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class ConnectTool
{
	// 1> 饿汉模式，   2> 静态内部类，延迟加载
//	private static Connection conn = gainConnection();

	public static Connection getInstance()
	{
		return  InnerClass_.conn;
		// return conn;
	}

	private static class InnerClass_
	{
		private static final Connection conn = gainConnection();

		private static Connection gainConnection()
		{
			String driver = "com.mysql.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/tws?autoReconnect=true&useSSL=false";
			String name ="root";
			String password="123";

			Connection conn_ = null;
			try
			{
				Class.forName (driver);//class forName 是将需要的包直接引用到服务器中。
				conn_ = DriverManager.getConnection (url,name,password);
			}
			catch (ClassNotFoundException  e)
			{
				System.out.println("initiation driver failed");
			}
			catch (SQLException e)
			{
				System.out.println("get connection failed");
			}
			return conn_;
		}
	}

	/**
	 * 私有构造函数,防止外部直接 new Singleton() 这样保证单例.
	 */
	private ConnectTool() {}

}