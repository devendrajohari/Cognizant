package com.devendra.product.bo;

import com.devendra.product.dao.ProductDAO;
import com.devendra.product.dao.ProductDAOImpl;
import com.devendra.product.dto.Product;

public class ProductBOImpl implements ProductBO {
	private static ProductDAO dao = new ProductDAOImpl();
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

}
