
import classes.AxeBehavior;
import classes.BowAndArrowBehavior;
import classes.King;
import classes.KnifeBehavior;
import classes.Knight;
import classes.Queen;
import classes.SwordBehavior;
import classes.Troll;

public class App {
    public static void main(String[] args) throws Exception {


        AxeBehavior axe = new AxeBehavior();
        BowAndArrowBehavior arco = new BowAndArrowBehavior();
        KnifeBehavior faca = new KnifeBehavior();
        SwordBehavior espada = new SwordBehavior();



        King rei = new King(axe);
        Queen rainha = new Queen(arco);
        Knight cavaleiro = new Knight(faca);
        Troll troll = new Troll(espada);

        rei.fight();
        rei.resWeapon();
        System.out.println();
        rainha.fight();
        rainha.resWeapon();
        System.out.println();
        cavaleiro.fight();
        cavaleiro.resWeapon();
        System.out.println();
        troll.fight();
        troll.resWeapon();
        System.out.println();
        rei.setWeapon(espada);
        rei.fight();
        rei.resWeapon();



    }
}
