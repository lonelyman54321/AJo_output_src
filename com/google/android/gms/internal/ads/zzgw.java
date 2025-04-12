/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhc;
import com.google.android.gms.internal.ads.zzhh;

public final class zzgw
extends zzgv {
    private final byte[] zza;
    private Uri zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzgw(byte[] byArray) {
        boolean bl2 = false;
        super(false);
        int n3 = byArray.length;
        if (n3 > 0) {
            bl2 = true;
        }
        zzeq.zzd(bl2);
        this.zza = byArray;
    }

    public final int zza(byte[] byArray, int n3, int n4) {
        int n7;
        if (n4 == 0) {
            return 0;
        }
        int n8 = this.zzd;
        if (n8 == 0) {
            return -1;
        }
        n4 = Math.min(n4, n8);
        byte[] byArray2 = this.zza;
        int n10 = this.zzc;
        System.arraycopy(byArray2, n10, byArray, n3, n4);
        this.zzc = n7 = this.zzc + n4;
        this.zzd = n7 = this.zzd - n4;
        this.zzg(n4);
        return n4;
    }

    public final long zzb(zzhh object) {
        Uri uri;
        this.zzb = uri = ((zzhh)object).zza;
        this.zzi((zzhh)object);
        long l2 = ((zzhh)object).zze;
        byte[] byArray = this.zza;
        int n3 = byArray.length;
        long l3 = n3;
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 <= 0) {
            boolean bl2;
            int n4;
            this.zzc = n4 = (int)l2;
            this.zzd = n3 -= n4;
            l2 = ((zzhh)object).zzf;
            l3 = -1;
            long l4 = l2 - l3;
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 != false) {
                long l7 = n3;
                l2 = Math.min(l7, l2);
                this.zzd = n4 = (int)l2;
            }
            this.zze = bl2 = true;
            this.zzj((zzhh)object);
            l2 = ((zzhh)object).zzf;
            long l8 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (l8 != false) {
                return l2;
            }
            return this.zzd;
        }
        object = new zzhc(2008);
        throw object;
    }

    public final Uri zzc() {
        return this.zzb;
    }

    public final void zzd() {
        boolean bl2 = this.zze;
        if (bl2) {
            bl2 = false;
            this.zze = false;
            this.zzh();
        }
        this.zzb = null;
    }
}

