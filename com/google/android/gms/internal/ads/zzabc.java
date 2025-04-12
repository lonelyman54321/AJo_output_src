/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.Surface
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.ads.zzaao;
import com.google.android.gms.internal.ads.zzaap;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzaas;
import com.google.android.gms.internal.ads.zzaba;
import com.google.android.gms.internal.ads.zzabb;
import com.google.android.gms.internal.ads.zzabn;
import com.google.android.gms.internal.ads.zzabq;
import com.google.android.gms.internal.ads.zzabv;
import com.google.android.gms.internal.ads.zzabw;
import com.google.android.gms.internal.ads.zzacl;
import com.google.android.gms.internal.ads.zzacm;
import com.google.android.gms.internal.ads.zzacn;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcu;
import com.google.android.gms.internal.ads.zzcv;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzds;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzdv;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzer;
import com.google.android.gms.internal.ads.zzfb;
import com.google.android.gms.internal.ads.zzfv;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzw;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

public final class zzabc
implements zzacn,
zzdt,
zzabv {
    private static final Executor zza;
    private final Context zzb;
    private final zzaba zzc;
    private final zzcu zzd;
    private final CopyOnWriteArraySet zze;
    private zzer zzf;
    private zzabq zzg;
    private zzabw zzh;
    private zzan zzi;
    private zzabn zzj;
    private zzfb zzk;
    private zzcv zzl;
    private Pair zzm;
    private int zzn;
    private int zzo;
    private float zzp;

    static {
        zzaao zzaao2 = new zzaao();
        zza = zzaao2;
    }

    public /* synthetic */ zzabc(zzaar copyOnWriteArraySet, zzabb zzabb2) {
        zzaba zzaba2;
        zzabb2 = zzaar.zza((zzaar)((Object)copyOnWriteArraySet));
        this.zzb = zzabb2;
        this.zzc = zzaba2 = new zzaba(this, (Context)zzabb2);
        copyOnWriteArraySet = zzaar.zzb((zzaar)((Object)copyOnWriteArraySet));
        zzeq.zzb(copyOnWriteArraySet);
        this.zzd = copyOnWriteArraySet;
        this.zze = copyOnWriteArraySet = new CopyOnWriteArraySet<zzaba>();
        this.zzo = 0;
        this.zzp = 1.0f;
        copyOnWriteArraySet.add(zzaba2);
    }

    public static /* bridge */ /* synthetic */ zzt zza(zzt zzt2) {
        return zzabc.zzu(zzt2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ zzds zzb(zzabc object, zzan zzan2, zzer object2) {
        Object object3;
        int n3 = ((zzabc)object).zzo;
        boolean bl2 = true;
        int n4 = 0;
        zzcu zzcu2 = null;
        if (n3 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object3 = null;
        }
        zzeq.zzf(n3 != 0);
        object3 = ((zzabc)object).zzh;
        if (object3 == null || (object3 = ((zzabc)object).zzg) == null) {
            bl2 = false;
        }
        zzeq.zzf(bl2);
        ((zzabc)object).zzf = object2;
        object3 = Looper.myLooper();
        zzeq.zzb(object3);
        bl2 = false;
        ((zzabc)object).zzk = object2 = object2.zzb((Looper)object3, null);
        object2 = zzabc.zzu(zzan2.zzz);
        n3 = ((zzt)object2).zzf;
        n4 = 7;
        if (n3 == n4 && (n3 = zzgd.zza) < (n4 = 34)) {
            object2 = ((zzt)object2).zzc();
            n3 = 6;
            ((zzr)object2).zzd(n3);
            object2 = ((zzr)object2).zzg();
        }
        Object object4 = object2;
        try {
            zzcu2 = ((zzabc)object).zzd;
            Context context = ((zzabc)object).zzb;
            zzw zzw2 = zzw.zza;
            object2 = ((zzabc)object).zzk;
            Objects.requireNonNull(object2);
            zzaap zzaap2 = new zzaap((zzfb)object2);
            zzgbc zzgbc2 = zzgbc.zzm();
            long l2 = 0L;
            ((zzabc)object).zzl = object2 = zzcu2.zza(context, (zzt)object4, zzw2, (zzdt)object, zzaap2, zzgbc2, l2);
            object = ((zzabc)object).zzm;
            if (object == null) throw null;
            object2 = ((Pair)object).first;
            object2 = (Surface)object2;
            object = ((Pair)object).second;
            object = (zzfv)object;
            ((zzfv)object).zzb();
            ((zzfv)object).zza();
            throw null;
        }
        catch (zzdq zzdq2) {}
        object2 = new zzacl(zzdq2, zzan2);
        throw object2;
    }

    public static /* bridge */ /* synthetic */ Executor zze() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzabc object) {
        int n3;
        ((zzabc)object).zzn = n3 = ((zzabc)object).zzn + -1;
        if (n3 > 0) {
            return;
        }
        if (n3 >= 0) {
            object = ((zzabc)object).zzh;
            zzeq.zzb(object);
            ((zzabw)object).zza();
            return;
        }
        String string2 = String.valueOf(n3);
        object = new IllegalStateException(string2);
        throw object;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzabc zzabc2) {
        int n3 = zzabc2.zzv();
        if (n3 == 0) {
            return;
        }
        zzabc2.zzn = n3 = zzabc2.zzn + 1;
        Object object = zzabc2.zzh;
        zzeq.zzb(object);
        ((zzabw)object).zza();
        object = zzabc2.zzk;
        zzeq.zzb(object);
        zzaaq zzaaq2 = new zzaaq(zzabc2);
        object.zzh(zzaaq2);
    }

    public static /* bridge */ /* synthetic */ void zzh(zzabc object, long l2, long l3) {
        object = ((zzabc)object).zzh;
        zzeq.zzb(object);
        ((zzabw)object).zzb(l2, l3);
    }

    public static /* bridge */ /* synthetic */ void zzi(zzabc object, float f5) {
        ((zzabc)object).zzp = f5;
        object = ((zzabc)object).zzh;
        if (object != null) {
            ((zzabw)object).zzd(f5);
        }
    }

    public static /* synthetic */ void zzj(zzabc zzabc2, zzabn zzabn2) {
        zzabc2.zzj = zzabn2;
    }

    public static /* bridge */ /* synthetic */ boolean zzt(zzabc object, long l2) {
        int n3 = ((zzabc)object).zzn;
        if (n3 == 0) {
            object = ((zzabc)object).zzh;
            zzeq.zzb(object);
            boolean bl2 = ((zzabw)object).zze(l2);
            if (bl2) {
                return true;
            }
        }
        return false;
    }

    private static zzt zzu(zzt zzt2) {
        boolean bl2;
        if (zzt2 != null && (bl2 = zzt2.zzf())) {
            return zzt2;
        }
        return zzt.zza;
    }

    private final boolean zzv() {
        int n3 = this.zzo;
        int n4 = 1;
        if (n3 == n4) {
            return n4 != 0;
        }
        return false;
    }

    public final zzabq zzc() {
        return this.zzg;
    }

    public final zzacm zzd() {
        return this.zzc;
    }

    public final void zzk() {
        zzfv zzfv2 = zzfv.zza;
        zzfv2.zzb();
        zzfv2.zza();
        this.zzm = null;
    }

    public final void zzl() {
        boolean bl2;
        Iterator iterator = this.zze.iterator();
        while (bl2 = iterator.hasNext()) {
            zzaas zzaas2 = (zzaas)iterator.next();
            zzaas2.zzb(this);
        }
        zzeq.zzb(null);
        throw null;
    }

    public final void zzm(zzdv zzdv2) {
        Iterator iterator = new Iterator();
        int n3 = zzdv2.zzc;
        ((zzal)((Object)iterator)).zzac(n3);
        n3 = zzdv2.zzd;
        ((zzal)((Object)iterator)).zzI(n3);
        Object object = "video/raw";
        ((zzal)((Object)iterator)).zzX((String)object);
        iterator = ((zzal)((Object)iterator)).zzad();
        this.zzi = iterator;
        iterator = this.zze.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object = (zzaas)iterator.next();
            object.zzc(this, zzdv2);
        }
    }

    public final void zzn() {
        int n3 = this.zzo;
        int n4 = 2;
        if (n3 == n4) {
            return;
        }
        zzfb zzfb2 = this.zzk;
        if (zzfb2 != null) {
            zzfb2.zze(null);
        }
        this.zzm = null;
        this.zzo = n4;
    }

    public final void zzo(long l2, long l3) {
        int n3 = this.zzn;
        if (n3 == 0) {
            zzabw zzabw2 = this.zzh;
            zzeq.zzb(zzabw2);
            zzabw2.zzc(l2, l3);
        }
    }

    public final void zzp(long l2, long l3, long l4, boolean bl2) {
        Object object;
        if (bl2 && (object = this.zzm) != null) {
            boolean bl3;
            object = this.zze.iterator();
            while (bl3 = object.hasNext()) {
                zzaas zzaas2 = (zzaas)object.next();
                zzaas2.zza(this);
            }
        }
        if ((object = this.zzj) != null) {
            object = this.zzi;
            if (object == null) {
                object = new zzal();
                object = ((zzal)object).zzad();
            }
            Object object2 = object;
            zzabn zzabn2 = this.zzj;
            long l7 = l3 - l4;
            object = this.zzf;
            zzeq.zzb(object);
            long l8 = System.nanoTime();
            zzabn2.zza(l7, l8, (zzan)object2, null);
        }
        zzeq.zzb(null);
        throw null;
    }

    public final void zzq(Surface surface, zzfv zzfv2) {
        boolean bl2;
        Object object = this.zzm;
        if (object != null && (bl2 = (object = (Surface)((Pair)object).first).equals(surface)) && (bl2 = ((zzfv)(object = (zzfv)this.zzm.second)).equals(zzfv2))) {
            return;
        }
        surface = Pair.create((Object)surface, (Object)zzfv2);
        this.zzm = surface;
        zzfv2.zzb();
        zzfv2.zza();
    }

    public final void zzr(List list) {
        this.zzc.zzk(list);
    }

    public final void zzs(zzabq zzabq2) {
        zzabw zzabw2;
        zzeq.zzf(this.zzv() ^ true);
        this.zzg = zzabq2;
        this.zzh = zzabw2 = new zzabw(this, zzabq2);
        float f5 = this.zzp;
        zzabw2.zzd(f5);
    }
}

