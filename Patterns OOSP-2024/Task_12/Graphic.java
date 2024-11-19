package org.example.task12;

public abstract class Graphic {
    public abstract void draw();

    public void add(Graphic graphic) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    public void remove(Graphic graphic) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    public Graphic[] getChildren() {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }
}