package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int middle = sideLength / 2;
        for(int i = 0; i < sideLength; i++){
            if(i != middle){
                for(int j = 0; j < sideLength; j++){
                    if(j != middle) System.out.print(" ");
                    else System.out.print(8);
                }
                System.out.print("\n");
            }
            else{
                for(int j = 0; j < sideLength; j++){
                    System.out.print(8);
                }
                System.out.print("\n");
            }
        }
    }
}
