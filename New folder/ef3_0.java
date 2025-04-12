/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

/*
 * Renamed from ef3
 */
public final class ef3_0 {
    public static final boolean a;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 34;
        n3 = n3 >= n4 ? 1 : 0;
        a = n3;
    }
}

