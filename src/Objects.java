public class Objects {

    public static void main(String[] args) {
        Computer cp1 = new Computer();

        cp1.setCPU("AMIDON");
        cp1.setMonsterboard("Hardcore");
        cp1.setHarddisk("2.9 Terrabyte");

        System.out.println(cp1.getCPU());
        System.out.println(cp1.getHarddisk());
        System.out.println(cp1.getMonsterboard());
    }

}
