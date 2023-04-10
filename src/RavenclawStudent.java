public class RavenclawStudent extends HogwartsStudent{
    private final int smart;
    private final int wise;
    private final int witty;
    private final int fullOfCreativity;

    public RavenclawStudent(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }
    @Override
    public String toString(){
        return super.toString() + ", smart: " + smart + ", wise: " + wise + ", witty: " + witty + ", fullOfCreativity: " + fullOfCreativity;
    }
    // Сумма по св-вам конкретного факультета
    private int getInnerTotalPower (){
        return smart + wise + witty + fullOfCreativity;
    }
    // Сравнение по св-вам конкретного факультета
    public void innerCompareTo(RavenclawStudent other){
        if (other.getInnerTotalPower() > this.getInnerTotalPower()){
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        } else if (other.getInnerTotalPower() < this.getInnerTotalPower()){
            System.out.println(this.getName() + " лучший Когтевранец, чем " + other.getName());
        } else {
            System.out.println("Когтевранцы " + other.getName() + " и " + this.getName() + " одинаково сильны");
        }
    }
}
