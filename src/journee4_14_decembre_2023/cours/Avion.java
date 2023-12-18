package journee4_14_decembre_2023.cours;

public class Avion {
    private String fabricant;
    private String modele;
    private int nombreSieges;

    public Avion(String fabricant, String modele, int nombreSieges){
        this.setFabricant(fabricant);
        this.setModele(modele);
        this.setNombreSieges(nombreSieges);
    }

    public String getFabricant(){
        return fabricant;
    }

    public String getModele(){
        return modele;
    }

    public int getNombreSieges(){
        return nombreSieges;
    }


    public void setFabricant(String fabricant) throws IllegalArgumentException{
        if(fabricant.length()<3){
            throw new IllegalArgumentException("Le nom du fabricant doit avoir au moins 3 caractères.");
        }
        this.fabricant=fabricant;
    }

    public void setModele(String modele) throws IllegalArgumentException{
        if(modele.length()<5){
            throw new IllegalArgumentException("Le modèle doit avoir au moins 5 caractères");
        }
        this.modele=modele;
    }

    public void setNombreSieges(int nombreSieges)throws IllegalArgumentException{
        if(nombreSieges<100 || nombreSieges>500){
            throw new IllegalArgumentException("Est-ce que vous êtes sûr que c'est un avion?");
        }
        this.nombreSieges=nombreSieges;
    }
}
