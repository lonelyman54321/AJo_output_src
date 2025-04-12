/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbmf;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccl;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcho;
import com.google.android.gms.internal.ads.zzchq;
import com.google.android.gms.internal.ads.zzciv;
import com.google.android.gms.internal.ads.zzcqd;
import com.google.android.gms.internal.ads.zzdqf;
import com.google.android.gms.internal.ads.zzdqg;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzdqi;
import com.google.android.gms.internal.ads.zzdqj;
import com.google.android.gms.internal.ads.zzdqk;
import com.google.android.gms.internal.ads.zzdql;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqp;
import com.google.android.gms.internal.ads.zzdqr;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzgez;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

public final class zzdqs {
    private final zzdqf zza;
    private final zza zzb;
    private final zzchq zzc;
    private final Context zzd;
    private final zzdvc zze;
    private final Executor zzf;
    private final zzaxd zzg;
    private final VersionInfoParcel zzh;
    private final zzbmf zzi;
    private final zzefz zzj;
    private final zzfoe zzk;
    private final zzegk zzl;
    private final zzfhs zzm;
    private ListenableFuture zzn;

    public zzdqs(zzdqp object) {
        Object object2;
        this.zzd = object2 = zzdqp.zza((zzdqp)object);
        object2 = zzdqp.zzk((zzdqp)object);
        this.zzf = object2;
        object2 = zzdqp.zzb((zzdqp)object);
        this.zzg = object2;
        object2 = zzdqp.zzd((zzdqp)object);
        this.zzh = object2;
        object2 = zzdqp.zzc((zzdqp)object);
        this.zzb = object2;
        this.zza = object2;
        object2 = zzdqp.zze((zzdqp)object);
        this.zzc = object2;
        super();
        this.zzi = object2;
        object2 = zzdqp.zzg((zzdqp)object);
        this.zzj = object2;
        object2 = zzdqp.zzj((zzdqp)object);
        this.zzk = object2;
        object2 = zzdqp.zzf((zzdqp)object);
        this.zze = object2;
        object2 = zzdqp.zzh((zzdqp)object);
        this.zzl = object2;
        this.zzm = object = zzdqp.zzi((zzdqp)object);
    }

    public static /* bridge */ /* synthetic */ zzdqf zzb(zzdqs zzdqs2) {
        return zzdqs2.zza;
    }

    public static /* bridge */ /* synthetic */ zzdvc zzc(zzdqs zzdqs2) {
        return zzdqs2.zze;
    }

    public static /* bridge */ /* synthetic */ zzefz zzd(zzdqs zzdqs2) {
        return zzdqs2.zzj;
    }

    public static /* bridge */ /* synthetic */ zzfoe zze(zzdqs zzdqs2) {
        return zzdqs2.zzk;
    }

    public final /* synthetic */ zzchd zza(zzchd zzchd2) {
        Object object;
        zzbmf zzbmf2 = this.zzi;
        zzchd2.zzag("/result", zzbmf2);
        zzciv zzciv2 = zzchd2.zzN();
        zzb zzb2 = object;
        zzbmf2 = this.zzd;
        object = new zzb((Context)zzbmf2, null, null);
        zzefz zzefz2 = this.zzj;
        zzfoe zzfoe2 = this.zzk;
        object = this.zze;
        zzdqf zzdqf2 = this.zza;
        zzciv2.zzR(null, zzdqf2, zzdqf2, zzdqf2, zzdqf2, false, null, zzb2, null, null, zzefz2, zzfoe2, (zzdvc)object, null, null, null, null, null, null);
        return zzchd2;
    }

    public final /* synthetic */ ListenableFuture zzf(String string2, JSONObject jSONObject, zzchd zzchd2) {
        return this.zzi.zzb(zzchd2, string2, jSONObject);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzg(String object, JSONObject jSONObject) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                ListenableFuture listenableFuture;
                try {
                    listenableFuture = this.zzn;
                    if (listenableFuture == null) {
                        object = null;
                        return zzgft.zzh(null);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    zzdqg zzdqg2 = new zzdqg(this, (String)object, jSONObject);
                    object = this.zzf;
                    return zzgft.zzn(listenableFuture, zzdqg2, (Executor)object);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(zzfgt object, zzfgw zzfgw2, zzcqd zzcqd2) {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzn;
            if (listenableFuture == null) {
                return;
            }
            zzdqm zzdqm2 = new zzdqm(this, (zzfgt)object, zzfgw2, zzcqd2);
            object = this.zzf;
            zzgft.zzr(listenableFuture, zzdqm2, (Executor)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi() {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzn;
            if (listenableFuture == null) {
                return;
            }
            zzdqi zzdqi2 = new zzdqi(this);
            Executor executor = this.zzf;
            zzgft.zzr(listenableFuture, zzdqi2, executor);
            listenableFuture = null;
            this.zzn = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(String object, Map object2) {
        synchronized (this) {
            object = this.zzn;
            if (object == null) {
                return;
            }
            String string2 = "sendMessageToNativeJs";
            zzdql zzdql2 = new zzdql(this, string2, (Map)object2);
            object2 = this.zzf;
            zzgft.zzr((ListenableFuture)object, zzdql2, (Executor)object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk() {
        synchronized (this) {
            Object object = zzbep.zzdL;
            Object object2 = zzba.zzc();
            Object object3 = object = ((zzben)object2).zza((zzbeg)object);
            object3 = (String)object;
            Object object4 = this.zzd;
            zzaxd zzaxd2 = this.zzg;
            VersionInfoParcel versionInfoParcel = this.zzh;
            zza zza2 = this.zzb;
            zzegk zzegk2 = this.zzl;
            zzfhs zzfhs2 = this.zzm;
            object2 = object;
            object = new zzcho((Context)object4, zzaxd2, versionInfoParcel, zza2, zzegk2, zzfhs2, (String)object3);
            object2 = zzcci.zze;
            object = zzgft.zzk((zzgez)object, (Executor)object2);
            object2 = new zzdqh(this);
            object4 = this.zzf;
            this.zzn = object = zzgft.zzm((ListenableFuture)object, (zzfxu)object2, (Executor)object4);
            object2 = "NativeJavascriptExecutor.initializeEngine";
            zzccl.zza((ListenableFuture)object, (String)object2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(String object, zzblp zzblp2) {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzn;
            if (listenableFuture == null) {
                return;
            }
            zzdqj zzdqj2 = new zzdqj(this, (String)object, zzblp2);
            object = this.zzf;
            zzgft.zzr(listenableFuture, zzdqj2, (Executor)object);
            return;
        }
    }

    public final void zzm(WeakReference weakReference, String string2, zzblp zzblp2) {
        zzdqr zzdqr2 = new zzdqr(this, weakReference, string2, zzblp2, null);
        this.zzl(string2, zzdqr2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(String object, zzblp zzblp2) {
        synchronized (this) {
            ListenableFuture listenableFuture = this.zzn;
            if (listenableFuture == null) {
                return;
            }
            zzdqk zzdqk2 = new zzdqk(this, (String)object, zzblp2);
            object = this.zzf;
            zzgft.zzr(listenableFuture, zzdqk2, (Executor)object);
            return;
        }
    }
}

