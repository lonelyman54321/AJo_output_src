/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.analytics.events.VideoComponentEvents$Companion;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cb
 */
public final class cb_2
implements View.OnClickListener {
    public final /* synthetic */ AjioVideoPlayerFullScreenFragment a;

    public /* synthetic */ cb_2(AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment) {
        this.a = ajioVideoPlayerFullScreenFragment;
    }

    public final void onClick(View view) {
        boolean bl2;
        sD3 sD32 = this.a;
        Intrinsics.checkNotNullParameter(sD32, "this$0");
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a();
        ((AJIOApplication)object).e = bl2 = true;
        boolean bl3 = ((AjioVideoPlayerFullScreenFragment)sD32).B;
        if (bl3) {
            boolean bl4;
            Object object2;
            object = VideoComponentEvents.Companion;
            Object object3 = ((VideoComponentEvents$Companion)object).getInstance();
            String string2 = ai0_2.h(((AjioVideoPlayerFullScreenFragment)sD32).u);
            ob_2 ob_22 = ((AjioVideoPlayerFullScreenFragment)sD32).s;
            String string3 = "ajioVideoPlayer";
            VideoSetting videoSetting = null;
            if (ob_22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                ob_22 = null;
            }
            if ((object2 = ((AjioVideoPlayerFullScreenFragment)sD32).F) != null) {
                object2 = ((BannerData)object2).getVideoSettings();
            } else {
                bl4 = false;
                object2 = null;
            }
            ob_22.getClass();
            bl4 = ow_0.g((VideoSetting)object2);
            long l2 = ((AjioVideoPlayerFullScreenFragment)sD32).D;
            ob_22 = null;
            String string4 = "video_banner_interactions";
            String string5 = "video_screen_interaction";
            String string6 = "minimised";
            ((VideoComponentEvents)object3).logExpandMinimizeEvent(false, string2, bl4, l2, string4, string5, string6);
            VideoComponentEvents videoComponentEvents = ((VideoComponentEvents$Companion)object).getInstance();
            String string7 = ai0_2.h(((AjioVideoPlayerFullScreenFragment)sD32).u);
            object = ((AjioVideoPlayerFullScreenFragment)sD32).s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl3 = false;
                object = null;
            }
            if ((object3 = ((AjioVideoPlayerFullScreenFragment)sD32).F) != null) {
                videoSetting = ((BannerData)object3).getVideoSettings();
            }
            object.getClass();
            boolean bl5 = ow_0.g(videoSetting);
            long l3 = ((AjioVideoPlayerFullScreenFragment)sD32).D;
            String string8 = "video_banner_interactions";
            String string9 = "video_screen_interaction";
            videoComponentEvents.logCloseVideoEvent(string7, bl5, l3, string8, string9);
        }
        if ((sD32 = ((Fragment)sD32).getActivity()) != null) {
            ((ComponentActivity)sD32).onBackPressed();
        }
    }
}

