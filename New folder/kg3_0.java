/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.Surface
 */
import android.os.Build;
import android.view.Surface;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/*
 * Renamed from Kg3
 */
public final class kg3_0 {
    public static final kg3_0 a;
    public static Method b;
    public static boolean c;

    static {
        kg3_0 kg3_02;
        a = kg3_02 = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Method method;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        boolean bl2 = true;
        if (n3 >= n4) {
            return bl2;
        }
        n4 = 22;
        if (n3 != n4) return false;
        synchronized (this) {
            n3 = 0;
            method = null;
            try {
                Object object = b;
                boolean bl3 = c;
                if (!bl3) {
                    c = bl2;
                    object = Surface.class;
                    String string2 = "lockHardwareCanvas";
                    object = ((Class)object).getDeclaredMethod(string2, null);
                    ((AccessibleObject)object).setAccessible(bl2);
                    b = object;
                }
                method = object;
            }
            catch (Throwable throwable) {
                b = null;
            }
        }
        if (method == null) return false;
        return bl2;
    }
}

