package de.kacperbak.config;

import de.kacperbak.web.WebConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by bakka on 19.02.16.
 */
public class SpringMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private static final String DEV_PROFILE = "dev";

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext rootContext = (AnnotationConfigWebApplicationContext) super.createRootApplicationContext();
        rootContext.getEnvironment().setDefaultProfiles(DEV_PROFILE);
        return rootContext;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext servletContext = (AnnotationConfigWebApplicationContext) super.createServletApplicationContext();
        servletContext.getEnvironment().setDefaultProfiles(DEV_PROFILE);
        return servletContext;
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{ RootConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{ WebConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/"} ;
    }
}
