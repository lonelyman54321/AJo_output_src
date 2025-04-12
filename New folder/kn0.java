/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 */
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class kn0
extends i0_0 {
    public final Object a;
    public final ExecutorService b;
    public volatile Handler c;

    public kn0() {
        Object object;
        this.a = object = new Object();
        object = new kn0$a();
        this.b = object = Executors.newFixedThreadPool(4, (ThreadFactory)object);
    }

    public static Handler Q(Looper looper) {
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 28;
        if (n8 >= n10) {
            return kn0$b.a(looper);
        }
        Object object = Handler.class;
        Class[] classArray = new Class[n7];
        Class clazz = Looper.class;
        classArray[0] = clazz;
        clazz = Handler.Callback.class;
        classArray[n4] = clazz;
        clazz = Boolean.TYPE;
        classArray[n3] = clazz;
        object = ((Class)object).getDeclaredConstructor(classArray);
        Object[] objectArray = new Object[n7];
        objectArray[0] = looper;
        objectArray[n4] = null;
        Boolean bl2 = Boolean.TRUE;
        objectArray[n3] = bl2;
        Object object2 = ((Constructor)object).newInstance(objectArray);
        try {
            return object2;
        }
        catch (InvocationTargetException invocationTargetException) {
            object2 = new Handler(looper);
            return object2;
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException reflectiveOperationException) {
            object2 = new Handler(looper);
            return object2;
        }
    }
}

