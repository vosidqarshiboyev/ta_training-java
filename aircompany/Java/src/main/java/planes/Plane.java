package planes;

import java.util.Objects;

public abstract class Plane {
    String planeModel;
    private int planeMaxSpeed;
    private int planeMaxFlightDistance;
    private int planeMaxLoadCapacity;

    public Plane(String planeModel, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity) {
        this.planeModel =planeModel;
        this.planeMaxSpeed = planeMaxSpeed;
        this.planeMaxFlightDistance = planeMaxFlightDistance;
        this.planeMaxLoadCapacity = planeMaxLoadCapacity;
    }
    public int getMaxLoadCapacity() {
             return    planeMaxLoadCapacity;

    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + planeModel + '\'' +
                ", maxSpeed=" + planeMaxSpeed +
                ", maxFlightDistance=" + planeMaxFlightDistance +
                ", maxLoadCapacity=" +planeMaxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return planeMaxSpeed == plane.planeMaxSpeed &&
                planeMaxFlightDistance == plane.planeMaxFlightDistance &&
                planeMaxLoadCapacity == plane.planeMaxLoadCapacity &&
                Objects.equals(planeModel, plane.planeModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
    }
}
