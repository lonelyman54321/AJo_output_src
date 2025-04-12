/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jioads.mediation.JioAdMediationController;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yk1
 */
public final class yk1_2
implements Runnable {
    public final /* synthetic */ JioAdMediationController a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ yk1_2(JioAdMediationController jioAdMediationController, boolean bl2) {
        this.a = jioAdMediationController;
        this.b = bl2;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
        if (object2 != null && (object2 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
            boolean bl2 = true;
            boolean bl3 = this.b;
            ((JioAdListener)object2).onAdClosed((JioAdView)object, bl2, bl3);
        }
    }
}

