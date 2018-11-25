
public class Module {

	public String name;
	public int rating;
	public int availability;
	
	
	public Module() {
		name = "";
		rating = 0;
		availability = 0;
	}
	
	public Module(String name, int rating, int availability) {
		this.name = name;
		this.rating = rating;
		this.availability = availability;
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

	public int getAvailability() {
		return availability;
	}

	public void setAvailability(int availability) {
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "\nModule [name=" + name + ", rating=" + rating + ", availability=" + availability + "]";
	}
	
	public void Display() {
		System.out.println(toString());
	}
}
