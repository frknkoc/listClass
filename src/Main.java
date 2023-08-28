public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new List<>();

        System.out.println("Dizi kapasitesi : " + liste.getCapacity());
        liste.add(12);
        liste.add(10);
        liste.add(13);
        liste.add(22);
        System.out.println("Eleman sayisi : " + liste.size());
        System.out.println(liste.toString());

        List<String> listt = new List<>();
        listt.add("u");
        listt.add("m");
        System.out.println(listt.toString());
    }
}