/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcwj;
import com.google.android.gms.internal.ads.zzcww;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzery;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfiw;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzerz
implements zzexw {
    private static final Object zzb;
    final Context zza;
    private final String zzc;
    private final String zzd;
    private final long zze;
    private final zzcwj zzf;
    private final zzfiw zzg;
    private final zzfho zzh;
    private final zzg zzi;
    private final zzdux zzj;
    private final zzcww zzk;

    static {
        Object object;
        zzb = object = new Object();
    }

    public zzerz(Context object, String string2, String string3, zzcwj zzcwj2, zzfiw zzfiw2, zzfho zzfho2, zzdux zzdux2, zzcww zzcww2, long l2) {
        this.zza = object;
        this.zzc = string2;
        this.zzd = string3;
        this.zzf = zzcwj2;
        this.zzg = zzfiw2;
        this.zzh = zzfho2;
        object = zzu.zzo().zzi();
        this.zzi = object;
        this.zzj = zzdux2;
        this.zzk = zzcww2;
        this.zze = l2;
    }

    public final int zza() {
        return 12;
    }

    public final ListenableFuture zzb() {
        Bundle bundle = new Bundle();
        Object object = this.zzj.zzb();
        String string2 = this.zzc;
        object.put("seq_num", string2);
        object = zzbep.zzcd;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzj;
            long l2 = zzu.zzB().currentTimeMillis();
            long l3 = this.zze;
            String string3 = "tsacc";
            object2 = String.valueOf(l2 -= l3);
            ((zzdux)object).zzc(string3, (String)object2);
            object = this.zzj;
            zzu.zzp();
            object2 = this.zza;
            boolean bl3 = zzt.zzG((Context)object2);
            boolean bl4 = true;
            object2 = bl4 != bl3 ? "1" : "0";
            string2 = "foreground";
            ((zzdux)object).zzc(string2, (String)object2);
        }
        object = zzbep.zzfI;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzf;
            object2 = this.zzh.zzd;
            ((zzcwj)object).zzk((zzl)object2);
            object = this.zzg.zzb();
            bundle.putAll((Bundle)object);
        }
        object = new zzery(this, bundle);
        return zzgft.zzh(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzc(Bundle object, Bundle bundle) {
        int n3;
        Object object2 = zzbep.zzfI;
        Object object3 = zzba.zzc();
        object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
        int n4 = ((Boolean)object2).booleanValue();
        if (n4 != 0) {
            object2 = "quality_signals";
            bundle.putBundle((String)object2, (Bundle)object);
        } else {
            object = zzbep.zzfH;
            object2 = zzba.zzc();
            object = (Boolean)((zzben)object2).zza((zzbeg)object);
            n3 = ((Boolean)object).booleanValue();
            if (n3 != 0) {
                object = zzb;
                synchronized (object) {
                    object2 = this.zzf;
                    object3 = this.zzh;
                    object3 = ((zzfho)object3).zzd;
                    ((zzcwj)object2).zzk((zzl)object3);
                    object2 = "quality_signals";
                    object3 = this.zzg;
                    object3 = ((zzfiw)object3).zzb();
                    bundle.putBundle((String)object2, (Bundle)object3);
                }
            } else {
                object = this.zzf;
                object2 = this.zzh.zzd;
                ((zzcwj)object).zzk((zzl)object2);
                object = this.zzg;
                object2 = "quality_signals";
                object = ((zzfiw)object).zzb();
                bundle.putBundle((String)object2, (Bundle)object);
            }
        }
        object = this.zzc;
        object2 = "seq_num";
        bundle.putString((String)object2, (String)object);
        object = this.zzi;
        n3 = object.zzS();
        if (n3 == 0) {
            object = this.zzd;
            object2 = "session_id";
            bundle.putString((String)object2, (String)object);
        }
        n3 = this.zzi.zzS() ^ 1;
        bundle.putBoolean("client_purpose_one", n3 != 0);
        object = zzbep.zzfJ;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        n3 = ((Boolean)object).booleanValue();
        if (n3 != 0) {
            object = "_app_id";
            try {
                zzu.zzp();
                object2 = this.zza;
                object2 = zzt.zzp((Context)object2);
                bundle.putString((String)object, (String)object2);
            }
            catch (RemoteException remoteException) {
                object2 = "AppStatsSignal_AppId";
                object3 = zzu.zzo();
                ((zzcby)object3).zzw(remoteException, (String)object2);
            }
        }
        object = zzbep.zzfK;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        n3 = ((Boolean)object).booleanValue();
        if (n3 != 0 && (object = this.zzh.zzf) != null) {
            object = new Bundle();
            object2 = this.zzk;
            object3 = this.zzh.zzf;
            long l2 = ((zzcww)object2).zzb((String)object3);
            object.putLong("dload", l2);
            object2 = this.zzk;
            object3 = this.zzh.zzf;
            String string2 = "pcc";
            n4 = ((zzcww)object2).zza((String)object3);
            object.putInt(string2, n4);
            object2 = "ad_unit_quality_signals";
            bundle.putBundle((String)object2, (Bundle)object);
        }
        object = zzbep.zzjK;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        n3 = ((Boolean)object).booleanValue();
        if (n3 != 0 && (n3 = ((zzcby)(object = zzu.zzo())).zza()) > 0) {
            object = zzu.zzo();
            n3 = ((zzcby)object).zza();
            object2 = "nrwv";
            bundle.putInt((String)object2, n3);
        }
    }
}

