package Business;

import java.util.List;
import javax.ejb.Local;
import beans.Product;

@Local
// Creates a business interface achieve total abstraction. Since java doesn't support inheritance the interface allows the project to acheive multiple inheritance. 
public interface BusinessInterface {
    // Declares a list of methods or variables to be used in the business service classes.
	public void test();
	public List<Product>getProducts();
	public void setProducts(List<Product> products);	
}
