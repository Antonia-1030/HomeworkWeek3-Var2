package homework.ver2;

public class RobotMishelov {
    public static void main (String[] args){
        // Data structure
        boolean BatteryFull = true;
        boolean BatteryEmpty = false;
        String Komanda1 = "Go sidewas.";
        String Komanda2 = "Jump.";
        String Komanda0 = "Forward";
        String Attack = "Karate chop!";
        int[] Hits = new int[4];
        //int [] DisplayNumbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] DisplayNumbers= new int[11];

        // Navigation/movement
        Scanner AreaScan = new Scanner (System.in);
        System.out.println("Kakvo ima otpred (0-nishto, 1-stena, 2-stol): ");
        int Obstacle = AreaScan.nextInt();
        if (Obstacle == 1) {System.out.println(Komanda1)}
        else if (Obstacle == 2) {System.out.println(Komanda2)}
        else {System.out.println(Komanda0)} ;

        // Attack
        while (BatteryFull){
            System.out.println("Vavedete broi na pikseli: ");
            for(int i = 0; Hits=> i; ++i){
             int PotentialMouse = AreaScan.nextInt();
             if (PotentialMouse % 2 == 0) {
                int HitPower;
                do {
                    int HitPower = (int) (Math.random() * 10 + 1);
                    System.out.print(Attack + " Mouse destroyed!");
                } while (HitPower != 5);
                break;
            } else { Komanda0 }
            }
        }
        // Charge
        while (BatteryEmpty){
            System.out.print("Testing nearest outlet...");
            String TestResult;
            do{
                int OutletValue1 = (int)(Math.random()*1000+1);
                int OutletValue2 = (int)(Math.random()*1000+1);
                if (OutletValue2>OutletValue1){TestResult= "Looking for another outlet..."}
                if (OutletValue1=OutletValue2){TestResult= "Re-testing..."};
            }while (OutletValue1!>OutletValue2);
            TestResult = "Charging...Charged!";
        }
    }

    // Communication
    public static Report(int[] DisplayNumbers, int L){
        for(int i = L-1; i>0; --i) {
            int pos = 0;
            for (; L>pos; ++pos){
                if(i !=pos && [i] DisplayNumbers == [pos] DisplayNumbers){break;}
                if(pos == L){return i}
                if (i %2 == 0) {
                    System.out.println("I am a robot!" + i);
                }
                else{System.out.print(" ");}
            }
        }
    }
    // public static Report(int[] DisplayNumbers){
    //        for(int i=0; i<=DisplayNumbers ; ++i) {
    //            if(i %2 == 0){System.out.println("I am a robot!" + i)};
    //        }
    //        return 0;}
}
