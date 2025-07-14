package com.example.diary_server.Config;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Contact API")
                .version("0.0.1")
                .description("<h3>Contact Service Swagger</h3>");

        return new OpenAPI()
                .info(info);
    }
}
