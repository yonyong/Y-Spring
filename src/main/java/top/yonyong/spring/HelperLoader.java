package top.yonyong.spring;


import top.yonyong.spring.util.ClassUtil;
import top.yonyong.spring.x.*;

/**
 * 加载相应的 Helper 类
 */
public final class HelperLoader {

    /**
     * 加载这五个类, 目的是为了执行类里的静态代码块
     */
    public static void init() {
        Class<?>[] classList = {
            ClassHelper.class,
            BeanHelper.class,
            AopHelper.class,
            IocHelper.class,
            ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}