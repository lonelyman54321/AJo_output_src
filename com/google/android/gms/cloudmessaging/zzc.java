/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.util.Log
 */
package com.google.android.gms.cloudmessaging;

import android.os.Build;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.Objects;

public final class zzc
extends ClassLoader {
    public final Class loadClass(String string2, boolean bl2) {
        String string3 = "com.google.android.gms.iid.MessengerCompat";
        int n3 = Objects.equals(string2, string3);
        if (n3 != 0) {
            int n4;
            string2 = "CloudMessengerCompat";
            int n7 = 3;
            n3 = Log.isLoggable((String)string2, (int)n7);
            if (n3 == 0 && (n3 = Build.VERSION.SDK_INT) == (n4 = 23)) {
                Log.isLoggable((String)string2, (int)n7);
            }
            return zzd.class;
        }
        return super.loadClass(string2, bl2);
    }
}

