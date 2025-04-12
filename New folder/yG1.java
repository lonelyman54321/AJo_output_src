/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

public final class yG1 {
    public static final TY2 a;

    static {
        TY2 tY2;
        a = tY2 = new TY2("MagnifierPositionInRoot");
    }

    public static boolean a() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        n3 = n3 >= n4 ? 1 : 0;
        return n3 != 0;
    }
}

