package chapter11;

public interface Product {
	
	double getPrice();
	void setPrice(double price);
	
	String getName();
	void setName(String name);
	
	String getColour();
	void setColour(String colour);

	default String getBarcode() {
		return "No barcode";
	}
}
