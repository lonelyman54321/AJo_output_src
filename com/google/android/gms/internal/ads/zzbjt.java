/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd$AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd$Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbjs;
import java.util.ArrayList;
import java.util.List;

public final class zzbjt
extends UnifiedNativeAd {
    private final zzbjs zza;
    private final List zzb;
    private final zzbhw zzc;
    private final VideoController zzd;
    private final NativeAd$AdChoicesInfo zze;
    private final List zzf;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbjt(zzbjs var1_1) {
        block25: {
            block26: {
                block24: {
                    block21: {
                        block23: {
                            block18: {
                                block19: {
                                    block20: {
                                        var2_6 = "";
                                        super();
                                        var3_7 = new ArrayList();
                                        this.zzb = var3_7;
                                        this.zzd = var3_7 = new VideoController();
                                        var3_7 = new ArrayList();
                                        this.zzf = var3_7;
                                        this.zza = var1_1;
                                        var3_7 = null;
                                        try {
                                            var1_1 = var1_1.zzu();
                                            if (var1_1 == null) break block18;
                                            var1_1 = var1_1.iterator();
lbl14:
                                            // 3 sources

                                            while (var4_8 = var1_1.hasNext()) {
                                                break;
                                            }
                                        }
                                        catch (RemoteException var1_2) {
                                            break block19;
                                        }
                                        {
                                            var5_9 /* !! */  = var1_1.next();
                                            var6_10 = var5_9 /* !! */  instanceof IBinder;
                                            if (!var6_10 || (var5_9 /* !! */  = (IBinder)var5_9 /* !! */ ) == null) {
                                                var6_10 = false;
                                                var7_11 = null;
                                                break block20;
                                            }
                                            var7_11 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
                                        }
                                        var8_12 = (var7_11 = var5_9 /* !! */ .queryLocalInterface((String)var7_11)) instanceof zzbhv;
                                        var7_11 = var8_12 != false ? (zzbhv)var7_11 : new zzbht((IBinder)var5_9 /* !! */ );
                                    }
                                    if (var7_11 == null) ** GOTO lbl14
                                    var5_9 /* !! */  = this.zzb;
                                    var9_13 = new zzbhw((zzbhv)var7_11);
                                    var5_9 /* !! */ .add((zzbhw)var9_13);
                                    ** GOTO lbl14
                                }
                                zzm.zzh(var2_6, var1_2);
                            }
                            try {
                                var1_1 = this.zza;
                                var1_1 = var1_1.zzv();
                                if (var1_1 == null) break block21;
                                var1_1 = var1_1.iterator();
lbl43:
                                // 3 sources

                                while (var4_8 = var1_1.hasNext()) {
                                    break;
                                }
                            }
                            catch (RemoteException var1_3) {
                                break block23;
                            }
                            var5_9 /* !! */  = var1_1.next();
                            var6_10 = var5_9 /* !! */  instanceof IBinder;
                            if (var6_10) {
                                var5_9 /* !! */  = (IBinder)var5_9 /* !! */ ;
                                var5_9 /* !! */  = zzcv.zzb(var5_9 /* !! */ );
                            } else {
                                var4_8 = false;
                                var5_9 /* !! */  = null;
                            }
                            if (var5_9 /* !! */  == null) ** GOTO lbl43
                            var7_11 = this.zzf;
                            var9_13 = new zzcx((zzcw)var5_9 /* !! */ );
                            var7_11.add(var9_13);
                            ** GOTO lbl43
                        }
                        zzm.zzh(var2_6, var1_3);
                    }
                    try {
                        var1_1 = this.zza;
                        var1_1 = var1_1.zzk();
                        if (var1_1 == null) break block24;
                        super((zzbhv)var1_1);
                        break block25;
                    }
                    catch (RemoteException var1_4) {
                        break block26;
                    }
                }
lbl75:
                // 2 sources

                while (true) {
                    var4_8 = false;
                    var5_9 /* !! */  = null;
                    break block25;
                    break;
                }
            }
            zzm.zzh(var2_6, var1_4);
            ** while (true)
        }
        this.zzc = var5_9 /* !! */ ;
        try {
            var1_1 = this.zza;
            var1_1 = var1_1.zzi();
            if (var1_1 != null) {
                var5_9 /* !! */  = this.zza;
                var5_9 /* !! */  = var5_9 /* !! */ .zzi();
                var3_7 = var1_1 = new zzbhp((zzbho)var5_9 /* !! */ );
            }
        }
        catch (RemoteException var1_5) {
            zzm.zzh(var2_6, var1_5);
        }
        this.zze = var3_7;
    }

    public final void performClick(Bundle bundle) {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbjs2.zzz(bundle);
    }

    public final boolean recordImpression(Bundle bundle) {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return false;
        }
        return zzbjs2.zzI(bundle);
    }

    public final void reportTouchEvent(Bundle bundle) {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbjs2.zzB(bundle);
    }

    public final VideoController zza() {
        block7: {
            Object object = this.zza;
            object = object.zzh();
            if (object == null) break block7;
            object = this.zzd;
            Object object2 = this.zza;
            object2 = object2.zzh();
            try {
                ((VideoController)object).zzb((zzdq)object2);
            }
            catch (RemoteException remoteException) {
                object2 = "Exception occurred while getting video controller";
                zzm.zzh((String)object2, remoteException);
            }
        }
        return this.zzd;
    }

    public final NativeAd$Image zzb() {
        return this.zzc;
    }

    public final Double zzc() {
        Double d2;
        block4: {
            zzbjs zzbjs2;
            d2 = null;
            try {
                zzbjs2 = this.zza;
            }
            catch (RemoteException remoteException) {
                zzm.zzh("", remoteException);
                return null;
            }
            double d5 = zzbjs2.zze();
            double d7 = -1.0;
            double d9 = d5 == d7 ? 0 : (d5 > d7 ? 1 : -1);
            if (d9 == false) break block4;
            d2 = d5;
        }
        return d2;
    }

    public final Object zzd() {
        block4: {
            Object object = this.zza;
            object = object.zzl();
            if (object == null) break block4;
            try {
                return ObjectWrapper.unwrap((IObjectWrapper)object);
            }
            catch (RemoteException remoteException) {
                String string2 = "";
                zzm.zzh(string2, remoteException);
            }
        }
        return null;
    }

    public final String zze() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbjs2.zzn();
    }

    public final String zzf() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbjs2.zzo();
    }

    public final String zzg() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbjs2.zzp();
    }

    public final String zzh() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbjs2.zzq();
    }

    public final String zzi() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbjs2.zzs();
    }

    public final String zzj() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return null;
        }
        return zzbjs2.zzt();
    }

    public final List zzk() {
        return this.zzb;
    }
}

