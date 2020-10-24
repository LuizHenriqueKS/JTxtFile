package br.zul.jtxtfile.main;

import br.zul.jtxtfile.JTxtFileFastReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author luizh
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        final File file = new File("Arquivo.txt");
        String content = new JTxtFileFastReader(file).setCharset(StandardCharsets.UTF_8).readAll();
        System.out.println(content);
    }
    
}
