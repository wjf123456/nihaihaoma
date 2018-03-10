package initializer;

import config.RootConfig;
import config.WebConfig;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import service.SignInService;

public class WebAppInitializer extends
        AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
            RootConfig.class};
    }


    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
