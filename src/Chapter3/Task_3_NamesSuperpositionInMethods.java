package Chapter3;

class FloatField {
    float x;
}

public class Task_3_NamesSuperpositionInMethods {

    static void changeField(FloatField f) {
            f.x = 3.14f;
   }

   public static void main(String[] args) {
     FloatField floatField = new FloatField();
     floatField.x = 9.8f;
     System.out.println("before method's invoke - " + floatField.x);
    changeField(floatField);
    System.out.println("after method's invoke - " + floatField.x);
   }
}
