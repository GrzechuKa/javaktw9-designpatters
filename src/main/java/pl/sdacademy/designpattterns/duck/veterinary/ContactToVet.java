package pl.sdacademy.designpattterns.duck.veterinary;

import java.util.Date;

public class ContactToVet {
    private Vet vet;

    public void callVet (){
        System.out.println(new Date());
        if(vet == null){
            vet = new Vet();
        }
        vet.ansvearPhone();
    }

}
