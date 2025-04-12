/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jioads.mediation.JioAdMediationController;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zk1
 */
public final class zk1_1
implements Runnable {
    public final /* synthetic */ JioAdMediationController a;

    public /* synthetic */ zk1_1(JioAdMediationController jioAdMediationController) {
        this.a = jioAdMediationController;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
        if (object2 != null && (object2 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
            ((JioAdListener)object2).onAdSkippable((JioAdView)object);
        }
    }
}

