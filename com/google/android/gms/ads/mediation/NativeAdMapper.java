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
import com.google.android.gms.ads.nativead.NativeAd$Image;
import java.util.List;
import java.util.Map;

public abstract class NativeAdMapper {
    private String zza;
    private List zzb;
    private String zzc;
    private NativeAd.Image zzd;
    private String zze;
    private String zzf;
    private Double zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private View zzk;
    private View zzl;
    private Bundle zzm;
    private boolean zzn;
    private boolean zzo;
    private float zzp;

    public NativeAdMapper() {
        Bundle bundle;
        this.zzm = bundle = new Bundle();
    }

    public View getAdChoicesContent() {
        return this.zzk;
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
        return this.zzm;
    }

    public final String getHeadline() {
        return this.zza;
    }

    public final NativeAd.Image getIcon() {
        return this.zzd;
    }

    public final List getImages() {
        return this.zzb;
    }

    public float getMediaContentAspectRatio() {
        return this.zzp;
    }

    public final boolean getOverrideClickHandling() {
        return this.zzo;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.zzn;
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
        return this.zzj;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.zzk = view;
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
        this.zzm = bundle;
    }

    public void setHasVideoContent(boolean bl2) {
        this.zzj = bl2;
    }

    public final void setHeadline(String string2) {
        this.zza = string2;
    }

    public final void setIcon(NativeAd.Image image) {
        this.zzd = image;
    }

    public final void setImages(List list) {
        this.zzb = list;
    }

    public void setMediaContentAspectRatio(float f5) {
        this.zzp = f5;
    }

    public void setMediaView(View view) {
        this.zzl = view;
    }

    public final void setOverrideClickHandling(boolean bl2) {
        this.zzo = bl2;
    }

    public final void setOverrideImpressionRecording(boolean bl2) {
        this.zzn = bl2;
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
        return this.zzl;
    }
}

