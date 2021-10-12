package Classes;

public class Bicycle {
    //Define attributes
    private String brand;
    private String color;
    private float velocity;

    //Constructors
    public Bicycle(){
        this.brand = "GW";
        this.color = "grey";
        this.velocity = 0;
    }
    public Bicycle(String bikeBrand, String bikeColor, float initialVelocity){
        this.brand = bikeBrand;
        this.color = bikeColor;
        this.velocity = initialVelocity;
    }

    //Define methods
    //getters
    public String getBrand(){
        return brand;
    }

    public String getColor(){
    return color;
    }

    public float getVelocity(){
        return velocity;
    }

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public void pedal(float acceleration){
        this.velocity = this.velocity + acceleration;
    }

    public void brake(){
        if(this.velocity > 0){
            this.velocity--;
        }
    }
    public void brake(float negativeAcceleration){
        if(this.velocity > negativeAcceleration) {
            this.velocity = this.velocity - negativeAcceleration;
            }
        }

        /*
        * Java String equals()
        The Java String class equals() method compares the two given strings based on
        * the content of the string. If any character is not matched, it returns false.
        * If all characters are matched, it returns true.
        * */
        public void brake(String intensity){
            if(intensity.equals("strong")){
                if(this.velocity > 10){
                    this.velocity = this.velocity - 10;
                } else {
                    if (velocity > 0){
                        this.velocity--;
                    }
                }
            }
        }
}


/*
* Los metodos de tipo void no devuelven ningun valor y se limitan a
* aumentar o disminuir la velocidad de la bicicleta
*
* Aunque los atributos son privados, los metodos son publicos y nos
* permite modificar o acceder el valor de los atributos, de manera
* indirecta
*
* Se recomiendo iniciar los metodos con verbos
*
* get: a los metodos cuyo nombre inicia con este verbo se le suele denominar
* getters, y nos permiten modificar el valor de un atributo del objeto.
*
* set: a los metodos cuyo nombre inicia con este verbo se le suele denominar
* setters, y nos permiten modificar el valor de un atributo del objeto.
* Se usa return para devolver un valor y para finalizar la ejecucion del metodo
*
* this: permite referirse al objeto actual. Es decir que, si desde un metodo se
* especifica this, seguido de un atributo o un metodo de dicha clase, se esta
* refiriendo al atributo o metodo de dicho nombre del objeto actual. */
