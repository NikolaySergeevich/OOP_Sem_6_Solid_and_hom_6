public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister user2 = new Persister("Jon");
		Repozitory repozitory = new Repozitory();
		Report report = new Report();
		report.reportUser(user);
		repozitory.Save(user);
		report.reportUser(user2);
		repozitory.Save(user2);

	}
}