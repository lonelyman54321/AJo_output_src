/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.media3.common.b;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yb
 */
public final class yb_2
implements Runnable {
    public final /* synthetic */ AjioVideoPlayerFullScreenFragment a;

    public /* synthetic */ yb_2(AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment) {
        this.a = ajioVideoPlayerFullScreenFragment;
    }

    public final void run() {
        int n3;
        int n4;
        AjioVideoPlayerFullScreenFragment ajioVideoPlayerFullScreenFragment = this.a;
        Intrinsics.checkNotNullParameter(ajioVideoPlayerFullScreenFragment, "this$0");
        Object object = ajioVideoPlayerFullScreenFragment.h;
        Object object2 = "seekbar";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = ajioVideoPlayerFullScreenFragment.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgVolume");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = ajioVideoPlayerFullScreenFragment.n;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = ajioVideoPlayerFullScreenFragment.t;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnShop");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = ajioVideoPlayerFullScreenFragment.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgClose");
            n4 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = ajioVideoPlayerFullScreenFragment.s;
        if (object == null) {
            ajioVideoPlayerFullScreenFragment.Ra();
        }
        object = ajioVideoPlayerFullScreenFragment.s;
        String string2 = "ajioVideoPlayer";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        }
        if ((object = ((ob_2)object).i) != null && (n4 = ((b)object).isPlaying()) == (n3 = 1)) {
            object = ajioVideoPlayerFullScreenFragment.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            if ((object = ((ob_2)object).i) != null) {
                string2 = null;
                object.setPlayWhenReady(false);
            }
            if ((object = ajioVideoPlayerFullScreenFragment.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            } else {
                object3 = object;
            }
            n4 = 8;
            object3.setVisibility(n4);
            object2 = VideoComponentEvents.Companion.getInstance();
            object = ajioVideoPlayerFullScreenFragment.u;
            string2 = ai0_2.h((String)object);
            long l2 = ajioVideoPlayerFullScreenFragment.D;
            object3 = "video_banner_interactions";
            n3 = 0;
            String string3 = "video_screen_interaction";
            String string4 = "full screen";
            ((VideoComponentEvents)object2).logVideoPauseEvent((String)object3, string2, false, l2, string3, string4);
        }
    }
}

