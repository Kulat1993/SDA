package decorator;

public class UnPrefix extends WordDecorator {
    public UnPrefix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        return "un" + word.display();
    }
}
