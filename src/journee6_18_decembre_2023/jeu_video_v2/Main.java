package journee6_18_decembre_2023.jeu_video_v2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ICombattre> mesPersonnages=new ArrayList<>();

//        journee5_15_decembre_2023.cours.Personnage p=new journee5_15_decembre_2023.cours.Personnage("Pepe",100); : Erreur, car la classe journee5_15_decembre_2023.cours.Personnage est abstraite.
        Guerrier chris=new Guerrier("Chris",200,500);
        Magicien yonis=new Magicien("Yonis",400,20000);
        Sorcier eric=new Sorcier("Eric",700,25000,10);
        Voleur wahiba=new Voleur("Wahiba",400,30000);

        Npc n=new Npc();

        mesPersonnages.add(chris);
        mesPersonnages.add(yonis);
        mesPersonnages.add(eric);
        mesPersonnages.add(wahiba);
        mesPersonnages.add(n);

        for(ICombattre p:mesPersonnages){
            p.attaquer();// Comportement Polymorphique
        }

//        System.out.println(Personnage.getNombrePersonnages());
//        System.out.println(Personnage.DUREE_DE_VIE_MAX);
//
//
//        System.out.println(yonis.getNom());
//        System.out.println(eric.getNiveauDeVie());
//        System.out.println(wahiba.getAgilite());
    }
}
