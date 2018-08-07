
public class Dog {
	private String color;
	private String breed;
	private int hunger;
	private int energy;
	
	

	Dog (String color,String breed, int hunger, int energy){
		this.color = color;
		this.breed = breed;
		this.hunger = hunger;
		this.energy = energy;
		
	}
	void bark(){
	System.out.println("bow wow");
	}
	
	void sleep(){
		this.hunger++;
		this.energy++;
		
	}
	void eat(){
		this.hunger--;
		this.energy--;
		
	}
	public String getColor() {
		return color;
	}


	public String getBreed() {
		return breed;
	}


	public int getHunger() {
		return hunger;
	}


	public void setHunger(int hunger) {
		this.hunger = hunger;
	}


	public int getEnergy() {
		return energy;
	}


	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
}	