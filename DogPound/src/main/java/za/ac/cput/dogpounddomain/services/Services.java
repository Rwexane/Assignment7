package za.ac.cput.dogpounddomain.services;

import java.util.List;

public interface Services <H, ID> {

    H create(H entity);

    public H readById(ID id);

    public List<H> readAll();

    //public H save(H entity);

    public H update(H entity);

    public void delete(H entity);


}
