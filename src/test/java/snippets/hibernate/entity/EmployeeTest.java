package snippets.hibernate.entity;

import org.hibernate.Session;
import org.junit.Test;

import snippets.hibernate.util.HibernateUtil;

public class EmployeeTest {

    @Test
    public void testSave() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        session.getTransaction();
        session.close();
    }

    @Test
    public void testGet() {
        
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testGetDepart() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();
    }
}
