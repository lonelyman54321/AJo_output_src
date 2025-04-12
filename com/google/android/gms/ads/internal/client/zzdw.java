/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class zzdw {
    private final HashSet zza;
    private final Bundle zzb;
    private final HashMap zzc;
    private final HashSet zzd;
    private final Bundle zze;
    private final HashSet zzf;
    private String zzg;
    private final List zzh;
    private String zzi;
    private String zzj;
    private int zzk;
    private boolean zzl;
    private String zzm;
    private int zzn;

    public zzdw() {
        Object object;
        this.zza = object = new HashSet();
        this.zzb = object = new Bundle();
        this.zzc = object;
        super();
        this.zzd = object;
        this.zze = object = new Bundle();
        super();
        this.zzf = object;
        super();
        this.zzh = object;
        this.zzk = -1;
        this.zzn = 60000;
    }

    public static /* bridge */ /* synthetic */ boolean zzD(zzdw zzdw2) {
        return zzdw2.zzl;
    }

    public static /* bridge */ /* synthetic */ int zza(zzdw zzdw2) {
        return zzdw2.zzn;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzdw zzdw2) {
        return zzdw2.zzk;
    }

    public static /* bridge */ /* synthetic */ Bundle zzc(zzdw zzdw2) {
        return zzdw2.zze;
    }

    public static /* bridge */ /* synthetic */ Bundle zzd(zzdw zzdw2) {
        return zzdw2.zzb;
    }

    public static /* bridge */ /* synthetic */ String zze(zzdw zzdw2) {
        return zzdw2.zzm;
    }

    public static /* bridge */ /* synthetic */ String zzf(zzdw zzdw2) {
        return zzdw2.zzg;
    }

    public static /* bridge */ /* synthetic */ String zzg(zzdw zzdw2) {
        return zzdw2.zzi;
    }

    public static /* bridge */ /* synthetic */ String zzh(zzdw zzdw2) {
        return zzdw2.zzj;
    }

    public static /* bridge */ /* synthetic */ HashMap zzi(zzdw zzdw2) {
        return zzdw2.zzc;
    }

    public static /* bridge */ /* synthetic */ HashSet zzj(zzdw zzdw2) {
        return zzdw2.zzf;
    }

    public static /* bridge */ /* synthetic */ HashSet zzk(zzdw zzdw2) {
        return zzdw2.zza;
    }

    public static /* bridge */ /* synthetic */ HashSet zzl(zzdw zzdw2) {
        return zzdw2.zzd;
    }

    public static /* bridge */ /* synthetic */ List zzm(zzdw zzdw2) {
        return zzdw2.zzh;
    }

    public final void zzA(String string2) {
        this.zzi = string2;
    }

    public final void zzB(String string2) {
        this.zzj = string2;
    }

    public final void zzC(boolean bl2) {
        this.zzk = (int)(bl2 ? 1 : 0);
    }

    public final void zzn(String string2) {
        this.zzf.add(string2);
    }

    public final void zzo(Class object, Bundle bundle) {
        Bundle bundle2 = this.zzb;
        String string2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        if ((bundle2 = bundle2.getBundle(string2)) == null) {
            bundle2 = this.zzb;
            Bundle bundle3 = new Bundle();
            bundle2.putBundle(string2, bundle3);
        }
        bundle2 = this.zzb.getBundle(string2);
        Preconditions.checkNotNull(bundle2);
        object = ((Class)object).getName();
        bundle2.putBundle((String)object, bundle);
    }

    public final void zzp(String string2, String string3) {
        this.zze.putString(string2, string3);
    }

    public final void zzq(String string2) {
        this.zza.add(string2);
    }

    public final void zzr(Class object, Bundle bundle) {
        Bundle bundle2 = this.zzb;
        object = ((Class)object).getName();
        bundle2.putBundle((String)object, bundle);
    }

    public final void zzs(NetworkExtras networkExtras) {
        HashMap hashMap = this.zzc;
        Class<?> clazz = networkExtras.getClass();
        hashMap.put(clazz, networkExtras);
    }

    public final void zzt(String string2) {
        this.zzd.add(string2);
    }

    public final void zzu(String string2) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void zzv(String string2) {
        this.zzm = string2;
    }

    public final void zzw(String string2) {
        this.zzg = string2;
    }

    public final void zzx(int n3) {
        this.zzn = n3;
    }

    public final void zzy(boolean bl2) {
        this.zzl = bl2;
    }

    public final void zzz(List object) {
        boolean bl2;
        Object object2 = this.zzh;
        object2.clear();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
            if (bl3) {
                object2 = "neighboring content URL should not be null or empty";
                com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object2);
                continue;
            }
            List list = this.zzh;
            list.add(object2);
        }
    }
}

