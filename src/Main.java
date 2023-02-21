public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu",100,10);
        Pokemon charmander = new Pokemon("Charmander",90,90);

        printBattle(pikachu,charmander);
        getDamage(pikachu, 10);
        getDamage(charmander, 20);
        printBattle(pikachu,charmander);


    }

    public static void printBattle( Pokemon pkmn1, Pokemon pkmn2){
        System.out.println( "................." );
        System.out.println( pkmn1.toString() );
        System.out.println( "====== V/S ======" );
        System.out.println( pkmn2.toString() );
    }

    public static void getDamage( Pokemon pkmn, Integer dmg){
        pkmn.hp_actual -= dmg;
    }

}