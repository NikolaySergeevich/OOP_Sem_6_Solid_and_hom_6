public class Persister extends User{


	public Persister(String name) {
		super(name);
	}
	@Override
	public String toString() {
		return String.format("%s упорный", super.toString());
	}
}