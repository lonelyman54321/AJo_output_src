/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.widget.NestedScrollView;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jioads.mediation.JioAdMediationController;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from al1
 */
public final class al1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ al1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                wd2_0 wd2_02 = (wd2_0)this.b;
                Intrinsics.checkNotNullParameter(wd2_02, "this$0");
                NestedScrollView nestedScrollView = wd2_02.u;
                if (nestedScrollView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("scrollView");
                    n3 = 0;
                    nestedScrollView = null;
                }
                ai0_2.s(nestedScrollView);
                return;
            }
            case 0: 
        }
        Object object = (JioAdMediationController)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
        object2 = object2 != null ? ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease() : null;
        if (object2 != null && (object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n()) != null && (object2 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
            object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
            ((JioAdListener)object2).onAdMediaExpand((JioAdView)object);
        }
    }
}

