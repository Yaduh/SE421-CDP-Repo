package dependencyInjection;

public class Main {
    public static void main(String...args){
     TextEditor t1 = new TextEditor(new WindowsSpellChecker());
     t1.render();
    }
    
}
