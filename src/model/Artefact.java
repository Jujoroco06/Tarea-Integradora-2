package src.model;

public class Artefact extends Assignment {
    private ArtefactType type;

    public Artefact(String id, String name, boolean visible, Phase phase, ArtefactType type) {
        super(id, name, visible, phase);
        this.type = type;
    }

    /**
     * @return
     */
    @Override
    public String generateID() {
        return "";
    }
}
