package geco;

import java.util.Random;

/***
 * Classe permettant la génération aléatoire d'un mot de passe.
 */
public class PasswordGeneration {

    public PasswordGeneration(){

    }

    /***
     * Génère un mot de passe aléatoire.
     * @return mot de passe
     */
    public String getRandomPassword(){
        String possibilité = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz,;!?0123456789éèç";
        String password = "";
        for (int i = 0; i < 8; i++){
            Random rand = new Random();
            int nombreAleatoire = rand.nextInt(possibilité.length());
            password += possibilité.charAt(nombreAleatoire);
        }
        return password;
    }

}
