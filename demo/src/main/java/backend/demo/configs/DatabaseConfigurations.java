package backend.demo.configs;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * Date: 8/14/2024
 * @author LiamMcIntosh
 * DataSource configuration class for connecting to multiple datasources
 */
@Configuration
public class DatabaseConfigurations {

	
	/**
	 * Date: 8/14/2024
	 * @author LiamMcIntosh
	 * @return DataSource
	 * Establishes datasource credentials for connecting
	 * to the Sql Server database
	 */
	@Primary
	@Bean("SqlServerSource")
	@ConfigurationProperties(prefix="sqlserver.datasource")
	public DataSource sqlServerSource() {
		return DataSourceBuilder.create().build();
	}
	
	/**
	 * Date: 8/14/2024
	 * @author LiamMcIntosh
	 * @return DataSource
	 * Establishes datasource credentials for connecting
	 * to the Oracle Db database
	 */
	@Bean("OracleDbSource")
	@ConfigurationProperties(prefix="oracledb.datasource")
	public DataSource oracleDbServerSource() {
		return DataSourceBuilder.create().build();
	}
	
}
