/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvx;
import com.google.android.gms.internal.ads.zzvy;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class zzuo
implements zzvq {
    private final ArrayList zza;
    private final HashSet zzb;
    private final zzvx zzc;
    private final zzso zzd;
    private Looper zze;
    private zzdc zzf;
    private zzpj zzg;

    public zzuo() {
        int n3 = 1;
        Object object = new ArrayList(n3);
        this.zza = object;
        super(n3);
        this.zzb = object;
        this.zzc = object = new zzvx();
        this.zzd = object = new zzso();
    }

    public /* synthetic */ zzdc zzM() {
        return null;
    }

    public final zzpj zzb() {
        zzpj zzpj2 = this.zzg;
        zzeq.zzb(zzpj2);
        return zzpj2;
    }

    public final zzso zzc(zzvo zzvo2) {
        return this.zzd.zza(0, zzvo2);
    }

    public final zzso zzd(int n3, zzvo zzvo2) {
        return this.zzd.zza(0, zzvo2);
    }

    public final zzvx zze(zzvo zzvo2) {
        return this.zzc.zza(0, zzvo2);
    }

    public final zzvx zzf(int n3, zzvo zzvo2) {
        return this.zzc.zza(0, zzvo2);
    }

    public final void zzg(Handler handler, zzsp zzsp2) {
        this.zzd.zzb(handler, zzsp2);
    }

    public final void zzh(Handler handler, zzvy zzvy2) {
        this.zzc.zzb(handler, zzvy2);
    }

    public final void zzi(zzvp object) {
        boolean bl2;
        HashSet hashSet = this.zzb;
        boolean bl3 = hashSet.isEmpty() ^ true;
        HashSet hashSet2 = this.zzb;
        hashSet2.remove(object);
        if (bl3 && (bl2 = ((HashSet)(object = this.zzb)).isEmpty())) {
            this.zzj();
        }
    }

    public void zzj() {
    }

    public final void zzk(zzvp zzvp2) {
        this.zze.getClass();
        HashSet hashSet = this.zzb;
        boolean bl2 = hashSet.isEmpty();
        hashSet.add(zzvp2);
        if (bl2) {
            this.zzl();
        }
    }

    public void zzl() {
    }

    public final void zzm(zzvp zzvp2, zzie zzie2, zzpj object) {
        Looper looper = Looper.myLooper();
        Looper looper2 = this.zze;
        boolean bl2 = true;
        if (looper2 != null && looper2 != looper) {
            bl2 = false;
        }
        zzeq.zzd(bl2);
        this.zzg = object;
        object = this.zzf;
        this.zza.add(zzvp2);
        looper2 = this.zze;
        if (looper2 == null) {
            this.zze = looper;
            this.zzb.add(zzvp2);
            this.zzn(zzie2);
            return;
        }
        if (object != null) {
            this.zzk(zzvp2);
            zzvp2.zza(this, (zzdc)object);
        }
    }

    public abstract void zzn(zzie var1);

    public final void zzo(zzdc zzdc2) {
        this.zzf = zzdc2;
        ArrayList arrayList = this.zza;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            zzvp zzvp2 = (zzvp)arrayList.get(i3);
            zzvp2.zza(this, zzdc2);
        }
    }

    public final void zzp(zzvp zzvp2) {
        this.zza.remove(zzvp2);
        ArrayList arrayList = this.zza;
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            this.zzq();
            return;
        }
        this.zzi(zzvp2);
    }

    public abstract void zzq();

    public final void zzr(zzsp zzsp2) {
        this.zzd.zzc(zzsp2);
    }

    public final void zzs(zzvy zzvy2) {
        this.zzc.zzh(zzvy2);
    }

    public /* synthetic */ void zzt(zzbu zzbu2) {
        throw null;
    }

    public final boolean zzu() {
        HashSet hashSet = this.zzb;
        boolean bl2 = hashSet.isEmpty();
        return !bl2;
    }

    public /* synthetic */ boolean zzv() {
        return true;
    }
}

