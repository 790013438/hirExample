package snippets;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import snippets.jpa.User;

public class App {

    public static void main(String[] args) {

    }

    public static void get() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        try {
            User user = session.get(User.class, "admin");
            System.out.println(user.getPassword());
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }

}
