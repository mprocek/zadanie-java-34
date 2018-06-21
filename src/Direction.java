public enum Direction {
    NORTH ("północ"),
    EAST ("wschód"),
    SOUTH ("południe"),
    WEST ("zachód"),
    UNDEFINED ("nieznany");

    private final String nameDirection;

    private Direction(String nameDirection){
        this.nameDirection=nameDirection;
    }

    public String getNameDirection() {
        return nameDirection;
    }


    }


