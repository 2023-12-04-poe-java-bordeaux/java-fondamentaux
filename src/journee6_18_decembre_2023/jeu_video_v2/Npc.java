package journee6_18_decembre_2023.jeu_video_v2;

public class Npc implements ICombattre{
    @Override
    public void attaquer() {
        System.out.println("Npc attacks");
    }

    @Override
    public void seDefendre() {
        System.out.println("Npc defends");
    }
}
