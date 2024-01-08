package lab6;
//Task1
public class Task1TextData {
    private char charValue;
    private String textValue;

    public void setValue(char value) {
        charValue = value;
    }

    public void setValue(String value) {
        textValue = value;
    }

    public void setValue(char[] value) {
        if (value.length == 1) {
            charValue = value[0];
        } else {
            textValue = new String(value);
        }
    }

    public void displayValues() {
        System.out.println("Char Value: " + charValue);
        System.out.println("Text Value: " + textValue);
    }

    public static void main(String[] args) {
        Task1TextData data = new Task1TextData();
        data.setValue('A');
        data.displayValues();

        data.setValue("Hello");
        data.displayValues();

        char[] charArray = {'J', 'a', 'v', 'a'};
        data.setValue(charArray);
        data.displayValues();
    }
}
