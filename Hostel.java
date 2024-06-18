public class Hostel {
    float length;
    float width;

    public static void main(String[] args) {
        Hostel amethist = new Hostel();
        Hostel ruby = new Hostel();
        Hostel garnet = new Hostel();
        Hostel sappire = new Hostel();

        ruby.length = 12.56f;
        garnet.width = 3.12f;

        System.out.println("The length of ruby is : " + ruby.length);
        System.out.println("The width of garnet is : " + garnet.width);
    }
}