package Model;

import java.util.ArrayList;

public class Board {
    private int size;
    private ArrayList<Field> allFields = new ArrayList();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Board(int size) {
        this.size = size;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Field field = new Field(i,j,false);
                allFields.add(field);
            }
        }
    }

    public int countDestroyed()
    {

        int destroyedCount = 0;

        for (int i = 0; i < allFields.size(); i++) {

            if(allFields.get(i).isDestroyed())
                destroyedCount++;

        }

        return destroyedCount;
    }

}