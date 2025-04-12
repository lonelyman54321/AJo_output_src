/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.ril.ajio.payment.fragment.CheckoutFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zT
 */
public final class zt_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zt_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (JioAdView)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = null;
                JioAdView.access$setPreparedCallBackGiven$p((JioAdView)object2, false);
                Object object3 = new StringBuilder();
                j_0.h((JioAdView)object2, (StringBuilder)object3, ": Callback onAdClosed isVideoCompleted: false isEligibleForReward: false");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = ((JioAdView)object2).getMAdState();
                JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
                if (object3 != jioAdView$AdState && (object3 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                    ((JioAdListener)object3).onAdClosed((JioAdView)object2, false, false);
                }
                return;
            }
            case 0: 
        }
        object2 = (CheckoutFragment)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((CheckoutFragment)object2).o;
        if (object != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
    }
}

