/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 */
package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import com.google.android.gms.internal.ads.zzf;
import com.google.android.gms.internal.ads.zzg;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzh;
import com.google.android.gms.internal.ads.zzk;

public final class zzi {
    public final AudioAttributes zza;

    public /* synthetic */ zzi(zzk zzk2, zzh zzh2) {
        zzk2 = zzk2.setContentType(0).setFlags(0);
        int n3 = 1;
        zzk2 = zzk2.setUsage(n3);
        int n4 = zzgd.zza;
        int n7 = 29;
        if (n4 >= n7) {
            zzf.zza((AudioAttributes.Builder)zzk2, n3);
        }
        if (n4 >= (n3 = 32)) {
            zzg.zza((AudioAttributes.Builder)zzk2, 0);
        }
        zzk2 = zzk2.build();
        this.zza = zzk2;
    }
}

