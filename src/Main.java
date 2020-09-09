public class Main
{
    public static void main(String[] args)
    {
        Dog a[] = new Dog[2];

        a[0].setAge(2);
        a[0].setName("Шарик");

        a[1].setAge(12);
        a[1].setName("Кубик");

        a[2].setAge(7);
        a[2].setName("Тетраэдрик");

        System.out.println(a[0].toStringDog());
    }
}
