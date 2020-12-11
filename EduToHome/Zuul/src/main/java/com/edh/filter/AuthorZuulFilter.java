package com.edh.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class AuthorZuulFilter extends ZuulFilter {

    @Override
    public String filterType() {

        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {

        return FilterConstants.PRE_DECORATION_FILTER_ORDER;
    }

    @Override
    public boolean shouldFilter() {
//        //1. 获取Request对象
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = requestContext.getRequest();
//        String requestURI = request.getRequestURI();
//        if ("/user/login".equals(requestURI)){
//            return false;
//        }
        return true;
    }

    @Override
    public Object run() throws ZuulException {
//        //读取公钥
//        Algorithm algorithm = Algorithm.HMAC256("secret");
//        JWTVerifier service =  JWT.require(algorithm).withIssuer("SERVICE").build();
//
//        //1. 获取Request对象
//        RequestContext requestContext = RequestContext.getCurrentContext();
//        HttpServletRequest request = requestContext.getRequest();
//
//        //从request请求中 获取head
//        // String token = request.getHeader("token");
//        String token = null;
//        Cookie[] cookies = request.getCookies();
//        for (Cookie cook:cookies
//        ) {
//            if (cook.getName().equals("token")){
//                token=cook.getValue();
//            }
//        }
//        //验证token信息
//        try{
//            DecodedJWT verify = service.verify(token);
//            //获取自定义的负载内容
//            Map<String, Claim> claims = verify.getClaims();
//            Claim loginName = claims.get("loginName");
//            Claim password = claims.get("password");
//        }catch (Exception e){
//
//            requestContext.getResponse().setContentType("application/json;charset=UTF-8");
//            requestContext.setResponseBody("验证失败!");
//        }


        return null;
    }

}
