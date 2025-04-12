/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;

final class zzele {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzele(String string2, String string3, int n3, long l2, Integer n4) {
        this.zza = string2;
        this.zzb = string3;
        this.zzc = n3;
        this.zzd = l2;
        this.zze = n4;
    }

    public final String toString() {
        int n3 = this.zzc;
        long l2 = this.zzd;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.zza;
        stringBuilder.append(string2);
        string2 = ".";
        stringBuilder.append(string2);
        stringBuilder.append(n3);
        stringBuilder.append(string2);
        stringBuilder.append(l2);
        String string3 = stringBuilder.toString();
        Object object = this.zzb;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = this.zzb;
            string3 = n1.a(string3, string2, (String)object);
        }
        object = zzbep.zzbD;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2 && (object = this.zze) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.zzb)))) {
            object = this.zze;
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(string3);
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append(object);
            string3 = ((StringBuilder)object2).toString();
        }
        return string3;
    }
}

