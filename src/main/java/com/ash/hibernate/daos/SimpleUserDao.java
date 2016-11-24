package com.ash.hibernate.daos;

import com.ash.hibernate.Model.SimpleUser;

public interface SimpleUserDao  {
	/**
	 * @param simpleUser
	 * @return
	 */
	public Integer saveUser(SimpleUser simpleUser); 
	
	/**
	 * Delete the particular row from the database.
	 * @param simpleUser Is well created object of SimpleUser Class
	 */
	public void deleteUser(SimpleUser simpleUser); 
	
	/**
	 * Update the particular Simple User Object
	 * @param simpleUser Is well created object of SimpleUser Class
	 */
	public void updateUser(SimpleUser simpleUser); 
	
	public SimpleUser getUserByID(Integer simpleUserID); 
	
	
	
}
