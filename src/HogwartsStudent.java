public abstract class HogwartsStudent {
    private final String name;
    private final int magicPower;
    private final int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return "name: " + name + ", magic power: " + magicPower + ", transgression: " + transgressionDistance;
    }
    // Сила магии и расстояние трансгресии у каждого ученика своё
    // и выражается в целочисленном эквиваленте
    // (Общее у всех факультетов)
    private int getTotalPower(){
        return magicPower + transgressionDistance;
    }
    // Сравнение по (Силе магии и расстоянии трансгресии)
    public void comparedTo(HogwartsStudent other){
        if (other.getTotalPower() > this.getTotalPower()){
            System.out.println(other.getName() + " сильнее, чем " + this.getName());
        } else if (other.getTotalPower() < this.getTotalPower()){
            System.out.println(this.getName() + " сильнее, чем " + other.getName());
        } else {
            System.out.println("Ученики " + other.getName() + " и "+ this.getName() + " равны по силе");
        }
    }
}
