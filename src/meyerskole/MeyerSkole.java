// meyer, løsningen fra skolen. 
package meyerskole;

import java.util.Scanner;

/**
 *
 * @author Kim Vammen
 */
public class MeyerSkole {

    public static void main(String[] args) {
        Cup cup = new Cup();
        Player pc = new Player();
        Scanner scan = new Scanner(System.in);
        int points = 0;


        while (points < 6 && pc.getPoint() < 6) {
            System.out.println("Ny runde");
            boolean lifted = false;
            int moveToBeat = 32;

            while (!lifted) {
                int pcStatement = pc.play(moveToBeat);
                if (pcStatement == 0) {
                    System.out.println("Løfter");
                    lifted = true;

                    if (moveToBeat > cup.getValue()) {
                        System.out.println("Du snød - PC vinder!");
                        pc.addPoint();
                    } else {
                        System.out.println("Doooh! - Du vinder");
                        points++;
                    }
                } else {
                    System.out.println("PC melder: " + cup.valueToString(pcStatement));
                }

                if (!lifted) {
                    System.out.println("Vil du løfte? j/n");
                    String answer = scan.nextLine();
                    if (answer.equals("j") || answer.equals("J")) {

                        if (pcStatement > pc.getValue()) {
                            System.out.println("PC snyder - du vinder");
                            points++;
                        } else {
                            System.out.println("Den var god nok - du vinder");
                            pc.addPoint();
                        }

                        lifted = true;
                    } else {
                        cup.shake();
                        System.out.println("Du slog " + cup.valueToString(cup.getValue()));
                        System.out.println("Hvad vil du melde? ");
                        int statement = Integer.parseInt(scan.nextLine());
                        moveToBeat = statement;
                    }
                }

            }
        }
    }
}
