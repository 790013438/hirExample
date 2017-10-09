package snippets.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//获取hibernate configuration
public final class HibernateUtil {

    private static SessionFactory factory;

    static {
        factory = new Configuration().configure().buildSessionFactory();
    }

    private HibernateUtil() {
    }

    /**
     * 获得与thread相应的Session
     */
    public static Session getSession() {
        return factory.getCurrentSession();
    }
}
