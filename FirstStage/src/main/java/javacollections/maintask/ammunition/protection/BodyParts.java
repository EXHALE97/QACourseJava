package javacollections.maintask.ammunition.protection;

public enum BodyParts {
    KNEES("Knees"),
    HIPS("Hips"),
    TORSO("Torso"),
    ELBOWS("Elbows"),
    TAILBONE("Tailbone"),
    SHOULDERS("Shoulders"),
    BACK("Back");

    String name;

    BodyParts(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
