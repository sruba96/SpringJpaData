package com.websystique.springmvc.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
    // the configuration classes for the root application context
    @Override
    protected Class<?>[] getRootConfigClasses()
    {
        return new Class[]
        {
            AppConfig.class
        };
    }

    // the configuration classes for the dispatcher servlet application context
    @Override
    protected Class<?>[] getServletConfigClasses()
    {
       return new Class<?>[] { RootConfig.class};
    }

    // servlet mapping(s) for the DispatcherServlet
    @Override
    protected String[] getServletMappings()
    {
        return new String[]
        {
            "/"
        };
    }
}