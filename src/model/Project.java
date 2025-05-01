package src.model;

import java.util.ArrayList;

public class Project implements Identifiable{
    private String name;
    private TypeOfProyect typeOfProyect;
    private String description;
    private String url;
    private String id;
    private String semester;
    private ArrayList<String> associatedBusiness;
    private ArrayList<String> keyWord;
    private Result[] results;


    public Project(String name, TypeOfProyect typeOfProyect, String description, String url, String semester, ArrayList<String> associatedBusiness, ArrayList<String> keyWord) {
        this.name = name;
        this.typeOfProyect = typeOfProyect;
        this.description = description;
        this.url = url;
        this.id = generateID();
        this.semester = semester;
        this.associatedBusiness = associatedBusiness;
        this.keyWord = keyWord;
        this.results = new Result[3];
    }
    public String generateID(){
        return "";
    }
}
