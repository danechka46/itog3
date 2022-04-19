import java.util.Scanner;

public class itog3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int index = 0;
        System.out.print("Количество строк: ");
        int k = s.nextInt();
        String[] ar = new String[k];
        int[] arCount = new int[k];
        String q = s.nextLine();
        for(int i = 0;i<k;i++){
            System.out.print("Строка "+(i+1)+": ");
            String str = s.nextLine();
            ar[i]=str;
            arCount[i] = (int) str.chars().distinct().count();
        }
        for(int i = 0;i < k;i++){
            if (arCount[i] > arCount[index])
            {
                index = i;
            }
        }
        System.out.println("Ответ: "+ar[index]);
    }
}
