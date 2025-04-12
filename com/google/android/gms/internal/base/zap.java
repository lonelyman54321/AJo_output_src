/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.base;

import android.os.Build;

public final class zap {
    public static final int zaa;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        n3 = n3 >= n4 ? 0x2000000 : 0;
        zaa = n3;
    }
}

