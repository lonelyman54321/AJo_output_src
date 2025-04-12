/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.view.accessibility.CaptioningManager
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.internal.ads.zzdj;
import com.google.android.gms.internal.ads.zzdl;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class zzdk {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private final zzgbc zzh;
    private final zzgbc zzi;
    private final int zzj;
    private final int zzk;
    private final zzgbc zzl;
    private final zzdj zzm;
    private zzgbc zzn;
    private int zzo;
    private final HashMap zzp;
    private final HashSet zzq;

    public zzdk() {
        zzgbc zzgbc2;
        int n3;
        this.zza = n3 = -1 >>> 1;
        this.zzb = n3;
        this.zzc = n3;
        this.zzd = n3;
        this.zze = n3;
        this.zzf = n3;
        this.zzg = true;
        this.zzh = zzgbc2 = zzgbc.zzm();
        this.zzi = zzgbc2 = zzgbc.zzm();
        this.zzj = n3;
        this.zzk = n3;
        Cloneable cloneable = zzgbc.zzm();
        this.zzl = cloneable;
        cloneable = zzdj.zza;
        this.zzm = cloneable;
        cloneable = zzgbc.zzm();
        this.zzn = cloneable;
        this.zzo = 0;
        this.zzp = cloneable = new Cloneable();
        this.zzq = cloneable;
    }

    public zzdk(zzdl object) {
        AbstractCollection abstractCollection;
        int n3;
        int n4;
        this.zza = n4 = -1 >>> 1;
        this.zzb = n4;
        this.zzc = n4;
        this.zzd = n4;
        this.zze = n3 = ((zzdl)object).zzl;
        this.zzf = n3 = ((zzdl)object).zzm;
        n3 = (int)(((zzdl)object).zzn ? 1 : 0);
        this.zzg = n3;
        this.zzh = abstractCollection = ((zzdl)object).zzo;
        this.zzi = abstractCollection = ((zzdl)object).zzq;
        this.zzj = n4;
        this.zzk = n4;
        HashMap hashMap = ((zzdl)object).zzu;
        this.zzl = hashMap;
        hashMap = ((zzdl)object).zzv;
        this.zzm = hashMap;
        hashMap = ((zzdl)object).zzw;
        this.zzn = hashMap;
        this.zzo = n4 = ((zzdl)object).zzx;
        hashMap = ((zzdl)object).zzE;
        super(hashMap);
        this.zzq = abstractCollection;
        object = ((zzdl)object).zzD;
        this.zzp = hashMap = new HashMap(object);
    }

    public static /* bridge */ /* synthetic */ int zza(zzdk zzdk2) {
        return zzdk2.zzo;
    }

    public static /* bridge */ /* synthetic */ int zzb(zzdk zzdk2) {
        return zzdk2.zzf;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzdk zzdk2) {
        return zzdk2.zze;
    }

    public static /* bridge */ /* synthetic */ zzdj zzd(zzdk zzdk2) {
        return zzdk2.zzm;
    }

    public static /* bridge */ /* synthetic */ zzgbc zzg(zzdk zzdk2) {
        return zzdk2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzgbc zzh(zzdk zzdk2) {
        return zzdk2.zzl;
    }

    public static /* bridge */ /* synthetic */ zzgbc zzi(zzdk zzdk2) {
        return zzdk2.zzn;
    }

    public static /* bridge */ /* synthetic */ zzgbc zzj(zzdk zzdk2) {
        return zzdk2.zzh;
    }

    public static /* bridge */ /* synthetic */ HashMap zzk(zzdk zzdk2) {
        return zzdk2.zzp;
    }

    public static /* bridge */ /* synthetic */ HashSet zzl(zzdk zzdk2) {
        return zzdk2.zzq;
    }

    public static /* bridge */ /* synthetic */ boolean zzm(zzdk zzdk2) {
        return zzdk2.zzg;
    }

    public final zzdk zze(Context object) {
        Object object2;
        int n3 = zzgd.zza;
        int n4 = 23;
        if ((n3 >= n4 || (object2 = Looper.myLooper()) != null) && (object = (CaptioningManager)object.getSystemService((String)(object2 = "captioning"))) != null && (n3 = (int)(object.isEnabled() ? 1 : 0)) != 0) {
            this.zzo = n3 = 1088;
            if ((object = object.getLocale()) != null) {
                this.zzn = object = zzgbc.zzn(((Locale)object).toLanguageTag());
            }
        }
        return this;
    }

    public final zzdk zzf(int n3, int n4, boolean bl2) {
        this.zze = n3;
        this.zzf = n4;
        this.zzg = true;
        return this;
    }
}

