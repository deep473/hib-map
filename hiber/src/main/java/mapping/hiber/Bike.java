package mapping.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bike {
	@Id
	int modelNum;
	String brand;
	int price;
	@ManyToOne
	Biker biker;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int modelNum, String brand, int price, Biker biker) {
		super();
		this.modelNum = modelNum;
		this.brand = brand;
		this.price = price;
		this.biker = biker;
	}
	public int getModelNum() {
		return modelNum;
	}
	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Biker getBiker() {
		return biker;
	}
	public void setBiker(Biker biker) {
		this.biker = biker;
	}
	@Override
	public String toString() {
		return "Bike [modelNum=" + modelNum + ", brand=" + brand + ", price=" + price + ", biker=" + biker + "]";
	}
	
}
