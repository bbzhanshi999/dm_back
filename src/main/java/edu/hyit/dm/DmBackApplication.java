package edu.hyit.dm;

import edu.hyit.dm.sys.interceptor.AuthenticationInteceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@MapperScan("edu.hyit.dm.app.dao")
public class DmBackApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DmBackApplication.class, args);
    }


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("DELETE","PUT","GET","POST")
                .maxAge(3600);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInteceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/api/login/**","/static/**");
    }
}
