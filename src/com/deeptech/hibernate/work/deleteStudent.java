package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;

public class deleteStudent 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.connection();
		Session ses=sf.openSession();
		ses.beginTransaction();
		
		Student s=ses.load(Student.class,2);
		ses.delete(s);
		System.out.println("Record deleted sucessfully");
		ses.getTransaction().commit();
		sf.close();
		ses.close();

	}

}