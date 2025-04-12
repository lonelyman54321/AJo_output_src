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
import com.jio.jioads.jioreel.tracker.model.b;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from o7
 */
public final class o7_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        boolean bl2 = false;
        object = null;
        Object object2 = "this$0";
        Object object3 = this.b;
        int bl3 = this.a;
        switch (bl3) {
            default: {
                boolean bl4;
                object3 = (s)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object2 = new StringBuilder();
                com.jio.jioads.jioreel.tracker.model.b.d((s)object3, (StringBuilder)object2, ": ivAdPlayback clicked current state: ");
                Object object4 = ((s)object3).X;
                Boolean bl5 = null;
                if (object4 != null) {
                    boolean bl6 = object4.isPlaying();
                    object4 = bl6;
                } else {
                    boolean bl7 = false;
                    object4 = null;
                }
                ((StringBuilder)object2).append(object4);
                object2 = ((StringBuilder)object2).toString();
                object4 = "message";
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
                object2 = JioAds$LogLevel.NONE;
                object2 = ((s)object3).X;
                if (object2 != null) {
                    bl4 = object2.isPlaying();
                    bl5 = bl4;
                }
                if (bl4 = Intrinsics.areEqual(bl5, object2 = Boolean.TRUE)) {
                    ((s)object3).K(false);
                } else {
                    object2 = Boolean.FALSE;
                    bl4 = Intrinsics.areEqual(bl5, object2);
                    if (bl4) {
                        ((s)object3).O(false);
                    }
                }
                return;
            }
            case 0: 
        }
        object3 = (AjioExoPlayerFragment)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object2 = ((AjioExoPlayerFragment)object3).n;
        if (object2 != null) {
            object = ((VideoSetting)object2).getFullScreen();
            object2 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object, object2);
        }
        if (bl2) {
            ((AjioExoPlayerFragment)object3).Wa();
        }
    }
}

