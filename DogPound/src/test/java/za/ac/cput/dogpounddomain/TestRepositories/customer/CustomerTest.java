package za.ac.cput.dogpounddomain.TestRepositories.customer;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.dogpounddomain.Domain.Customer;
import za.ac.cput.dogpounddomain.Factories.CustomerFactory;
import za.ac.cput.dogpounddomain.Repository.customer.CustomerRepository;
//import za.ac.cput.dogpounddomain.Repository.customer.Impl.CustomerRepositoryImpl;
import za.ac.cput.dogpounddomain.services.customer.CustomerService;

import java.util.*;

public class CustomerTest{ // extends AbstractTestNGSpringContextTests {
    //@Autowired
    private CustomerService service;
    //@Autowired
    private CustomerRepository repository;

    private HashMap<String, String> id;

    @Test
    public void create() throws Exception {

        List<Customer> customer = new ArrayList<Customer>();;
        /* CREATE CUSTOMER LIST */
        HashMap<String, String> customerDetails = new HashMap<String, String>();
        customerDetails.put("Number", "C0001");
        customerDetails.put("Name", "Bulelani");
        customerDetails.put("Surname", "Rwexane");

       /* SimpleDateFormat fomatter = new SimpleDateFormat("dd/mm/yy");
        Date currDate = fomatter.parse("01/01/2016");
        PackageProduct pkgproduct1 = PackageProductFactory.createPackageProduct(
                pkgProdDetail1, currDate, 5);          // PackageProduct 1

*/
        Customer customer1 = CustomerFactory.createCustomer(customerDetails,"Bulelani","Rwexane");

        Map<String, String> customerDetails1 = new HashMap<String, String>();
        customerDetails1.put("Number", "C0002");
        customerDetails1.put("Name", "Luyanda");
        customerDetails1.put("Surname", "Fani");

     /*   SimpleDateFormat fomatter2 = new SimpleDateFormat("dd/mm/yy");
        Date currDate2 = fomatter2.parse("01/01/2016");
        PackageProduct pkgproduct2 = PackageProductFactory.createPackageProduct(
                pkgProdDetail2, currDate2, 5);     // PackageProduct 2
*/
        Customer customer2 = CustomerFactory.createCustomer(customerDetails,"Luyanda","Fani");
        customer.add(customer1);
        customer.add(customer2);

        /*this.repository.save(customer2);
        id = customer1.getID();
        Assert.assertNotNull(customer1.getID());
        *//*------------------------------*/

      /*  Map<String, Integer> sides = new HashMap<String, Integer>();
        sides.put("width", 200);
        sides.put("height", 200);

        Container container = ContainerFactory.createContainer(sides, "CO1003", packageProd);
        this.repository.save(container);
        id = container.getId();
        Assert.assertNotNull(container.getId());
*/
    }
}
