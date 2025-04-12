/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.media3.common.b;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sg0
 */
public final class sg0_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sg0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                boolean bl3;
                object2 = (dj2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((dj2_2)object2).k;
                Object object3 = "ajioVideoPlayer";
                String string2 = null;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    bl3 = false;
                    object = null;
                }
                if ((object = ((ob_2)object).i) != null && (bl3 = ((b)object).isPlaying()) == (bl2 = true)) {
                    object = ((dj2_2)object2).k;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        bl3 = false;
                        object = null;
                    }
                    if ((object = ((ob_2)object).i) != null) {
                        n3 = 0;
                        object3 = null;
                        object.setPlayWhenReady(false);
                    }
                    if ((object = ((dj2_2)object2).g) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("imgPause");
                        bl3 = false;
                        object = null;
                    }
                    ai0_2.i((View)object);
                    object = ((dj2_2)object2).f;
                    object3 = "imgPlay";
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        bl3 = false;
                        object = null;
                    }
                    ai0_2.B((View)object);
                    object = ((dj2_2)object2).f;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                        bl3 = false;
                        object = null;
                    }
                    ai0_2.a((View)object);
                    object = ((dj2_2)object2).v;
                    object3 = ((dj2_2)object2).w;
                    object.removeCallbacks((Runnable)object3);
                    VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
                    String string3 = ai0_2.h(((dj2_2)object2).l);
                    long l2 = ((dj2_2)object2).s;
                    object = ((Fragment)object2).getArguments();
                    if (object != null) {
                        object3 = "product_id";
                        object = object.getString((String)object3);
                    } else {
                        bl3 = false;
                        object = null;
                    }
                    String string4 = String.valueOf(object);
                    object = ((Fragment)object2).getArguments();
                    if (object != null) {
                        object2 = "product_name";
                        string2 = object.getString((String)object2);
                    }
                    String string5 = String.valueOf(string2);
                    String string6 = "video_banner_interactions";
                    String string7 = "video_screen_interaction";
                    boolean bl4 = true;
                    videoComponentEvents.logPlayPauseEvent(string3, false, l2, string4, string5, bl4, false, string6, string7);
                }
                return;
            }
            case 0: 
        }
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        object2 = (CustomWebViewActivity)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = ((CustomWebViewActivity)object2).w0;
        n3 = 21;
        if (n4 == n3) {
            object2.finish();
        } else {
            ((CustomWebViewActivity)object2).F2();
        }
    }
}

