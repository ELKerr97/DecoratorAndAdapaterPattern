package decorator;

import java.util.Random;

public class PhoneNumberStringSource implements StringSource{
    @Override
    public String next() {
        return "8016086490";
    }
}
