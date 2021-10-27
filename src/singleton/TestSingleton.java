package singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class TestSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.doWork();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.doWork();

    }
}
