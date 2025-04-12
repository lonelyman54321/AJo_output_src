/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.controller.ConfigController;
import in.juspay.hypersdk.core.JBridge;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jk1
 */
public final class jk1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jk1_2(JBridge jBridge, String string2) {
        this.a = 0;
        this.c = jBridge;
        this.b = string2;
    }

    public /* synthetic */ jk1_2(String string2, ConfigController configController) {
        this.a = 1;
        this.b = string2;
        this.c = configController;
    }

    public final void run() {
        Object object = this.c;
        String string2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Intrinsics.checkNotNullParameter(string2, "$packageName");
                object = (ConfigController)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = new StringBuilder("Fetch config via fibo logic for ");
                object2.append(string2);
                Intrinsics.checkNotNullParameter(object2.toString(), "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                ((ConfigController)object).fetchConfig(string2);
                return;
            }
            case 0: 
        }
        JBridge.t((JBridge)object, string2);
    }
}

