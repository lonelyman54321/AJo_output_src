/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 */
package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd$Image;
import java.util.List;
import java.util.Map;

public abstract class UnifiedNativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private NativeAd$Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private VideoController zzj;
    private boolean zzk;
    private View zzl;
    private View zzm;
    private Object zzn;
    private Bundle zzo;
    private boolean zzp;
    private boolean zzq;
    private float zzr;

    public UnifiedNativeAdMapper() {
        Bundle bundle;
        this.zzo = bundle = new Bundle();
    }

    public View getAdChoicesContent() {
        return this.zzl;
    }

    public final String getAdvertiser() {
        return this.zzf;
    }

    public final String getBody() {
        return this.zzc;
    }

    public final String getCallToAction() {
        return this.zze;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.zzo;
    }

    public final String getHeadline() {
        return this.zza;
    }

    public final NativeAd$Image getIcon() {
        return this.zzd;
    }

    public final List getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzr;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzq;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzp;
    }

    public final String getPrice() {
        return this.zzi;
    }

    public final Double getStarRating() {
        return this.zzg;
    }

    public final String getStore() {
        return this.zzh;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.zzk;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.zzl = view;
    }

    public final void setAdvertiser(String string2) {
        this.zzf = string2;
    }

    public final void setBody(String string2) {
        this.zzc = string2;
    }

    public final void setCallToAction(String string2) {
        this.zze = string2;
    }

    public final void setExtras(Bundle bundle) {
        this.zzo = bundle;
    }

    public void setHasVideoContent(boolean bl2) {
        this.zzk = bl2;
    }

    public final void setHeadline(String string2) {
        this.zza = string2;
    }

    public final void setIcon(NativeAd$Image nativeAd$Image) {
        this.zzd = nativeAd$Image;
    }

    public final void setImages(List list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f5) {
        this.zzr = f5;
    }

    public void setMediaView(View view) {
        this.zzm = view;
    }

    public final void setOverrideClickHandling(boolean bl2) {
        this.zzq = bl2;
    }

    public final void setOverrideImpressionRecording(boolean bl2) {
        this.zzp = bl2;
    }

    public final void setPrice(String string2) {
        this.zzi = string2;
    }

    public final void setStarRating(Double d2) {
        this.zzg = d2;
    }

    public final void setStore(String string2) {
        this.zzh = string2;
    }

    public void trackViews(View view, Map map2, Map map3) {
    }

    public void untrackView(View view) {
    }

    public final View zza() {
        return this.zzm;
    }

    public final VideoController zzb() {
        return this.zzj;
    }

    public final Object zzc() {
        return this.zzn;
    }

    public final void zzd(Object object) {
        this.zzn = object;
    }

    public final void zze(VideoController videoController) {
        this.zzj = videoController;
    }
}

