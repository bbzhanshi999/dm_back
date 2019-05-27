package edu.hyit.dm.sys.interceptor;

import edu.hyit.dm.app.model.Employee;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthenticationInteceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(handler.getClass());

        //拦截请求
        //判断session和principal是否存在

        HttpSession session = request.getSession(false);
        if(session!=null){
            //是否有principal
            Employee principal = (Employee)session.getAttribute("principal");
            return principal != null;
        }
        //如果被拦截，让他去登录
        response.sendRedirect(request.getContextPath()+"/");
        return false;
    }
}
