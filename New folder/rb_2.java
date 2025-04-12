/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import com.ril.ajio.videoPlayer.ui.AjioVideoPlayerFullScreenFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rb
 */
public final class rb_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ rb_2(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        boolean bl2;
        Object object2;
        boolean bl3;
        int n3 = this.a;
        switch (n3) {
            default: {
                bG1 bG12 = (bG1)this.b;
                Intrinsics.checkNotNullParameter(bG12, "this$0");
                bG12.onNavigationClick();
                return;
            }
            case 0: 
        }
        object = (AjioVideoPlayerFullScreenFragment)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((AjioVideoPlayerFullScreenFragment)object).K = bl3 = true;
        Object object3 = ((AjioVideoPlayerFullScreenFragment)object).m;
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            bl3 = false;
            object3 = null;
        }
        int n4 = 8;
        object3.setVisibility(n4);
        object3 = ((AjioVideoPlayerFullScreenFragment)object).o;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            bl3 = false;
            object3 = null;
        }
        ai0_2.i((View)object3);
        object3 = ((AjioVideoPlayerFullScreenFragment)object).s;
        String string2 = "ajioVideoPlayer";
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object3 = null;
        }
        long l2 = 0L;
        ((ob_2)object3).m(l2);
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        object3 = ((AjioVideoPlayerFullScreenFragment)object).s;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl3 = false;
            object3 = null;
        }
        if ((object2 = ((AjioVideoPlayerFullScreenFragment)object).F) != null) {
            object2 = ((BannerData)object2).getVideoSettings();
        } else {
            bl2 = false;
            object2 = null;
        }
        object3.getClass();
        boolean bl4 = ow_0.g((VideoSetting)object2);
        object3 = ((AjioVideoPlayerFullScreenFragment)object).u;
        String string3 = ai0_2.h((String)object3);
        long l3 = ((AjioVideoPlayerFullScreenFragment)object).D;
        bl2 = true;
        String string4 = "video_banner_interactions";
        String string5 = "video_screen_interaction";
        String string6 = "full screen";
        videoComponentEvents.logReplayEvent(bl2, string3, bl4, l3, string4, string5, string6);
        object = ((AjioVideoPlayerFullScreenFragment)object).s;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object4 = object;
        }
        ((ob_2)object4).k();
    }
}

