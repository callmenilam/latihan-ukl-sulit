import java.util.Scanner;

public class uklsulit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah baris:");
        int baris = input.nextInt();
        System.out.println("Masukkan jumlah kolom");
        int kolom = input.nextInt();

        int[][] matriks1 = new int[baris][kolom];
        int[][] matriks2 = new int[baris][kolom];
        int[][] hasil =new int[baris][kolom];
        System.out.println("Masukkan elemen matriks pertama:");
        for(int i = 0; i< baris;i++){
            for(int j = 0; j< kolom;j++){
              System.out.println("Elemet["+i+"]["+j+"]:");
            matriks1[i][j] = input.nextInt();  
            }
        }
        System.out.println("Masukkan elemen  matriks kedua");
        for(int i = 0; i <baris;i++){
            for(int j = 0; j <kolom;j++){
                System.out.println("Elemen ["+i+"]["+j+"]:");
                matriks2[i][j] = input.nextInt();
            }
        }
        //penjumlahan matriks
        for(int i=0; i<baris;i++){
            for (int j=0; j<kolom;j++){
                hasil[i][j]=matriks1[i][j]+matriks2[i][j];
            }
        }
        System.out.println("Hasil penjumlahan matriks:");
        for(int i=0;i<baris;i++){
            for(int j=0; j<kolom;j++){
               System.out.println(hasil[i][j]+"\t");
            }
            System.out.println();
        }
            input.close();
    }
}
