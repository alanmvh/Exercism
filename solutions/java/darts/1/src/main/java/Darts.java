class Darts {
    int score(double xOfDart, double yOfDart) {
        double r = Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2);
        r = Math.abs(Math.sqrt(r));
        if (r <= 1.0) {
            return 10;
        } else if (r >= 1.1 && r <= 5.0) {
            return 5;
        } else if (r >= 5.0 && r <= 10.0) {
            return 1;
        } else {
            return 0;
        }
    }
}
