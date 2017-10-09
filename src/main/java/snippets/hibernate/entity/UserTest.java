package snippets.hibernate.entity;

import org.hibernate.Session;
import org.junit.Test;

import snippets.hibernate.util.HibernateUtil;

public class UserTest {

    @Test
    public void testSave() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        session.getTransaction().commit();
        session.close();
    }
}
