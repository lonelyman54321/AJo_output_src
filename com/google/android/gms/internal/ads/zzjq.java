/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzadn;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyw;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzja;
import com.google.android.gms.internal.ads.zzjj;
import com.google.android.gms.internal.ads.zzjk;
import com.google.android.gms.internal.ads.zzjl;
import com.google.android.gms.internal.ads.zzjm;
import com.google.android.gms.internal.ads.zzjn;
import com.google.android.gms.internal.ads.zzjo;
import com.google.android.gms.internal.ads.zzk;
import com.google.android.gms.internal.ads.zzmr;
import com.google.android.gms.internal.ads.zzvb;
import com.google.android.gms.internal.ads.zzvn;

public final class zzjq {
    final Context zza;
    zzer zzb;
    zzfyw zzc;
    zzfyw zzd;
    zzfyw zze;
    zzfyw zzf;
    zzfyw zzg;
    zzfxu zzh;
    Looper zzi;
    zzk zzj;
    int zzk;
    boolean zzl;
    zzmr zzm;
    long zzn;
    long zzo;
    boolean zzp;
    boolean zzq;
    String zzr;
    zzja zzs;

    public zzjq(Context context, zzcgn zzcgn2) {
        int n3;
        Object object = context;
        Object object2 = zzcgn2;
        Object object3 = new zzjj(zzcgn2);
        object2 = new zzjk(context);
        zzjl zzjl2 = new zzjl(context);
        zzjm zzjm2 = new zzjm();
        zzjn zzjn2 = new zzjn(context);
        zzjo zzjo2 = new zzjo();
        context.getClass();
        this.zza = context;
        this.zzc = object3;
        this.zzd = object2;
        this.zze = zzjl2;
        this.zzf = zzjm2;
        this.zzg = zzjn2;
        this.zzh = zzjo2;
        object = zzgd.zzy();
        this.zzi = object;
        object = com.google.android.gms.internal.ads.zzk.zza;
        this.zzj = object;
        this.zzk = n3 = 1;
        this.zzl = n3;
        this.zzm = object3 = zzmr.zze;
        long l2 = zzgd.zzr(20);
        long l3 = zzgd.zzr(500L);
        object2 = object3;
        this.zzs = object3 = new zzja(0.97f, 1.03f, 1000L, 1.0E-7f, l2, l3, 0.999f, null);
        this.zzb = object3 = zzer.zza;
        this.zzn = 500L;
        this.zzo = 2000L;
        this.zzp = n3;
        this.zzr = "";
    }

    public static /* synthetic */ zzvn zza(Context context) {
        zzadn zzadn2 = new zzadn();
        zzvb zzvb2 = new zzvb(context, zzadn2);
        return zzvb2;
    }
}

