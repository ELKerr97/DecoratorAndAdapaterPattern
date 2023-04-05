package decorator;

public class DeleteThreeCharsDecorator implements StringSource{

    StringSource stringSource;

    public DeleteThreeCharsDecorator(StringSource stringSource) {
        this.stringSource = stringSource;
    }

    @Override
    public String next() {
        StringBuilder stringBuilder = new StringBuilder(stringSource.next());
        stringBuilder.delete(0, 3);
        return stringBuilder.toString();
    }
}
