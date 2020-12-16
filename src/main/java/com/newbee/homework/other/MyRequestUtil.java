package com.newbee.homework.other;

import org.springframework.web.bind.ServletRequestDataBinder;

import javax.servlet.http.HttpServletRequest;

public class MyRequestUtil {
    public static <T> T getParameterObject(HttpServletRequest request, Class<T> tClass) {
        try {
            T result = tClass.newInstance();
            ServletRequestDataBinder binder = new ServletRequestDataBinder(result);
            binder.bind(request);
            return result;
        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }

}
