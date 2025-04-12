/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbn;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzha;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zzst;
import com.google.android.gms.internal.ads.zzuo;
import com.google.android.gms.internal.ads.zzuq;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzwn;
import com.google.android.gms.internal.ads.zzwr;
import com.google.android.gms.internal.ads.zzws;
import com.google.android.gms.internal.ads.zzwt;
import com.google.android.gms.internal.ads.zzwv;
import com.google.android.gms.internal.ads.zzxj;
import com.google.android.gms.internal.ads.zzzv;
import com.google.android.gms.internal.ads.zzzz;

public final class zzww
extends zzuo
implements zzwn {
    private final zzha zza;
    private final zzst zzb;
    private final int zzc;
    private boolean zzd;
    private long zze;
    private boolean zzf;
    private boolean zzg;
    private zzie zzh;
    private zzbu zzi;
    private final zzwt zzj;
    private final zzzz zzk;

    public /* synthetic */ zzww(zzbu zzbu2, zzha zzha2, zzwt zzwt2, zzst zzst2, zzzz zzzz2, int n3, zzwv zzwv2) {
        this.zzi = zzbu2;
        this.zza = zzha2;
        this.zzj = zzwt2;
        this.zzb = zzst2;
        this.zzk = zzzz2;
        this.zzc = n3;
        this.zzd = true;
        this.zze = -9223372036854775807L;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final void zzw() {
        void var2_4;
        zzxj zzxj2;
        Object object;
        zzww zzww2 = this;
        long l2 = this.zze;
        boolean bl2 = this.zzf;
        boolean bl3 = this.zzg;
        zzbu zzbu2 = this.zzJ();
        if (bl3) {
            object = zzbu2.zzf;
        } else {
            bl3 = false;
            object = null;
        }
        zzbk zzbk2 = object;
        long l3 = -9223372036854775807L;
        long l4 = 0L;
        long l7 = 0L;
        object = zzxj2;
        zzxj2 = new zzxj(l3, l3, l3, l2, l2, l4, l7, bl2, false, false, null, zzbu2, zzbk2);
        bl3 = zzww2.zzd;
        if (bl3) {
            zzws zzws2 = new zzws(zzww2, (zzdc)object);
        }
        zzww2.zzo((zzdc)var2_4);
    }

    public final void zzG(zzvm zzvm2) {
        ((zzwr)zzvm2).zzN();
    }

    public final zzvm zzI(zzvo zzvo2, zzzv zzzv2, long l2) {
        zzwr zzwr2;
        zzww zzww2 = this;
        zzhb zzhb2 = this.zza.zza();
        Object object = this.zzh;
        if (object != null) {
            zzhb2.zzf((zzie)object);
        }
        object = this.zzJ().zzd;
        object.getClass();
        Object object2 = zzww2.zzj;
        this.zzb();
        object2 = ((zzwt)object2).zza;
        zzuq zzuq2 = new zzuq((zzaea)object2);
        zzst zzst2 = zzww2.zzb;
        zzso zzso2 = this.zzc(zzvo2);
        zzzz zzzz2 = zzww2.zzk;
        zzvx zzvx2 = this.zze(zzvo2);
        int n3 = zzww2.zzc;
        object2 = ((zzbn)object).zzb;
        long l3 = zzgd.zzr(-9223372036854775807L);
        object = zzwr2;
        zzwr2 = new zzwr((Uri)object2, zzhb2, zzuq2, zzst2, zzso2, zzzz2, zzvx2, this, zzzv2, null, n3, l3);
        return zzwr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbu zzJ() {
        synchronized (this) {
            return this.zzi;
        }
    }

    public final void zza(long l2, boolean bl2, boolean bl3) {
        long l3;
        boolean bl4;
        long l4 = -9223372036854775807L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            l2 = this.zze;
        }
        if (!(bl4 = this.zzd) && (object = (l3 = (l4 = this.zze) - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false && (bl4 = this.zzf) == bl2 && (bl4 = this.zzg) == bl3) {
            return;
        }
        this.zze = l2;
        this.zzf = bl2;
        this.zzg = bl3;
        this.zzd = false;
        this.zzw();
    }

    public final void zzn(zzie zzie2) {
        this.zzh = zzie2;
        Looper.myLooper().getClass();
        this.zzb();
        this.zzw();
    }

    public final void zzq() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzt(zzbu zzbu2) {
        synchronized (this) {
            this.zzi = zzbu2;
            return;
        }
    }

    public final void zzz() {
    }
}

