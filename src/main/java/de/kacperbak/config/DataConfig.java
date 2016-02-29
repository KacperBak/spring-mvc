package de.kacperbak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

@Configuration
public class DataConfig {

    @Bean
    @Profile("dev")
    public DataSource developmentDataSource(){
        //create data source
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/vwdev");
        dataSource.setUsername("de.kacperbak.dev");
        dataSource.setPassword("asdf");

        //populate data source
        ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScripts(new ClassPathResource("postgresql-schema.sql"));
        populator.setSeparator(";");
        try{
            populator.populate(dataSource.getConnection());
        } catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean
    @Profile("prod")
    public DataSource productionDataSource(){
        DataSource dataSource = null;
        try{
            Context ctx = new InitialContext();
            dataSource = (DataSource) ctx.lookup("java:comp/env/jdbc/vwProdDB");
        }catch (Exception e){
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean
    public JdbcOperations jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
