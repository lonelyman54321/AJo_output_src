/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.admanager.zzb;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbwj;

public final class AdManagerAdView
extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context, 0);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3, 0, true);
        Preconditions.checkNotNull(context, "Context cannot be null");
    }

    public AdSize[] getAdSizes() {
        return this.zza.zzC();
    }

    public AppEventListener getAppEventListener() {
        return this.zza.zzh();
    }

    public VideoController getVideoController() {
        return this.zza.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.zza.zzg();
    }

    public void loadAd(AdManagerAdRequest object) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbep.zza(this.getContext());
        Object object2 = (Boolean)zzbgi.zzf.zze();
        boolean bl2 = (Boolean)object2;
        if (bl2) {
            object2 = zzbep.zzlg;
            Object object3 = zzba.zzc();
            object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
            bl2 = (Boolean)object2;
            if (bl2) {
                object2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                object3 = new zzb(this, (AdManagerAdRequest)object);
                object2.execute((Runnable)object3);
                return;
            }
        }
        object2 = this.zza;
        object = ((AdRequest)object).zza();
        ((zzea)object2).zzm((zzdx)object);
    }

    public void recordManualImpression() {
        this.zza.zzo();
    }

    public void setAdSizes(AdSize ... adSizeArray) {
        int n3;
        if (adSizeArray != null && (n3 = adSizeArray.length) > 0) {
            this.zza.zzt(adSizeArray);
            return;
        }
        adSizeArray = new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        throw adSizeArray;
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.zza.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean bl2) {
        this.zza.zzw(bl2);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.zza.zzy(videoOptions);
    }

    public final /* synthetic */ void zza(AdManagerAdRequest object) {
        zzea zzea2;
        try {
            zzea2 = this.zza;
        }
        catch (IllegalStateException illegalStateException) {
            zzbwj.zza(this.getContext()).zzh(illegalStateException, "AdManagerAdView.loadAd");
            return;
        }
        object = ((AdRequest)object).zza();
        zzea2.zzm((zzdx)object);
    }

    public final boolean zzb(zzbu zzbu2) {
        return this.zza.zzz(zzbu2);
    }
}

