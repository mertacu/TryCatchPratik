import java.util.Scanner;

public class TryCatchBlogu {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner input = new Scanner(System.in);
        System.out.println("Index numarasını giriniz : ");

        try {
            int indexNumb = input.nextInt();
            int result = arr[indexNumb];
            System.out.println("Girmiş olduğunuz dizinin " + indexNumb + ". indeksindeki eleman : " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata Mesajı : index dizi boyutunun dışındadır!");
        } catch (Exception e) {
            System.out.println("Hata Yakalandı : " + e.toString());
        }
    }
}
