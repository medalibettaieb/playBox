package tn.edu.esprit.cs.playBox.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilities {
	private SessionFactory sessionFactory;
	private Session session;
	private static HibernateUtilities instanceOf;
	private HibernateUtilities() {
	}
	public Session giveMeSession(){
		if (session==null) {
			sessionFactory=new Configuration().configure().buildSessionFactory();
			session=sessionFactory.getCurrentSession();
		}
		
		return session;
	}
	public static HibernateUtilities getInstanceOf() {
		if(instanceOf==null){
			instanceOf=new HibernateUtilities();
		}
		return instanceOf;
	}

}
