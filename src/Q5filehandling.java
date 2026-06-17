import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
public class Q5filehandling {

        public static void main(String[] args) {
            String fileName1 = "D://similar1.txt"; // Replace with your first file name
            String fileName2 = "D://similar2.txt"; // Replace with your second file name

            HashSet<String> set1 = readFileIntoSet(fileName1);
            HashSet<String> set2 = readFileIntoSet(fileName2);

            System.out.println("Strings that are the same in both files:");

            for (String str : set1) {
                if (set2.contains(str)) {
                    System.out.println(str);
                }
            }
        }

        private static HashSet<String> readFileIntoSet(String fileName) {
            HashSet<String> set = new HashSet<>();

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line = reader.readLine();

                while (line != null) {
                    line = line.trim();

                    if (!line.isEmpty()) {
                        set.add(line);
                    }

                    line = reader.readLine();
                }

                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file " + fileName + ": " + e.getMessage());
            }

            return set;
        }
    }


