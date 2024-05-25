import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String...args){
     Injector g = Guice.createInjector(new TextEditorModule());
     TextEditor t1 = g.getInstance(TextEditor.class);
    }
    
}
