package Singleton;

public class AppSettings {
    private static volatile AppSettings ourInstance;

    public static AppSettings getInstance() {
        if (ourInstance != null) {
            return ourInstance;
        } synchronized (Object.class) {
            ourInstance = new AppSettings();
        }
        return ourInstance;
    }

    private AppSettings() {
    }
}
