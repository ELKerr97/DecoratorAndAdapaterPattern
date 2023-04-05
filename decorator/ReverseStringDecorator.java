package decorator;

public class ReverseStringDecorator implements StringSource{

    StringSource stringSource;

    public ReverseStringDecorator(StringSource stringSource) {
        this.stringSource = stringSource;
    }

    @Override
    public String next() {
        StringBuilder stringBuilder = new StringBuilder(stringSource.next());
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
