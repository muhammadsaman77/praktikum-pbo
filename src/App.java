public class App {// membuat class bernama App yang bisa diakses secara public
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello namaku Saman");
        int age = 20;
        String hewan = "Kucing";
        System.out.println(age);
        System.out.println(hewan);
        final String gender = "Laki-Laki"; //mendeklarasikan variabel constant dengan type string bernama gender
        System.out.println(gender);
        //1byte = 8bit
        //1short = 2 byte= 16 bit 
        byte typeByte = 32;
        short typeShort = 30000;
        int typeInt = 6000;
        long typeLong = 800000000;
        System.out.println("type byte "+typeByte);
        System.out.println("type short "+typeShort);
        System.out.println("type int "+typeInt);
        System.out.println("type long "+typeLong);
        boolean benar = true;
        char character = 'a'; //char petik satu
        System.out.println(benar);
        System.out.println(character);
        String alatTulis = "Pulpen"; // String petik dua
        System.out.println(alatTulis);
        short intToShort = (short)typeInt;
        System.out.println(intToShort);

        int angka1 = 10;
        angka1++;
        System.out.println(angka1);
        angka1*=5; // angka1 = angka1 * 5
        System.out.println(angka1);
        angka1+=5; // angka1 = angka1 + 5
        System.out.println(angka1);
        int angka2 = 70;
        boolean lebihdari = angka1> angka2; //60 > 70 
        boolean kurangdari = angka1< angka2; //60 < 70 
        System.out.println("angka1 > angka2 =" + lebihdari);
        System.out.println("angka1 < angka2 =" + kurangdari);
        // if else statement
        int angka = 30;
        if (angka>40){
            System.out.println("angka ini lebih dari 40");
        }else if(angka == 40){
            System.out.println("angka ini bernilai 40");
        }
        else{
            System.out.println("tidak terpenuhi");
        }
        String ternary = (angka>=40)?"angka ini lebih dari sama dengan 40":"angka ini kurang dari 40";
        System.out.println(ternary);
        //swich case
        String lampu = "ungu";
        switch (lampu){
            case "merah":
                System.out.println("Lampu merah harap berhenti");
                break;
            case "kuning":
                System.out.println("Lampu kuning harap berhatihati");
                break;
            case "hijau":
            System.out.println("lampu hijau silahkan jalan");
            default:
                System.out.println("tidak terdeteksi");
        }
        // while loop
        // int a = 1;
        // while (a<=10){
        // System.out.println("perulangan ke"+a);
        // a++;
        // }
        // do {
        //     System.out.println("perulangan ke "+a);
        //     a++;
        // } while (a<=10);
        for (int i=1;i<=10;i++){
            System.out.println("perulangan "+ i);
        }
    }
}
