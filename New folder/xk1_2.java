/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jioads.mediation.JioAdMediationController;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xk1
 */
public final class xk1_2
implements Runnable {
    public final /* synthetic */ JioAdMediationController a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xk1_2(JioAdMediationController jioAdMediationController, boolean bl2) {
        this.a = jioAdMediationController;
        this.b = bl2;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
        object2 = object2 != null ? ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
        if (object2 != null) {
            JioAdView jioAdView;
            object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
            if (object2 != null && (object2 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                jioAdView = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
                ((JioAdListener)object2).onAdMediaEnd(jioAdView);
            }
            if ((object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n()) != null && (object2 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
                jioAdView = null;
                boolean bl2 = this.b;
                ((JioAdListener)object2).onAdClosed((JioAdView)object, bl2, false);
            }
        }
    }
}

