package top.yonyong.spring.annotation;

import top.yonyong.spring.constant.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author yonyong
 * @Description //处理器方法注解
 * @Date 2020/4/20 10:26
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRequestMapping {

    /**
     * 请求路径
     * @return
     */
    String value() default "";

    /**
     * 请求方法
     * @return
     */
    RequestMethod method() default RequestMethod.GET;
}