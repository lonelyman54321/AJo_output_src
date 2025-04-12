/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.j_0;
import com.jio.jioads.util.f;
import in.juspay.hypersdk.core.SdkTracker;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vU2
 */
public final class vu2_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vu2_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (JioAdView)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                object = (String)object;
                Intrinsics.checkNotNullParameter(object, "$packageName");
                Object object3 = new StringBuilder();
                String string2 = ": Refresh fibotimer is finished so calling cacheAd";
                j_0.h((JioAdView)object2, (StringBuilder)object3, string2);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object3 = JioAds$LogLevel.NONE;
                object3 = JioAdView.access$getFiboTimerMap$p((JioAdView)object2);
                if (object3 != null) {
                    object = (f)((HashMap)object3).remove(object);
                }
                ((JioAdView)object2).cacheAd();
                return;
            }
            case 0: 
        }
        object2 = (SdkTracker)object2;
        object = (Boolean)object;
        SdkTracker.e((SdkTracker)object2, (Boolean)object);
    }
}

