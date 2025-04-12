/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Bj2
 */
public final class bj2_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View.OnClickListener b;

    public /* synthetic */ bj2_1(int n3, View.OnClickListener onClickListener) {
        this.a = n3;
        this.b = onClickListener;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (vv2_1)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                Product product = ((vv2_1)object).N0;
                if (product != null && (object = ((vv2_1)object).n) != null) {
                    object.u2(product);
                }
                return;
            }
            case 0: 
        }
        dj2_2 dj2_22 = (dj2_2)this.b;
        Intrinsics.checkNotNullParameter(dj2_22, "this$0");
        n3 = 1;
        dj2_22.z = n3;
        object = dj2_22.e;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgReplay");
            n3 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = dj2_22.i;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgThumbnail");
            n3 = 0;
            object = null;
        }
        ai0_2.i((View)object);
        object = dj2_22.k;
        String string2 = "ajioVideoPlayer";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object = null;
        }
        long l2 = 0L;
        ((ob_2)object).m(l2);
        VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
        String string3 = ai0_2.h(dj2_22.l);
        long l3 = dj2_22.s;
        String string4 = "video_screen_interaction";
        String string5 = "full screen";
        boolean bl2 = true;
        String string6 = "video_banner_interactions";
        videoComponentEvents.logReplayEvent(bl2, string3, false, l3, string6, string4, string5);
        object = dj2_22.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object2 = object;
        }
        ((ob_2)object2).k();
    }
}

