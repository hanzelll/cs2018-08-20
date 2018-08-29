package by.it.akhmelev.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printDec(a, b);
        printBin(a, b);
        printHex(a, b);
        printOct(a, b);
    }

    private static void printOct(int a, int b) {
        String ao = Integer.toOctalString(a);
        String bo = Integer.toOctalString(b);
        String so = Integer.toOctalString(a + b);
        System.out.println("OCT:" + ao + "+" + bo + "=" + so);
    }

    private static void printHex(int a, int b) {
        String ah = Integer.toHexString(a);
        String bh = Integer.toHexString(b);
        String sh = Integer.toHexString(a + b);
        System.out.println("HEX:" + ah + "+" + bh + "=" + sh);
    }

    private static void printBin(int a, int b) {
        String ab = Integer.toBinaryString(a);
        String bb = Integer.toBinaryString(b);
        String sb = Integer.toBinaryString(a + b);
        System.out.println("BIN:" + ab + "+" + bb + "=" + sb);
    }

    private static void printDec(int a, int b) {
        String ad = Integer.toString(a);
        String bd = Integer.toString(b);
        String sd = Integer.toString(a + b);
        System.out.println("DEC:" + ad + "+" + bd + "=" + sd);
    }
}
