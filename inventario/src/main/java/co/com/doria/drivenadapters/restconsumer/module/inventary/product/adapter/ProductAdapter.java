package co.com.doria.drivenadapters.restconsumer.module.inventary.product.adapter;

import co.com.doria.drivenadapters.restconsumer.module.inventary.product.consumer.ProductConsumer;
import co.com.doria.model.module.inventary.product.gateway.ProductRepo;
import co.com.doria.model.module.inventary.product.gateway.SpreadsheetResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Getter
@Component
@Repository
@RequiredArgsConstructor
public class ProductAdapter implements ProductRepo {

    private final ProductConsumer productConsumer;

    @Override
    public String getAllProducts() {
        try {
            return productConsumer.getGoogleSheet();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
