package anand.learn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMethod {
	public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        MainMethod obj = new MainMethod();
		obj.doTransaction(sessionFactory);
		sessionFactory.close();

	}

	public void doTransaction(SessionFactory factory) {
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Gaurav Chawla");

		RegularEmployee e2 = new RegularEmployee();
		e2.setName("Vivek Kumar");
		e2.setSalary(50000);
		e2.setBonus(5);

		ContractEmployee e3 = new ContractEmployee();
		e3.setName("Arjun Kumar");
		e3.setPayPerHour(1000);
		e3.setContractDuration("15 hours");

		session.persist(e1);
		session.persist(e2);
		session.persist(e3);

		transaction.commit();
		session.close();
		System.out.println("success");
	}
}