package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

    public static void main(String[] args) {

        ArrayList<Integer> entiers = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        System.out.println("Taille de la liste " + entiers.size());

        System.out.println("Le plus grand est " + Collections.max(entiers));
        entiers.remove(Collections.min(entiers));
        System.out.println(entiers);

        for (int i = 0; i < entiers.size(); i++) {
            if (entiers.get(i) < 0)
                entiers.set(i, Math.abs(entiers.get(i)));
        }

        System.out.println(entiers);


    }

}
