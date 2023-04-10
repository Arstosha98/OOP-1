public class HufflepuffStudent extends HogwartsStudent{
    private final int hardworking;
    private final int loyalty;
    private final int honesty;

    public HufflepuffStudent(String name, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }
    @Override
    public String toString(){
        return super.toString() + ", hardworking: " + hardworking + ", loyalty: " + loyalty + " , honesty: " + honesty;
    }
    // Сумма по св-вам конкретного факультета
    private int getInnerTotalPower (){
        return hardworking + loyalty + honesty;
    }
    // Сравнение по св-вам конкретного факультета
    public void innerCompareTo(HufflepuffStudent other){
        if (other.getInnerTotalPower() > this.getInnerTotalPower()){
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else if (other.getInnerTotalPower() < this.getInnerTotalPower()){
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println("Пуффендуйцы " + other.getName() + " и " + this.getName() + " одинаково сильны");
        }
    }
}
