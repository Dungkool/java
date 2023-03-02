package board;

public class DAO {
	public void insert(String str) {
		System.out.println("Inserted Oracle Dataase Row : " + str);
	}
	public void update(int num, String str) {
		System.out.println("Updated Oracle Dataase Row : " + num + " " + str);
	}
	public void delete(int num) {
		System.out.println("Deleted Oracle Dataase Row : " + num);
	}
	public String select(int num) {
		return "Hi Database...";
	}
}
