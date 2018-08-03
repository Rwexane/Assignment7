package za.ac.cput.dogpounddomain.RestApi;

import javax.validation.Valid;
import java.util.List;

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
import za.ac.cput.dogpounddomain.Domain.Dog;
import za.ac.cput.dogpounddomain.services.dog.DogService;

import java.util.List;

@Controller
public class DogController {
    @Autowired
    private DogService myService;

    //--------------------------------------Create Client------------------------------------
    @RequestMapping(value = "/dog/create", method = RequestMethod.PUT)
    public ResponseEntity<Void> createDog(@RequestBody Dog dog, UriComponentsBuilder ucBuilder)
    {
        myService.create(dog);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/dog/{id}").buildAndExpand(dog.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }



    //-------------------Retrieve Single Story--------------------------------------------------------
    @RequestMapping(value = "/dog/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dog> getDog(@PathVariable("id") long id) {
        Dog myDog= myService.readById(id);
        if (myDog == null) {
            //return new ResponseEntity<Dog>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Dog>(myDog, HttpStatus.OK);
    }

    //---------------------Retrieve List of Clients---------------------------------------------------

    @RequestMapping(value = "/Dogs/",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Dog>> getAllAdoptops()
    {
        List<Dog> clients = myService.readAll();
        if(clients.isEmpty())
        {
            return new ResponseEntity<List<Dog>>(HttpStatus.NO_CONTENT);//OR HttpStatus.Not_Found
        }

        return new ResponseEntity<List<Dog>>(clients,HttpStatus.OK);
    }

    @RequestMapping(value = "/dog/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Dog> deleteAdoption(@PathVariable("id")long id)
    {
        System.out.println("Fetching & Deleting Dog with id" + id);

        Dog dog = myService.readById(id);
        if(dog == null)
        {
            System.out.println("Unable to delete. Adoption with id " + id + " not found");//comment
            return new ResponseEntity<Dog>(HttpStatus.NOT_FOUND);

        }

        myService.delete(dog);
        return new ResponseEntity<Dog>(HttpStatus.NO_CONTENT);
    }

    //----------------------------------Update----------------------------------------------------
    @RequestMapping(value = "dog/update/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Dog> updateAdoption(@PathVariable("id") long id, @RequestBody Dog dog)
    {
        System.out.println("Updating Adoption " + id);

        Dog currentDog = myService.readById(id);

        if(currentDog == null)
        {
            System.out.println("Dog with id" +id+ "not found");
            return new ResponseEntity<Dog>(HttpStatus.NOT_FOUND);
        }

        Dog updatedDog = new Dog.Builder().copy(currentDog)
                .id(dog.getId())
                .breed(dog.getBreed())
                .name(dog.getName())
                .livingArea(dog.getlivingArea())
                .build();
        myService.update(currentDog);

        return new ResponseEntity<Dog>(updatedDog,HttpStatus.OK);
    }
}
