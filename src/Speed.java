public enum Speed {
    SLOW(30,"wolno"),
    NORMAL(90, "średnio"),
    FAST(120, "szybko");

    int speedValue;
    public final String translation;

    Speed(int speedValue, String translation) {
        this.speedValue = speedValue;
        this.translation = translation;
    }
}