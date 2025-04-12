/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IInterface
 *  android.os.RemoteException
 */
package com.google.android.gms.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomFormatAdLoadedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbka;
import com.google.android.gms.internal.ads.zzbkc;
import com.google.android.gms.internal.ads.zzbkd;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbut;
import com.google.android.gms.internal.ads.zzbuv;

public class AdLoader$Builder {
    private final Context zza;
    private final zzbq zzb;

    public AdLoader$Builder(Context object, String string2) {
        Context context = (Context)Preconditions.checkNotNull(object, "context cannot be null");
        zzaw zzaw2 = zzay.zza();
        zzbrb zzbrb2 = new zzbrb();
        object = zzaw2.zzc((Context)object, string2, zzbrb2);
        this.zza = context;
        this.zzb = object;
    }

    public AdLoader build() {
        Object object;
        zzp zzp2;
        Context context;
        try {
            context = this.zza;
        }
        catch (RemoteException remoteException) {
            zzm.zzh("Failed to build AdLoader.", remoteException);
            IInterface iInterface = new zzeu();
            context = this.zza;
            iInterface = iInterface.zzc();
            zzp2 = zzp.zza;
            object = new AdLoader(context, (zzbn)iInterface, zzp2);
            return object;
        }
        object = this.zzb;
        object = object.zze();
        zzp2 = zzp.zza;
        AdLoader adLoader2 = new AdLoader(context, (zzbn)object, zzp2);
        return adLoader2;
    }

    public AdLoader$Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener object, AdSize ... object2) {
        int n3;
        if (object2 != null && (n3 = ((AdSize[])object2).length) > 0) {
            Object object3 = this.zza;
            zzq zzq2 = new zzq((Context)object3, (AdSize[])object2);
            object2 = this.zzb;
            object3 = new zzbkc((OnAdManagerAdViewLoadedListener)object);
            try {
                object2.zzj((zzbjg)object3, zzq2);
            }
            catch (RemoteException remoteException) {
                object2 = "Failed to add Google Ad Manager banner ad listener";
                zzm.zzk((String)object2, remoteException);
            }
            return this;
        }
        object = new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        throw object;
    }

    public AdLoader$Builder forCustomFormatAd(String string2, NativeCustomFormatAd$OnCustomFormatAdLoadedListener object, NativeCustomFormatAd$OnCustomClickListener object2) {
        Object object3 = new zzbut((NativeCustomFormatAd$OnCustomFormatAdLoadedListener)object, (NativeCustomFormatAd$OnCustomClickListener)object2);
        object = this.zzb;
        object2 = ((zzbut)object3).zzb();
        object3 = ((zzbut)object3).zza();
        try {
            object.zzh(string2, (zzbjc)object2, (zzbiz)object3);
        }
        catch (RemoteException remoteException) {
            object = "Failed to add custom format ad listener";
            zzm.zzk((String)object, remoteException);
        }
        return this;
    }

    public AdLoader$Builder forNativeAd(NativeAd$OnNativeAdLoadedListener nativeAd$OnNativeAdLoadedListener) {
        Object object = this.zzb;
        zzbuv zzbuv2 = new zzbuv(nativeAd$OnNativeAdLoadedListener);
        try {
            object.zzk(zzbuv2);
        }
        catch (RemoteException remoteException) {
            object = "Failed to add google native ad listener";
            zzm.zzk((String)object, remoteException);
        }
        return this;
    }

    public AdLoader$Builder withAdListener(AdListener adListener) {
        Object object = this.zzb;
        com.google.android.gms.ads.internal.client.zzg zzg2 = new com.google.android.gms.ads.internal.client.zzg(adListener);
        try {
            object.zzl(zzg2);
        }
        catch (RemoteException remoteException) {
            object = "Failed to set AdListener.";
            zzm.zzk((String)object, remoteException);
        }
        return this;
    }

    public AdLoader$Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
        Object object = this.zzb;
        try {
            object.zzm(adManagerAdViewOptions);
        }
        catch (RemoteException remoteException) {
            object = "Failed to specify Ad Manager banner ad options";
            zzm.zzk((String)object, remoteException);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AdLoader$Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
        try {
            zzbhk zzbhk2;
            zzbq zzbq2 = this.zzb;
            boolean bl2 = nativeAdOptions.shouldReturnUrlsForImageAssets();
            boolean bl3 = nativeAdOptions.shouldRequestMultipleImages();
            int n3 = nativeAdOptions.getAdChoicesPlacement();
            Object object = nativeAdOptions.getVideoOptions();
            if (object != null) {
                VideoOptions videoOptions = nativeAdOptions.getVideoOptions();
                object = new zzfk(videoOptions);
            } else {
                object = null;
            }
            Object object2 = object;
            boolean bl4 = nativeAdOptions.zzc();
            int n4 = nativeAdOptions.getMediaAspectRatio();
            int n7 = nativeAdOptions.zza();
            boolean bl5 = nativeAdOptions.zzb();
            int n8 = nativeAdOptions.zzd();
            int n10 = n8 + -1;
            int n14 = 4;
            int n15 = -1;
            object = zzbhk2;
            zzbhk2 = new zzbhk(n14, bl2, n15, bl3, n3, (zzfk)object2, bl4, n4, n7, bl5, n10);
            zzbq2.zzo(zzbhk2);
            return this;
        }
        catch (RemoteException remoteException) {}
        String string2 = "Failed to specify native ad options";
        zzm.zzk(string2, remoteException);
        return this;
    }

    public final AdLoader$Builder zza(String string2, zzg object, zzf object2) {
        Object object3 = new zzbka((zzg)object, (zzf)object2);
        object = this.zzb;
        object2 = ((zzbka)object3).zzd();
        object3 = ((zzbka)object3).zzc();
        try {
            object.zzh(string2, (zzbjc)object2, (zzbiz)object3);
        }
        catch (RemoteException remoteException) {
            object = "Failed to add custom template ad listener";
            zzm.zzk((String)object, remoteException);
        }
        return this;
    }

    public final AdLoader$Builder zzb(zzi zzi2) {
        Object object = this.zzb;
        zzbkd zzbkd2 = new zzbkd(zzi2);
        try {
            object.zzk(zzbkd2);
        }
        catch (RemoteException remoteException) {
            object = "Failed to add google native ad listener";
            zzm.zzk((String)object, remoteException);
        }
        return this;
    }

    public final AdLoader$Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
        Object object = this.zzb;
        zzbhk zzbhk2 = new zzbhk(nativeAdOptions);
        try {
            object.zzo(zzbhk2);
        }
        catch (RemoteException remoteException) {
            object = "Failed to specify native ad options";
            zzm.zzk((String)object, remoteException);
        }
        return this;
    }
}

