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
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbyz;
import com.google.android.gms.internal.ads.zzbzd;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzbzi;
import com.google.android.gms.internal.ads.zzbzo;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzdrh;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfgg;
import com.google.android.gms.internal.ads.zzfgi;
import com.google.android.gms.internal.ads.zzfgj;
import com.google.android.gms.internal.ads.zzfhg;
import com.google.android.gms.internal.ads.zzfiq;

public final class zzfgk
extends zzbyz {
    private final zzfgg zza;
    private final zzffw zzb;
    private final String zzc;
    private final zzfhg zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzaxd zzg;
    private final zzdvc zzh;
    private zzdrh zzi;
    private boolean zzj;

    public zzfgk(String object, zzfgg zzfgg2, Context context, zzffw zzffw2, zzfhg zzfhg2, VersionInfoParcel versionInfoParcel, zzaxd zzaxd2, zzdvc zzdvc2) {
        boolean bl2;
        this.zzc = object;
        this.zza = zzfgg2;
        this.zzb = zzffw2;
        this.zzd = zzfhg2;
        this.zze = context;
        this.zzf = versionInfoParcel;
        object = zzbep.zzaE;
        this.zzj = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzg = zzaxd2;
        this.zzh = zzdvc2;
    }

    public static /* bridge */ /* synthetic */ zzdrh zzr(zzfgk zzfgk2) {
        return zzfgk2.zzi;
    }

    public static /* bridge */ /* synthetic */ zzfhg zzs(zzfgk zzfgk2) {
        return zzfgk2.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzt(zzfgk zzfgk2, zzdrh zzdrh2) {
        zzfgk2.zzi = zzdrh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzu(zzl object, zzbzh object2, int n3) {
        synchronized (this) {
            Throwable throwable2;
            zzfgj zzfgj2;
            Object object3;
            block8: {
                try {
                    Object object4;
                    object3 = zzbgi.zzl;
                    object3 = ((zzbfv)object3).zze();
                    object3 = (Boolean)object3;
                    int n4 = ((Boolean)object3).booleanValue();
                    boolean bl2 = false;
                    zzfgj2 = null;
                    if (n4 != 0) {
                        object3 = zzbep.zzlg;
                        object4 = zzba.zzc();
                        object3 = ((zzben)object4).zza((zzbeg)object3);
                        n4 = (int)(((Boolean)(object3 = (Boolean)object3)).booleanValue() ? 1 : 0);
                        if (n4 != 0) {
                            bl2 = true;
                        }
                    }
                    object3 = this.zzf;
                    n4 = ((VersionInfoParcel)object3).clientJarVersion;
                    object4 = zzbep.zzlh;
                    zzben zzben2 = zzba.zzc();
                    object4 = zzben2.zza((zzbeg)object4);
                    int n7 = (Integer)(object4 = (Integer)object4);
                    if (n4 < n7 || !bl2) {
                        object3 = "#008 Must be called on the main UI thread.";
                        Preconditions.checkMainThread((String)object3);
                    }
                    object3 = this.zzb;
                    ((zzffw)object3).zzk((zzbzh)object2);
                    zzu.zzp();
                    object2 = this.zze;
                    int n8 = zzt.zzH((Context)object2);
                    n4 = 0;
                    object3 = null;
                    if (n8 != 0 && (object2 = ((zzl)object).zzs) == null) {
                        object = "Failed to load the ad because app ID is missing.";
                        zzm.zzg((String)object);
                        object = this.zzb;
                        n8 = 4;
                        object2 = zzfiq.zzd(n8, null, null);
                        ((zzffw)object).zzdB((zze)object2);
                        return;
                    }
                    object2 = this.zzi;
                    if (object2 == null) break block8;
                }
                catch (Throwable throwable2) {}
                return;
            }
            object2 = new zzffy(null);
            object3 = this.zza;
            ((zzfgg)object3).zzj(n3);
            zzfgg zzfgg2 = this.zza;
            object3 = this.zzc;
            zzfgj2 = new zzfgj(this);
            zzfgg2.zzb((zzl)object, (String)object3, (zzepq)object2, zzfgj2);
            return;
            throw throwable2;
        }
    }

    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrh zzdrh2 = this.zzi;
        zzdrh2 = zzdrh2 != null ? zzdrh2.zza() : new Bundle();
        return zzdrh2;
    }

    public final zzdn zzc() {
        Object object = zzbep.zzgW;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (object = this.zzi) != null) {
            return ((zzcup)object).zzl();
        }
        return null;
    }

    public final zzbyx zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrh zzdrh2 = this.zzi;
        if (zzdrh2 != null) {
            return zzdrh2.zzc();
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zze() {
        synchronized (this) {
            try {
                Object object = this.zzi;
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(zzl zzl2, zzbzh zzbzh2) {
        synchronized (this) {
            int n3 = 2;
            this.zzu(zzl2, zzbzh2, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg(zzl zzl2, zzbzh zzbzh2) {
        synchronized (this) {
            int n3 = 3;
            this.zzu(zzl2, zzbzh2, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzh(boolean bl2) {
        synchronized (this) {
            String string2 = "setImmersiveMode must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
            this.zzj = bl2;
            return;
        }
    }

    public final void zzi(zzdd zzdd2) {
        if (zzdd2 == null) {
            this.zzb.zzg(null);
            return;
        }
        zzffw zzffw2 = this.zzb;
        zzfgi zzfgi2 = new zzfgi(this, zzdd2);
        zzffw2.zzg(zzfgi2);
    }

    public final void zzj(zzdg zzdg2) {
        block4: {
            Object object = "setOnPaidEventListener must be called on the main UI thread.";
            Preconditions.checkMainThread((String)object);
            boolean bl2 = zzdg2.zzf();
            if (bl2) break block4;
            object = this.zzh;
            try {
                ((zzdvc)object).zze();
            }
            catch (RemoteException remoteException) {
                String string2 = "Error in making CSI ping for reporting paid event callback";
                zzm.zzf(string2, remoteException);
            }
        }
        this.zzb.zzi(zzdg2);
    }

    public final void zzk(zzbzd zzbzd2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbzd2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(zzbzo object) {
        synchronized (this) {
            String string2;
            Object object2 = "#008 Must be called on the main UI thread.";
            Preconditions.checkMainThread((String)object2);
            object2 = this.zzd;
            ((zzfhg)object2).zza = string2 = ((zzbzo)object).zza;
            ((zzfhg)object2).zzb = object = ((zzbzo)object).zzb;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(IObjectWrapper iObjectWrapper) {
        synchronized (this) {
            boolean bl2 = this.zzj;
            this.zzn(iObjectWrapper, bl2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(IObjectWrapper object, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2 = "#008 Must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object2);
                    object2 = this.zzi;
                    if (object2 == null) {
                        object = "Rewarded can not be shown before loaded";
                        zzm.zzj((String)object);
                        object = this.zzb;
                        bl2 = 9;
                        boolean bl3 = false;
                        object2 = null;
                        zze zze2 = zzfiq.zzd((int)(bl2 ? 1 : 0), null, null);
                        ((zzffw)object).zzq(zze2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object2 = zzbep.zzcH;
                StackTraceElement[] stackTraceElementArray = zzba.zzc();
                object2 = stackTraceElementArray.zza((zzbeg)object2);
                boolean bl4 = (Boolean)(object2 = (Boolean)object2);
                if (bl4) {
                    object2 = this.zzg;
                    object2 = ((zzaxd)object2).zzc();
                    stackTraceElementArray = new Throwable();
                    stackTraceElementArray = stackTraceElementArray.getStackTrace();
                    object2.zzn(stackTraceElementArray);
                }
                object = ObjectWrapper.unwrap((IObjectWrapper)object);
                object = (Activity)object;
                object2 = this.zzi;
                ((zzdrh)object2).zzh(bl2, (Activity)object);
                return;
            }
            throw throwable2;
        }
    }

    public final boolean zzo() {
        boolean bl2;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdrh zzdrh2 = this.zzi;
        return zzdrh2 != null && !(bl2 = zzdrh2.zzf());
    }

    public final void zzp(zzbzi zzbzi2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbzi2);
    }
}

