/*
 * Decompiled with CFR 0.152.
 */
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import androidx.transition.Transition$j;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.adinterfaces.j_0;

/*
 * Renamed from jr3
 */
public final class jr3_0
implements Transition$j {
    public static void b(JioAdView jioAdView, StringBuilder stringBuilder, String string2, JioAds$Companion jioAds$Companion) {
        j_0.h(jioAdView, stringBuilder, string2);
        jioAds$Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
    }

    public void a(Transition$i transition$i, Transition transition2, boolean bl2) {
        transition$i.onTransitionEnd(transition2, bl2);
    }
}

