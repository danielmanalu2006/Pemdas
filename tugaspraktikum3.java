import java.util.Scanner;

public class tugaspraktikum3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NIM = input.nextLine();
        String TA = NIM.substring(0, 2);
        String KF = NIM.substring(2, 5);
        String PD = NIM.substring(5, 8);
        String JM = NIM.substring(8, 12);
        String NM = NIM.substring(12, 15);


        String Fakultas;
        switch (KF) {
            case "515":
                Fakultas = "FILKOM";
                break;
            case "514":
                Fakultas = "FMIPA";
                break;
            default:
                Fakultas = "Unknown";
        }

        String ProgramStudi;
        switch (PD) {
            case "020":
                ProgramStudi = "Teknik Informatika";
                break;
            case "030":
                ProgramStudi = "Teknik Komputer";
                break;
            case "040":
                ProgramStudi = "Sistem Informasi";
                break;
            case "070":
                ProgramStudi = "Teknologi Informasi";
                break;
            case "050":
                ProgramStudi = "Biologi";
                break;
            case "051":
                ProgramStudi = "Kimia";
                break;
            case "061":
                ProgramStudi = "Matematika";
                break;
            case "060":
                if (Fakultas.equals("FILKOM")) {
                    ProgramStudi = "Pendidikan Teknologi Informasi";
                } else if (Fakultas.equals("FMIPA")) {
                    ProgramStudi = "Fisika";
                } else {
                    ProgramStudi = "Unknown";
                }
                break;
            default:
                ProgramStudi = "Unknown";
                break;
        }

        String JalurMasuk;
        switch (JM) {
            case "1111":
                JalurMasuk = "SNBP";
                break;
            case "0111":
                JalurMasuk = "SNBT";
                break;
            case "7111":
                JalurMasuk = "Mandiri";
                break;
            default:
                JalurMasuk = "Unknown";
                break;
        }

        System.out.println("Angkatan: " + "20" + TA);
        System.out.println("Fakultas: " + Fakultas);
        System.out.println("Program studi: " + ProgramStudi);
        System.out.println("Jalur masuk: " + JalurMasuk);
        System.out.println("Nomor mahasiswa: " + NM);

        input.close();
        
        }

    }


