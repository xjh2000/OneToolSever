package com.ot.onetool.config;

import com.google.gson.Gson;
import com.ot.onetool.Json.Result;
import com.ot.onetool.Util.TokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LoginFilter implements WebMvcConfigurer {
    /**
     * 注册拦截器
     */
//
//    @Component
//    public static class TokenInterceptor implements HandlerInterceptor {
//        @Override
//        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception{
//            if(request.getMethod().equals("OPTIONS")){
//                response.setStatus(HttpServletResponse.SC_OK);
//                return true;
//            }
//            response.setCharacterEncoding("utf-8");
//            String token = request.getHeader("token"); //前端vue将token添加在请求头中
////        System.err.println(request.getHeader());
//            if(token != null){
//                boolean result = TokenUtil.verify(token);
//                if(result){
//                    System.out.println("通过拦截器");
//                    return true;
//                }
//            }
//            response.setCharacterEncoding("UTF-8");
//            response.setContentType("application/json; charset=utf-8");
//            try{
//                Result result=new Result();
//                result.setMsg("token verify fail");
//                result.setState(0);
//                Gson gson=new Gson();
//                response.getWriter().append(gson.toJson(result));
//
//                System.out.println("认证失败，未通过拦截器");
//
//            }catch (Exception e){
//                e.printStackTrace();
//                response.sendError(500);
//                return false;
//            }
//            return false;
//        }
//    }


}
