public class Main {
    public static void main(String[] args) {
        GryffindorStudent potter = new GryffindorStudent("Гарри Поттер", 80,80,90,70,80);
        GryffindorStudent granger = new GryffindorStudent("Гермиона Грейнджер",90,70,80,90,70);
        GryffindorStudent weasley = new GryffindorStudent("Рон Уизли", 50,60,70,40,20);
        HufflepuffStudent smith = new HufflepuffStudent("Захария Смит",30,20,70,60,80);
        HufflepuffStudent diggory = new HufflepuffStudent("Седрик Диггори",40,30,60,70,80);
        HufflepuffStudent finchFletchley = new HufflepuffStudent("Джастин Финч-Флетчли",30,50,50,60,40);
        SlytherinStudent malfoy = new SlytherinStudent("Драко Малфой",60,70,80,40,60,50,80);
        SlytherinStudent montague = new SlytherinStudent("Грэхэм Монтегю",40,30,50,60,50,70,60);
        SlytherinStudent goyle = new SlytherinStudent("Грегори Гойл",30,20,60,70,60,50,70);
        RavenclawStudent chang = new RavenclawStudent("Чжоу Чанг",60,40,70,70,60,80);
        RavenclawStudent patil = new RavenclawStudent("Падма Патил",40,50,60,70,80,70);
        RavenclawStudent belby = new RavenclawStudent("Маркус Белби",50,30,40,60,70,60);

        weasley.innerCompareTo(granger);
        smith.innerCompareTo(diggory);
        chang.innerCompareTo(patil);
        montague.innerCompareTo(goyle);
        System.out.println();
        finchFletchley.comparedTo(belby);
        potter.comparedTo(malfoy);
        System.out.println();
        System.out.println(potter);
        System.out.println(malfoy);
    }
}