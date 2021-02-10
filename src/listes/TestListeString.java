package listes;


import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestListeString {

    public static void main(String[] args) {

        ArrayList<String> villes = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        String max = Collections.max(villes, (String s1, String s2) -> s1.length() - s2.length());
        System.out.println("Index " + villes.indexOf(max) + " " + max + " " + "is the largest and is size " + max.length());

        // methode 1
        ListIterator<String> iterator = villes.listIterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            iterator.set(next.toUpperCase());
        }

        // methode 2
        List<String> collect = villes.stream().map(item -> item.toUpperCase(Locale.ROOT)).collect(Collectors.toList());


        List<String> listwithoutN = villes.stream().filter(s -> s.charAt(0) != 'N').collect(Collectors.toList());

        System.out.println(listwithoutN);


    }

}
