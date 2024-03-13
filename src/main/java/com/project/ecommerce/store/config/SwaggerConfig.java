package com.project.ecommerce.store.config;


import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration



@SecurityScheme(
        name = "scheme1",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
@OpenAPIDefinition(

        info = @Info(
                title = "QuikBazaar API ",
                description = "Dive into the precision and innovation of Saurabh Maurya's expertly crafted E-commerce backend code for QuickBazaar. Powered by SpringBoot, it guarantees a dynamic and reliable online shopping experience, reshaping the future of E-commerce technology.",
                version = "1.0V",
                contact = @Contact(
                        name = "Saurabh Maurya",
                        email = "saurabhmaurya.in@gmail.com",
                        url = "https://quikbazaar.netlify.app/"
                ),
                license = @License(
                        name = "OPEN License",
                        url = "https://vvnt.netlify.app/"
                )
        )
        ,
        externalDocs = @ExternalDocumentation(
                description = "This is external docs",
                url = "https://github.com/saurabhm1"
        )
)
public class SwaggerConfig {


}
