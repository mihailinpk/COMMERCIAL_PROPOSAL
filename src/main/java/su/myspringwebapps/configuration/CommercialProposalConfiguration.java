package su.myspringwebapps.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@PropertySource("classpath:connect_parameters.properties")
public class CommercialProposalConfiguration {

    @Value("com.mysql.jdbc.Driver")
    private String driverClassName;
    @Value("jdbc:mysql://localhost:3306/db_doors?serverTimezone=Europe/Moscow")
    private String url;
    @Value("${db_username}")
    private String username;
    @Value("${db_password}")
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