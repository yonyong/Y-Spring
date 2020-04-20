package top.yonyong.spring.constant;

/**
 * @Author yonyong
 * @Description //相关配置项常量
 * @Date 2020/4/20 10:31
 **/
public interface ConfigConstant {

    /**
     * 配置文件的名称
     */
    String CONFIG_FILE = "mybootstrap.yml";

    /**
     * 数据库
     */
    String JDBC_DRIVER = "yonyong.spring.datasource.driver";
    String JDBC_URL = "yonyong.spring.datasource.url";
    String JDBC_USERNAME = "yonyong.spring.datasource.username";
    String JDBC_PASSWORD = "yonyong.spring.datasource.password";

    //文件地址
    String APP_BASE_PACKAGE = "handwritten.framework.app.base_package";
    String APP_JSP_PATH = "handwritten.framework.app.jsp_path";
    String APP_ASSET_PATH = "handwritten.framework.app.asset_path";
}
