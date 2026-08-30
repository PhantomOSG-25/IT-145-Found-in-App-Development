public final class Demo {
    private Demo() { }

    public static void main(String[] args) {
        System.out.printf("Wall area: %.1f square feet%n", PaintCalculator.wallArea(8, 12));
        System.out.printf("Paint needed: %.2f gallons%n", PaintCalculator.gallonsNeeded(8, 12));
        System.out.printf("Cans needed: %d%n", PaintCalculator.cansNeeded(8, 12));

        Dog dog = new Dog("Buddy", 4, 42.5f, true);
        System.out.printf("%s occupies space %d; grooming=%s%n",
                dog.getName(), dog.getSpaceNumber(), dog.isGrooming());
    }
}
