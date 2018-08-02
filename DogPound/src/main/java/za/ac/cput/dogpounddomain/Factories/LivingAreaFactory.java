package za.ac.cput.dogpounddomain.Factories;

import za.ac.cput.dogpounddomain.Domain.Dog;
import za.ac.cput.dogpounddomain.Domain.LivingArea;

import java.util.List;

public class LivingAreaFactory {

    //singleton
    private static LivingAreaFactory instance=null;

    public LivingAreaFactory(){}

    public static LivingAreaFactory getInstance(){
        if (instance == null) {
            instance = new LivingAreaFactory();
        }
        return instance;
    }
    public static LivingArea createLivingArea(int livingAreaId,
                                              String name,
                                              String code,
                                              List<Dog> animals){
        return new LivingArea.Builder(name)
                .code(code)
                .livingAreaId(livingAreaId)
                .animals(animals)
                .build();
    }
}
