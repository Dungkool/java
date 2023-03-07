package db;

public class MariaDBDAO implements DAO {

	@Override
	public void insert(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
		System.out.println("Inserted MariaDB Database");
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
		System.out.println("Deleted MariaDB Database");

	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		System.out.println(obj);
		System.out.println("Updated MariaDB Database");

	}

}
