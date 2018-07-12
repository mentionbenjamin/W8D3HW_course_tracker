package db;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBHelper {

    private static Session session;
    private static Transaction transaction;

    public static void save(Object object) {
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        } catch (Throwable e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static <T> List<T> getAll(Class classType) {
        List<T> results = null;
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            Criteria cr = session.createCriteria(classType);
            results = cr.list();
        } catch (Throwable e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

    public static void update(Object object) {
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.update(object);
            transaction.commit();
        } catch (Throwable e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static void delete(Object object) {
        session = HibernateUtil.getSessionFactory().openSession();

        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        } catch (Throwable e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public static <T> T find(int id, Class classType){
        session = HibernateUtil.getSessionFactory().openSession();
        T result = null;

        try {
            Criteria cr = session.createCriteria(classType);
            cr.add(Restrictions.eq("id", id));
            result = (T) cr.uniqueResult();
        } catch(Throwable e){
            transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }

        return result;
    }

}