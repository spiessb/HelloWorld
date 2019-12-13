package CheckFolder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Check all .csv files in MDBPrecon if all start with '"INSERT'.
 */
public class CheckCsv {

    static boolean allCorrect = true;

    public static void main(String[] args) {
        try (Stream<Path> walk = Files.walk(Paths.get("C:\\Users\\beat.spiess\\testumgebung\\tide-testablauf\\automaten\\QS_AUTOMAT_HEL\\testdaten\\mdb\\MDBPrecon"))) {

            List<String> result = walk.map(x -> x.toString())
                    .filter(f -> f.endsWith(".csv")).collect(Collectors.toList());

            result.forEach(CheckCsv::checkFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (allCorrect) {
            System.out.println( "You're fine.");
        } else {
            System.err.println("Check files with errors!");
        }

    }

    /**
     * Prints fileName if at least one line in file is not correct.
     * @param fileName
     */
    public static void checkFile(String fileName) {
        String line;

        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                if (! line.startsWith("\"INSERT")) {
                    allCorrect = false;
                    System.out.println("Error in " + fileName);
                    break;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
