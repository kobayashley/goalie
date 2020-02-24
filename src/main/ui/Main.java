package main.ui;

import main.model.OKRList;

public class Main {

    public static void main(String[] args) {
        OKRList l = new OKRList();
        l.start();
        new GUI();

    }
}

