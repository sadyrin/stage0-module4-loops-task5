package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int middle = height / 2;
        int count = height;
        int spaces = 0;
        for(int i = 0; i < height; i++){
            if(i < middle){
                for(int k = 0; k < spaces / 2; k++){
                    System.out.print(" ");
                }
                for(int j = 0; j < count; j++){
                    if(j != middle) System.out.print("8");
                    else System.out.print(8);
                }
                for(int k = 0; k < spaces / 2; k++){
                    System.out.print(" ");
                }
                count -= 2;
                spaces += 2;
            }
            if(i >= middle){
                if(count == 0){
                    count += 2;
                    spaces -= 2;
                }
                for(int k = 0; k < spaces / 2; k++){
                    System.out.print(" ");
                }
                for(int j = 0; j < count; j++){
                    if(j != middle) System.out.print("8");
                    else System.out.print(8);
                }
                for(int k = 0; k < spaces / 2; k++){
                    System.out.print(" ");
                }

                count += 2;
                spaces -= 2;
            }
            System.out.print("\n");
        }
    }
}
