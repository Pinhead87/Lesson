import java.util.Arrays;

public class ArrayCalculation {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;
    float[] arr = new float[SIZE];
    ArrayCalculation() {
        Arrays.fill(arr, 1.0f);
    }
    public void method1() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (float) i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
        System.out.println("Затрачено времени при одном потоке: " + (System.currentTimeMillis() - a) + " мс");
//        System.out.println(Arrays.toString(arr));
    }
    public void method2() {
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, HALF);
        System.arraycopy(arr, HALF, a2, 0, HALF);
        NewThread t1 = new NewThread(a1, 0);
        NewThread t2 = new NewThread(a2, HALF);
        try {
            t1.getT().join();
            t2.getT().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(t1.getHalfArray(), 0, arr, 0, HALF);
        System.arraycopy(t2.getHalfArray(), 0, arr, HALF, HALF);
        System.out.println("Затрачено времени при двух потоках: " + (System.currentTimeMillis() - a) + " мс");
//        System.out.println(Arrays.toString(arr));
    }
}
