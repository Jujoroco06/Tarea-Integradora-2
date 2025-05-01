package src.model;

public class Document extends Assignment {
    private String url;

    public Document(String id, String name, boolean visible, Phase phase, String url) {
        super(id, name, visible, phase);
        this.url = url;
    }

    /**
     * @return
     */
    @Override
    public String generateID() {
        return "";
    }
}
