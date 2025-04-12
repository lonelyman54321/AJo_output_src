/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.ads.mediation;

import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd$Image;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zze;
import com.google.android.gms.ads.formats.zzj;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

final class zza
extends UnifiedNativeAdMapper {
    private final UnifiedNativeAd zza;

    public zza(UnifiedNativeAd object) {
        this.zza = object;
        Object object2 = ((UnifiedNativeAd)object).zzh();
        this.setHeadline((String)object2);
        object2 = ((UnifiedNativeAd)object).zzk();
        this.setImages((List)object2);
        object2 = ((UnifiedNativeAd)object).zzf();
        this.setBody((String)object2);
        object2 = ((UnifiedNativeAd)object).zzb();
        this.setIcon((NativeAd$Image)object2);
        object2 = ((UnifiedNativeAd)object).zzg();
        this.setCallToAction((String)object2);
        object2 = ((UnifiedNativeAd)object).zze();
        this.setAdvertiser((String)object2);
        object2 = ((UnifiedNativeAd)object).zzc();
        this.setStarRating((Double)object2);
        object2 = ((UnifiedNativeAd)object).zzj();
        this.setStore((String)object2);
        object2 = ((UnifiedNativeAd)object).zzi();
        this.setPrice((String)object2);
        object2 = ((UnifiedNativeAd)object).zzd();
        this.zzd(object2);
        boolean bl2 = true;
        this.setOverrideImpressionRecording(bl2);
        this.setOverrideClickHandling(bl2);
        object = ((UnifiedNativeAd)object).zza();
        this.zze((VideoController)object);
    }

    public final void trackViews(View object, Map map2, Map map3) {
        boolean bl2 = object instanceof zzj;
        if (!bl2) {
            map2 = zze.zza;
            if ((object = (zze)((WeakHashMap)map2).get(object)) == null) {
                return;
            }
            throw null;
        }
        throw null;
    }
}

