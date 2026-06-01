public class SportCar extends Car{
    
    public SportCar(String modelname){
      super(modelname);
    }
    @Override
    void displayModel(){
        System.out.println(getstartEngine());
        System.out.println("Beep! I am an "+getModelName());
    }

    

}
