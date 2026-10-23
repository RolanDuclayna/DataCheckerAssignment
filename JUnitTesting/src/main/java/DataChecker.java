public class DataChecker {

    public enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public boolean has31(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Invalid Month.");
        }
        switch (month) {
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                return true;

            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
            case FEBRUARY:
                return false;
        }
        return false;
    }

}
