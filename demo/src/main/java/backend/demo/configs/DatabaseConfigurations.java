package backend.demo.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


/**
 * Date: 8/19/2024
 * @author LiamMcIntosh
 * DataSource configuration class for connecting to Sql Server
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class DatabaseConfigurations {

	
	@Value("${db.username}")
	private String dbUsername;
	@Value("${db.password}")
	private String dbPassword;
	@Value("${db.url}")
	private String dbUrl;
	@Value("${db.driver.classname}")
	private String dbDriver;

	
	/**
	 * Date: 8/19/2024
	 * @author LiamMcIntosh
	 * @return DataSource
	 * Establishes datasource credentials for connecting
	 * to the Sql Server database
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setUsername(dbUsername);
		dataSource.setPassword(dbPassword);
		dataSource.setUrl(dbUrl);
		dataSource.setDriverClassName(dbDriver);
		
		return dataSource;
	}
	
}
