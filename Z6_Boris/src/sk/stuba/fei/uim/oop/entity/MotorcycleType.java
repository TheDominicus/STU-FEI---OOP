package sk.stuba.fei.uim.oop.entity;

public enum MotorcycleType {
    CRUISER,SCOOTER,SPORT;

    @Override
    public String toString() {
        switch (this) {
            case CRUISER:
                return "Cruiser";
            case SCOOTER:
                return "Scooter";
            case SPORT:
                return "Sport";
        }
        return null;
    }
}
