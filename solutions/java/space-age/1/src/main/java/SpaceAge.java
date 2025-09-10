import java.util.Map;
import java.util.Optional;

class SpaceAge {
    private final int SECONDS_PER_EARTH_YEAR = 31_557_600;
    private double seconds_age;
    public static final Map<String, Double> ORBITAL_PERIODS = Map.of(
            "Mercury", 0.2408467,
            "Venus", 0.61519726,
            "Earth", 1.0,
            "Mars", 1.8808158,
            "Jupiter", 11.862615,
            "Saturn", 29.447498,
            "Uranus", 84.016846,
            "Neptune", 164.79132
    );

    SpaceAge(double seconds) {
        this.seconds_age = seconds;
    }

    double getSeconds() {
        return seconds_age;
    }

    double onEarth() {
        return seconds_age / SECONDS_PER_EARTH_YEAR;
    }

    double onMercury() {
        return seconds_age / (ORBITAL_PERIODS.get("Mercury")  * SECONDS_PER_EARTH_YEAR);
    }

    double onVenus() {
        return seconds_age / (ORBITAL_PERIODS.get("Venus") * SECONDS_PER_EARTH_YEAR);
    }

    double onMars() {
        return seconds_age / ((ORBITAL_PERIODS.get("Mars") * SECONDS_PER_EARTH_YEAR));
    }

    double onJupiter() {
        return seconds_age / ((ORBITAL_PERIODS.get("Jupiter") * SECONDS_PER_EARTH_YEAR));
    }

    double onSaturn() {
        return seconds_age / ((ORBITAL_PERIODS.get("Saturn") * SECONDS_PER_EARTH_YEAR));
    }

    double onUranus() {
        return seconds_age / ((ORBITAL_PERIODS.get("Uranus") * SECONDS_PER_EARTH_YEAR));
    }

    double onNeptune() {
        return seconds_age / ((ORBITAL_PERIODS.get("Neptune") * SECONDS_PER_EARTH_YEAR));
    }

}
