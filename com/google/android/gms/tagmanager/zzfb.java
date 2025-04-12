/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;

final class zzfb {
    public static void zza(Context context, String string2, String string3, String string4) {
        context = context.getSharedPreferences(string2, 0).edit();
        context.putString(string3, string4);
        context.apply();
    }
}

