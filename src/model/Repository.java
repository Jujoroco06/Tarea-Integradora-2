package src.model;

public class Repository extends Assignment {
    private String url;
    private int amountOfDocuments;

    public Repository(String id, String name, boolean visible, Phase phase, String url, int amountOfDocuments) {
        super(id, name, visible, phase);
        this.url = url;
        this.amountOfDocuments = amountOfDocuments;
    }

    /**
     * @return
     */
    @Override
    public String generateID() {
        return "";
    }
}