
package net.owlsoft.hib01;

import net.owlsoft.hib01.model.Car;
import net.owlsoft.hib01.model.Engine;
import net.owlsoft.hib01.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by Perry on 17-Apr-15.
 */
public class App {
    public static void main(String[] args){
//        testInsert();
//        testQueryUnidir();
        testQueryUnidirOther();
        System.out.println("finish!!!");
    }

    public static  void testInsert(){
        Car car = new Car("bmw", "yellow", null);
        Engine engine = new Engine("rollroyce", "x11", car);
        car.setEngine(engine);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(car);
        tx.commit();
        session.close();
    }

    public  static void testQueryUnidir(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select car from Car as car where car.name = :name");
        query.setParameter("name", "bmw");

        List<Car> listCar = query.list();
        Car car1 = listCar.get(0);
        System.out.println(car1.toString());
        System.out.println(car1.getEngine().toString());
    }

    public  static void testQueryUnidirOther(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery("select engine from Engine as engine where engine.model = :model");
        query.setParameter("model", "x11");

        List<Engine> listEngine = query.list();
        Engine en1 = listEngine.get(0);
        System.out.println(en1.toString());
        System.out.println(en1.getCar().toString());
    }

}
