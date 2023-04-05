package decorator;

public class UpperCaseStringDecorator implements StringSource{

    StringSource stringSource;

    public UpperCaseStringDecorator(StringSource stringSource) {
        this.stringSource = stringSource;
    }

    @Override
    public String next() {
        return stringSource.next().toUpperCase();
    }
}
