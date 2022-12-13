package NLayeredWithKodlama.io.core.logging;

import NLayeredWithKodlama.io.entities.Category;
import NLayeredWithKodlama.io.entities.Course;

public class FileLogger implements Logger{


    @Override
    public void log(String data) {
        System.out.println("Dosyaya loglandı: "+data);
    }
}
