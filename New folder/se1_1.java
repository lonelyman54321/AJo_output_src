/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAdView$AdState;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SE1
 */
public final class se1_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ se1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (JioAdView)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = new StringBuilder();
                j_0.h((JioAdView)object, (StringBuilder)object2, ": Callback onAdMediaStart");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = ((JioAdView)object).getMAdState();
                JioAdView$AdState jioAdView$AdState = JioAdView$AdState.DESTROYED;
                if (object2 == jioAdView$AdState || (object2 = ((JioAdView)object).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) == null) return;
                ((JioAdListener)object2).onAdMediaStart((JioAdView)object);
                return;
            }
            case 0: 
        }
        object = (ou0_0)object;
        try {
            ((ou0_0)object).b();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

