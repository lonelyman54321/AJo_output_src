/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdw;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class zzdx {
    private final String zza;
    private final List zzb;
    private final Set zzc;
    private final Bundle zzd;
    private final Map zze;
    private final String zzf;
    private final String zzg;
    private final SearchAdRequest zzh;
    private final int zzi;
    private final Set zzj;
    private final Bundle zzk;
    private final Set zzl;
    private final boolean zzm;
    private final String zzn;
    private final int zzo;
    private final long zzp;

    public zzdx(zzdw zzdw2, SearchAdRequest object) {
        int n3;
        int n4;
        long l2;
        this.zzp = l2 = System.currentTimeMillis();
        Object object2 = zzdw.zzf(zzdw2);
        this.zza = object2;
        object2 = zzdw.zzm(zzdw2);
        this.zzb = object2;
        this.zzc = object2 = Collections.unmodifiableSet(zzdw.zzk(zzdw2));
        this.zzd = object2 = zzdw.zzd(zzdw2);
        object2 = Collections.unmodifiableMap(zzdw.zzi(zzdw2));
        this.zze = object2;
        object2 = zzdw.zzg(zzdw2);
        this.zzf = object2;
        object2 = zzdw.zzh(zzdw2);
        this.zzg = object2;
        this.zzh = object;
        this.zzi = n4 = zzdw.zzb(zzdw2);
        this.zzj = object = Collections.unmodifiableSet(zzdw.zzl(zzdw2));
        object = zzdw.zzc(zzdw2);
        this.zzk = object;
        object = Collections.unmodifiableSet(zzdw.zzj(zzdw2));
        this.zzl = object;
        n4 = (int)(zzdw.zzD(zzdw2) ? 1 : 0);
        this.zzm = n4;
        this.zzn = object = zzdw.zze(zzdw2);
        this.zzo = n3 = zzdw.zza(zzdw2);
    }

    public final int zza() {
        return this.zzo;
    }

    public final int zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzp;
    }

    public final Bundle zzd(Class object) {
        Bundle bundle = this.zzd;
        String string2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        if ((bundle = bundle.getBundle(string2)) != null) {
            object = ((Class)object).getName();
            return bundle.getBundle((String)object);
        }
        return null;
    }

    public final Bundle zze() {
        return this.zzk;
    }

    public final Bundle zzf(Class object) {
        Bundle bundle = this.zzd;
        object = ((Class)object).getName();
        return bundle.getBundle((String)object);
    }

    public final Bundle zzg() {
        return this.zzd;
    }

    public final NetworkExtras zzh(Class clazz) {
        return (NetworkExtras)this.zze.get(clazz);
    }

    public final SearchAdRequest zzi() {
        return this.zzh;
    }

    public final String zzj() {
        return this.zzn;
    }

    public final String zzk() {
        return this.zza;
    }

    public final String zzl() {
        return this.zzf;
    }

    public final String zzm() {
        return this.zzg;
    }

    public final List zzn() {
        List list = this.zzb;
        ArrayList arrayList = new ArrayList(list);
        return arrayList;
    }

    public final Set zzo() {
        return this.zzl;
    }

    public final Set zzp() {
        return this.zzc;
    }

    public final boolean zzq() {
        return this.zzm;
    }

    public final boolean zzr(Context object) {
        boolean bl2;
        Object object2 = zzej.zzf().zzc();
        zzay.zzb();
        Set set = this.zzj;
        object = com.google.android.gms.ads.internal.util.client.zzf.zzz(object);
        boolean bl3 = set.contains(object);
        return bl3 || (bl2 = (object2 = ((RequestConfiguration)object2).getTestDeviceIds()).contains(object));
        {
        }
    }
}

