package co.com.doria.controller.module.inventary.product;

import co.com.doria.usecase.module.inventary.product.ProductUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("inventario")
public class InventarioController {

    private final ProductUseCase productUseCase;

    public InventarioController(ProductUseCase productUseCase) {
        this.productUseCase = productUseCase;
    }

    @GetMapping ("/health")
    public String getHealth (){
        return "Health";
    }

    @GetMapping ("/products")
    public String getAllProducts (){
        return productUseCase.getAllProducts();
    }
}

