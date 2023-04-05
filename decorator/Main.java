package decorator;

public class Main {
    public static void main(String[] args) {
        ReverseStringDecorator reverseStringDecorator = new ReverseStringDecorator(new PhoneNumberStringSource());
        DeleteThreeCharsDecorator deleteThreeCharsDecorator = new DeleteThreeCharsDecorator(new NameStringSource());
        UpperCaseStringDecorator upperCaseStringDecorator = new UpperCaseStringDecorator(new NameStringSource());
        UpperCaseStringDecorator upperDelete = new UpperCaseStringDecorator(deleteThreeCharsDecorator);

        System.out.println(reverseStringDecorator.next());
        System.out.println(deleteThreeCharsDecorator.next());
        System.out.println(upperCaseStringDecorator.next());
        System.out.println(upperDelete.next());
    }
}
