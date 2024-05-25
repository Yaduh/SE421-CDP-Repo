import java.util.Random;

import com.google.inject.AbstractModule;
import com.google.inject.Key;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class TextEditorModule extends AbstractModule {

        @Override
        protected void configure(){
            bind(SpellChecker.class)
            .to(WindowsSpellChecker.class) 
            .in(Singleton.class);
        }

        @Provides
        static Key generateKey(){
            Random r = new Random();
            return new Key("Win" + r.nextInt());
        }
        
        @Singleton
        @Provides
        static SpellChecker provideSpellChecker(){
            if(getOSName().equals("Win")){
                return new WindowsSpellChecker();
            }else if(getOSName().equals("MacOS")){
                return new MacOsSpellChcker();
            }
        }
    }

