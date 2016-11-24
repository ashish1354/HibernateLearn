package com.ash.hibernate.daos;

import org.hibernate.Session;

import com.ash.hibernate.Model.SimpleUser;
import com.ash.hibernate.configlearn.HibernateUtil;

public class SimpleUserDaoIMPL implements SimpleUserDao {
	private Session session;
	
	SimpleUserDaoIMPL(){
		this.session = HibernateUtil.getSessionFactory().openSession();
	}
	
	
	public Integer saveUser(SimpleUser simpleUser) {
		session.beginTransaction();
		Object id= session.save(simpleUser);
		session.getTransaction().commit();
		return (Integer)id;
	}


	public void updateUser(SimpleUser simpleUser) {
		session.beginTransaction();
		session.saveOrUpdate(simpleUser);
		session.getTransaction().commit();
	}

	public SimpleUser getUserByID(Integer simpleUserID) {
		SimpleUser simpleUser = (SimpleUser) session.get(SimpleUser.class, simpleUserID);
		return simpleUser;
	}


	public void deleteUser(SimpleUser simpleUser) {
		session.beginTransaction();
		session.delete(simpleUser);
		session.getTransaction().commit();
	}

}
