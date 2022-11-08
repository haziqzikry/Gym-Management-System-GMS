package Model;

public class Person {
	private String name, birthday;
	private Double weight, height;
	
	public Person() {
		this.name = "";
		this.birthday = "";
		this.weight = 0.00;
		this.height = 0.00;
	}
	
	public Person(String name, String birthday, Double weight, Double height){
		this.name = name;
		this.birthday = birthday;
		this.weight = weight;
		this.height = height;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public Double getWeight() {
		return weight;
	}
	
	public Double getHeight() {
		return height;
	}
	
	
}
