/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/*
 * Renamed from EA
 */
public final class ea_1 {
    public static Object a(Class clazz, InvocationHandler object) {
        if (object == null) {
            return null;
        }
        ClassLoader classLoader = ea_1.class.getClassLoader();
        Class[] classArray = new Class[]{clazz};
        object = Proxy.newProxyInstance(classLoader, classArray, (InvocationHandler)object);
        return clazz.cast(object);
    }
}

