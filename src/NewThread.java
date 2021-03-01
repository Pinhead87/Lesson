public class NewThread implements Runnable {
    Thread t;
    private final float[] halfArray;
    private final int startIndex;

    public Thread getT() {
        return t;
    }

    public float[] getHalfArray() {
        return halfArray;
    }

    NewThread(float[] halfArray, int startIndex) {
        this.halfArray = halfArray;
        this.startIndex = startIndex;
        t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < halfArray.length; i++) {
            halfArray[i] = (float)(halfArray[i] * Math.sin(0.2f + (float) (i + startIndex) / 5) * Math.cos(0.2f + (float) (i + startIndex) / 5) * Math.cos(0.4f + (float) (i + startIndex) / 2));
        }
    }
}
