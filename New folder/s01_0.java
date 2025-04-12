/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.ads.AdRequest;
import com.jioads.mediation.partners.GooglePlayServicesBanner;

/*
 * Renamed from s01
 */
public final class s01_0
implements Runnable {
    public final /* synthetic */ GooglePlayServicesBanner a;
    public final /* synthetic */ AdRequest b;

    public /* synthetic */ s01_0(GooglePlayServicesBanner googlePlayServicesBanner, AdRequest adRequest) {
        this.a = googlePlayServicesBanner;
        this.b = adRequest;
    }

    public final void run() {
        GooglePlayServicesBanner googlePlayServicesBanner = this.a;
        AdRequest adRequest = this.b;
        GooglePlayServicesBanner.a(googlePlayServicesBanner, adRequest);
    }
}

