package top.yonyong.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 切面注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAspect {
    /**
     * 包名
     */
    String pkg() default "";

    /**
     * 类名
     */
    String cls() default "";
}