public final class Dog extends Pet {
    private final float weight;
    private boolean grooming;

    public Dog(String name, int spaceNumber, float weight, boolean grooming) {
        super(name, spaceNumber);
        if (!Float.isFinite(weight) || weight <= 0) {
            throw new IllegalArgumentException("weight must be positive");
        }
        this.weight = weight;
        this.grooming = grooming;
    }

    public float getWeight() { return weight; }
    public boolean isGrooming() { return grooming; }
    public void setGrooming(boolean grooming) { this.grooming = grooming; }
}
