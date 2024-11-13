import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class MaterialManagement {
    private Material[] materialList;
    private int listSize;

    public MaterialManagement(int capacity) {
        materialList = new Material[capacity];
        listSize = 0;
    }

    public void addMaterial(Material material) {
        if (listSize < materialList.length) {
            materialList[listSize++] = material;
        }
    }

    public void updateMaterial(int index, Material newMaterial) {
        if (index >= 0 && index < listSize) {
            materialList[index] = newMaterial;
        }
    }

    public void removeMaterial(int index) {
        if (index >= 0 && index < listSize) {
            for (int i = index; i < listSize - 1; i++) {
                materialList[i] = materialList[i + 1];
            }
            materialList[listSize - 1] = null;
            listSize--;
        }
    }

    //Tinh tong tien
    public double calTotalPrice() {
        double totalPrice = 0.0;
        for (int i = 0; i < listSize; i++) {
            totalPrice += materialList[i].getAmount();
        }
        return totalPrice;
    }

    //sap xep vat lieu theo gia
    public void sortByCost() {
        Arrays.sort(materialList, 0, listSize, Comparator.comparingInt(Material::getCost));
    }

    //Tinh chenh lech chiet khau va khong chiet khau
    public double calDiscountDifference() {
        double withDiscount = 0.0;
        double noDiscount = 0.0;
        for (int i = 0; i < listSize; i++) {
            if (materialList[i] instanceof Discount) {
                withDiscount += ((Discount) materialList[i]).getRealMoney();
            }
            noDiscount += materialList[i].getAmount();
        }
        return noDiscount - withDiscount;
    }

    //Display
    public void displayMaterial() {
        for (int i = 0; i < listSize; i++) {
            System.out.println(materialList[i].getName() + "-" + materialList[i].getAmount());
        }
    }
}
