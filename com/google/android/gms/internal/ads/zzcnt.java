/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzda;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzau;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbnu;
import com.google.android.gms.internal.ads.zzbqy;
import com.google.android.gms.internal.ads.zzbqz;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbys;
import com.google.android.gms.internal.ads.zzcau;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcno;
import com.google.android.gms.internal.ads.zzcnp;
import com.google.android.gms.internal.ads.zzcnq;
import com.google.android.gms.internal.ads.zzcnr;
import com.google.android.gms.internal.ads.zzcxd;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzdsy;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzehn;
import com.google.android.gms.internal.ads.zzeho;
import com.google.android.gms.internal.ads.zzeji;
import com.google.android.gms.internal.ads.zzeny;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfik;
import com.google.android.gms.internal.ads.zzfim;
import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzfvh;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class zzcnt
extends zzcn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdst zzc;
    private final zzehn zzd;
    private final zzeny zze;
    private final zzdxf zzf;
    private final zzcau zzg;
    private final zzdsy zzh;
    private final zzdya zzi;
    private final zzbhd zzj;
    private final zzfmq zzk;
    private final zzfik zzl;
    private final zzcxd zzm;
    private final zzdvc zzn;
    private boolean zzo;
    private final Long zzp;

    public zzcnt(Context object, VersionInfoParcel versionInfoParcel, zzdst zzdst2, zzehn zzehn2, zzeny zzeny2, zzdxf zzdxf2, zzcau zzcau2, zzdsy zzdsy2, zzdya zzdya2, zzbhd zzbhd2, zzfmq zzfmq2, zzfik zzfik2, zzcxd zzcxd2, zzdvc zzdvc2) {
        this.zza = object;
        this.zzb = versionInfoParcel;
        this.zzc = zzdst2;
        this.zzd = zzehn2;
        this.zze = zzeny2;
        this.zzf = zzdxf2;
        this.zzg = zzcau2;
        this.zzh = zzdsy2;
        this.zzi = zzdya2;
        this.zzj = zzbhd2;
        this.zzk = zzfmq2;
        this.zzl = zzfik2;
        this.zzm = zzcxd2;
        this.zzn = zzdvc2;
        this.zzo = false;
        object = zzu.zzB().elapsedRealtime();
        this.zzp = object;
    }

    public final void zzb() {
        Object object = zzu.zzo().zzi();
        boolean bl2 = object.zzR();
        if (bl2) {
            object = zzu.zzo().zzi().zzl();
            Object object2 = this.zza;
            Object object3 = this.zzb;
            zzay zzay2 = zzu.zzs();
            bl2 = zzay2.zzj((Context)object2, (String)object, (String)(object3 = ((VersionInfoParcel)object3).afmaVersion));
            if (!bl2) {
                zzu.zzo().zzi().zzC(false);
                object = zzu.zzo().zzi();
                object2 = "";
                object.zzB((String)object2);
            }
        }
    }

    public final void zzc(Runnable object) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Object object2 = zzu.zzo().zzi().zzh().zze();
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            boolean bl3;
            if (object != null) {
                try {
                    object.run();
                }
                catch (Throwable throwable) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not initialize rewarded ads.", throwable);
                    return;
                }
            }
            if (bl3 = ((zzdst)(object = this.zzc)).zzd()) {
                Context context;
                boolean bl4;
                Object object3;
                Object object4;
                Object object5;
                Object object6;
                object = new HashMap();
                object2 = object2.values().iterator();
                while (bl2 = object2.hasNext()) {
                    boolean bl5;
                    object6 = ((zzbqz)object2.next()).zza.iterator();
                    while (bl5 = object6.hasNext()) {
                        boolean bl6;
                        object5 = (zzbqy)object6.next();
                        object4 = ((zzbqy)object5).zzk;
                        object5 = ((zzbqy)object5).zzc.iterator();
                        while (bl6 = object5.hasNext()) {
                            object3 = (String)object5.next();
                            bl4 = ((HashMap)object).containsKey(object3);
                            if (!bl4) {
                                context = new ArrayList();
                                ((HashMap)object).put(object3, context);
                            }
                            if (object4 == null) continue;
                            object3 = (List)((HashMap)object).get(object3);
                            object3.add(object4);
                        }
                    }
                }
                object2 = new JSONObject();
                object = ((HashMap)object).entrySet().iterator();
                while (bl2 = object.hasNext()) {
                    object6 = (Map.Entry)object.next();
                    object5 = (String)object6.getKey();
                    object4 = this.zzd;
                    if ((object4 = object4.zza((String)object5, (JSONObject)object2)) == null) continue;
                    object3 = ((zzeho)object4).zzb;
                    object3 = (zzfim)object3;
                    bl4 = ((zzfim)object3).zzC();
                    if (bl4) continue;
                    bl4 = ((zzfim)object3).zzB();
                    if (!bl4) continue;
                    object4 = ((zzeho)object4).zzc;
                    object4 = (zzeji)object4;
                    object6 = object6.getValue();
                    object6 = (List)object6;
                    context = this.zza;
                    ((zzfim)object3).zzj(context, (zzbys)object4, (List)object6);
                    object6 = new StringBuilder();
                    object4 = "Initialized rewarded video mediation adapter ";
                    ((StringBuilder)object6).append((String)object4);
                    ((StringBuilder)object6).append((String)object5);
                    object6 = ((StringBuilder)object6).toString();
                    try {
                        com.google.android.gms.ads.internal.util.client.zzm.zze((String)object6);
                    }
                    catch (zzfhv zzfhv2) {
                        object3 = "Failed to initialize rewarded video mediation adapter \"";
                        object4 = new StringBuilder((String)object3);
                        ((StringBuilder)object4).append((String)object5);
                        ((StringBuilder)object4).append("\"");
                        object5 = ((StringBuilder)object4).toString();
                        com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object5, zzfhv2);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfit.zzb(this.zza, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zze() {
        synchronized (this) {
            zzac zzac2 = zzu.zzr();
            return zzac2.zza();
        }
    }

    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    public final List zzg() {
        return this.zzf.zzg();
    }

    public final void zzh(String string2) {
        this.zze.zzg(string2);
    }

    public final void zzi() {
        this.zzf.zzl();
    }

    public final void zzj(boolean bl2) {
        Object object;
        try {
            object = this.zza;
        }
        catch (IOException iOException) {
            String string2 = iOException.getMessage();
            object = new RemoteException(string2);
            throw object;
        }
        object = zzfvh.zzi((Context)object);
        ((zzfvh)object).zzn(bl2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk() {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                boolean bl2;
                try {
                    bl2 = this.zzo;
                    if (bl2) {
                        String string2 = "Mobile ads is initialized already.";
                        com.google.android.gms.ads.internal.util.client.zzm.zzj(string2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                Object object = this.zza;
                zzbep.zza((Context)object);
                object = this.zza;
                Object object2 = this.zzb;
                zzcby zzcby2 = zzu.zzo();
                zzcby2.zzu((Context)object, (VersionInfoParcel)object2);
                object = this.zzm;
                ((zzcxd)object).zzd();
                object = this.zza;
                object2 = zzu.zzc();
                ((zzbcu)object2).zzi((Context)object);
                this.zzo = bl2 = true;
                object = this.zzf;
                ((zzdxf)object).zzr();
                object = this.zze;
                ((zzeny)object).zze();
                object = zzbep.zzdY;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                object = (Boolean)object;
                bl2 = (Boolean)object;
                if (bl2) {
                    object = this.zzh;
                    ((zzdsy)object).zzc();
                }
                object = this.zzi;
                ((zzdya)object).zzg();
                object = zzbep.zzjj;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                object = (Boolean)object;
                bl2 = (Boolean)object;
                if (bl2) {
                    object = zzcci.zza;
                    object2 = new zzcno(this);
                    object.execute((Runnable)object2);
                }
                object = zzbep.zzkT;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                bl2 = (Boolean)(object = (Boolean)object);
                if (bl2) {
                    object = zzcci.zza;
                    object2 = new zzcnq(this);
                    object.execute((Runnable)object2);
                }
                object = zzbep.zzcO;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                bl2 = (Boolean)(object = (Boolean)object);
                if (bl2) {
                    object = zzcci.zza;
                    object2 = new zzcnp(this);
                    object.execute((Runnable)object2);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzl(String object, IObjectWrapper object2) {
        boolean bl2;
        Object object3;
        Object object4;
        block8: {
            zzbep.zza(this.zza);
            object4 = zzbep.zzec;
            object3 = zzba.zzc();
            object4 = (Boolean)((zzben)object3).zza((zzbeg)object4);
            bl2 = (Boolean)object4;
            if (bl2) {
                zzu.zzp();
                object4 = this.zza;
                try {
                    object4 = zzt.zzp((Context)object4);
                    break block8;
                }
                catch (RemoteException remoteException) {
                    object3 = "NonagonMobileAdsSettingManager_AppId";
                    zzcby zzcby2 = zzu.zzo();
                    zzcby2.zzw(remoteException, (String)object3);
                }
            }
            object4 = "";
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object4);
        boolean bl4 = true;
        Object object5 = bl4 == bl3 ? object : object4;
        boolean bl5 = TextUtils.isEmpty((CharSequence)object5);
        if (!bl5) {
            object = zzbep.zzdW;
            object = (Boolean)zzba.zzc().zza((zzbeg)object);
            bl5 = (Boolean)object;
            object4 = zzbep.zzaR;
            bl3 = (Boolean)zzba.zzc().zza((zzbeg)object4);
            bl5 |= bl3;
            object3 = zzba.zzc();
            object4 = (Boolean)((zzben)object3).zza((zzbeg)object4);
            bl2 = (Boolean)object4;
            if (bl2) {
                object = (Runnable)ObjectWrapper.unwrap((IObjectWrapper)object2);
                object2 = new zzcnr(this, (Runnable)object);
            } else {
                object2 = null;
                bl4 = bl5;
            }
            if (bl4) {
                Context context = this.zza;
                VersionInfoParcel versionInfoParcel = this.zzb;
                zzfmq zzfmq2 = this.zzk;
                zzdvc zzdvc2 = this.zzn;
                Long l2 = this.zzp;
                zzf zzf2 = zzu.zza();
                zzf2.zza(context, versionInfoParcel, (String)object5, (Runnable)object2, zzfmq2, zzdvc2, l2);
            }
        }
    }

    public final void zzm(zzda zzda2) {
        zzdxz zzdxz2 = zzdxz.zzb;
        this.zzi.zzh(zzda2, zzdxz2);
    }

    public final void zzn(IObjectWrapper object, String string2) {
        if (object == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        if ((object = (Context)ObjectWrapper.unwrap((IObjectWrapper)object)) == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        zzau zzau2 = new zzau((Context)object);
        zzau2.zzn(string2);
        object = this.zzb.afmaVersion;
        zzau2.zzo((String)object);
        zzau2.zzr();
    }

    public final void zzo(zzbrf zzbrf2) {
        this.zzl.zzf(zzbrf2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp(boolean bl2) {
        synchronized (this) {
            zzac zzac2 = zzu.zzr();
            zzac2.zzc(bl2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq(float f5) {
        synchronized (this) {
            zzac zzac2 = zzu.zzr();
            zzac2.zzd(f5);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr(String string2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Object object = this.zza;
                        zzbep.zza((Context)object);
                        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
                        if (bl2) break block5;
                        object = zzbep.zzdW;
                        Object object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        bl2 = (Boolean)(object = (Boolean)object);
                        if (bl2) {
                            Context context = this.zza;
                            VersionInfoParcel versionInfoParcel = this.zzb;
                            zzfmq zzfmq2 = this.zzk;
                            object2 = zzu.zza();
                            ((zzf)object2).zza(context, versionInfoParcel, string2, null, zzfmq2, null, null);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzs(zzbnu zzbnu2) {
        this.zzf.zzs(zzbnu2);
    }

    public final void zzt(String string2) {
        Object object = zzbep.zzju;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = zzu.zzo();
            ((zzcby)object).zzz(string2);
        }
    }

    public final void zzu(zzff zzff2) {
        zzcau zzcau2 = this.zzg;
        Context context = this.zza;
        zzcau2.zzn(context, zzff2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzv() {
        synchronized (this) {
            zzac zzac2 = zzu.zzr();
            return zzac2.zze();
        }
    }

    public final /* synthetic */ void zzw() {
        zzbwo zzbwo2 = new zzbwo();
        this.zzj.zza(zzbwo2);
    }
}

