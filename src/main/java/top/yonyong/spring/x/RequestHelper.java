package top.yonyong.spring.x;


import top.yonyong.spring.bean.Param;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * 请求助手类
 */
public final class RequestHelper {

    /**
     * 获取请求参数
     */
    public static Param createParam(HttpServletRequest request) throws IOException {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        Enumeration<String> paramNames = request.getParameterNames();
        //没有参数
        if (!paramNames.hasMoreElements()) {
            return null;
        }

        //get和post参数都能获取到
        while (paramNames.hasMoreElements()) {
            String fieldName = paramNames.nextElement();
            String fieldValue = request.getParameter(fieldName);
            paramMap.put(fieldName, fieldValue);
        }

        return new Param(paramMap);
    }

}
