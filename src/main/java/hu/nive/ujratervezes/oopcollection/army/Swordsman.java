package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean blockFirst;

    public Swordsman(boolean armor) {
        super(100, 10, armor);
    }

    @Override
    public void sufferDamage(int damage) {
        if (this.blockFirst) {
            super.sufferDamage(damage);
        } else {
            this.blockFirst = true;
        }
    }
}