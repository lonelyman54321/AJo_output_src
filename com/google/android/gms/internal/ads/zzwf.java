/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaw;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzgca;
import com.google.android.gms.internal.ads.zzgci;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzuw;
import com.google.android.gms.internal.ads.zzuz;
import com.google.android.gms.internal.ads.zzvm;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzwd;
import com.google.android.gms.internal.ads.zzwe;
import com.google.android.gms.internal.ads.zzzv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzwf
extends zzuw {
    private static final zzbu zza;
    private final zzvq[] zzb;
    private final zzdc[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzgca zzf;
    private int zzg;
    private long[][] zzh;
    private zzwe zzi;
    private final zzuz zzj;

    static {
        zzaw zzaw2 = new zzaw();
        zzaw2.zza("MergingMediaSource");
        zza = zzaw2.zzc();
    }

    public zzwf(boolean bl2, boolean bl3, zzuz zzuz2, zzvq ... zzvqArray) {
        Object object;
        this.zzb = zzvqArray;
        this.zzj = zzuz2;
        List<zzvq> list = Arrays.asList(zzvqArray);
        this.zzd = object = new ArrayList(list);
        this.zzg = -1;
        object = new zzdc[zzvqArray.length];
        this.zzc = object;
        object = new long[0][];
        this.zzh = (long[][])object;
        this.zze = object;
        this.zzf = object = zzgci.zzb(8).zzb(2).zza();
    }

    public final void zzG(zzvm zzvm2) {
        Object object;
        int n3;
        zzvm2 = (zzwd)zzvm2;
        for (int i3 = 0; i3 < (n3 = ((zzvq[])(object = this.zzb)).length); ++i3) {
            object = object[i3];
            zzvm zzvm3 = ((zzwd)zzvm2).zzn(i3);
            object.zzG(zzvm3);
        }
    }

    public final zzvm zzI(zzvo object, zzzv object2, long l2) {
        Object object3 = this.zzc;
        zzvq[] zzvqArray = this.zzb;
        int n3 = zzvqArray.length;
        zzvm[] zzvmArray = new zzvm[n3];
        object3 = object3[0];
        Object object4 = ((zzvo)object).zza;
        int n4 = ((zzdc)object3).zza(object4);
        for (int i3 = 0; i3 < n3; ++i3) {
            object4 = this.zzc[i3].zzf(n4);
            object4 = ((zzvo)object).zza(object4);
            zzvq zzvq2 = this.zzb[i3];
            long[] lArray = this.zzh[n4];
            long l3 = lArray[i3];
            long l4 = l2 - l3;
            zzvmArray[i3] = object4 = zzvq2.zzI((zzvo)object4, (zzzv)object2, l4);
        }
        object = this.zzj;
        long[] lArray = this.zzh[n4];
        object2 = new zzwd((zzuz)object, lArray, zzvmArray);
        return object2;
    }

    public final zzbu zzJ() {
        Object object = this.zzb;
        int n3 = ((zzvq[])object).length;
        if (n3 > 0) {
            n3 = 0;
            object = object[0].zzJ();
        } else {
            object = zza;
        }
        return object;
    }

    public final void zzn(zzie zzie2) {
        Object object;
        int n3;
        super.zzn(zzie2);
        zzie2 = null;
        for (int i3 = 0; i3 < (n3 = ((zzvq[])(object = this.zzb)).length); ++i3) {
            Integer n4 = i3;
            object = object[i3];
            this.zzB(n4, (zzvq)object);
        }
    }

    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        ArrayList arrayList = this.zzd;
        zzvq[] zzvqArray = this.zzb;
        Collections.addAll(arrayList, zzvqArray);
    }

    public final void zzt(zzbu zzbu2) {
        this.zzb[0].zzt(zzbu2);
    }

    public final void zzz() {
        zzwe zzwe2 = this.zzi;
        if (zzwe2 == null) {
            super.zzz();
            return;
        }
        throw zzwe2;
    }
}

