public class Exceptions extends Throwable {

    public static void main(String[] args) {

        Integer[] arr = {2, 3, 4};

        try {
            System.out.println(arr[4]);
        } catch (Exception ex){

            System.out.println("Exception has been raised");
          //  ex.printStackTrace();
        } finally {
            System.out.println("Setup Garbage collection");
        }
    }


}
