package org.example.task12;

public class CompositeGraphic extends Graphic {
    private Graphic[] children;
    private int count = 0;

    public CompositeGraphic(int maxChildren) {
        this.children = new Graphic[maxChildren];
    }

    @Override
    public void draw() {
        for (int i = 0; i < count; i++) {
            children[i].draw();
        }
    }

    @Override
    public void add(Graphic graphic) {
        if (count < children.length) {
            children[count++] = graphic;
        } else {
            System.out.println("Невозможно добавить больше объектов");
        }
    }

    @Override
    public void remove(Graphic graphic) {
        for (int i = 0; i < count; i++) {
            if (children[i] == graphic) {
                for (int j = i; j < count - 1; j++) {
                    children[j] = children[j + 1];
                }
                children[--count] = null;
                break;
            }
        }
    }

    @Override
    public Graphic[] getChildren() {
        return children;
    }
}