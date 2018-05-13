package home_work8;

import java.util.HashMap;

public enum CarType {

    Sedan, SportCar;

    HashMap<String, Double> models = new HashMap<>();
    double maxVol, minVol;

    public Object putModels(String mod, double val){
        models.put(mod, val);
        return models;
    }

    public Double getVolMax (CarType carType){
            maxVol = 0.0;
            for (Double value : carType.models.values()){
                if (maxVol < value){
                    maxVol = value;
                }
        }
        return maxVol;
    }
    public Double getVolMin (CarType carType){
        minVol = 1000.0;
        for (Double value : carType.models.values()){
            if (minVol > value){
                minVol = value;
            }
        }
        return minVol;
    }

}

class CarTypeDemo{
    public static void main(String[] args) {
        CarType sedan;
        sedan = CarType.Sedan;
        sedan.putModels("Lada Granta", 1.4);
        sedan.putModels("Renault Logan", 1.6);
        sedan.putModels("Volvo V60", 2.5);
        sedan.putModels("Lifan ", 1.3);
        System.out.println("hello");

        /*
        *
        *
        *
        *
        *
        *
        *
        *
         */

        CarType sportCar;
        sportCar = CarType.SportCar;
        sportCar.putModels("Mazda RX8", 1.3);
        sportCar.putModels("McLaren 570GT", 5.7);
        sportCar.putModels("Bugatti Vision GT", 8.0);
        sportCar.putModels("Acura NSX", 2.0);

        System.out.println("\n" + CarType.Sedan.models);
        System.out.println("\n" + CarType.SportCar.models);
        System.out.println("\n" + CarType.SportCar.getVolMax(CarType.SportCar));
        System.out.println("\n" + CarType.Sedan.getVolMax(CarType.Sedan));
        System.out.println("\n" + CarType.SportCar.getVolMin(CarType.SportCar));
        System.out.println("\n" + CarType.Sedan.getVolMin(CarType.Sedan));
    }
}
