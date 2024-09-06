public class park {
    private String name;

        public park(String name) {
            this.name = name;
        }

    public class Attraction {
        private String Attraction_name;
        private String Attraction_working;
        private double cost;

        public Attraction(String Attraction_name, String Attraction_working, double cost) {
            this.Attraction_name = Attraction_name;
            this.Attraction_working = Attraction_working;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Attraction Name: " + Attraction_name);
            System.out.println("Working Hours: " + Attraction_working);
            System.out.println("Cost: " + cost);
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Park");
        Attraction attractionOne = park.new Attraction("Attraction1", "10:00 - 14:00", 20);
        attractionOne.printInfo();
    }
}
