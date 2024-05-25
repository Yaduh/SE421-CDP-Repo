package dependencyInjection;

public class TextEditor {
    private String content;
    private SpellChecker spellService;
    public TextEditor(SpellChecker checker){
        this.spellService = checker;
    }
    public void render(){
        
        String [] typos = this.spellService.check(this.content);


    }
    // Implementation
}
