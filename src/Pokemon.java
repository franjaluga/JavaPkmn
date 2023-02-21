public class Pokemon implements Atributos {

    String name;
    int hp_actual;
    int hp_max;
    int pp_actual;
    int pp_max;

    boolean isAlive;

    public Pokemon( String name, int hp_max, int pp_max) {
        this.name = name;
        this.hp_actual = hp_max;
        this.hp_max = hp_max;
        this.pp_actual = pp_max;
        this.pp_max = pp_max;
        this.isAlive = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp_actual() {
        return hp_actual;
    }

    public void setHp_actual(int hp_actual) {
        this.hp_actual = hp_actual;
    }

    public int getHp_max() {
        return hp_max;
    }

    public void setHp_max(int hp_max) {
        this.hp_max = hp_max;
    }

    public int getPp_actual() {
        return pp_actual;
    }

    public void setPp_actual(int pp_actual) {
        this.pp_actual = pp_actual;
    }

    public int getPp_max() {
        return pp_max;
    }

    public void setPp_max(int pp_max) {
        this.pp_max = pp_max;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", HP =" + hp_actual +
                "/" + hp_max +
                ", PP =" + pp_actual +
                "/" + pp_max +
                ", isAlive=" + isAlive +
                '}';
    }

    @Override
    public <I extends Integer> void getDamage(I i) {
        this.hp_actual = this.hp_actual - i.intValue();
        if(this.hp_actual <= 0 ){
            this.isAlive = false;
        }else{
            this.isAlive = true;
        }
    }
}
