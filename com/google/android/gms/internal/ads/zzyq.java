/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzdk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzyp;
import com.google.android.gms.internal.ads.zzys;
import java.util.HashMap;
import java.util.Map;

public final class zzyq
extends zzdk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private final SparseArray zzh;
    private final SparseBooleanArray zzi;

    public zzyq() {
        SparseArray sparseArray;
        this.zzh = sparseArray = new SparseArray();
        this.zzi = sparseArray;
        this.zzx();
    }

    public zzyq(Context context) {
        this.zze(context);
        context = zzgd.zzv(context);
        int n3 = context.x;
        int n4 = context.y;
        this.zzf(n3, n4, true);
        this.zzh = context;
        super();
        this.zzi = context;
        this.zzx();
    }

    public /* synthetic */ zzyq(zzys zzys2, zzyp zzyp2) {
        super(zzys2);
        int n3;
        boolean bl2;
        this.zza = bl2 = zzys2.zzI;
        this.zzb = bl2 = zzys2.zzK;
        this.zzc = bl2 = zzys2.zzM;
        this.zzd = bl2 = zzys2.zzR;
        this.zze = bl2 = zzys2.zzS;
        this.zzf = bl2 = zzys2.zzT;
        this.zzg = bl2 = zzys2.zzV;
        zzyp2 = zzys.zza(zzys2);
        SparseArray sparseArray = new SparseArray();
        for (int i3 = 0; i3 < (n3 = zzyp2.size()); ++i3) {
            n3 = zzyp2.keyAt(i3);
            Map map2 = (Map)zzyp2.valueAt(i3);
            HashMap hashMap = new HashMap(map2);
            sparseArray.put(n3, hashMap);
        }
        this.zzh = sparseArray;
        zzys2 = zzys.zzb(zzys2).clone();
        this.zzi = zzys2;
    }

    public static /* bridge */ /* synthetic */ SparseArray zzn(zzyq zzyq2) {
        return zzyq2.zzh;
    }

    public static /* bridge */ /* synthetic */ SparseBooleanArray zzo(zzyq zzyq2) {
        return zzyq2.zzi;
    }

    public static /* bridge */ /* synthetic */ boolean zzq(zzyq zzyq2) {
        return zzyq2.zzd;
    }

    public static /* bridge */ /* synthetic */ boolean zzr(zzyq zzyq2) {
        return zzyq2.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzs(zzyq zzyq2) {
        return zzyq2.zzb;
    }

    public static /* bridge */ /* synthetic */ boolean zzt(zzyq zzyq2) {
        return zzyq2.zze;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(zzyq zzyq2) {
        return zzyq2.zzc;
    }

    public static /* bridge */ /* synthetic */ boolean zzv(zzyq zzyq2) {
        return zzyq2.zzf;
    }

    public static /* bridge */ /* synthetic */ boolean zzw(zzyq zzyq2) {
        return zzyq2.zza;
    }

    private final void zzx() {
        boolean bl2;
        this.zza = bl2 = true;
        this.zzb = bl2;
        this.zzc = bl2;
        this.zzd = bl2;
        this.zze = bl2;
        this.zzf = bl2;
        this.zzg = bl2;
    }

    public final zzyq zzp(int n3, boolean bl2) {
        SparseBooleanArray sparseBooleanArray = this.zzi;
        boolean bl3 = sparseBooleanArray.get(n3);
        if (bl3 != bl2) {
            if (bl2) {
                SparseBooleanArray sparseBooleanArray2 = this.zzi;
                bl3 = true;
                sparseBooleanArray2.put(n3, bl3);
            } else {
                SparseBooleanArray sparseBooleanArray3 = this.zzi;
                sparseBooleanArray3.delete(n3);
            }
        }
        return this;
    }
}

