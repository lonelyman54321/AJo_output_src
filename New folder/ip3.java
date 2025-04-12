/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Trace
 */
import android.os.Build;
import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class ip3 {
    public static final long a;
    public static final Method b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        Class<Long> clazz;
        int n3 = 2;
        int n4 = 3;
        int n7 = 1;
        Class<String> clazz2 = String.class;
        Class<Trace> clazz3 = Trace.class;
        int n8 = Build.VERSION.SDK_INT;
        int n10 = 29;
        if (n8 >= n10) return;
        Object object = "TRACE_TAG_APP";
        try {
            object = clazz3.getField((String)object);
            n10 = 0;
            clazz = null;
        }
        catch (Exception exception) {
            return;
        }
        long l2 = ((Field)object).getLong(null);
        a = l2;
        object = "isTagEnabled";
        clazz = Long.TYPE;
        Class[] classArray = new Class[n7];
        classArray[0] = clazz;
        object = clazz3.getMethod((String)object, classArray);
        b = object;
        object = "asyncTraceBegin";
        Class<Integer> clazz4 = Integer.TYPE;
        Class[] classArray2 = new Class[n4];
        classArray2[0] = clazz;
        classArray2[n7] = clazz2;
        classArray2[n3] = clazz4;
        clazz3.getMethod((String)object, classArray2);
        object = "asyncTraceEnd";
        classArray2 = new Class[n4];
        classArray2[0] = clazz;
        classArray2[n7] = clazz2;
        classArray2[n3] = clazz4;
        clazz3.getMethod((String)object, classArray2);
        object = "traceCounter";
        Class[] classArray3 = new Class[n4];
        classArray3[0] = clazz;
        classArray3[n7] = clazz2;
        classArray3[n3] = clazz4;
        clazz3.getMethod((String)object, classArray3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a() {
        Object object;
        boolean bl2 = false;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            return ip3$a.a();
        }
        try {
            object = b;
        }
        catch (Exception exception) {
            return bl2;
        }
        long l2 = a;
        Long l3 = l2;
        int n7 = 1;
        Object[] objectArray = new Object[n7];
        objectArray[0] = l3;
        n4 = 0;
        l3 = null;
        object = ((Method)object).invoke(null, objectArray);
        object = (Boolean)object;
        return (Boolean)object;
    }
}

