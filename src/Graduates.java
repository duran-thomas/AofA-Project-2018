
public class Graduates {

	private String name;
	private int rating;
	
	public Graduates() {
		name  = "";
		rating = 0;
	}
	
	public Graduates(String name, int rating) {
		this.name = name;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void Display() {
		System.out.println("Name: " + name);
		System.out.println("Rating: " + rating);
	}
}
