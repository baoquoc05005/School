public enum SurfaceMaterial {
    TERRESTRIAL("Terrestrial"),
    GASEOUS("Gaseous"),
    ICY("Icy");

    private String description;

    SurfaceMaterial(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
