package journee5_15_decembre_2023.jeu_video_v2;

import java.util.Random;
import java.util.List;

public class DelegueDeClasse {
    public static void main(String[] args) {
        List<String> etudiants = List.of(
                "MOUSSALLI Jérôme", "PEREZ Virginie", "BOURQUE Lucia", "MBOUP Dame",
                "ECH CHARRAT Ayoub", "AZÉ Alix", "DUFFAU Yonis", "OH Sukjin",
                "ANNE Rudy", "BARZANA Andgel", "GHEZALI RAMDANI Wahiba", "Nicolas GUERIN",
                "BAEVA Boryana", "BERTAUDEAU Stéphanie", "LARREMENDY Eric"
        );

        Random random = new Random();
        int index = random.nextInt(etudiants.size());
        System.out.println("Le délégué de classe élu est : " + etudiants.get(index));
    }
}
