/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 *  android.view.View
 */
package com.google.android.gms.ads.nativead;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbif;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class NativeAdViewHolder {
    public static final WeakHashMap zza;
    private zzbif zzb;
    private WeakReference zzc;

    static {
        WeakHashMap weakHashMap;
        zza = weakHashMap = new WeakHashMap();
    }

    public NativeAdViewHolder(View object, Map map2, Map map3) {
        Object object2 = "ContainerView must not be null";
        Preconditions.checkNotNull(object, object2);
        boolean bl2 = object instanceof NativeAdView;
        if (bl2) {
            zzm.zzg("The provided containerView is of type of NativeAdView, which cannot be usedwith NativeAdViewHolder.");
            return;
        }
        object2 = zza;
        Object v4 = ((WeakHashMap)object2).get(object);
        if (v4 != null) {
            zzm.zzg("The provided containerView is already in use with another NativeAdViewHolder.");
            return;
        }
        ((WeakHashMap)object2).put(object, this);
        this.zzc = object2 = new Object(object);
        map2 = NativeAdViewHolder.zza(map2);
        map3 = NativeAdViewHolder.zza(map3);
        object = zzay.zza().zzi((View)object, (HashMap)map2, (HashMap)map3);
        this.zzb = object;
    }

    private static final HashMap zza(Map hashMap) {
        if (hashMap == null) {
            hashMap = new HashMap();
            return hashMap;
        }
        HashMap hashMap2 = new HashMap(hashMap);
        return hashMap2;
    }

    public final void setClickConfirmingView(View object) {
        zzbif zzbif2;
        try {
            zzbif2 = this.zzb;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", remoteException);
            return;
        }
        object = ObjectWrapper.wrap(object);
        zzbif2.zzb((IObjectWrapper)object);
    }

    public void setNativeAd(NativeAd object) {
        object = ((NativeAd)object).zza();
        Object object2 = this.zzc;
        object2 = object2 != null ? (View)((Reference)object2).get() : null;
        if (object2 == null) {
            zzm.zzj("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        WeakHashMap weakHashMap = zza;
        boolean bl2 = weakHashMap.containsKey(object2);
        if (!bl2) {
            weakHashMap.put(object2, this);
        }
        if ((object2 = this.zzb) != null) {
            try {
                object2.zzc((IObjectWrapper)object);
                return;
            }
            catch (RemoteException remoteException) {
                object2 = "Unable to call setNativeAd on delegate";
                zzm.zzh((String)object2, remoteException);
            }
        }
    }

    public void unregisterNativeAd() {
        Object object;
        Object object2 = this.zzb;
        if (object2 != null) {
            try {
                object2.zzd();
            }
            catch (RemoteException remoteException) {
                object = "Unable to call unregisterNativeAd on delegate";
                zzm.zzh((String)object, remoteException);
            }
        }
        if ((object2 = (object2 = this.zzc) != null ? (View)((Reference)object2).get() : null) != null) {
            object = zza;
            ((WeakHashMap)object).remove(object2);
        }
    }
}

