package decorator;

public class IngSuffix extends WordDecorator {
    public IngSuffix(Word word) {
        super(word);
    }

    @Override
    public String display() {
        return word.display() + "ing";
    }
}
