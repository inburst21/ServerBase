package com.inburst.server.App;

public class MainTest {

    public static void main(String[] args) {
        Application application = new Application();
        application.onCreate();
        Activity activity = new Activity();
        activity.onStart();
    }
}
