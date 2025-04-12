/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd$Image;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhi;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbrt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbsm
extends zzbrt {
    private final UnifiedNativeAdMapper zza;

    public zzbsm(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        this.zza = unifiedNativeAdMapper;
    }

    public final boolean zzA() {
        return this.zza.getOverrideClickHandling();
    }

    public final boolean zzB() {
        return this.zza.getOverrideImpressionRecording();
    }

    public final double zze() {
        Double d2 = this.zza.getStarRating();
        if (d2 != null) {
            return this.zza.getStarRating();
        }
        return -1.0;
    }

    public final float zzf() {
        return this.zza.getMediaContentAspectRatio();
    }

    public final float zzg() {
        return this.zza.getCurrentTime();
    }

    public final float zzh() {
        return this.zza.getDuration();
    }

    public final Bundle zzi() {
        return this.zza.getExtras();
    }

    public final zzdq zzj() {
        VideoController videoController = this.zza.zzb();
        if (videoController != null) {
            return this.zza.zzb().zza();
        }
        return null;
    }

    public final zzbho zzk() {
        return null;
    }

    public final zzbhv zzl() {
        NativeAd$Image nativeAd$Image = this.zza.getIcon();
        if (nativeAd$Image != null) {
            Drawable drawable2 = nativeAd$Image.getDrawable();
            Uri uri = nativeAd$Image.getUri();
            double d2 = nativeAd$Image.getScale();
            int n3 = nativeAd$Image.zzb();
            int n4 = nativeAd$Image.zza();
            zzbhi zzbhi2 = new zzbhi(drawable2, uri, d2, n3, n4);
            return zzbhi2;
        }
        return null;
    }

    public final IObjectWrapper zzm() {
        View view = this.zza.getAdChoicesContent();
        if (view == null) {
            return null;
        }
        return ObjectWrapper.wrap(view);
    }

    public final IObjectWrapper zzn() {
        View view = this.zza.zza();
        if (view == null) {
            return null;
        }
        return ObjectWrapper.wrap(view);
    }

    public final IObjectWrapper zzo() {
        Object object = this.zza.zzc();
        if (object == null) {
            return null;
        }
        return ObjectWrapper.wrap(object);
    }

    public final String zzp() {
        return this.zza.getAdvertiser();
    }

    public final String zzq() {
        return this.zza.getBody();
    }

    public final String zzr() {
        return this.zza.getCallToAction();
    }

    public final String zzs() {
        return this.zza.getHeadline();
    }

    public final String zzt() {
        return this.zza.getPrice();
    }

    public final String zzu() {
        return this.zza.getStore();
    }

    public final List zzv() {
        Object object = this.zza.getImages();
        ArrayList<zzbhi> arrayList = new ArrayList<zzbhi>();
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                NativeAd$Image nativeAd$Image = (NativeAd$Image)object.next();
                Drawable drawable2 = nativeAd$Image.getDrawable();
                Uri uri = nativeAd$Image.getUri();
                double d2 = nativeAd$Image.getScale();
                int n3 = nativeAd$Image.zzb();
                int n4 = nativeAd$Image.zza();
                zzbhi zzbhi2 = new zzbhi(drawable2, uri, d2, n3, n4);
                arrayList.add(zzbhi2);
            }
        }
        return arrayList;
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        this.zza.handleClick((View)iObjectWrapper);
    }

    public final void zzx() {
        this.zza.recordImpression();
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper object, IObjectWrapper object2) {
        object = (HashMap)ObjectWrapper.unwrap((IObjectWrapper)object);
        object2 = (HashMap)ObjectWrapper.unwrap((IObjectWrapper)object2);
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        this.zza.trackViews((View)iObjectWrapper, (Map)object, (Map)object2);
    }

    public final void zzz(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (View)ObjectWrapper.unwrap(iObjectWrapper);
        this.zza.untrackView((View)iObjectWrapper);
    }
}

