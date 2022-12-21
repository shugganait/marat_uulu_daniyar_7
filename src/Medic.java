public class Medic extends Hero{

    private double healPoints = 50.5;
    @Override
    public void applySuperAbility() {
        System.out.println("||Medic применил спосбность PLAGUE");
    }

    public double getHealPoints() {
        return healPoints;
    }

    public void increaseExperience(){
        double sum = 0.0;
        sum += healPoints * 10;
        healPoints += sum / 100;
    }
}
