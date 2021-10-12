package Classes.Subclasses;

import Classes.Bicycle;

public class MountainBicycle extends Bicycle {
    //define attribute
    private int cambio;


    //Constructors
    public MountainBicycle(){
        if(cambio > 0 && cambio <= 12){
            this.cambio = cambio;
        }else {
            this.cambio = 6;
        }
    }

    //define methods
    public void cambioUp(){
        if(this.cambio < 12){
            cambio++;
        }
    }

    public void cambioDown(){
        if(this.cambio > 1){
            cambio--;
        }
    }

    //getter
    public int getCambio(){
        return this.cambio;
    }

    @Override
    public void pedal(float acceleration){
        float accelerationWithCambio = acceleration * (this.cambio/6);
        super.pedal(accelerationWithCambio);
    }

}
