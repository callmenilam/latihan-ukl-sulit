import java.util.Scanner;

public class uklsulit1 {
   
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa");
        int jumlahSiswa = input.nextInt();
        double[] nilai = new double[jumlahSiswa];
        double total = 0;

        //Memasukkan nilai setiap siswa
        for(int i = 0 ; i < jumlahSiswa;i++){
            System.out.println ("Masukkan nilai siswa ke-"+ (i +1)+ ":");
            nilai[i]= input.nextDouble();
            total += nilai[i]; // Menambahkan ke total
        }

        // Menghitung rata-rata
            double rataRata = total / jumlahSiswa;
            System.out.println("Rata-rata nilai seluruh siswa"+ rataRata);

            input.close();
       }
        
    }

