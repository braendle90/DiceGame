package com.company;

import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

                int endSumUser = 0;
                int endSumComputer = 0;


                boolean runProgram = false;


                Scanner scanner = new Scanner(System.in);




                while (true) {

                    System.out.println("1. \t Starten");
                    System.out.println("2.\t Beenden");


                    int inputScannertoRun = scanner.nextInt();

                    switch (inputScannertoRun) {

                        case 1:
                            //System.out.println("Random: "+RandomMethod());

                            for (int i = 0; i < 6; i++) {



                                endSumUser = endSumUser+ RandomMethod();

                                endSumComputer = endSumComputer+ RandomMethod();

                            }
                            System.out.println("Der Benutze hat "+endSumUser+" Augen gewürfelt");
                            System.out.println("Der Computer hat "+endSumComputer+" Augen gewürfelt");


                            if (endSumUser > endSumComputer) {

                                System.out.println("Benutzer hat gewonnen.");

                            }
                            else if (endSumUser < endSumComputer) {

                                System.out.println("Der Computer hat gewonnen");

                            }
                            else if (endSumUser == endSumComputer){

                                System.out.println("Beide haben unentschieden gespielt");
                            }

                            endSumUser = 0;
                            endSumComputer =0;


                            break;
                        case 2:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("idiot");


                    }


                }




            }



            private static int RandomMethod(){

                Random random = new Random();

                int newRandom = random.nextInt(6-0)+1;

                return newRandom;
            }

        }
