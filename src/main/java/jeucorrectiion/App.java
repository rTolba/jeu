package jeucorrectiion;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        // Créez un objet Random pour générer des nombres aléatoires.
        Random random = new Random();

        int position = 1; // Commencez à la case 1.
        int lancers = 0; // Nombre de lancers de dé effectués.

        while (lancers < 5 && position < 20) {
            // Générez un nombre aléatoire entre 1 et 6
            int de = random.nextInt(6) + 1;

            // Avancez d'un nombre de cases égal au résultat du dé.
            position += de;
            lancers++;

            System.out.println("Lancer " + lancers + ": Vous avez fait un " + de + ". Vous êtes maintenant sur la case "
                    + position);

            // Si vous êtes déjà à la case 20 ou au-delà, vous avez gagné.
            if (position == 20) {
                System.out.println("Félicitations, vous avez gagné !");
                break;
            }
        }

        if (position != 20) {
            System.out.println("Désolé, vous avez perdu. Vous n'avez pas atteint la case 20 en 5 lancers de dé.");
        }
    }
}
