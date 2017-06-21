package com.solutions.guidedrecovery.ecapp;

/**
 * Created by Daan on 20-6-2017.
 */

public class Vak {

    String name;
    int EC;
    int image;
    boolean box;


    Vak(String _describe, int _ec, int _image, boolean _box) {
        name = _describe;
        EC = _ec;
        image = _image;
        box = _box;
    }
}