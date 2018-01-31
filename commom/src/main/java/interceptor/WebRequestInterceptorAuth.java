/**
 * 文 件 名:  WebRequestInterceptorAuth
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/11/28
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package interceptor;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/11/28
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class WebRequestInterceptorAuth implements WebRequestInterceptor
{

	public void preHandle (WebRequest request) throws Exception
	{
		System.out.println ("1111111-------------preHandle");
		System.out.println(request.getHeader (""));
	}

	public void postHandle (WebRequest request, ModelMap model) throws Exception
	{
		System.out.println ("222222-------------postHandle");
	}

	public void afterCompletion (WebRequest request, Exception ex) throws Exception
	{
		System.out.println ("333333-------------afterCompletion");
	}
}