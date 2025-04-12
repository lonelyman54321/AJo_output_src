/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.auth-api;

import android.os.Build;

public final class zbbk {
    public static final int zba;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        n3 = n3 >= n4 ? 0x2000000 : 0;
        zba = n3;
    }
}

