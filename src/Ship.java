import java.util.Random;

public class Ship {
    private Point currentLocation;

    Ship() {
        Random rand = new Random();
        currentLocation = new Point(rand.nextInt(10), rand.nextInt(10));
    }

    public Point getShipLocation() {
        return currentLocation;
    }
}
