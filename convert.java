import java.util.Scanner;
public class convert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,desimal;
        String a_bit,biner, heksa;
        boolean running = true;

        while(running){
        System.out.printf("%s\n", "Menu:");
        System.out.printf("%s\n", "0. Keluar");
        System.out.printf("%s\n", "1. Biner ke Desimal");
        System.out.printf("%s\n", "2. Desimal ke Biner");
        System.out.printf("%s\n", "3. Biner ke Hexa");
        System.out.printf("%s\n", "4. Hexa ke Biner");
        System.out.printf("%s\n", "5. Desimal ke Hexa");
        System.out.printf("%s\n", "6. Hexa ke Desimal");

        System.out.printf("%s", "Pilihan anda: ");
        int pilihan = input.nextInt();


        switch(pilihan){
        case 0:
        System.out.println("Terima kasih! Program selesai.");
        System.exit(0);
        case 1:
        input.nextLine();
        System.out.println("=======Biner > Desimal=======");
        System.out.print("Masukkan bilangan biner: ");
        biner = input.nextLine();
        desimal = Integer.parseInt(biner, 2);
        System.out.println("Hasil konversi ke desimal: " + desimal);
        break;

        case 2:
        input.nextLine();
        System.out.println("=======Desimal > Biner=======");
        System.out.print("Masukkan bilangan desimal: ");
        a = input.nextInt();
        a_bit = String.format(Integer.toBinaryString(a)).replace(' ','0');
        System.out.printf("%s = %d\n", a_bit,a);
        System.out.println("Hasil konversi ke biner: " + a_bit);
        break;
        
        case 3:
        input.nextLine();
        System.out.println("=======Biner > Heksadesimal=======");
        System.out.print("Masukkan bilangan biner: ");
        biner = input.nextLine();
        desimal = Integer.parseInt(biner, 2);
        heksa = Integer.toHexString(desimal).toUpperCase();
        System.out.println("Hasil konversi ke heksadesimal: " + heksa);
        break;
        
        case 4:
        input.nextLine();
        System.out.println("=======Heksadesimal > Biner=======");
        System.out.print("Masukkan bilangan heksadesimal: ");
        heksa = input.nextLine();
        desimal = Integer.parseInt(heksa, 16);
        biner = Integer.toBinaryString(desimal);
        System.out.println("Hasil konversi ke biner: " + biner);
        break;
        
        case 5:
        input.nextLine();
        System.out.println("=======Desimal > Heksadesimal=======");
        System.out.print("Masukkan bilangan desimal: ");
        desimal = input.nextInt();
        heksa = Integer.toHexString(desimal).toUpperCase();
        System.out.println("Hasil konversi ke heksadesimal: " + heksa);
        break;
        
        case 6:
        input.nextLine();
        System.out.println("=======Heksadesimal > Desimal=======");
        System.out.print("Masukkan bilangan heksadesimal: ");
        heksa = input.nextLine();
        desimal = Integer.parseInt(heksa, 16);
        System.out.println("Hasil konversi ke desimal: " + desimal);
        break;

        default:
        System.out.printf("%s\n", "Data tak ditemukan, program dihentikan ...");

        }
    }

    }
}
