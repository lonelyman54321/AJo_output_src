/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$OnSharedPreferenceChangeListener
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.android.gms.internal.ads.zzdvj;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class zzdvk {
    protected final String zza;
    protected final Map zzb;
    protected final Context zzc;
    protected final Executor zzd;
    protected final zzr zze;
    protected final boolean zzf;
    private final CsiUrlBuilder zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final AtomicBoolean zzj;
    private final AtomicReference zzk;

    public zzdvk(Executor object, zzr zzr2, CsiUrlBuilder csiUrlBuilder, Context context) {
        boolean bl2;
        Serializable serializable = (String)zzbge.zzb.zze();
        this.zza = serializable;
        this.zzb = serializable = new Serializable();
        this.zzj = serializable;
        Bundle bundle = new Bundle();
        super(bundle);
        this.zzk = serializable;
        this.zzd = object;
        this.zze = zzr2;
        object = zzbep.zzbY;
        this.zzf = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzg = csiUrlBuilder;
        object = zzbep.zzcb;
        this.zzh = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        object = zzbep.zzhk;
        this.zzi = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzc = context;
    }

    private final void zza(Map object, boolean bl2) {
        boolean bl3 = object.isEmpty();
        if (!bl3) {
            Object object2;
            boolean bl4;
            Object object3;
            bl3 = object.isEmpty();
            if (bl3) {
                object3 = "Empty or null paramMap.";
                zzm.zze((String)object3);
            } else {
                boolean bl5;
                Object object4;
                object3 = this.zzj;
                bl4 = true;
                bl3 = ((AtomicBoolean)object3).getAndSet(bl4);
                if (!bl3) {
                    object3 = zzbep.zzkz;
                    object3 = (String)zzba.zzc().zza((zzbeg)object3);
                    object2 = this.zzc;
                    object4 = new zzdvj(this, (String)object3);
                    object3 = zzad.zza((Context)object2, (String)object3, (SharedPreferences.OnSharedPreferenceChangeListener)object4);
                    object2 = this.zzk;
                    ((AtomicReference)object2).set(object3);
                }
                object3 = (Bundle)this.zzk.get();
                object2 = object3.keySet().iterator();
                while (bl5 = object2.hasNext()) {
                    object4 = (String)object2.next();
                    String string2 = String.valueOf(object3.get((String)object4));
                    object.put(object4, string2);
                }
            }
            object3 = this.zzg.generateUrl((Map)object);
            com.google.android.gms.ads.internal.util.zze.zza((String)object3);
            object2 = "scar";
            object = (String)object.get(object2);
            boolean bl6 = Boolean.parseBoolean((String)object);
            bl4 = this.zzf;
            if (!(!bl4 || bl2 && !(bl2 = this.zzh) || bl6 && !(bl6 = this.zzi))) {
                object = this.zzd;
                zzdvi zzdvi2 = new zzdvi(this, (String)object3);
                object.execute(zzdvi2);
            }
            return;
        }
        zzm.zze("Empty paramMap.");
    }

    public final String zzb(Map map2) {
        return this.zzg.generateUrl(map2);
    }

    public final ConcurrentHashMap zzc() {
        Map map2 = this.zzb;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map2);
        return concurrentHashMap;
    }

    public final /* synthetic */ void zzd(String string2, SharedPreferences sharedPreferences2, String object) {
        sharedPreferences2 = this.zzc;
        object = this.zzk;
        string2 = zzad.zzb((Context)sharedPreferences2, string2);
        ((AtomicReference)object).set(string2);
    }

    public final void zze(Map map2) {
        this.zza(map2, true);
    }

    public final void zzf(Map map2) {
        this.zza(map2, false);
    }
}

