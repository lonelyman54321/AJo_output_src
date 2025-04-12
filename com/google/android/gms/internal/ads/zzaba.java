/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzaax;
import com.google.android.gms.internal.ads.zzaay;
import com.google.android.gms.internal.ads.zzaaz;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzack;
import com.google.android.gms.internal.ads.zzacl;
import com.google.android.gms.internal.ads.zzacm;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzao;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzjh;
import com.google.android.gms.internal.ads.zzt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

final class zzaba
implements zzacm,
zzaas {
    final /* synthetic */ zzabc zza;
    private final Context zzb;
    private final int zzc;
    private final ArrayList zzd;
    private zzds zze;
    private zzan zzf;
    private long zzg;
    private boolean zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private zzack zzl;
    private Executor zzm;

    public zzaba(zzabc object, Context context) {
        this.zza = object;
        this.zzb = context;
        int n3 = zzgd.zzL(context);
        int n4 = 1;
        if (n4 != n3) {
            n4 = 5;
        }
        this.zzc = n4;
        object = new ArrayList();
        this.zzd = object;
        this.zzi = -9223372036854775807L;
        this.zzl = object = zzack.zzb;
        this.zzm = object = zzabc.zze();
    }

    private final void zzm() {
        Object object = this.zzf;
        if (object == null) {
            return;
        }
        object = new ArrayList();
        ArrayList arrayList = this.zzd;
        ((ArrayList)object).addAll(arrayList);
        object = this.zzf;
        object.getClass();
        zzeq.zzb(null);
        int n3 = ((zzan)object).zzt;
        int n4 = ((zzan)object).zzs;
        zzt zzt2 = ((zzan)object).zzz;
        zzt2 = zzabc.zza(zzt2);
        zzao zzao2 = new zzao(zzt2, n4, n3);
        float f5 = ((zzan)object).zzw;
        zzao2.zza(f5);
        zzao2.zzb();
        throw null;
    }

    public final void zza(zzabc object) {
        object = this.zzl;
        Executor executor = this.zzm;
        zzaaz zzaaz2 = new zzaaz(this, (zzack)object);
        executor.execute(zzaaz2);
    }

    public final void zzb(zzabc object) {
        object = this.zzl;
        Executor executor = this.zzm;
        zzaay zzaay2 = new zzaay(this, (zzack)object);
        executor.execute(zzaay2);
    }

    public final void zzc(zzabc object, zzdv zzdv2) {
        object = this.zzl;
        Executor executor = this.zzm;
        zzaax zzaax2 = new zzaax(this, (zzack)object, zzdv2);
        executor.execute(zzaax2);
    }

    public final long zzd(long l2, boolean bl2) {
        boolean bl3 = false;
        zzeq.zzf(false);
        l2 = this.zzk;
        long l3 = -9223372036854775807L;
        bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (bl2) {
            zzabc zzabc2 = this.zza;
            bl3 = zzabc.zzt(zzabc2, l2);
            if (!bl3) {
                return l3;
            }
            this.zzm();
            this.zzk = l3;
        }
        zzeq.zzb(null);
        throw null;
    }

    public final void zze() {
        this.zzj = false;
        this.zzi = -9223372036854775807L;
        zzabc.zzg(this.zza);
    }

    public final void zzf(zzan object, zzer zzer2) {
        this.zze = object = zzabc.zzb(this.zza, (zzan)object, zzer2);
    }

    public final void zzg(int n3, zzan zzan2) {
        long l2;
        n3 = 0;
        zzeq.zzf(false);
        this.zzf = zzan2;
        Object object = this.zzj;
        long l3 = -9223372036854775807L;
        boolean bl2 = true;
        if (!object) {
            this.zzm();
            this.zzj = bl2;
            this.zzk = l3;
            return;
        }
        long l4 = this.zzi;
        long l7 = l4 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object) {
            n3 = 1;
        }
        zzeq.zzf(n3 != 0);
        this.zzk = l2 = this.zzi;
    }

    public final void zzh(long l2, long l3) {
        zzabc zzabc2 = null;
        zzeq.zzf(false);
        try {
            zzabc2 = this.zza;
        }
        catch (zzjh zzjh2) {
            Object object = this.zzf;
            if (object == null) {
                object = new zzal();
                object = ((zzal)object).zzad();
            }
            zzacl zzacl2 = new zzacl(zzjh2, (zzan)object);
            throw zzacl2;
        }
        zzabc2.zzo(l2, l3);
    }

    public final void zzi(zzack zzack2, Executor executor) {
        this.zzl = zzack2;
        this.zzm = executor;
    }

    public final void zzj(long l2) {
        long l3 = this.zzg;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        boolean bl2 = object != false;
        this.zzh = bl2;
        this.zzg = l2;
    }

    public final void zzk(List list) {
        this.zzd.clear();
        this.zzd.addAll(list);
        this.zzm();
    }

    public final boolean zzl() {
        return zzgd.zzL(this.zzb);
    }
}

