/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vb
 */
public final class vb_2
implements F62 {
    public final /* synthetic */ AjioVideoPlayerFullScreenFragment a;

    public /* synthetic */ vb_2(AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment) {
        this.a = ajioVideoPlayerFullScreenFragment;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onChanged(Object object) {
        object = (Long)object;
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = this.a;
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, "this$0");
        Object object2 = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNull(object);
        long l2 = (Long)object;
        long l3 = ((TimeUnit)((Object)object2)).toSeconds(l2);
        long l4 = 2;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 > 0 && (l7 = (long)ajioVideoPlayerFullScreenFragment.f) == false) {
            BannerData bannerData;
            ajioVideoPlayerFullScreenFragment.f = true;
            object = cp_1.Companion;
            l7 = (long)km_1.b((cp$a)object);
            if (l7 != false && (l7 = (long)ajioVideoPlayerFullScreenFragment.K) == false) {
                l7 = 0;
                object = null;
                ajioVideoPlayerFullScreenFragment.y = false;
                ajioVideoPlayerFullScreenFragment.Sa();
            }
            object2 = VideoComponentEvents.Companion.getInstance();
            object = ajioVideoPlayerFullScreenFragment.F;
            if (object == null || (object = ((BannerData)object).getBannerUrl()) == null || (object = ai0_2.h((String)object)) == null) {
                object = "";
            }
            Object object3 = object;
            object = ajioVideoPlayerFullScreenFragment.s;
            boolean bl2 = false;
            VideoSetting videoSetting = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ajioVideoPlayer");
                l7 = 0;
                object = null;
            }
            if ((bannerData = ajioVideoPlayerFullScreenFragment.F) != null) {
                videoSetting = bannerData.getVideoSettings();
            }
            object.getClass();
            boolean bl3 = ow_0.g(videoSetting);
            long l8 = ajioVideoPlayerFullScreenFragment.D;
            String string2 = "video_banner_interactions";
            String string3 = "video_screen_interaction";
            bl2 = true;
            ((VideoComponentEvents)object2).logVideoWatchEvent(bl2, (String)object3, bl3, l8, string2, string3);
        }
    }
}

