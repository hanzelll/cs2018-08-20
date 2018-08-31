package by.it.akhmelev.lesson01;

public class Main {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            String hex = String.format("%8s", Integer.toHexString(i)).replace(" ", "0");
            String octal = String.format("%8s", Integer.toOctalString(i)).replace(" ", "0");
            System.out.printf("%8s %8s %8s %4d \n", hex, octal, binary, i);
        }
    }
}