package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean armor;

    public MilitaryUnit(int hitPoints, int damage, boolean armor) {
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.armor = armor;
    }

    public int doDamage() {
        return this.damage;
    }

    public void sufferDamage(int damage) {
        if (this.armor) {
            this.hitPoints -= damage / 2;
        } else {
            this.hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return this.hitPoints;
    }
}