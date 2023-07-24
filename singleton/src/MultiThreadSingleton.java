public class MultiThreadSingleton {
    public static MultiThreadSingleton instance;
    private MultiThreadSingleton() {}
    public static synchronized MultiThreadSingleton getInstance() {
        if(instance == null) {
            instance = new MultiThreadSingleton();
        }
        return instance;
    }
}
