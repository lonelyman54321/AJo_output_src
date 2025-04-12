/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.ads.AdRequest$Builder;
import com.jioads.mediation.partners.GooglePlayServicesInterstitial;

/*
 * Renamed from t01
 */
public final class t01_0
implements Runnable {
    public final /* synthetic */ GooglePlayServicesInterstitial a;
    public final /* synthetic */ AdRequest$Builder b;

    public /* synthetic */ t01_0(GooglePlayServicesInterstitial googlePlayServicesInterstitial, AdRequest$Builder adRequest$Builder) {
        this.a = googlePlayServicesInterstitial;
        this.b = adRequest$Builder;
    }

    public final void run() {
        GooglePlayServicesInterstitial googlePlayServicesInterstitial = this.a;
        AdRequest$Builder adRequest$Builder = this.b;
        GooglePlayServicesInterstitial.a(googlePlayServicesInterstitial, adRequest$Builder);
    }
}

