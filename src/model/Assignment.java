package src.model;

public abstract class Assignment implements Identifiable {
    private String id;
    private String name;
    private boolean visible;
    private Phase phase;

    public Assignment(String id, String name, boolean visible, Phase phase) {
        this.id = id;
        this.name = name;
        this.visible = visible;
        this.phase = phase;
    }

}
