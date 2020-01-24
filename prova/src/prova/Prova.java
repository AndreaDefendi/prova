/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Prova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
// pre-read in the number of rows/columns

        int r;
        int c;
        boolean appoggio;
        FileReader MyFile = new FileReader("C:\\Users\\defendi.andrea\\Desktop\\matrix.txt");
        char[][] cr = new char[3][3];

        for (r = 0; r < 3; r++) {
            for (c = 0; c < 3; c++) {

                if (cr[r][c] >= 48 && cr[r][c] <= 57) {
                    cr[r][c] = (char) MyFile.read();
                }

            }
        }

        for (r = 0; r < 3; r++) {
            for (c = 1; c < 3; c++) {

                if (cr[r][c] >= 48 && cr[r][c] <= 57) {
                    System.out.print(cr[r][c]);
                } else if (c == 0 && c == 1) {
                    System.out.print("\t");
                } else if (c == 2) {
                    System.out.println("");
                }
            }
        }

    }

}
