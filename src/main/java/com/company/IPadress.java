package com.company;

import java.util.Scanner;

public class IPadress {

    public static Scanner scanner = new Scanner(System.in);

    public static String getIPOfNetwork(String IP, String mask) {

        String ipOfNetwork = "";

        String[] IPArr = IP.split("\\.");
        Integer[] IPArrInt = new Integer[IPArr.length];
        String[] maskArr = mask.split("\\.");
        Integer[] maskArrInt = new Integer[maskArr.length];
        Integer[] outArr = new Integer[maskArrInt.length];

        for (int i = 0; i < IPArr.length; i++) {
            IPArrInt[i] = Integer.parseInt(IPArr[i]);
            maskArrInt[i] = Integer.parseInt(maskArr[i]);
            outArr[i] = IPArrInt[i] & maskArrInt[i];
        }

        for (Integer k : outArr)
            ipOfNetwork += k  + ".";

        ipOfNetwork = ipOfNetwork.substring(0, ipOfNetwork.length()-1);

        return ipOfNetwork;
    }

    public static String getBroadcast(String IPNet, String mask) {

        String broadcast = "";
        String[] IPNetArr = IPNet.split("\\.");
        Integer[] IPNetArrInt = new Integer[IPNetArr.length];
        String[] maskArr = mask.split("\\.");
        Integer[] maskArrInt = new Integer[maskArr.length];
        Integer[] outArr = new Integer[maskArrInt.length];

        for (int i = 0; i < maskArr.length; i++) {
            IPNetArrInt[i] = Integer.parseInt(IPNetArr[i]);
            maskArrInt[i] = Integer.parseInt(maskArr[i]) ^ 255;
            outArr[i] = maskArrInt[i] + IPNetArrInt[i];
            broadcast += outArr[i]  + ".";
        }

        broadcast = broadcast.substring(0,broadcast.length()-1);
        return broadcast;
    }


    public static void main(String[] args) {

        System.out.println("podaj adres IP");
        String ip = scanner.nextLine();

        System.out.println("podaj adres maski");
        String mask = scanner.nextLine();

        System.out.println("Adres sieci to: ");
        System.out.println(getIPOfNetwork(ip, mask));

        System.out.println("Adres rozgloszeniowy to: ");

        System.out.println(getBroadcast(getIPOfNetwork(ip, mask), mask));


    }
}
