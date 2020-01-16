package javacollections.maintask.ammunition;

public enum Brands {
    FOX("Fox"),
    LS("LS2"),
    OZONE("Ozone"),
    NOLAN("Nolan"),
    ONEAL("O'Neal"),
    PROANTI("Proanti"),
    REBELHORN("Rebelhorn"),
    RICHA("Richa"),
    SECA("Seca"),
    SHARK("Shark"),
    SASTEC("SAS-TEC"),
    XTR("XTR");

    String producer;

    Brands(String producer){
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
