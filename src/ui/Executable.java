package src.ui;

import src.model.Controller;

import java.util.Scanner;

public class Executable {
    private Scanner reader;
    private Controller controller;
    public Executable() {
        this.reader = new Scanner(System.in);
        this.controller = new Controller();
    }
}
