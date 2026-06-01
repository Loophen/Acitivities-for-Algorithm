public class Car {
    private String modelname;
    private String Car;

    public Car(String modelname){
        this.modelname = modelname;
    }
    String getModelName(){
        return modelname;
    }
    
     void setCar(String Car){
        this.Car=Car;
    }
    String getCar(){
        return Car;
    }
   
   
    
void displayModel(){
    System.out.println();
}

String getstartEngine(){
    return "Start Constructing a " + Car;
}
}
