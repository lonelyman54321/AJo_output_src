/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzbyj;
import com.google.android.gms.internal.ads.zzbyn;
import com.google.android.gms.internal.ads.zzbyo;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcze;
import com.google.android.gms.internal.ads.zzdak;
import com.google.android.gms.internal.ads.zzdrh;
import com.google.android.gms.internal.ads.zzepq;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzffy;
import com.google.android.gms.internal.ads.zzfgg;
import com.google.android.gms.internal.ads.zzfgo;
import com.google.android.gms.internal.ads.zzfgp;
import com.google.android.gms.internal.ads.zzfhg;
import java.util.regex.Pattern;

public final class zzfgq
extends zzbyj {
    private final zzfgg zza;
    private final zzffw zzb;
    private final zzfhg zzc;
    private zzdrh zzd;
    private boolean zze = false;

    public zzfgq(zzfgg zzfgg2, zzffw zzffw2, zzfhg zzfhg2) {
        this.zza = zzfgg2;
        this.zzb = zzffw2;
        this.zzc = zzfhg2;
    }

    public static /* bridge */ /* synthetic */ zzdrh zzv(zzfgq zzfgq2) {
        return zzfgq2.zzd;
    }

    public static /* bridge */ /* synthetic */ zzfhg zzw(zzfgq zzfgq2) {
        return zzfgq2.zzc;
    }

    public static /* bridge */ /* synthetic */ void zzx(zzfgq zzfgq2, zzdrh zzdrh2) {
        zzfgq2.zzd = zzdrh2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzy() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        boolean bl2;
                        zzdrh zzdrh2 = this.zzd;
                        if (zzdrh2 == null || (bl2 = zzdrh2.zze())) break block4;
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

    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdrh zzdrh2 = this.zzd;
        zzdrh2 = zzdrh2 != null ? zzdrh2.zza() : new Bundle();
        return zzdrh2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzdn zzc() {
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
                        object = this.zzd;
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzd() {
        synchronized (this) {
            try {
                Object object = this.zzd;
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

    public final void zze() {
        this.zzf(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2 = "destroy must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object2);
                    object2 = this.zzb;
                    Object object3 = null;
                    ((zzffw)object2).zzg(null);
                    object2 = this.zzd;
                    if (object2 != null) {
                        if (object != null) {
                            object3 = object = ObjectWrapper.unwrap((IObjectWrapper)object);
                            object3 = (Context)object;
                        }
                        object = this.zzd;
                        object = ((zzcup)object).zzm();
                        ((zzdak)object).zza((Context)object3);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
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
    public final void zzg(zzbyo object) {
        synchronized (this) {
            Throwable throwable2;
            Object object2;
            Object object3;
            Object object4;
            block9: {
                block8: {
                    object4 = "loadAd must be called on the main UI thread.";
                    try {
                        boolean bl2;
                        block7: {
                            Preconditions.checkMainThread((String)object4);
                            object4 = ((zzbyo)object).zzb;
                            object3 = zzbep.zzfx;
                            object2 = zzba.zzc();
                            object3 = ((zzben)object2).zza((zzbeg)object3);
                            object3 = (String)object3;
                            if (object3 != null && object4 != null) {
                                try {
                                    bl2 = Pattern.matches((String)object3, (CharSequence)object4);
                                    if (!bl2) break block7;
                                    break block8;
                                }
                                catch (RuntimeException runtimeException) {
                                    object3 = "NonagonUtil.isPatternMatched";
                                    object2 = zzu.zzo();
                                    ((zzcby)object2).zzw(runtimeException, (String)object3);
                                }
                            }
                        }
                        if (!(bl2 = this.zzy())) break block9;
                        object4 = zzbep.zzfz;
                        object3 = zzba.zzc();
                        object4 = ((zzben)object3).zza((zzbeg)object4);
                        bl2 = (Boolean)(object4 = (Boolean)object4);
                        if (bl2) break block9;
                    }
                    catch (Throwable throwable2) {}
                }
                return;
            }
            object3 = null;
            object4 = new zzffy(null);
            this.zzd = null;
            object3 = this.zza;
            int n3 = 1;
            ((zzfgg)object3).zzj(n3);
            object3 = this.zza;
            object2 = ((zzbyo)object).zza;
            object = ((zzbyo)object).zzb;
            zzfgo zzfgo2 = new zzfgo(this);
            ((zzfgg)object3).zzb((zzl)object2, (String)object, (zzepq)object4, zzfgo2);
            return;
            throw throwable2;
        }
    }

    public final void zzh() {
        this.zzi(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzi(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2 = "pause must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object2);
                    object2 = this.zzd;
                    if (object2 != null) {
                        if (object == null) {
                            object = null;
                        } else {
                            object = ObjectWrapper.unwrap((IObjectWrapper)object);
                            object = (Context)object;
                        }
                        object2 = this.zzd;
                        object2 = ((zzcup)object2).zzm();
                        ((zzdak)object2).zzb((Context)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzj() {
        this.zzk(null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                Object object2 = "resume must be called on the main UI thread.";
                try {
                    Preconditions.checkMainThread((String)object2);
                    object2 = this.zzd;
                    if (object2 != null) {
                        if (object == null) {
                            object = null;
                        } else {
                            object = ObjectWrapper.unwrap((IObjectWrapper)object);
                            object = (Context)object;
                        }
                        object2 = this.zzd;
                        object2 = ((zzcup)object2).zzm();
                        ((zzdak)object2).zzc((Context)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzl(zzby zzby2) {
        Object object = "setAdMetadataListener can only be called from the UI thread.";
        Preconditions.checkMainThread((String)object);
        if (zzby2 == null) {
            this.zzb.zzg(null);
            return;
        }
        object = this.zzb;
        zzfgp zzfgp2 = new zzfgp(this, zzby2);
        ((zzffw)object).zzg(zzfgp2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(String string2) {
        synchronized (this) {
            Object object = "#008 Must be called on the main UI thread.: setCustomData";
            Preconditions.checkMainThread((String)object);
            object = this.zzc;
            ((zzfhg)object).zzb = string2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(boolean bl2) {
        synchronized (this) {
            String string2 = "setImmersiveMode must be called on the main UI thread.";
            Preconditions.checkMainThread(string2);
            this.zze = bl2;
            return;
        }
    }

    public final void zzo(zzbyn zzbyn2) {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbyn2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp(String string2) {
        synchronized (this) {
            Object object = "setUserId must be called on the main UI thread.";
            Preconditions.checkMainThread((String)object);
            object = this.zzc;
            ((zzfhg)object).zza = string2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq() {
        synchronized (this) {
            Object var1_1 = null;
            this.zzr(null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block5: {
                    boolean bl2;
                    Object object2;
                    block7: {
                        block6: {
                            object2 = "showAd must be called on the main UI thread.";
                            try {
                                Preconditions.checkMainThread((String)object2);
                                object2 = this.zzd;
                                if (object2 == null) break block5;
                                object2 = null;
                                if (object != null) break block6;
                                break block7;
                            }
                            catch (Throwable throwable2) {
                                break block8;
                            }
                        }
                        bl2 = (object = ObjectWrapper.unwrap((IObjectWrapper)object)) instanceof Activity;
                        if (bl2) {
                            object2 = object;
                            object2 = (Activity)object;
                        }
                    }
                    object = this.zzd;
                    bl2 = this.zze;
                    ((zzdrh)object).zzh(bl2, (Activity)object2);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final boolean zzs() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return this.zzy();
    }

    public final boolean zzt() {
        boolean bl2;
        zzdrh zzdrh2 = this.zzd;
        return zzdrh2 != null && (bl2 = zzdrh2.zzg());
    }

    public final void zzu(zzbyi zzbyi2) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbyi2);
    }
}

