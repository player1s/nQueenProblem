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

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                Field field = new Field(i,j,false, false);
                allFields.add(field);
            }
        }
    }

    public Field getField(int posX, int posY)
    {
        for (int i = 0; i < allFields.size(); i++) {
            if(allFields.get(i).getPosX() == posX && allFields.get(i).getPosY() == posY)
                return allFields.get(i);
        }
        return null;
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

    public int countOccupied()
    {

        int occupiedCount = 0;

        for (int i = 0; i < allFields.size(); i++) {

            if(allFields.get(i).isOccupied())
                occupiedCount++;

        }

        return occupiedCount;
    }

    public void placeQueen(Field field)
    {
        Queen queen = new Queen(field);

        queen.getField().setOccupied(true);

        for (int i = 0; i < allFields.size(); i++) {
            if(allFields.get(i).getPosX() == field.getPosX() || allFields.get(i).getPosY() == field.getPosY()) {
                allFields.get(i).setDestroyed(true);
                //System.out.println("field on " + allFields.get(i).getPosX() + " " + allFields.get(i).getPosY() + " is destroyed");
            }
        }
    }

}
