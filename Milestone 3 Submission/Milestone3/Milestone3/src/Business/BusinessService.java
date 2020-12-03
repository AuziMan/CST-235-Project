package Business;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import beans.Product;

@Stateless
@Local(BusinessInterface.class)

@Alternative
// The purpose of a BusinessService is to declare methods (previously declared in the BusinessInterface) with values inside of them to be updated on the response pages. 
public class BusinessService implements BusinessInterface {
	
    // Creates a products arraylist to be used in the business service.
	List<Product> products = new ArrayList<Product>();
	
    // Creates a default constructor and creates a data grid with manually entered table values. 
	public BusinessService() {		
		products.add(new Product("1", "Macbook", (float)1200, 1));
		products.add(new Product("2", "Iphone ", (float)800, 1));
		products.add(new Product("3", "Airpods", (float)120, 3));
		products.add(new Product("4", "Dell laptop", (float)1100, 1));
		products.add(new Product("5", "Speaker", (float)400, 1));
	}
	
	@Override
	public List<Product> getProducts() {
        // Once the product from the list is received return a product
		return products;
	}

	@Override
	public void setProducts(List<Product> products) {
		this.products = products;	
	}
	
	@Override
	public void test() {		
        // Prints out a test message to test if the web page is working. 
		System.out.println("------------------hello from test");
	}

}
