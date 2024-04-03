public class Places {

    public void officePlaces() {System.out.println("Places that fits for businesses:");}

    public void placesListed(int num1, int num2, String...places) {
        // List the possible locations to consider
        System.out.println(places[1]);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Places b1 = new Places();
        b1.officePlaces();
        b1.placesListed(2000, 3000, "lakeview", "downtown");
    }
}