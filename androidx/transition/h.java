/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package androidx.transition;

import android.os.Build;

public final class h {
    public static final boolean a;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        n3 = n3 >= n4 ? 1 : 0;
        a = n3;
    }
}

