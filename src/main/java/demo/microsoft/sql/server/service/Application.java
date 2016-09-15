package demo.microsoft.sql.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public FilterRegistrationBean corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("HEAD");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("DELETE");
		config.addAllowedMethod("PATCH");
		source.registerCorsConfiguration("/**", config);
		final FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
		bean.setOrder(0);
		return bean;
	}
	

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Bean
	public CommandLineRunner testJdbc() {

		return (args) -> {

//			List<Map<String, Object>> result = jdbcTemplate.queryForList("exec [tcWW].[procWoolworthsInvoice] @SalesOrder='049858'");
//			for(Map<String, Object> row : result) {
//				System.out.println("<>:" + row.get("Name").toString()); 
//			}

//			List<InvoicePrintModel> test = jdbcTemplate.query("exec [tcWW].[procWoolworthsInvoice] @SalesOrder='049858'", new BeanPropertyRowMapper<InvoicePrintModel>(InvoicePrintModel.class));
//			for(InvoicePrintModel row : test) {
//				System.out.println("<>:" + row.getName()); 
//			}

			
		};

	}

}
