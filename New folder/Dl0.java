/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$c;
import androidx.media3.exoplayer.drm.b$a;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jioads.mediation.JioAdMediationController;
import kotlin.jvm.internal.Intrinsics;

public final class Dl0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Dl0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object = (JioAdMediationController)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Object object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
                if (object2 != null) {
                    object2 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                } else {
                    boolean bl2 = false;
                    object2 = null;
                }
                if (object2 != null && (object2 = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n()) != null && (object2 = ((JioAdView)object2).getMAdListener$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease()) != null) {
                    object = JioAdMediationController.access$getIJioAdView$p((JioAdMediationController)object).n();
                    ((JioAdListener)object2).onAdMediaStart((JioAdView)object);
                }
                return;
            }
            case 0: 
        }
        DefaultDrmSessionManager$c defaultDrmSessionManager$c = (DefaultDrmSessionManager$c)this.b;
        boolean bl3 = defaultDrmSessionManager$c.d;
        if (!bl3) {
            Object object = defaultDrmSessionManager$c.c;
            if (object != null) {
                b$a b$a = defaultDrmSessionManager$c.b;
                object.e(b$a);
            }
            object = defaultDrmSessionManager$c.e.n;
            object.remove(defaultDrmSessionManager$c);
            defaultDrmSessionManager$c.d = bl3 = true;
        }
    }
}

