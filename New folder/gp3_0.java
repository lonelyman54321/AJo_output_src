/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Trace
 */
import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * Renamed from gp3
 */
public final class gp3_0 {
    public static long a;
    public static Method b;
    public static Method c;
    public static Method d;

    public static void a(Exception throwable) {
        boolean bl2 = throwable instanceof InvocationTargetException;
        if (bl2) {
            bl2 = (throwable = ((Throwable)throwable).getCause()) instanceof RuntimeException;
            if (bl2) {
                throw (RuntimeException)throwable;
            }
            RuntimeException runtimeException = new RuntimeException(throwable);
            throw runtimeException;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean b() {
        Exception exception2;
        boolean bl2;
        block4: {
            Object object;
            Object object2;
            int n3;
            block3: {
                n3 = 1;
                bl2 = false;
                int n4 = Build.VERSION.SDK_INT;
                int n7 = 29;
                if (n4 >= n7) {
                    return hp3_0.c();
                }
                object2 = "isTagEnabled";
                object = Trace.class;
                try {
                    Class<Long> clazz;
                    long l2;
                    Class[] classArray = b;
                    if (classArray != null) break block3;
                    classArray = "TRACE_TAG_APP";
                    classArray = ((Class)object).getField((String)classArray);
                    a = l2 = classArray.getLong(null);
                    classArray = new Class[n3];
                    classArray[0] = clazz = Long.TYPE;
                    b = object2 = ((Class)object).getMethod((String)object2, classArray);
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            object2 = b;
            long l3 = a;
            object = l3;
            Object object3 = new Object[n3];
            object3[0] = object;
            object3 = ((Method)object2).invoke(null, (Object[])object3);
            object3 = (Boolean)object3;
            return (Boolean)object3;
        }
        gp3_0.a(exception2);
        return bl2;
    }

    public static String c(String string2) {
        int n3;
        int n4 = string2.length();
        if (n4 <= (n3 = 127)) {
            return string2;
        }
        return string2.substring(0, n3);
    }
}

