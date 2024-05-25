import com.google.inject.Inject;
import com.google.inject.Key;

public class TextEditor {
    private String content;
    private SpellChecker spellService;

    @Inject
    public TextEditor(SpellChecker checker, Key k){
        this.spellService = checker;
    }
    public void render(){
        
        String [] typos = this.spellService.check(this.content);


    }
    // Implementation
}
