package Classes.Subclasses;

import Classes.Bicycle;

public class MountainBicycle extends Bicycle {
    //define attribute
    private int gear;


    //Constructors
    public MountainBicycle(){
        if(gear > 0 && gear <= 12){
            this.gear = gear;
        }else {
            this.gear = 6;
        }
    }

    //define methods
    public void gearUp(){
        if(this.gear< 12){
            gear++;
        }
    }

    public void gearDown(){
        if(this.gear > 1){
            gear--;
        }
    }

    //getter
    public int getGear(){
        return this.gear;
    }

    @Override
    public void pedal(float acceleration){
        float accelerationWithGear = acceleration * (this.gear/6);
        super.pedal(accelerationWithGear);
    }

}
