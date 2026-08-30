public class Pet {
    private final String name;
    private final int spaceNumber;

    public Pet(String name, int spaceNumber) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is required");
        }
        if (spaceNumber < 0) {
            throw new IllegalArgumentException("space number cannot be negative");
        }
        this.name = name;
        this.spaceNumber = spaceNumber;
    }

    public String getName() { return name; }
    public int getSpaceNumber() { return spaceNumber; }
}
