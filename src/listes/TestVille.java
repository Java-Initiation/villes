package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Consumer;

public class TestVille {

    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 478000));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Ville villePlusPeuplee = villes.stream().max(Comparator.comparingInt(Ville::getNbHabitants)).get();
        System.out.println("ville la plus peuplée : " + villePlusPeuplee);

        villes.remove(villes.stream().min(Comparator.comparingInt(Ville::getNbHabitants)).get());

        villes.forEach(ville -> {
            if (ville.getNbHabitants() > 100000)
                ville.setNom(ville.getNom().toUpperCase(Locale.ROOT));
        });

        for (Ville ville : villes)
            System.out.println(ville);

        villes.sort(new ComparatorHabitant());

        System.out.println("Tri effectué");
        for (Ville ville : villes)
            System.out.println(ville);

    }

}
