package dependencyInjection;

public class TextEditor {
    private String content;

    public void render(){
        if(getOSName().equals("Win")){
           // 30 API only runs under Windows
        }else if(getOSName().equals("Linux")){
            // 15 API that provides Linux
    }esle if(getOSName().equals("MacOS")){
            // 50 API MacOS
    }
    // Implementation
}
}