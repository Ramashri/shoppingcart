package com.niit.ShoppingCartBackend.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCartBackend.Model.Cart;

@Repository("CartDAO")
public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Cart> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Cart getByCartId(int cartid) {
		String hql = "from Cart where CartId ='" + cartid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Cart> listCart = (List<Cart>) (query).list();

		if (listCart != null && !listCart.isEmpty()) {
			return listCart.get(0);
		}
		return null;
	}

	@Transactional
	public Cart getByProductId(int productid) {
		String hql = "from Cart where ProductId ='" + productid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Cart> listCart = (List<Cart>) (query).list();

		if (listCart != null && !listCart.isEmpty()) {
			return listCart.get(0);
		}
		return null;
	}

	@Transactional
	public Cart getByProductName(String productname) {
		String hql = "from Cart where ProductName ='" + productname + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Cart> listCart = (List<Cart>) (query).list();

		if (listCart != null && !listCart.isEmpty()) {
			return listCart.get(0);
		}
		return null;

	}

	@Transactional
	public void saveOrUpdate(Cart productid) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(productid);
	}

	

	@Transactional
	public void editCategory(Cart productid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int productid) {
		Cart cartToDelete = new Cart();
		cartToDelete.setProductId(productid);
		sessionFactory.getCurrentSession().delete(cartToDelete);
		
	}

	
}	