package com.exilant.demo.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.FlushMode;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
	public class RepositoryConfig
	{
	    @Value("${spring.datasource.driver-class-name}")   private String classname;
	    @Value("${spring.datasource.url}")                 private String url;
	    @Value("${spring.datasource.username}")            private String username;
	    @Value("${spring.datasource.password}")            private String password;
	    @Value("${hibernate.dialect}")         			  private String hibernateDialect;
	    @Value("${hibernate.show-sql}")    				  private String hibernateShowSql;
	    @Value("${spring.jpa.hibernate.ddl-auto}") 				  private String hibernateHbm2ddlAuto;
	        
	    @Bean   
	    public DataSource getDataSource()
	    {
	        DriverManagerDataSource ds = new DriverManagerDataSource(); 
	        ds.setDriverClassName(classname);
	        ds.setUrl(url);
	        ds.setUsername(username);
	        ds.setPassword(password);        
	        return ds;
	    }
	    
	   /* @Bean
	    @Autowired
	    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	    {
	        HibernateTransactionManager htm = new HibernateTransactionManager();
	        htm.setSessionFactory(sessionFactory);
	        return htm;
	    }*/
	    
	    @Bean
	    @Autowired
	    public HibernateTemplate getHibernateTemplate(SessionFactory sessionFactory)
	    {
	        HibernateTemplate hibernateTemplate = new HibernateTemplate(sessionFactory);
	        hibernateTemplate.setCheckWriteOperations(false);
	        return hibernateTemplate;
	    }
	        
	    @Bean
	    public LocalSessionFactoryBean getSessionFactory()
	    {
	        LocalSessionFactoryBean sessionFactory= new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(getDataSource());
	        sessionFactory.setPackagesToScan("com");
	        sessionFactory.setHibernateProperties(getHibernateProperties());
	        return sessionFactory;
	    }

	    @Bean
	    public Properties getHibernateProperties()
	    {
	        Properties properties = new Properties();
	        properties.put("hibernate.dialect", hibernateDialect);
	        properties.put("hibernate.show_sql", hibernateShowSql);
	        properties.put("hibernate.hbm2ddl.auto", hibernateHbm2ddlAuto);
	        
	        return properties;
	    }
	    
	}

