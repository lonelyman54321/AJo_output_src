/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.jioreel.adDetection.k;
import com.jio.jioads.jioreel.ssai.f;
import in.juspay.hypersdk.analytics.LogSessioniser;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cx1
 */
public final class cx1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cx1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (k)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                ((f)object).b.onAdMediaEnd();
                Intrinsics.checkNotNullParameter("SDK onAdMediaEnd", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                ((k)object).L = null;
                return;
            }
            case 0: 
        }
        LogSessioniser.c((LogSessioniser)object);
    }
}

