package su.myspringwebapps.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@PropertySource("classpath:config.properties")
public class CommercialProposalConfiguration {

    @Value("${database.driver_class_name}")
    private String driverClassName;
    @Value("${database.url}")
    private String url;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private String password;

    // Арбитр представлений
    @Bean
    public InternalResourceViewResolver viewResolver()  {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }

    // Связь с базой данных
    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName(driverClassName);
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setUsername(username);
        driverManagerDataSource.setPassword(password);
        return driverManagerDataSource;
    }
    @Bean
    public SimpleJdbcTemplate jdbcTemplate()    {
        return new SimpleJdbcTemplate(dataSource());
    }

}