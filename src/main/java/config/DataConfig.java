package config;
import domain.Log;
import domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DataConfig {

    @Bean
    public DataSource h2DataSource(){
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("schema.sql")
                .build();
    }
        @Bean
        public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
            SqlSessionFactoryBean sqlSessionFactoryBean
                    =new SqlSessionFactoryBean();
            sqlSessionFactoryBean.setDataSource(dataSource);
            Resource[] mappers=new ClassPathResource[]{
                    new ClassPathResource("mappers/UserMapper.xml"),
                    new ClassPathResource("mappers/LogMapper.xml"),
            };
            sqlSessionFactoryBean.setMapperLocations(mappers);


            Class[] aliases = new Class[]{User.class,Log.class};
            sqlSessionFactoryBean.setTypeAliases(aliases);



            return sqlSessionFactoryBean.getObject();
        }







    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer=
                new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("reporsitory");
        return mapperScannerConfigurer;
    }




}
