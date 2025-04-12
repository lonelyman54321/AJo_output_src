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

/*
 * Renamed from y21
 */
public final class y21_0 {
    public static Handler a(Looper object) {
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 28;
        if (n8 >= n10) {
            return y21$a.a(object);
        }
        Object object2 = Handler.class;
        Class[] classArray = new Class[n7];
        Class clazz = Looper.class;
        classArray[0] = clazz;
        clazz = Handler.Callback.class;
        classArray[n4] = clazz;
        clazz = Boolean.TYPE;
        classArray[n3] = clazz;
        object2 = ((Class)object2).getDeclaredConstructor(classArray);
        Object[] objectArray = new Object[n7];
        objectArray[0] = object;
        objectArray[n4] = null;
        Boolean bl2 = Boolean.TRUE;
        objectArray[n3] = bl2;
        Object object3 = ((Constructor)object2).newInstance(objectArray);
        try {
            return object3;
        }
        catch (InvocationTargetException invocationTargetException) {
            object = invocationTargetException.getCause();
            n3 = object instanceof RuntimeException;
            if (n3 == 0) {
                n3 = object instanceof Error;
                if (n3 != 0) {
                    throw (Error)object;
                }
                object3 = new RuntimeException((Throwable)object);
                throw object3;
            }
            throw (RuntimeException)object;
        }
        catch (IllegalAccessException | InstantiationException | NoSuchMethodException reflectiveOperationException) {
            object3 = new Handler(object);
            return object3;
        }
    }
}

