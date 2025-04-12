/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsIntent$e;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbtw;

public final class zzbtx
implements MediationInterstitialAdapter {
    private Activity zza;
    private MediationInterstitialListener zzb;
    private Uri zzc;

    public static /* bridge */ /* synthetic */ Activity zza(zzbtx zzbtx2) {
        return zzbtx2.zza;
    }

    public static /* bridge */ /* synthetic */ MediationInterstitialListener zzb(zzbtx zzbtx2) {
        return zzbtx2.zzb;
    }

    public final void onDestroy() {
        zzm.zze("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        zzm.zze("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        zzm.zze("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, MediationInterstitialListener object, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.zzb = object;
        if (object == null) {
            zzm.zzj("Listener not set for mediation. Returning.");
            return;
        }
        boolean bl2 = context instanceof Activity;
        if (bl2) {
            bl2 = zzbfm.zzg(context);
            if (!bl2) {
                zzm.zzj("Default browser does not support custom tabs. Bailing out.");
                this.zzb.onAdFailedToLoad((MediationInterstitialAdapter)this, 0);
                return;
            }
            object = bundle.getString("tab_url");
            boolean bl3 = TextUtils.isEmpty((CharSequence)object);
            if (bl3) {
                zzm.zzj("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.zzb.onAdFailedToLoad((MediationInterstitialAdapter)this, 0);
                return;
            }
            context = (Activity)context;
            this.zza = context;
            context = Uri.parse((String)object);
            this.zzc = context;
            this.zzb.onAdLoaded(this);
            return;
        }
        zzm.zzj("AdMobCustomTabs can only work with Activity context. Bailing out.");
        this.zzb.onAdFailedToLoad((MediationInterstitialAdapter)this, 0);
    }

    public final void showInterstitial() {
        Object object = new CustomTabsIntent$e();
        object = ((CustomTabsIntent$e)object).a();
        Object object2 = ((CustomTabsIntent)object).intent;
        Object object3 = this.zzc;
        object2.setData(object3);
        object = ((CustomTabsIntent)object).intent;
        zzc zzc2 = new zzc((Intent)object, null);
        zzbtv zzbtv2 = new zzbtv(this);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 0, false);
        object = new AdOverlayInfoParcel(zzc2, null, zzbtv2, null, versionInfoParcel, null, null);
        object2 = zzt.zza;
        object3 = new zzbtw(this, (AdOverlayInfoParcel)object);
        object2.post((Runnable)object3);
        zzu.zzo().zzq();
    }
}

