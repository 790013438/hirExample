package snippets;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import snippets.jpa.User;

public class AppTest {

    private static SessionFactory factory;
    private static Session session;

    static {
        session = factory.openSession();
    }

    @Before
    public void setUp() {
        session = factory.openSession();
        session.beginTransaction();
    }

    @After
    public void tearDown() {
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testSave() {
        User user = new User("kk", "123123", "dcwang@qq.com");
        Assert.assertNotNull(session.save(user));
    }

    @Test
    public void testGet() {
        User user = session.get(User.class, "kk");
        Assert.assertNotNull(user);
        Assert.assertEquals(user.getEmail(), "dcwang@qq.com");
        User user2 = session.get(User.class, "luohao");
        Assert.assertNull(user2);
    }

}
