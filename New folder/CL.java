/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.os.Build$VERSION
 */
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class CL {
    public static Method a;
    public static Method b;
    public static boolean c;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Canvas object, boolean bl2) {
        InvocationTargetException invocationTargetException2222;
        block11: {
            block10: {
                Object object2 = Canvas.class;
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 29;
                if (n3 >= n4) {
                    if (bl2) {
                        CL$a.b(object);
                        return;
                    }
                    CL$a.a(object);
                    return;
                }
                n4 = 28;
                if (n3 == n4) {
                    object = new IllegalStateException("This method doesn't work on Pie!");
                    throw object;
                }
                n3 = c ? 1 : 0;
                n4 = 0;
                if (!n3) {
                    n3 = 1;
                    Object object3 = "insertReorderBarrier";
                    try {
                        a = object3 = ((Class)object2).getDeclaredMethod((String)object3, null);
                        ((AccessibleObject)object3).setAccessible(n3 != 0);
                        object3 = "insertInorderBarrier";
                        b = object2 = ((Class)object2).getDeclaredMethod((String)object3, null);
                        ((AccessibleObject)object2).setAccessible(n3 != 0);
                    }
                    catch (NoSuchMethodException noSuchMethodException) {}
                    c = n3;
                }
                if (bl2) {
                    try {
                        object2 = a;
                        if (object2 == null) break block10;
                        ((Method)object2).invoke(object, null);
                    }
                    catch (InvocationTargetException invocationTargetException2222) {
                        break block11;
                    }
                }
            }
            if (bl2) return;
            Method method = b;
            if (method == null) return;
            method.invoke(object, null);
            return;
        }
        Throwable throwable = invocationTargetException2222.getCause();
        RuntimeException runtimeException = new RuntimeException(throwable);
        throw runtimeException;
        catch (IllegalAccessException illegalAccessException) {}
    }
}

