/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.internal.gtm;

import android.util.Log;

public final class zzgq {
    public static final boolean zza(int n3) {
        String string2 = "GoogleTagManager";
        return (n3 = (int)(Log.isLoggable((String)string2, (int)n3) ? 1 : 0)) != 0;
    }
}

