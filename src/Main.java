import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaterialManagement management = new MaterialManagement(10);
        //
        CrispyFlour flour1 = new CrispyFlour("F1", "TNT", LocalDate.of(1911, 2, 20), 100, 10);
        CrispyFlour flour2 = new CrispyFlour("F2", "C4", LocalDate.of(1923, 2, 20), 1200, 5);
        CrispyFlour flour3 = new CrispyFlour("F3", "Fuminat", LocalDate.of(1955, 2, 20), 300, 20);
        CrispyFlour flour4 = new CrispyFlour("F4", "HG", LocalDate.of(1974, 2, 20), 500, 15);
        CrispyFlour flour5 = new CrispyFlour("F5", "CH3", LocalDate.of(1968, 2, 20), 1000, 30);
        //
        Meat meat1 = new Meat("M1", "Thit phu nu", LocalDate.of(2024, 11, 13), 5000, 45);
        Meat meat2 = new Meat("M2", "Thit phu nu 2", LocalDate.of(2024, 11, 1), 6000, 50);
        Meat meat3 = new Meat("M3", "Thit phu nu 3", LocalDate.of(2024, 11, 3), 7000, 40);
        Meat meat4 = new Meat("M4", "Thit phu nu 4", LocalDate.of(2024, 11, 4), 8000, 52);
        Meat meat5 = new Meat("M5", "Thit phu nu 5", LocalDate.of(2024, 11, 10), 9000, 48);
        //
        management.addMaterial(flour1);
        management.addMaterial(flour2);
        management.addMaterial(flour3);
        management.addMaterial(flour4);
        management.addMaterial(flour5);
        management.addMaterial(meat1);
        management.addMaterial(meat2);
        management.addMaterial(meat3);
        management.addMaterial(meat4);
        management.addMaterial(meat5);
        //Tong tien cac vat lieu
        System.out.println("Tong tien vat lieu: " + management.calTotalPrice());
        //Chenh lech chiet khau
        System.out.println("Chenh lech chiet khau: " + management.calDiscountDifference());
        //Sap xep theo gia
        management.sortByCost();
        System.out.println("Sau khi sap xep: ");
        management.displayMaterial();
    }
}