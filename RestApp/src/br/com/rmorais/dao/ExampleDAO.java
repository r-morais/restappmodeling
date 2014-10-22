package br.com.rmorais.dao;

import java.util.ArrayList;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;

import com.benpot.util.HibernateUtil;

public class ExampleDAO {

	private static final Log log = LogFactory.getLog(ExampleDAO.class);
	
	public ArrayList listAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query queryResult = session.createQuery("from State");
		ArrayList list = (ArrayList) queryResult.list();
		return list;
	}
	
}
