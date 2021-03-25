/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author LENOVO
 */
public class Tugas2no2 {
    public static void main(String[] Args) {
        int[][] H = {
            {8,14},
            {25,2},
            {20,40}
        };
        
        int[][] A = {
            {4,4},
            {5,1},
            {10,20}
        };
        
        if((H.length == A.length) && (H[0].length == A[0].length)){
            int[][] R = new int[H.length][H[0].length];
            for(int I=0; I<A.length; I++){
                for(int S=0; S<H[0].length; S++){
                    R[I][S] = H[I][S] - A[I][S];
                }
            }
            for(int[] r: R){
                for(int q: r){
                    System.out.print(q+" ");
                }
                System.out.println();
            }
            System.out.println(R[2][1]);
            
        }
        else {
            System.out.println("Ukuran berbeda");
        }
}
    
}
