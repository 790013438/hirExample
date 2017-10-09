package snippets.hibernate.entity;

import java.io.Serializable;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

import snippets.hibernate.util.HibernateUtil;

public class UserTest {

    @Test
    public void testSave() {
        User user = new User();
        user.setUsername("jack");
        user.setPassword(DigestUtils.md5Hex("123456"));
        user.setEmail("jack@126.com");

        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        Serializable key = session.save(user);
        System.out.println(key);
        Assert.assertNotNull(key);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGet() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = session.get(User.class, 1);
        Assert.assertNotNull(user);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getEmail());

        User user2 = session.get(User.class, 2);
        Assert.assertNull(user2);

        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void testGetByUsername() {
        Session session = HibernateUtil.getSession();
        session.beginTransaction();

        User user = session.createQuery("from User u where u.username=:username", User.class).setParameter("username", "jack").getSingleResult();
        Assert.assertNotNull(user);
    }
}
