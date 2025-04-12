/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzie;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzuo;
import com.google.android.gms.internal.ads.zzut;
import com.google.android.gms.internal.ads.zzuu;
import com.google.android.gms.internal.ads.zzuv;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzvp;
import com.google.android.gms.internal.ads.zzvq;
import com.google.android.gms.internal.ads.zzvy;
import java.util.HashMap;
import java.util.Iterator;

public abstract class zzuw
extends zzuo {
    private final HashMap zza;
    private Handler zzb;
    private zzie zzc;

    public zzuw() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public abstract void zzA(Object var1, zzvq var2, zzdc var3);

    public final void zzB(Object object, zzvq zzvq2) {
        boolean bl2 = this.zza.containsKey(object) ^ true;
        zzeq.zzd(bl2);
        zzut zzut2 = new zzut(this, object);
        Object object2 = new zzuu(this, object);
        zzuv zzuv2 = new zzuv(zzvq2, zzut2, (zzuu)object2);
        HashMap hashMap = this.zza;
        hashMap.put(object, zzuv2);
        object = this.zzb;
        object.getClass();
        zzvq2.zzh((Handler)object, (zzvy)object2);
        object = this.zzb;
        object.getClass();
        zzvq2.zzg((Handler)object, (zzsp)object2);
        object = this.zzc;
        object2 = this.zzb();
        zzvq2.zzm(zzut2, (zzie)object, (zzpj)object2);
        boolean bl3 = this.zzu();
        if (!bl3) {
            zzvq2.zzi(zzut2);
        }
    }

    public final void zzj() {
        boolean bl2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (zzuv)iterator.next();
            zzvq zzvq2 = ((zzuv)object).zza;
            object = ((zzuv)object).zzb;
            zzvq2.zzi((zzvp)object);
        }
    }

    public final void zzl() {
        boolean bl2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (zzuv)iterator.next();
            zzvq zzvq2 = ((zzuv)object).zza;
            object = ((zzuv)object).zzb;
            zzvq2.zzk((zzvp)object);
        }
    }

    public void zzn(zzie zzie2) {
        this.zzc = zzie2;
        zzie2 = zzgd.zzx(null);
        this.zzb = zzie2;
    }

    public void zzq() {
        boolean bl2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (zzuv)iterator.next();
            zzvq zzvq2 = ((zzuv)object).zza;
            Object object2 = ((zzuv)object).zzb;
            zzvq2.zzp((zzvp)object2);
            zzvq2 = ((zzuv)object).zza;
            object2 = ((zzuv)object).zzc;
            zzvq2.zzs((zzvy)object2);
            zzvq2 = ((zzuv)object).zza;
            object = ((zzuv)object).zzc;
            zzvq2.zzr((zzsp)object);
        }
        this.zza.clear();
    }

    public int zzw(Object object, int n3) {
        return 0;
    }

    public long zzx(Object object, long l2, zzvo zzvo2) {
        return l2;
    }

    public zzvo zzy(Object object, zzvo zzvo2) {
        throw null;
    }

    public void zzz() {
        boolean bl2;
        Iterator iterator = this.zza.values().iterator();
        while (bl2 = iterator.hasNext()) {
            zzvq zzvq2 = ((zzuv)iterator.next()).zza;
            zzvq2.zzz();
        }
    }
}

