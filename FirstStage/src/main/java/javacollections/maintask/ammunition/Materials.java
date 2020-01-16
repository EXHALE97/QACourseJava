package javacollections.maintask.ammunition;

public enum Materials {
    COTTON("Cotton"),
    POLYESTER("Polyester"),
    THERMOPLASTIC("Thermoplastic"),
    POLYCARBONATE("Polycarbonate"),
    FIBER_GLASS("Fiber glass"),
    COAL_PLASTIC("Coal plastic"),
    LEATHER("Leather"),
    COW_SKIN("Cow skin"),
    GOAT_SKIN("Goat skin"),
    VEAL_SKIN("Veal skin"),
    POLYPROPYLENE("Polypropylene");

    String type;

    Materials(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
