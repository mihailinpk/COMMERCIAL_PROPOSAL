package su.myspringwebapps.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import su.myspringwebapps.calculators.DoorPriceCalculatorImplementation;
import su.myspringwebapps.calculators.GeneralDoorPriceCalculatorImplementation;
import su.myspringwebapps.calculators.TotalNumberOfDoorsCalculatorImplementation;
import su.myspringwebapps.repositories.DoorPricesInteractionWithDatabaseImplementation;
import su.myspringwebapps.sevices.MainService;

@Configuration
public class CommercialProposalConfiguration {

    // Арбитр представлений
    @Bean
    public InternalResourceViewResolver viewResolver()  {
        return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
    }

    // Калькулятор общей стоимости дверных блоков по текущей позиции коммерческого предложения
    @Bean
    public DoorPriceCalculatorImplementation calculatordoorprice()  {
        return new DoorPriceCalculatorImplementation();
    }

    // Калькулятор общей стоимости дверных блоков в предложении
    @Bean
    public GeneralDoorPriceCalculatorImplementation calculatorgeneraldoorprice()    {
        return new GeneralDoorPriceCalculatorImplementation();
    }

    // Калькулятор общего количества дверных блоков в предложении
    @Bean
    public TotalNumberOfDoorsCalculatorImplementation calculatortotaldoornumber()   {
        return new TotalNumberOfDoorsCalculatorImplementation();
    }

    // Настройки (цена и надбавка за количество)
    @Bean
    public DoorPricesInteractionWithDatabaseImplementation pricesrepository()   {
        return new DoorPricesInteractionWithDatabaseImplementation();
    }

    // Главный сервис программы
    @Bean
    public MainService mainservice()    {
        return new MainService(calculatorgeneraldoorprice(), calculatortotaldoornumber(), pricesrepository());
    }

    // Связь с базой данных
    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/db_doors?serverTimezone=Europe/Moscow");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("root");
        return driverManagerDataSource;
    }
    @Bean
    public SimpleJdbcTemplate jdbcTemplate()    {
        return new SimpleJdbcTemplate(dataSource());
    }

}