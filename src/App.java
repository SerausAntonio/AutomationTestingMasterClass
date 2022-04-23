import jdk.swing.interop.SwingInterOpUtils;

public class App {

    public static void main(String[] args) {
        String str = "String123";
        int integerNumber= 123;
        Integer integerNumberRef = 123;
        double doubleNumber = 2.45;
        short shortNumber= 32767;
        Short shortNumberref = 32767;
        long longNumber = 37139231;
        Long longNumberRef = Long.valueOf(37139231);
        float floatNumber = 52.3f;
        Float floatNumerRef = 52.3f;
        char character = 'a';
        Character characterRef = 'a';
        boolean booleanValue = true;
        Boolean booleanValueRef = false;
        System.out.println(Boolean.getBoolean(String.valueOf(booleanValue)));
        byte myByte = 120;
        Byte myByteRef = 120;
        System.out.println("Hello world");

        System.out.println(ObjectOrientedLanguages.JAVA);

        for (ObjectOrientedLanguages oop : ObjectOrientedLanguages.values()){
            System.out.println(oop);
        }
    }
}
