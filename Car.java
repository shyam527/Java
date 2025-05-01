public class Car {

    private String model;
    private int year;
    private String color;
    private double price;

    public Car(String model, int year, String color, double price){
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
            return model;
        }



        public int getYear() {
            return year;
        }



        public String getColor() {
            return color;
        }



        public double getPrice() {
            return price;
        }


        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", year=" + year +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    '}';
        }

    public static void main(String[] args) {
        
        Car car1 = new Car("Renault-Kwid", 2025, "Grey", 4.70);
        Car car2 = new Car("Tata-Tiago", 2024, "White", 5.00);
        Car car3 = new Car("Hyundai-Creta", 2020, "Black", 10.25);

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}