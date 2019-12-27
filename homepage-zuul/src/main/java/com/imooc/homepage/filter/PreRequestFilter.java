package com.imooc.homepage.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * Created by lwy on 2019/12/23.
 * 在过滤器中存储客户端发起请求的时间戳
 */
@Slf4j
@Component
public class PreRequestFilter extends ZuulFilter{


    @Override
    public String filterType() {
        // 指定过滤器的类型 这是请求之前的类型
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 定义过滤器的执行顺序 数值越小优先级越高
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 是否启用当前的过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // RequestContext 用于在过滤器之间传递消息
        RequestContext ctx = RequestContext.getCurrentContext();

        ctx.set("startTime", System.currentTimeMillis());

        return null;
    }
}
