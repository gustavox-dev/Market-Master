package com.example.Market.Master.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Market Master!")
                        .version("1.0")
                        .description("API Market Master."))
                .externalDocs(new ExternalDocumentation()
                        .description("Documentação do Projeto Market Master")
                        .url("https://github.com/gustavox-dev/Market-Master"));
    }
}
