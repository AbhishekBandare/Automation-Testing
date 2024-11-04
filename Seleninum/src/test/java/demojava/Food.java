package demojava;

public class Food {
 private String FoodName;
 private String cuisine;
 private String FoodType;
 private double unitPrize;
 
public Food(String foodName, String cuisine, String foodType, double unitPrize) {
	
	FoodName = foodName;
	this.cuisine = cuisine;
	FoodType = foodType;
	this.unitPrize = unitPrize;
}
public String getFoodName() {
	return FoodName;
}
public void setFoodName(String foodName) {
	FoodName = foodName;
}
public String getCuisine() {
	return cuisine;
}
public void setCuisine(String cuisine) {
	this.cuisine = cuisine;
}
public String getFoodType() {
	return FoodType;
}
public void setFoodType(String foodType) {
	FoodType = foodType;
}
public double getUnitPrize() {
	return unitPrize;
}
public void setUnitPrize(double unitPrize) {
	this.unitPrize = unitPrize;
}
     
 public void foodDetails() {
	 System.out.println(this.FoodName);
	 System.out.println(this.FoodType);
 }
 
 
}
