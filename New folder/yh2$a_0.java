/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.lang.reflect.Method;

/*
 * Renamed from yH2$a
 */
public final class yh2$a_0
extends yh2_2 {
    public final Object b(Class serializable, Object object, Method method, Object[] objectArray) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            return xm0_2.a(serializable, object, method, objectArray);
        }
        serializable = new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        throw serializable;
    }

    public final boolean c(Method method) {
        return xh2_2.a(method);
    }
}

