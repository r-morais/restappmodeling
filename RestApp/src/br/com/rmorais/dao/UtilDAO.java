package br.com.rmorais.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.benpot.util.HibernateUtil;

public class UtilDAO {

	private static final Log log = LogFactory.getLog(UtilDAO.class);

	public void persist(Object object) {

		log.debug("persisting Object instance");

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.persist(object);
			tx.commit();
			session.close();
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}
	
	public void update(Object object) {

		log.debug("update Object instance");

		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			session.update(object);
			tx.commit();
			session.close();
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}
	
	public void delete(Object object) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.delete(object);	
		tx.commit();		
		session.close();
	}
}
