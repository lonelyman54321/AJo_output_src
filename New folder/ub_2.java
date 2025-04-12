/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ub
 */
public final class ub_2
implements F62 {
    public final /* synthetic */ AjioVideoPlayerFullScreenFragment a;

    public /* synthetic */ ub_2(AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment) {
        this.a = ajioVideoPlayerFullScreenFragment;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        object = (Long)object;
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = this.a;
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, "this$0");
        Object object2 = ajioVideoPlayerFullScreenFragment.n;
        VideoSetting videoSetting = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object2 = null;
        }
        Object object3 = eb_2.a;
        Intrinsics.checkNotNull(object);
        long l2 = (Long)object;
        object3 = eb_2.a(l2);
        object2.setText((CharSequence)object3);
        object2 = ajioVideoPlayerFullScreenFragment.F;
        if (object2 != null && (object2 = ((BannerData)object2).getDuration()) != null) {
            boolean bl2;
            l2 = ((Number)object2).longValue();
            long l3 = (Long)object;
            long l4 = (l2 -= l3) - (l3 = (long)2);
            Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object4 >= 0 && !(bl2 = ajioVideoPlayerFullScreenFragment.f)) {
                boolean bl3;
                ajioVideoPlayerFullScreenFragment.f = bl3 = true;
                object3 = VideoComponentEvents.Companion.getInstance();
                object = ajioVideoPlayerFullScreenFragment.F;
                if (object == null || (object = ((BannerData)object).getBannerUrl()) == null || (object = ai0_2.h((String)object)) == null) {
                    object = "";
                }
                Object object5 = object;
                object = ajioVideoPlayerFullScreenFragment.s;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                    boolean bl4 = false;
                    object = null;
                }
                if ((object2 = ajioVideoPlayerFullScreenFragment.F) != null) {
                    videoSetting = ((BannerData)object2).getVideoSettings();
                }
                object.getClass();
                boolean bl5 = ow_0.g(videoSetting);
                long l7 = ajioVideoPlayerFullScreenFragment.D;
                String string2 = "video_banner_interactions";
                String string3 = "video_screen_interaction";
                boolean bl6 = true;
                ((VideoComponentEvents)object3).logVideoWatchEvent(bl6, (String)object5, bl5, l7, string2, string3);
            }
        }
    }
}

