package src.model;

import java.util.ArrayList;

public class Professor {
    private String name;
    private String id;
    private String email;
    private IDType idType;
    private ArrayList<Course> courses;

    public Professor(String name, String id, String email, IDType idType) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.idType = idType;
        courses = new ArrayList<>();
    }


}
