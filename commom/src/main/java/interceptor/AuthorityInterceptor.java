/**
 * 文 件 名:  AuthorityInterceptor
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2017/11/28
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package interceptor;

import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2017/11/28
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class AuthorityInterceptor implements HandlerInterceptor
{
	public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
	{
		System.out.println ("1111111-------------preHandle");
		System.out.println(request);
		String uri = request.getRequestURI ();
		StringBuffer url = request.getRequestURL ();
		String remoteAddress = request.getRemoteAddr ();
		request.getAttributeNames ();
		System.out.println ("uri"+uri+"remoteAddress:"+remoteAddress+"url:"+url);
		return true;
	}

	public void postHandle (HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception
	{
		System.out.println ("1111111-------------postHandle");
		System.out.println("response:"+response+"request:"+request+"handler"+handler+"modelAndView"+modelAndView);
	}

	public void afterCompletion (HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception
	{

		System.out.println ("1111111-------------afterCompletion");

		System.out.println("response:"+response+"request:"+request+"handler"+handler+"exception:"+ex);

	}
}