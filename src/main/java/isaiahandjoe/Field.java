package isaiahandjoe;

import jared.Edible;

import java.util.Arrays;

public class Field extends Crop {
    CropRow[] cropRows;
    Crop crops;
    Crop[][] fieldRows;

    public Field(int numberOfRows, int numberOfColumns, CropRow... cropRows) {
        fieldRows = new Crop[numberOfRows][numberOfColumns];

        for (int x = 0; x < cropRows.length; x++) {
            System.out.println("ROW" + x + "\n");
            for (int i = 0; i < numberOfColumns; i++) {
                //fieldRows[x] = cropRows[x];//cropRows[x];
                //System.out.println(x + " " + i );
                fieldRows[x][i] = cropRows[x].getCropFromRow(i);
                System.out.println(fieldRows[x][i]);
            }
        }


    }
//    public CropRow[][] buildField(CropRow cropRow1, CropRow cropRow2, CropRow cropRow3){
//        cropRows = new CropRow[][]{
//                {cropRow1},
//                {cropRow2},
//                {cropRow3}
//        };
//    }


    @Override
    public String toString() {
        return "Field{" +
                "fieldRows=" + Arrays.deepToString(fieldRows) +
                '}';
    }

    @Override
    public Edible yields() {
        return null;
    }
}
