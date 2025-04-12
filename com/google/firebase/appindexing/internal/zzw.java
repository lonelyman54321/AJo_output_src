/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.firebase.appindexing.internal;

import android.util.Log;

public final class zzw {
    public static int zza(String string2) {
        boolean bl2 = zzw.zzb(3);
        if (bl2) {
            return Log.d((String)"FirebaseAppIndex", (String)string2);
        }
        return 0;
    }

    public static boolean zzb(int n3) {
        String string2 = "FirebaseAppIndex";
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            return true;
        }
        return Log.isLoggable((String)string2, (int)n3);
    }
}

