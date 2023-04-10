public class GryffindorStudent extends HogwartsStudent {
    private final int nobility;
    private final int honor;
    private final int bravery;

    public GryffindorStudent(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }
    @Override
    public String toString(){
        return super.toString() + ", nobility: " + nobility + ", honor: " + honor + ", bravery: " + bravery;
    }

    // Сумма по св-вам конкретного факультета
    private int getInnerTotalPower (){
        return nobility + honor + bravery;
    }

    // Сравнение по св-вам конкретного факультета
    public void innerCompareTo(GryffindorStudent other){
        if (other.getInnerTotalPower() > this.getInnerTotalPower()){
            System.out.println(other.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else if (other.getInnerTotalPower() < this.getInnerTotalPower()){
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " + other.getName());
        } else {
            System.out.println("Гриффиндорцы " + other.getName() + " и " + this.getName() + " одинаково сильны");
        }
    }
}
