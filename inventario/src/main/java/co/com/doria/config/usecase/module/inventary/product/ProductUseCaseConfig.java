package co.com.doria.config.usecase.module.inventary.product;

import co.com.doria.model.module.inventary.product.gateway.ProductRepo;
import co.com.doria.usecase.module.inventary.product.ProductUseCase;
import co.com.doria.usecase.module.inventary.product.ProductUseCaseImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductUseCaseConfig {

    @Bean
    public ProductUseCase productUseCase(ProductRepo productRepo){
        return new ProductUseCaseImp(productRepo);
    }
}
