/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAd$OnNativeAdLoadedListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jioads.mediation.partners.GooglePlayServicesNative;
import com.jioads.mediation.partners.JioMediationListener;

/*
 * Renamed from u01
 */
public final class u01_0
implements NativeAd$OnNativeAdLoadedListener {
    public final /* synthetic */ GooglePlayServicesNative a;
    public final /* synthetic */ JioMediationListener b;
    public final /* synthetic */ JioAdView c;

    public /* synthetic */ u01_0(GooglePlayServicesNative googlePlayServicesNative, JioMediationListener jioMediationListener, JioAdView jioAdView) {
        this.a = googlePlayServicesNative;
        this.b = jioMediationListener;
        this.c = jioAdView;
    }

    public final void onNativeAdLoaded(NativeAd nativeAd) {
        JioMediationListener jioMediationListener = this.b;
        JioAdView jioAdView = this.c;
        GooglePlayServicesNative.a(this.a, jioMediationListener, jioAdView, nativeAd);
    }
}

