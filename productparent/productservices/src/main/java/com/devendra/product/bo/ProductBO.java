package com.devendra.product.bo;

import com.devendra.product.dto.Product;

public interface ProductBO {
	void create(Product product);
	Product findProduct(int id);
}
