package com.niit.ShoppingCartBackend.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCartBackend.Model.User;

@Repository("UserDAO")
public class UserDAOImpl  implements UserDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public User getByUserId(int userid) {
		String hql = "from User where UserId ='" + userid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}

	

	@Transactional
	public User getByEmailId(String emailid) {
		String hql = "from User where EmailId ='" + emailid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		
	}
		return null;
	}
	
	@Transactional
	public User getByPassword(String password) {
		String hql = "from User where Password ='" + password + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}
	
	public User getByConformPassword(String conformpassword) {
		String hql = "from User where ConformPassword ='" + conformpassword + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		
	}
		return null;
	}

	@Transactional
	public User getByContactNumber(int contactnumber) {
		String hql = "from User where ContactNumber ='" + contactnumber + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}

	@Transactional
	public User getByAddress(String address) {
		String hql = "from User where Address ='" + address + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		}
		return null;
	}
	
	
	@Transactional
	public User getByZipcode(int zipcode) {
		String hql = "from User where Zipcode ='" + zipcode + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		
	}
		return null;
	}
	
	public User getByRole(String role) {
		String hql = "from User where Role ='" + role + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		
	}
		return null;
	}
	

	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Transactional
	public void delete(int Userid) {
		User userToDelete = new User();
		userToDelete.setUserId(Userid);
		sessionFactory.getCurrentSession().delete(userToDelete);
		
	}

	public User getByUserName(String username) {
		String hql = "from User where UserName ='" + username + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		
	}
		return null;
	}

	

}