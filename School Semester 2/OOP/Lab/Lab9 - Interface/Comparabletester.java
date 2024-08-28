public class ComparableTester {

    public ComparableTester() {
        Cow c1 = new Cow("Bell", 1500);
        Cow c2 = new Cow("Cinnamon", 1450);
        System.out.println("Cow with maximum weight = " + MaxValue.max(c1, c2));
        
        Person p1 = new Person("Betty Ben", 25);
        Person p2 = new Person("Cindy Ken", 30);
        System.out.println("Elder person = " + MaxValue.max(p1, p2));
    }

    public static void main(String[] args) {
        new ComparableTester();
    }
}
