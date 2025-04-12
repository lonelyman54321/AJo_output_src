/*
 * Decompiled with CFR 0.152.
 */
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.jioreel.adDetection.c;
import com.jio.jioads.jioreel.ssai.f;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aK
 */
public final class ak_1
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak_1(e82_0 e82_02, String string2) {
        this.a = 0;
        this.b = e82_02;
    }

    public /* synthetic */ ak_1(c c2) {
        this.a = 1;
        this.b = c2;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (c)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                ((f)object).b.onAdMediaEnd();
                Intrinsics.checkNotNullParameter("SDK onAdMediaEnd", "message");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                return;
            }
            case 0: 
        }
        ((e82_0)object).a();
    }
}

