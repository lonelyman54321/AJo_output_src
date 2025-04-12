/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzu;

public final class zzfil {
    public static void zza(Context object, boolean bl2) {
        if (bl2) {
            zzm.zzi("This request is sent from a test device.");
            return;
        }
        zzay.zzb();
        object = zzf.zzz(object);
        StringBuilder stringBuilder = new StringBuilder("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        stringBuilder.append((String)object);
        stringBuilder.append("\")) to get test ads on this device.");
        zzm.zzi(stringBuilder.toString());
    }

    public static void zzb(int n3, Throwable throwable, String string2) {
        String string3 = "Ad failed to load : ";
        CharSequence charSequence = new StringBuilder(string3);
        charSequence.append(n3);
        charSequence = charSequence.toString();
        zzm.zzi((String)charSequence);
        zze.zzb(string2, throwable);
        int n4 = 3;
        if (n3 == n4) {
            return;
        }
        zzu.zzo().zzv(throwable, string2);
    }
}

