package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Student;
import com.deeptech.hibernate.work.utility.HibernateUtil;
public class createStudent {

	public static void main(String[] args) {
	
		Student s = new Student();
		s.setStudentName("Pavithra");
		s.setRollNumber(79);
		s.setCourse("BCA");
		SessionFactory sf = HibernateUtil.connection();
		Session ses = sf.openSession()	;
		ses.save(s);
		System.out.println("Inserted Record Succesfully");
		

	}

}
