/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.jioads.adinterfaces.l_0;
import com.jio.jioads.videomodule.VideoViewAudioState;
import com.jio.jioads.videomodule.h_0;
import com.jio.jioads.videomodule.j_0;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from t7
 */
public final class t7_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        boolean bl2;
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (s)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = new StringBuilder();
                l_0.e((s)object2, (StringBuilder)object, ": ivAdSoundToggle clicked");
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object = JioAds$LogLevel.NONE;
                object = ((s)object2).B;
                VideoViewAudioState videoViewAudioState = h_0.a;
                n3 = (int)(Intrinsics.areEqual(object, videoViewAudioState) ? 1 : 0);
                if (n3 != 0) {
                    ((s)object2).Q(false);
                } else {
                    videoViewAudioState = j_0.a;
                    boolean bl3 = Intrinsics.areEqual(object, videoViewAudioState);
                    if (bl3) {
                        ((s)object2).F(false);
                    }
                }
                return;
            }
            case 1: {
                object2 = (op_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((op_2)object2).d;
                if (object != null) {
                    object.O8();
                }
                return;
            }
            case 0: 
        }
        object2 = (AjioExoPlayerFragment)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        ((AjioExoPlayerFragment)object2).y = bl2 = true;
        ((AjioExoPlayerFragment)object2).Ta(bl2);
    }
}

