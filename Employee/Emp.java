package Employee;

public class Emp {
	private String name;
	private int id;
	private String city;
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
