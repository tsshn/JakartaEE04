package library;

public class ConditionalClass {

    private String output;

    ConditionalClass(String output) {
        this.output = output;
    }

    public void printInfo() {
        System.out.println("Sequence name: " + output);
    }
}