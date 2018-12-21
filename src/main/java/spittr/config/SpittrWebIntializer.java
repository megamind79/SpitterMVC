package spittr.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpittrWebIntializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //AbstractAnnotationConfigDispatcherServletInitializer implements WebApplicationInitializer
    // which's used by Dispatcher Servlet to configure the appropriate controllers based on routes
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
        //return new Class[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
        //return new Class[0];
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(value = "spittr.web")
//public class SpittrWebIntializer {
//
//}
