package hospital.elboyev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final int chiqish = 0;
        final int bemorqush = 1;
        final int bemorruyxati = 2;
        final int shifokorqush = 3;
        final int shifokorruyxati = 4;

        Scanner kirit = new Scanner(System.in);
        shifoxona kasalxona = new shifoxona();
        malumot haqida = new malumot();


        int amal = -1;

        while (amal!=chiqish){

            haqida.dasturHaqida();

            System.out.print("Amalni tanlang : ");

            amal = kirit.nextInt();
            kirit.nextLine();

            switch (amal) {
                case bemorqush -> {
                    bemor kasal = new bemor();
                    System.out.println("Bemor ismi: ");
                    kasal.setIsm(kirit.nextLine());
                    System.out.println("Bemor familyasi: ");
                    kasal.setFamilya(kirit.nextLine());
                    System.out.println("Bemor kalit raqami: ");
                    kasal.setId(kirit.nextInt());
                    kasalxona.addbemor(kasal);
                    System.out.println("\nBemor ro'yxatga olindi. ");
                }
                case bemorruyxati -> {
                    System.out.println("Ro'yxatga olingan bemorlar: \n");
                    kasalxona.printbemor();
                }
                case shifokorqush -> {
                    shifokor duxtir = new shifokor();
                    System.out.println("Shifokor ismi: ");
                    duxtir.setIsm(kirit.nextLine());
                    System.out.println("Shifokor familyasi: ");
                    duxtir.setFamilya(kirit.nextLine());
                    System.out.println("Shifokor kalit raqami: ");
                    duxtir.setId(kirit.nextInt());
                    kasalxona.addshifokor(duxtir);
                    System.out.println("\nShifokor qabul qilindi. ");
                }
                case shifokorruyxati -> {
                    System.out.println("Shifokorlar ruyxati: \n");
                    kasalxona.printshifokor();
                }
                case chiqish -> {
                    System.out.println("Dasturdan chiqildi..");
                    System.out.println("\n \n \n \n \nCreator: B_Elboyev");
                }

                default -> System.out.println("Ushbu amal mavjud emas!");
            }
        }
        kirit.close();
    }
}
