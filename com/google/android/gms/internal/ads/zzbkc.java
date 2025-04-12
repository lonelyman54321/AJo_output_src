/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbb;
import com.google.android.gms.internal.ads.zzbjf;
import com.google.android.gms.internal.ads.zzbkb;

public final class zzbkc
extends zzbjf {
    private final OnAdManagerAdViewLoadedListener zza;

    public zzbkc(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        this.zza = onAdManagerAdViewLoadedListener;
    }

    public static /* bridge */ /* synthetic */ OnAdManagerAdViewLoadedListener zzc(zzbkc zzbkc2) {
        return zzbkc2.zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(zzbu zzbu2, IObjectWrapper object) {
        AdManagerAdView adManagerAdView;
        Object object2;
        block15: {
            RemoteException remoteException3;
            block13: {
                boolean bl2;
                Object object3;
                block14: {
                    RemoteException remoteException22;
                    block12: {
                        object2 = "";
                        if (zzbu2 == null) return;
                        if (object == null) {
                            return;
                        }
                        object = (Context)ObjectWrapper.unwrap((IObjectWrapper)object);
                        adManagerAdView = new AdManagerAdView((Context)object);
                        object = null;
                        try {
                            object3 = zzbu2.zzi();
                        }
                        catch (RemoteException remoteException22) {
                            break block12;
                        }
                        bl2 = object3 instanceof zzg;
                        if (bl2) {
                            object3 = zzbu2.zzi();
                            if ((object3 = (zzg)object3) != null) {
                                object3 = ((zzg)object3).zzb();
                            } else {
                                bl2 = false;
                                object3 = null;
                            }
                            adManagerAdView.setAdListener((AdListener)object3);
                        }
                        break block14;
                    }
                    zzm.zzh((String)object2, remoteException22);
                }
                try {
                    object3 = zzbu2.zzj();
                }
                catch (RemoteException remoteException3) {
                    break block13;
                }
                bl2 = object3 instanceof zzbbb;
                if (bl2) {
                    object3 = zzbu2.zzj();
                    if ((object3 = (zzbbb)object3) != null) {
                        object = ((zzbbb)object3).zzb();
                    }
                    adManagerAdView.setAppEventListener((AppEventListener)object);
                }
                break block15;
            }
            zzm.zzh((String)object2, remoteException3);
        }
        object = zzf.zza;
        object2 = new zzbkb(this, adManagerAdView, zzbu2);
        object.post((Runnable)object2);
    }
}

