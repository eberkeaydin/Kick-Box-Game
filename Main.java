public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 11 , 100, 90, 50);
        Fighter alex = new Fighter("Alex" , 7 , 95, 100, 60);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
