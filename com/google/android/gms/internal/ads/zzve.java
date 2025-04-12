/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzvd;
import java.util.Map;

final class zzve
implements zzhb {
    private final zzhb zza;
    private final int zzb;
    private final zzvd zzc;
    private final byte[] zzd;
    private int zze;

    public zzve(zzhb object, int n3, zzvd zzvd2) {
        int n4 = 1;
        boolean bl2 = n3 > 0;
        zzeq.zzd(bl2);
        this.zza = object;
        this.zzb = n3;
        this.zzc = zzvd2;
        object = new byte[n4];
        this.zzd = (byte[])object;
        this.zze = n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int zza(byte[] byArray, int n3, int n4) {
        int n7;
        Object object;
        int n8 = this.zze;
        int n10 = -1;
        if (n8 == 0) {
            Object object2 = this.zza;
            object = this.zzd;
            int n14 = 1;
            Object object3 = 0;
            zzfu zzfu2 = null;
            n8 = object2.zza((byte[])object, 0, n14);
            if (n8 == n10) return n10;
            object2 = this.zzd;
            n8 = (object2[0] & 0xFF) << 4;
            if (n8 != 0) {
                int n15;
                object = new byte[n8];
                for (n14 = n8; n14 > 0; n14 -= n15) {
                    zzhb zzhb2 = this.zza;
                    n15 = zzhb2.zza((byte[])object, (int)object3, n14);
                    if (n15 == n10) return n10;
                    object3 += n15;
                }
                while (n8 > 0 && (object3 = (Object)object[n14 = n8 + -1]) == 0) {
                    n8 = n14;
                }
                if (n8 > 0) {
                    zzvd zzvd2 = this.zzc;
                    zzfu2 = new zzfu((byte[])object, n8);
                    zzvd2.zza(zzfu2);
                }
            }
            this.zze = n8 = this.zzb;
        }
        if ((n7 = (object = this.zza).zza(byArray, n3, n4 = Math.min(n8, n4))) == n10) return n7;
        this.zze = n3 = this.zze - n7;
        return n7;
    }

    public final long zzb(zzhh object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final void zzf(zzie zzie2) {
        zzie2.getClass();
        this.zza.zzf(zzie2);
    }
}

