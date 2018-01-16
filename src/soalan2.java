/*Anda dikehendaki membuat aturcara 
 *yang dapat mengesan maarkah yang dimasukkan
 *adalah sama bagi dua matapelajaran.
 *Contohnya mata pelajaran sains dan matematik
 *Gunakan struktur kawalan if untuk membuat ujian ke atas
 *input yang dimasukkan oleh pengguna.
 *Jika gred sama, paparkan output "Gred yang diperolehi tidak sama"
 *dan sebaliknya.
  .
 */ 

/**
 *
 * @author user
 */import java.util.Scanner;
public class soalan2 {
    public static void main(String[]    args) {
        Scanner input  = new Scanner(System.in);
        char sains;
        char math;
        
       System.out.println("Apakah gred bagi Math:[A/B/C/D/E/G]");
                sains=input.next().charAt(0);
       System.out.println("Apakah gred bagi sains:[A/B/C/D/G]");
                math=input.next().charAt(0);
                
       if (sains==math)
           System.out.println("Gred yang diperolehi sama");
       if(sains!=math)  // also CORRECT>
           System.out.println("Gred yang diperolehi tidak sama");
    }
}
