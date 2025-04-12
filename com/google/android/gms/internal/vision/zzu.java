/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

public final class zzu {
    public static boolean zza(Context context, String string2) {
        String string3;
        int n3;
        int n4 = DynamiteModule.getLocalVersion(context, string2);
        return n4 > (n3 = DynamiteModule.getRemoteVersion(context, string3 = "com.google.android.gms.vision.dynamite"));
    }
}

