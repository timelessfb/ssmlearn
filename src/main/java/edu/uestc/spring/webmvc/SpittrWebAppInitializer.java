package edu.uestc.spring.webmvc;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    /*getRootConfigClasses()方法返回的带有@Configuration注解的类将会用来配置ContextLoaderListener创建的Spring application context中的bean*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0]{RootConfig.class};
    }

    /*返回的带有@Configuration注解的类，将会用来定义DispatcherServlet的Spring application context中的bean*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    /*将一个或多个路径映射到DispatcherServlet*/
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
