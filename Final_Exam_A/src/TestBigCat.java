public class TestBigCat {
    public static void main(String[] args)
    {
        Tiger tiger = new Tiger("orange", "striped", 60, "jungle");
        Panther panther = new Panther("black", "spotted", 50, "forest");

        System.out.println("Tiger: " + tiger.toString());
        System.out.println("Panther: " + panther.toString());
    }
}