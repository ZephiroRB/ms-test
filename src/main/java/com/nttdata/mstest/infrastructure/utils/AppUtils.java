package com.nttdata.mstest.infrastructure.utils;

import com.nttdata.mstest.core.dtos.ProductDto;
import com.nttdata.mstest.core.entities.Product;
import org.springframework.beans.BeanUtils;

public class AppUtils {
    public static ProductDto entityToDto(Product product)
    {
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        return productDto;
    }
    public static Product dtoToEntity(ProductDto productDto)
    {
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }
}
