import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Q4Filehandling {
        public static void main(String[] args) {
            String fileName = "D://prime.txt";

            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                String line = reader.readLine();

                while (line != null) {
                    line = line.trim();

                    try {
                        int number = Integer.parseInt(line);

                        if (isPrime(number)) {
                            System.out.println(number);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping non-integer value: " + line);
                    }

                    line = reader.readLine();
                }

                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        }

        private static boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }

            for (int i = 2; i <= Math_Library.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


