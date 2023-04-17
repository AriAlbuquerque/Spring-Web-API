package dio.web.api.DOC;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2

public class SwaggerConfig {
    private Contact contact() {
        return new Contact(
                "Ariane",
                "http://www.arianealbuquerque.com.br",
                "ari@arianealbuquerque.com.br");
    }

    private ApiInfoBuilder infoBuilder() {
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - REST API");
        apiInfoBuilder.description("API com uso de Spring REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: OPEN SOURCE");
        apiInfoBuilder.license("Licença da Empresa");
        apiInfoBuilder.licenseUrl("http://www.arianealbuquerque.com.br");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;

    }

    @Bean
    public Docket detalheApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.springbootweb.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.infoBuilder().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }


}
