package repeticions;

import java.util.HashSet;
import java.util.ArrayList;

public class DetectorCaracters {
    public static char cercarPrimerNoRepetit(String frase) {
        HashSet<Character> vistos = new HashSet<>();
        ArrayList<Character> candidats = new ArrayList<>();
        for (Character ch : frase.toCharArray()) {
            if (!vistos.contains(ch)) {
                vistos.add(ch);
                candidats.add(ch);
            } else {
                candidats.remove(ch);
            }
        }
        return candidats.get(0);
    }

    public static char cercarPrimerRepetit(String frase) {
        HashSet<Character> vistos = new HashSet<>();
        int index = 0;
        boolean trobat = false;
        Character primer = null;
        while (!trobat) {
            char actual = frase.charAt(index);
            if (vistos.contains(actual)) {
                trobat = true;
                primer = actual;
            } else {
                index++;
                vistos.add(actual);
            }
        }
        return primer;
    }
}
