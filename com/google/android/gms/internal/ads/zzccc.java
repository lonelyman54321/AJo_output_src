/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbbg;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzcca;
import com.google.android.gms.internal.ads.zzccb;
import com.google.android.gms.internal.ads.zzfiw;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class zzccc
implements zzbbg {
    final zzcbz zza;
    final HashSet zzb;
    final HashSet zzc;
    private final Object zzd;
    private final zzg zze;
    private final zzcca zzf;
    private boolean zzg;

    public zzccc(String object, zzg zzg2) {
        Object object2;
        this.zzd = object2 = new Object();
        object2 = new HashSet();
        this.zzb = object2;
        object2 = new HashSet();
        this.zzc = object2;
        this.zzg = false;
        this.zza = object2 = new zzcbz((String)object, zzg2);
        this.zze = zzg2;
        this.zzf = object = new zzcca();
    }

    public final void zza(boolean object) {
        Object object2 = zzu.zzB();
        long l2 = object2.currentTimeMillis();
        if (object != 0) {
            long l3 = this.zze.zzd();
            l2 -= l3;
            Object object3 = zzbep.zzaU;
            zzben zzben2 = zzba.zzc();
            object3 = (Long)zzben2.zza((zzbeg)object3);
            l3 = (Long)object3;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object > 0) {
                int n3;
                object3 = this.zza;
                ((zzcbz)object3).zzd = n3 = -1;
            } else {
                int n4;
                object3 = this.zza;
                object2 = this.zze;
                ((zzcbz)object3).zzd = n4 = object2.zzc();
            }
            this.zzg = true;
            return;
        }
        this.zze.zzu(l2);
        zzg zzg2 = this.zze;
        int n7 = this.zza.zzd;
        zzg2.zzL(n7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int zzb() {
        Object object = this.zzd;
        synchronized (object) {
            zzcbz zzcbz2 = this.zza;
            return zzcbz2.zza();
        }
    }

    public final zzcbr zzc(Clock clock, String string2) {
        Object object = this.zzf;
        object = ((zzcca)object).zza();
        zzcbr zzcbr2 = new zzcbr(clock, this, (String)object, string2);
        return zzcbr2;
    }

    public final String zzd() {
        return this.zzf.zzb();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(zzcbr zzcbr2) {
        Object object = this.zzd;
        synchronized (object) {
            HashSet hashSet = this.zzb;
            hashSet.add(zzcbr2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf() {
        Object object = this.zzd;
        synchronized (object) {
            zzcbz zzcbz2 = this.zza;
            zzcbz2.zzc();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        Object object = this.zzd;
        synchronized (object) {
            zzcbz zzcbz2 = this.zza;
            zzcbz2.zzd();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh() {
        Object object = this.zzd;
        synchronized (object) {
            zzcbz zzcbz2 = this.zza;
            zzcbz2.zze();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi() {
        Object object = this.zzd;
        synchronized (object) {
            zzcbz zzcbz2 = this.zza;
            zzcbz2.zzf();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(zzl zzl2, long l2) {
        Object object = this.zzd;
        synchronized (object) {
            zzcbz zzcbz2 = this.zza;
            zzcbz2.zzg(zzl2, l2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk() {
        Object object = this.zzd;
        synchronized (object) {
            zzcbz zzcbz2 = this.zza;
            zzcbz2.zzh();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(HashSet hashSet) {
        Object object = this.zzd;
        synchronized (object) {
            HashSet hashSet2 = this.zzb;
            hashSet2.addAll(hashSet);
            return;
        }
    }

    public final boolean zzm() {
        return this.zzg;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle zzn(Context object, zzfiw zzfiw2) {
        Iterator iterator;
        HashSet hashSet = new HashSet();
        Object object2 = this.zzd;
        synchronized (object2) {
            iterator = this.zzb;
            hashSet.addAll(iterator);
            iterator = this.zzb;
            ((HashSet)((Object)iterator)).clear();
        }
        object2 = new Bundle();
        iterator = this.zza;
        String string2 = this.zzf.zzb();
        object = ((zzcbz)((Object)iterator)).zzb((Context)object, string2);
        object2.putBundle("app", (Bundle)object);
        object = new Bundle();
        iterator = this.zzc.iterator();
        boolean bl2 = iterator.hasNext();
        if (bl2) {
            object = (zzccb)iterator.next();
            throw null;
        }
        object2.putBundle("slots", (Bundle)object);
        object = new ArrayList();
        iterator = hashSet.iterator();
        while (true) {
            if (!(bl2 = iterator.hasNext())) {
                object2.putParcelableArrayList("ads", (ArrayList)object);
                zzfiw2.zzc(hashSet);
                return object2;
            }
            string2 = ((zzcbr)iterator.next()).zza();
            ((ArrayList)object).add(string2);
        }
    }
}

