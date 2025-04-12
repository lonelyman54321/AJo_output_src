/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import java.lang.reflect.Method;

public final class dE3 {
    public static boolean a;
    public static Method b;
    public static final boolean c;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 27;
        n3 = n3 >= n4 ? 1 : 0;
        c = n3;
    }
}

