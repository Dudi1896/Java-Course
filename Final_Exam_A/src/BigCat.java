public class BigCat {

    private String color;
    private String coatPattern;
    private int topSpeed;
    private String habitat;

    public BigCat(String newColor, String coat, int speed, String newHabitat) {
        this.color = newColor;
        this.coatPattern = coat;
        this.topSpeed = speed;
        this.habitat = newHabitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCoatPattern() {
        return coatPattern;
    }

    public void setCoatPattern(String coatPattern) {
        this.coatPattern = coatPattern;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String toString() {
        return "This is a " + color + " " + coatPattern + " Big Cat that can run at a top speed of " + topSpeed + " mph.";
    }



}
