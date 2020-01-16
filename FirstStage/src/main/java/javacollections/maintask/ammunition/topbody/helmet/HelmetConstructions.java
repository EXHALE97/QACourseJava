package javacollections.maintask.ammunition.topbody.helmet;

public enum HelmetConstructions {
    FULL_FACE("Full-face"),
    FLIP_UP("Transformer"),
    JET("Opened(3/4)"),
    OFF_ROAD("Off-road"),
    ENDURO("Enduro");

    String name;

    HelmetConstructions(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
