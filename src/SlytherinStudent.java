public class SlytherinStudent extends HogwartsStudent {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int thirstForPower;

    public SlytherinStudent(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + ", cunning: " + cunning + ", determination: " + determination + ", ambition: " + ambition + ", resourcefulness: " + resourcefulness + ", thirstForPower: " + thirstForPower;
    }
    // Сумма по св-вам конкретного факультета
    private int getInnerTotalPower (){
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }
    // Сравнение по св-вам конкретного факультета
    public void innerCompareTo(SlytherinStudent other){
        if (other.getInnerTotalPower() > this.getInnerTotalPower()){
            System.out.println(other.getName() + " лучший Слизеринец, чем " + this.getName());
        } else if (other.getInnerTotalPower() < this.getInnerTotalPower()){
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println("Слизеринцы " + other.getName() + " и " + this.getName() + " одинаково сильны");
        }
    }
}
