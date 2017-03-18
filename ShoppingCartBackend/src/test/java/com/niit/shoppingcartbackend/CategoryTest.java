package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartBackend.DAO.CategoryDAO;
import com.niit.ShoppingCartBackend.Model.Category;

public class CategoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		
		Category category = (Category) context.getBean("category");
		
		category.setCategoryId(123);
		category.setCategoryName("Watches");
		
		categoryDAO.saveOrUpdate(category);
	}

}
