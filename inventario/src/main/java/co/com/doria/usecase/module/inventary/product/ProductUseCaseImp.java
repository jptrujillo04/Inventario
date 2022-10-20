package co.com.doria.usecase.module.inventary.product;

import co.com.doria.model.module.inventary.product.gateway.ProductRepo;

public class ProductUseCaseImp implements ProductUseCase{

    private final ProductRepo productRepo;

    public ProductUseCaseImp(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    @Override
    public String getAllProducts() {
        return productRepo.getAllProducts();
    }
}
