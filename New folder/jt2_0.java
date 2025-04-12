/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

/*
 * Renamed from jt2
 */
public final class jt2_0 {
    public static final it2_1 a;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        it2_1 it2_12 = n3 >= n4 ? new zh_0() : new Object();
        a = it2_12;
    }
}

