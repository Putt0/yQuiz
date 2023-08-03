package github.com.putt0.account;

import java.util.UUID;

public class Account {

    private final UUID uniqueId;
    private final String name;
    private int points;

    public Account(UUID uniqueId, String name, int points) {
        this.uniqueId = uniqueId;
        this.name = name;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void addPoint() {
        setPoints(getPoints() + 1);
    }
}