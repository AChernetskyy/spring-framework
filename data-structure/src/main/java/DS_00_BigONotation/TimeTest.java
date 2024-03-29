package DS_00_BigONotation;

public class TimeTest {
    public static void main(String[] args) {
        int n=10000;
        int m = 0;
        long startTime=System.currentTimeMillis();
        int numberOfOperations=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) numberOfOperations++;
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Number of Operations is = "+ numberOfOperations + " in "+ (endTime-startTime)+" milisecs");

        // Task 2 Nested Loops...................
        startTime=System.currentTimeMillis();
        numberOfOperations=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                numberOfOperations++;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #2 O(n^2)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 2 End...................

        // Task 3 Three Nested Loops...................
        startTime=System.currentTimeMillis();
        long numberOfOperations2= (long) 0.0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++)
                    numberOfOperations2++;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #3 O(n^3) = "+ numberOfOperations2 + " in "+ (endTime-startTime));
        // Task 3 End...................

        // Task 4 N and M Nested Loops...................
        startTime=System.currentTimeMillis();
        numberOfOperations=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                numberOfOperations++;
            }
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #4 O(nxm)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 4 End...................

        //Task 5 Start
        startTime=System.currentTimeMillis();
        numberOfOperations=0;
        for(int i=1;i<=n;i=i*2){
            numberOfOperations++;
        }
        endTime=System.currentTimeMillis();
        System.out.println("Number of Operations in Task #5 O(log n)= "+ numberOfOperations + " in "+ (endTime-startTime));
        // Task 5 End...................
    }
}
