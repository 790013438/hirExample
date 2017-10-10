package snippets.hibernate.entity;

import org.hibernate.Session;
import org.junit.Test;

import snippets.hibernate.util.HibernateUtil;

public class EmployeeTestt {

    @Test
    public void test() {
        Session session = HibernateUtil.getSession();
    }

}
