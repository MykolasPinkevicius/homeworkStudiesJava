package com.mykolaspinke.mykolaspinkeArtifact;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import net.roseindia.Employee;
import net.roseindia.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.getCurrentSession();
		org.hibernate.Transaction tr = session.beginTransaction();
		
		String strSql ="from Employee o";
		Query query = session.createQuery(strSql);
		List lst = query.list();
		for(Iterator<Iterator> it=lst.iterator();it.hasNext();){
		
			Employee emp=(Employee)it.next();
			System.out.println("Hello: " + emp.getEmpName());
		 }
		  

		tr.commit();
		System.out.println("Data displayed");
		sessFact.close();
    }
}
