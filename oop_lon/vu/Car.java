package oop_lon.vu;

public class Car {
        private String color;
        private int enginePower;
        private boolean convertible;
        private boolean parkingBrake;

        public Car() {
        }

        public Car(String color, int enginePower, boolean convertible, boolean parkingBrake) {
            this.color = color;
            this.enginePower = enginePower;
            this.convertible = convertible;
            this.parkingBrake = parkingBrake;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void pressStartButton() {
            System.out.println("ù ù");
        }

        public void pressAcceleratorButton() {
            System.out.println("ỉn ỉn");
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", enginePower=" + enginePower +
                    ", convertible=" + convertible +
                    ", parkingBrake=" + parkingBrake +
                    '}';
        }
}
