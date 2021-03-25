package modul2;
public class Tugas2no1 {
      public static void main(String[] args) {
        int hewan[][]= new int[3][3];
        hewan[0] [0] =34;
        hewan[0] [1] =56;
        hewan[0] [2] =41;
        hewan[1] [0] =45;
        hewan[1] [1] =36;
        hewan[1] [2] =37;
        hewan[2] [0] =51;
        hewan[2] [1] =32;
        hewan[2] [2] =46;
        for (int i = 0; i < hewan.length; i++){
            for (int j = 0; j <hewan[0].length; j++){
                System.out.print(hewan[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(hewan[2][0]);
        System.out.println();
        System.out.println("haris");
      }
}
