/**
 * 文 件 名:  HomeController
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/10/30
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.compliers.controller;

import com.compliers.pojo.RequestInfo;
import com.compliers.pojo.ResponseInfo;
import com.compliers.pojo.UserInfo;
import com.compliers.service.UserSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.MediaType;
import java.util.*;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/10/30
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
//@RestController
@Controller
@RequestMapping("/home")
public class HomeController
{
	private static final Logger logger = LoggerFactory.getLogger (HomeController.class);
	private String LOGFIX = "-------------------";
	private String LOGPRE = "------------------->";

	@Autowired
	private UserSerivce userSerivce;

	@RequestMapping(value = "/testHome")
	@ResponseBody
	public ResponseInfo index(@RequestBody RequestInfo requestInfo)
	{
		ResponseInfo result = new ResponseInfo();
		logger.debug ("--------params json " + requestInfo.toString ());
		UserInfo temp = userSerivce.gainUser ("254151139912");
		logger.debug (String.format ("%s,this information logs for system test %s %s",LOGFIX,LOGPRE,temp));
		logger.debug (String.format ("%s,this information logs for system test %s %s",LOGFIX,LOGPRE,userSerivce.hashCode ()));

		result.setDescription ("test option successfully");
		result.setResultCode ("0");

		return result;
	}

	@RequestMapping("/testHome2")
	public String index2()
	{

		UserInfo temp = userSerivce.gainUser ("254151139912");
		logger.debug (String.format ("%s,this information logs for system test %s %s",LOGFIX,LOGPRE,temp));
		logger.debug (String.format ("%s,this information logs for system test %s %s",LOGFIX,LOGPRE,userSerivce.hashCode ()));

		return "target";
	}

	public static void main(String[] args)
	{
		/*Set<String> x = new HashSet<String> ();
		x.add ("1");
		x.add ("a");
		x.add ("c");
		x.add ("");
		Iterator<String> it = x.iterator ();
		while(it.hasNext ()){
			System.out.println(it.next ());
		}*/
		//Collections.synchronizedMap();
	/*	Hashtable<String,Object> xx= new Hashtable<String, Object> ();

		xx.put ("first","1");
		xx.put ("third","3");
		xx.put ("second","2");

		Enumeration a = xx.elements ();
		while (a.hasMoreElements ())
		{
			System.out.println(a.nextElement ());
		}*/
		Map test = new HashMap<String,String> ();
		test.put ("First","first");
		test.put ("second","second");
		test.put (null,"third");
		test.put ("four",null);

		Iterator<Map.Entry<String,Object>> it = test.entrySet ().iterator ();
		while(it.hasNext ()){
			System.out.println(it.next ());
		}

	}

	public static int change2Target(int a,String b)
	{
		return a + Integer.valueOf (b);
	}

	public static String change2Target(String a,int b)
	{
		return a + b + "";
	}

}
