package com.niit.shoppingcartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ShoppingCartBackend.DAO.BillingaddressDAO;
import com.niit.ShoppingCartBackend.DAO.CartDAO;
import com.niit.ShoppingCartBackend.DAO.CategoryDAO;
import com.niit.ShoppingCartBackend.DAO.ProductDAO;
import com.niit.ShoppingCartBackend.DAO.ShippingaddressDAO;
import com.niit.ShoppingCartBackend.DAO.SupplierDAO;
import com.niit.ShoppingCartBackend.DAO.UserDAO;
import com.niit.ShoppingCartBackend.DAO.WishlistDAO;
import com.niit.ShoppingCartBackend.Model.Billingaddress;
import com.niit.ShoppingCartBackend.Model.Cart;
import com.niit.ShoppingCartBackend.Model.Category;
import com.niit.ShoppingCartBackend.Model.User;
import com.niit.ShoppingCartBackend.Model.Whishlist;
import com.niit.ShoppingCartBackend.Model.Product;
import com.niit.ShoppingCartBackend.Model.Shippingaddress;
import com.niit.ShoppingCartBackend.Model.Supplier;

public class CategoryTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		BillingaddressDAO billingaddressDAO = (BillingaddressDAO) context.getBean("BillingaddressDAO");
		CartDAO cartDAO = (CartDAO) context.getBean("CartDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		WishlistDAO wishlistDAO = (WishlistDAO) context.getBean("WishlistDAO");
		ShippingaddressDAO shippingaddressDAO = (ShippingaddressDAO) context.getBean("ShippingaddressDAO");
		
		
		Category category = (Category) context.getBean("category");
		User user = (User) context.getBean("user");
		Product product = (Product) context.getBean("product");
		Billingaddress billingaddress = (Billingaddress) context.getBean("billingaddress");
		Cart cart = (Cart) context.getBean("cart");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Whishlist whishlist = (Whishlist) context.getBean("whishlist");
		Shippingaddress shippingaddress = (Shippingaddress) context.getBean("shippingaddress");
		
		
		category.setCategoryId(123);
		category.setCategoryName("Watch");
		categoryDAO.saveOrUpdate(category);
		
		
		user.setUserName("skfr");
		user.setPassword("jfkd");
		user.setContactNumber(98765);
		user.setAddress("12,sejkajdh");
		userDAO.saveOrUpdate(user);
		
		
		product.setProductName("fdknmfg");
		productDAO.saveOrUpdate(product);
		
		billingaddress.setBillingAddress("hfdjdufuinv");
		billingaddress.setContactNumber(897465);
		billingaddressDAO.saveOrUpdate(billingaddress);
		
		cart.setProductId(02);
		cart.setProductName("dfhjj");
		cartDAO.saveOrUpdate(cart);
		
		
		supplier.setSupplierName("hddsjk");
		supplier.setContactNumber(87968764);
		supplierDAO.saveOrUpdate(supplier);
		
		
		whishlist.setProductName("dhjf");
		whishlist.setPrice(87);
		wishlistDAO.saveOrUpdate(whishlist);
		
		shippingaddress.setShippingAddress("fdgfs");
		shippingaddress.setUserName("jkfgjd");
		shippingaddress.setUserId(6474);
		
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		
		
	}

}