package interceptor;

import org.apache.ibatis.plugin.Invocation;
import org.omg.PortableInterceptor.Interceptor;

import java.util.Properties;

public class PasswordEncoderPlugin implements org.apache.ibatis.plugin.Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return null;
    }

    @Override
    public Object plugin(Object target) {
        return null;
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
