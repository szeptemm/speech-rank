import com.typesafe.config.ConfigFactory;
import org.junit.Test;

import com.github.peggybrown.speechrank.gateway.Importer;

import java.io.File;

public class ImporterTest {

    String apiKey = ConfigFactory.parseFile(new File("api.conf"))
        .getString("youtube.apiKey");

    @Test
    public void testImport() {
        new Importer(apiKey).importBoilingFrogs2019().forEach(System.out::println);
    }

}
