public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("ok", 5, 7.6);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("gorshiplor", 8, 8.0);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
