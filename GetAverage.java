public class GetAverage {
public static void main(String[] args) {
 
 getAverageStatic(8,7,9);
 
 GetAverage w1= new GetAverage();
 System.out.println(w1.getAverage(5, 3, 1));
 
 getAverageStaticVoid(3,4,5);
 
 GetAverage w2= new GetAverage();
 w2.getAverageNonStaticVoid(93, 65, 100);
}

public static void getAverageStatic(int first, int second, int third) {
 int average = (first+second+third)/3;
 System.out.println(average);
}

public int getAverage(int first, int second, int third) {
 return (first+second+third)/3;
}

public static void getAverageStaticVoid(int first, int second, int third) {
 int average =(first+second+third)/3;
 System.out.println(average);
}

public void getAverageNonStaticVoid(int first, int second, int third) {
 int average = (first+second+third)/3;
 System.out.println(average);
}


}
