/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzcb;
import com.google.android.gms.ads.internal.client.zzcf;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbvp;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzdak;
import com.google.android.gms.internal.ads.zzdig;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzepc;
import com.google.android.gms.internal.ads.zzepj;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfep;
import com.google.android.gms.internal.ads.zzfew;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfiq;

public final class zzepk
extends zzbt {
    private final zzq zza;
    private final Context zzb;
    private final zzfew zzc;
    private final String zzd;
    private final VersionInfoParcel zze;
    private final zzepc zzf;
    private final zzffw zzg;
    private final zzaxd zzh;
    private final zzdvc zzi;
    private zzdig zzj;
    private boolean zzk;

    public zzepk(Context object, zzq zzq2, String string2, zzfew zzfew2, zzepc zzepc2, zzffw zzffw2, VersionInfoParcel versionInfoParcel, zzaxd zzaxd2, zzdvc zzdvc2) {
        boolean bl2;
        this.zza = zzq2;
        this.zzd = string2;
        this.zzb = object;
        this.zzc = zzfew2;
        this.zzf = zzepc2;
        this.zzg = zzffw2;
        this.zze = versionInfoParcel;
        object = zzbep.zzaE;
        this.zzk = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzh = zzaxd2;
        this.zzi = zzdvc2;
    }

    public static /* bridge */ /* synthetic */ zzdig zzb(zzepk zzepk2) {
        return zzepk2.zzj;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzepk zzepk2, zzdig zzdig2) {
        zzepk2.zzj = zzdig2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zze() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2;
                        zzdig zzdig2 = this.zzj;
                        if (zzdig2 == null || (bl2 = zzdig2.zza())) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    return true;
                }
                return false;
            }
            throw throwable2;
        }
    }

    public final void zzA() {
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzB() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object = "resume must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zzj;
                    if (object != null) {
                        object = ((zzcup)object).zzm();
                        ((zzdak)object).zzc(null);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzC(zzbe zzbe2) {
    }

    public final void zzD(zzbh zzbh2) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zzj(zzbh2);
    }

    public final void zzE(zzby zzby2) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    public final void zzF(zzq zzq2) {
    }

    public final void zzG(zzcb zzcb2) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzm(zzcb2);
    }

    public final void zzH(zzbcj zzbcj2) {
    }

    public final void zzI(zzw zzw2) {
    }

    public final void zzJ(zzci zzci2) {
        this.zzf.zzn(zzci2);
    }

    public final void zzK(zzdu zzdu2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzL(boolean bl2) {
        synchronized (this) {
            String string2 = "setImmersiveMode must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
            this.zzk = bl2;
            return;
        }
    }

    public final void zzM(zzbvp zzbvp2) {
    }

    public final void zzN(boolean bl2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzO(zzbfk zzbfk2) {
        synchronized (this) {
            Object object = "setOnCustomRenderedAdLoadedListener must be called on the main UI thread.";
            Preconditions.checkMainThread((String)object);
            object = this.zzc;
            ((zzfew)object).zzi(zzbfk2);
            return;
        }
    }

    public final void zzP(zzdg zzdg2) {
        block4: {
            Object object = "setPaidEventListener must be called on the main UI thread.";
            Preconditions.checkMainThread((String)object);
            boolean bl2 = zzdg2.zzf();
            if (bl2) break block4;
            object = this.zzi;
            try {
                ((zzdvc)object).zze();
            }
            catch (RemoteException remoteException) {
                String string2 = "Error in making CSI ping for reporting paid event callback";
                zzm.zzf(string2, remoteException);
            }
        }
        this.zzf.zzl(zzdg2);
    }

    public final void zzQ(zzbvs zzbvs2, String string2) {
    }

    public final void zzR(String string2) {
    }

    public final void zzS(zzbyn zzbyn2) {
        this.zzg.zzm(zzbyn2);
    }

    public final void zzT(String string2) {
    }

    public final void zzU(zzfk zzfk2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzW(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                try {
                    object2 = this.zzj;
                    if (object2 == null) {
                        object = "Interstitial can not be shown before loaded.";
                        zzm.zzj((String)object);
                        object = this.zzf;
                        int n3 = 9;
                        boolean bl2 = false;
                        Object var5_8 = null;
                        object2 = zzfiq.zzd(n3, null, null);
                        ((zzepc)object).zzq((zze)object2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = zzbep.zzcH;
                StackTraceElement[] stackTraceElementArray = zzba.zzc();
                object2 = stackTraceElementArray.zza((zzbeg)object2);
                boolean bl3 = (Boolean)(object2 = (Boolean)object2);
                if (bl3) {
                    object2 = this.zzh;
                    object2 = ((zzaxd)object2).zzc();
                    stackTraceElementArray = new Throwable();
                    stackTraceElementArray = stackTraceElementArray.getStackTrace();
                    object2.zzn(stackTraceElementArray);
                }
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                object = (Activity)object;
                object2 = this.zzj;
                boolean bl4 = this.zzk;
                ((zzdig)object2).zzc(bl4, (Activity)object);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzX() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object = "showInterstitial must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zzj;
                    zze zze2 = null;
                    if (object == null) {
                        object = "Interstitial can not be shown before loaded.";
                        zzm.zzj((String)object);
                        object = this.zzf;
                        int n3 = 9;
                        zze2 = zzfiq.zzd(n3, null, null);
                        ((zzepc)object).zzq(zze2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object = zzbep.zzcH;
                StackTraceElement[] stackTraceElementArray = zzba.zzc();
                object = stackTraceElementArray.zza((zzbeg)object);
                boolean bl2 = (Boolean)(object = (Boolean)object);
                if (bl2) {
                    object = this.zzh;
                    object = ((zzaxd)object).zzc();
                    stackTraceElementArray = new Throwable();
                    stackTraceElementArray = stackTraceElementArray.getStackTrace();
                    object.zzn(stackTraceElementArray);
                }
                object = this.zzj;
                boolean bl3 = this.zzk;
                ((zzdig)object).zzc(bl3, null);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean zzY() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzZ() {
        synchronized (this) {
            zzfew zzfew2 = this.zzc;
            return zzfew2.zza();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzaa() {
        synchronized (this) {
            String string2 = "isLoaded must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
            return this.zze();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzab(zzl var1_1) {
        synchronized (this) {
            block8: {
                try {
                    var2_3 = zzbgi.zzi;
                    var2_3 = var2_3.zze();
                    var2_3 = (Boolean)var2_3;
                    var3_4 = var2_3.booleanValue();
                    var4_5 = false;
                    var5_6 = null;
                    if (var3_4 == 0) ** GOTO lbl-1000
                    var2_3 = zzbep.zzlg;
                    var6_7 = zzba.zzc();
                    var2_3 = var6_7.zza((zzbeg)var2_3);
                    var3_4 = (var2_3 = (Boolean)var2_3).booleanValue();
                    if (var3_4 != 0) {
                        var3_4 = 1;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var3_4 = 0;
                        var2_3 = null;
                    }
                    var6_7 = this.zze;
                    var7_8 = var6_7.clientJarVersion;
                    var8_9 = zzbep.zzlh;
                    var9_10 = zzba.zzc();
                    var8_9 = var9_10.zza((zzbeg)var8_9);
                    var8_9 = (Integer)var8_9;
                    var10_11 = var8_9.intValue();
                    if (var7_8 < var10_11 || var3_4 == 0) {
                        var2_3 = "loadAd must be called on the main UI thread.";
                        Preconditions.checkMainThread((String)var2_3);
                    }
                    zzu.zzp();
                    var2_3 = this.zzb;
                    var3_4 = zzt.zzH((Context)var2_3);
                    var7_8 = 0;
                    var6_7 = null;
                    if (var3_4 != 0 && (var2_3 = var1_1.zzs) == null) {
                        var1_1 = "Failed to load the ad because app ID is missing.";
                        zzm.zzg((String)var1_1);
                        var1_1 = this.zzf;
                        if (var1_1 == null) return false;
                        var3_4 = 4;
                        var2_3 = zzfiq.zzd(var3_4, null, null);
                        var1_1.zzdB((zze)var2_3);
                        break block8;
                    }
                    var3_4 = this.zze();
                    if (var3_4 != 0) return false;
                    var2_3 = this.zzb;
                    var4_5 = var1_1.zzf;
                    zzfil.zza((Context)var2_3, var4_5);
                    this.zzj = null;
                    var2_3 = this.zzc;
                    var5_6 = this.zzd;
                    var6_7 = this.zza;
                    var8_9 = new zzfep((zzq)var6_7);
                    var6_7 = new zzepj(this);
                    return var2_3.zzb((zzl)var1_1, var5_6, (zzepq)var8_9, (zzepr)var6_7);
                }
                catch (Throwable var1_2) {}
            }
            return false;
            throw var1_2;
        }
    }

    public final void zzac(zzcf zzcf2) {
    }

    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        Bundle bundle = new Bundle();
        return bundle;
    }

    public final zzq zzg() {
        return null;
    }

    public final zzbh zzi() {
        return this.zzf.zzg();
    }

    public final zzcb zzj() {
        return this.zzf.zzi();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzdn zzk() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = zzbep.zzgW;
                    zzben zzben2 = zzba.zzc();
                    object = zzben2.zza((zzbeg)object);
                    object = (Boolean)object;
                    boolean bl2 = (Boolean)object;
                    if (bl2) {
                        object = this.zzj;
                        if (object == null) return null;
                        return ((zzcup)object).zzl();
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
            }
            throw throwable2;
        }
    }

    public final zzdq zzl() {
        return null;
    }

    public final IObjectWrapper zzn() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzr() {
        synchronized (this) {
            return this.zzd;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzs() {
        synchronized (this) {
            try {
                Object object = this.zzj;
                if (object == null) return null;
                zzcze zzcze2 = ((zzcup)object).zzl();
                if (zzcze2 == null) return null;
                object = ((zzcup)object).zzl();
                return ((zzcze)object).zzg();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzt() {
        synchronized (this) {
            try {
                Object object = this.zzj;
                if (object == null) return null;
                zzcze zzcze2 = ((zzcup)object).zzl();
                if (zzcze2 == null) return null;
                object = ((zzcup)object).zzl();
                return ((zzcze)object).zzg();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzx() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object = "destroy must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zzj;
                    if (object != null) {
                        object = ((zzcup)object).zzm();
                        ((zzdak)object).zza(null);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzy(zzl zzl2, zzbk zzbk2) {
        this.zzf.zzk(zzbk2);
        this.zzab(zzl2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzz() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object = "pause must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object);
                    object = this.zzj;
                    if (object != null) {
                        object = ((zzcup)object).zzm();
                        ((zzdak)object).zzb(null);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

