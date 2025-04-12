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
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo;
import com.google.android.gms.ads.nativead.NativeAd$Image;
import com.google.android.gms.ads.nativead.NativeAd$UnconfirmedClickListener;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbun;
import com.google.android.gms.internal.ads.zzbuw;
import java.util.ArrayList;
import java.util.List;

public final class zzbuo
extends NativeAd {
    private final zzbjs zza;
    private final List zzb;
    private final zzbun zzc;
    private final NativeAd$AdChoicesInfo zzd;
    private final List zze;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public zzbuo(zzbjs var1_1) {
        block25: {
            block26: {
                block24: {
                    block21: {
                        block23: {
                            block18: {
                                block20: {
                                    var2_6 = "";
                                    super();
                                    var3_7 = new ArrayList();
                                    this.zzb = var3_7;
                                    var3_7 = new ArrayList();
                                    this.zze = var3_7;
                                    this.zza = var1_1;
                                    var3_7 = null;
                                    try {
                                        var1_1 = var1_1.zzu();
                                        if (var1_1 == null) break block18;
                                        var1_1 = var1_1.iterator();
lbl13:
                                        // 3 sources

                                        while (var4_8 = var1_1.hasNext()) {
                                            break;
                                        }
                                    }
                                    catch (RemoteException var1_2) {
                                        break block20;
                                    }
                                    var5_9 /* !! */  = var1_1.next();
                                    var6_10 = var5_9 /* !! */  instanceof IBinder;
                                    if (var6_10) {
                                        var5_9 /* !! */  = (IBinder)var5_9 /* !! */ ;
                                        var5_9 /* !! */  = zzbhu.zzg(var5_9 /* !! */ );
                                    } else {
                                        var4_8 = false;
                                        var5_9 /* !! */  = null;
                                    }
                                    if (var5_9 /* !! */  == null) ** GOTO lbl13
                                    var7_11 = this.zzb;
                                    var8_12 = new zzbun((zzbhv)var5_9 /* !! */ );
                                    var7_11.add(var8_12);
                                    ** GOTO lbl13
                                }
                                zzm.zzh(var2_6, var1_2);
                            }
                            try {
                                var1_1 = this.zza;
                                var1_1 = var1_1.zzv();
                                if (var1_1 == null) break block21;
                                var1_1 = var1_1.iterator();
lbl41:
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
                            if (var5_9 /* !! */  == null) ** GOTO lbl41
                            var7_11 = this.zze;
                            var8_12 = new zzcx((zzcw)var5_9 /* !! */ );
                            var7_11.add(var8_12);
                            ** GOTO lbl41
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
lbl73:
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
                var3_7 = var1_1 = new zzbul((zzbho)var5_9 /* !! */ );
            }
        }
        catch (RemoteException var1_5) {
            zzm.zzh(var2_6, var1_5);
        }
        this.zzd = var3_7;
    }

    public final void cancelUnconfirmedClick() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Failed to cancelUnconfirmedClick", remoteException);
            return;
        }
        zzbjs2.zzw();
    }

    public final void destroy() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbjs2.zzx();
    }

    public final void enableCustomClickGesture() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbjs2.zzC();
    }

    public final NativeAd$AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    public final String getAdvertiser() {
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

    public final String getBody() {
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

    public final String getCallToAction() {
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

    public final Bundle getExtras() {
        zzbjs zzbjs2 = this.zza;
        try {
            zzbjs2 = zzbjs2.zzf();
            if (zzbjs2 != null) {
                return zzbjs2;
            }
        }
        catch (RemoteException remoteException) {
            String string2 = "";
            zzm.zzh(string2, remoteException);
        }
        zzbjs2 = new Bundle();
        return zzbjs2;
    }

    public final String getHeadline() {
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

    public final NativeAd$Image getIcon() {
        return this.zzc;
    }

    public final List getImages() {
        return this.zzb;
    }

    public final MediaContent getMediaContent() {
        block7: {
            Object object = this.zza;
            object = object.zzj();
            if (object == null) break block7;
            Object object2 = this.zza;
            object2 = object2.zzj();
            try {
                object = new zzep((zzbhs)object2, null);
                return object;
            }
            catch (RemoteException remoteException) {
                object2 = "";
                zzm.zzh((String)object2, remoteException);
            }
        }
        return null;
    }

    public final List getMuteThisAdReasons() {
        return this.zze;
    }

    public final String getPrice() {
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

    public final ResponseInfo getResponseInfo() {
        Object object = this.zza;
        try {
            object = object.zzg();
        }
        catch (RemoteException remoteException) {
            String string2 = "";
            zzm.zzh(string2, remoteException);
            object = null;
        }
        return ResponseInfo.zza((zzdn)object);
    }

    public final Double getStarRating() {
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

    public final String getStore() {
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

    public final boolean isCustomClickGestureEnabled() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return false;
        }
        return zzbjs2.zzG();
    }

    public final boolean isCustomMuteThisAdEnabled() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return false;
        }
        return zzbjs2.zzH();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void muteThisAd(MuteThisAdReason object) {
        RemoteException remoteException222;
        String string2;
        block8: {
            block5: {
                block7: {
                    boolean bl2;
                    zzbjs zzbjs2;
                    block6: {
                        string2 = "";
                        zzbjs2 = this.zza;
                        bl2 = zzbjs2.zzH();
                        if (!bl2) break block5;
                        if (object != null) break block6;
                        try {
                            object = this.zza;
                            bl2 = false;
                            zzbjs2 = null;
                            object.zzy(null);
                            return;
                        }
                        catch (RemoteException remoteException222) {}
                    }
                    bl2 = object instanceof zzcx;
                    if (!bl2) break block7;
                    zzbjs2 = this.zza;
                    object = (zzcx)object;
                    object = ((zzcx)object).zza();
                    zzbjs2.zzy((zzcw)object);
                    return;
                    break block8;
                }
                object = "Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null";
                zzm.zzg((String)object);
                return;
                catch (RemoteException remoteException3) {
                    zzm.zzh(string2, remoteException3);
                }
            }
            object = "Ad is not custom mute enabled";
            zzm.zzg((String)object);
            return;
        }
        zzm.zzh(string2, remoteException222);
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

    public final void recordCustomClickGesture() {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzbjs2.zzA();
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

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("", remoteException);
            return;
        }
        zzct zzct2 = new zzct(muteThisAdListener);
        zzbjs2.zzD(zzct2);
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Failed to setOnPaidEventListener", remoteException);
            return;
        }
        zzfe zzfe2 = new zzfe(onPaidEventListener);
        zzbjs2.zzE(zzfe2);
    }

    public final void setUnconfirmedClickListener(NativeAd$UnconfirmedClickListener nativeAd$UnconfirmedClickListener) {
        zzbjs zzbjs2;
        try {
            zzbjs2 = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Failed to setUnconfirmedClickListener", remoteException);
            return;
        }
        zzbuw zzbuw2 = new zzbuw(nativeAd$UnconfirmedClickListener);
        zzbjs2.zzF(zzbuw2);
    }
}

