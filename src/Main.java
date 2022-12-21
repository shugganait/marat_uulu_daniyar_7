public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();
        Hero[] heroes = {magic, medic, warrior};
        for(int i = 0; i < 3; i++) {
            heroes[i].applySuperAbility();
            medic.increaseExperience();
            System.out.println("К единице лечения Медика прибавлено 10%, вывод: " + (int) medic.getHealPoints());
        }
    }
}