package src.model;

import java.util.ArrayList;
import java.util.Date;

public class Result implements Identifiable {
    private String id;
    private String studentGroup;
    private Date date;
    private ArrayList<Assignment> assignments;

    public Result(String id, String studentGroup, Date date) {
        this.id = id;
        this.studentGroup = studentGroup;
        this.date = date;
    }

    @Override
    public String generateID() {
        return null;
    }
}
