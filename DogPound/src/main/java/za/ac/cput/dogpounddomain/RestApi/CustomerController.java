package za.ac.cput.dogpounddomain.RestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import za.ac.cput.dogpounddomain.Domain.Customer;
import za.ac.cput.dogpounddomain.services.customer.CustomerService;

import java.util.List;
import java.util.Set;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService myService;


    //--------------------------------------Create Client------------------------------------
    @RequestMapping(value = "/customer/create", method = RequestMethod.PUT)
    public ResponseEntity<Void> createClient(@RequestBody Customer cust, UriComponentsBuilder ucBuilder)
    {
        myService.create(cust);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customer/{id}").buildAndExpand(cust.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }



    //-------------------Retrieve Single Story--------------------------------------------------------


    @RequestMapping(value = "/cust/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") long id) {
        Customer cust = myService.readById(id);
        if (cust == null) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Customer>(cust, HttpStatus.OK);
    }
    //---------------------Retrieve List of Clients---------------------------------------------------
    @RequestMapping(value = "/customers/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> getAllClients()
    {
        List<Customer> customers = myService.readAll();
        if(customers.isEmpty())
        {
            return new ResponseEntity<List<Customer>>(HttpStatus.NO_CONTENT);//OR HttpStatus.Not_Found
        }

        return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
    }

}
