package com.tvhung.quanlycang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "org.springdoc" })
@Import({ org.springdoc.core.SpringDocConfiguration.class, org.springdoc.webmvc.core.SpringDocWebMvcConfiguration.class,
		org.springdoc.webmvc.ui.SwaggerConfig.class, org.springdoc.core.SwaggerUiConfigProperties.class,
		org.springdoc.core.SwaggerUiOAuthProperties.class,
		org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration.class })

class OpenApiConfig implements WebMvcConfigurer {

}