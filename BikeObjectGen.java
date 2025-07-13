public class BikeObjectGen
{
    public static void main(String[] args) {
        BikeObject1 bike1 = new BikeObject1("Hero Splendor+","Blue",110000,new BikeEngine("Petrol",110,"Manual"));
        BikeObject1 bike2 = new BikeObject1("Suzuki Burgman","Blue",142000,new BikeEngine("Petrol",125,"Manual"));

        BikeObject1 [] Bikes = {bike1,bike2};
        for (int i = 0; i < Bikes.length; i++)
        {
            Bikes[i].detailsOfBike();
            System.out.println();
            Bikes[i].engine().detailsOfEngine();
        }
    }
}
