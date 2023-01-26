package school.mjc.stage0.loops.task5;

public class Triangle {
    public  void printTriangle(int cathetusLength) {
        int count = 1;
        for(int i = 0; i < cathetusLength; i++){
            for(int j = 0; j < count; j++){
                System.out.print(8);
            }
            System.out.print("\n");
            count++;
        }
    }
}
