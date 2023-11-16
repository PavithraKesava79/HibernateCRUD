package com.deeptech.hibernate.work.utility;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionfactory;
	
	static // static block
	{
		sessionfactory = new Configuration().configure().buildSessionFactory(); 
							// SessionFactory is used to call hibernate configuration File
	}
	public static SessionFactory connection()// user-defined Method
	{
		return sessionfactory;
	}

}
