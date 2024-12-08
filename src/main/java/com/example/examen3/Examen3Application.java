package com.example.examen3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Examen3Application {

		public static void main(String[] args) {
			SpringApplication.run(Examen3Application.class, args);
		}


		@Bean
		public WebMvcConfigurer corsConfigurer() {
			return new WebMvcConfigurer() {
				@Override
				public void addCorsMappings(CorsRegistry registry) {
					registry.addMapping("/api/v1/**") // Rutas relacionadas con Personaje y ProgramaTv
							.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
							.allowedOrigins("http://adminprogramas.com", "http://localhost:4200") // Dominios permitidos
							.allowedHeaders("*")
							.allowCredentials(true);
				}
			};
		}
	}
