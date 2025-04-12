/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yD0
 */
public final class yd0_2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView$B b;

    public /* synthetic */ yd0_2(RecyclerView$B recyclerView$B, int n3) {
        this.a = n3;
        this.b = recyclerView$B;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2;
                VideoComponentEvents videoComponentEvents;
                int n4;
                boolean bl2;
                Object object2 = (x71_0)this.b;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                object = ((x71_0)object2).m;
                if (object != null) {
                    ((ma_2)object).s = bl2 = true;
                }
                bl2 = false;
                if (object != null) {
                    n4 = ((ma_2)object).r;
                } else {
                    n4 = 0;
                    videoComponentEvents = null;
                }
                if (object != null && (object = ((ow_0)object).a(n4)) != null) {
                    object.play();
                }
                if ((object = ((x71_0)object2).e) != null && (object = ((BannerData)object).getBannerUrl()) != null && (string2 = ai0_2.h((String)object)) != null) {
                    boolean bl3;
                    videoComponentEvents = VideoComponentEvents.Companion.getInstance();
                    object = ((x71_0)object2).e;
                    if (object != null && (object = ((BannerData)object).getVideoSettings()) != null) {
                        object = ((VideoSetting)object).getAutoPlay();
                        object2 = Boolean.TRUE;
                        bl3 = bl2 = Intrinsics.areEqual(object, object2);
                    } else {
                        bl3 = false;
                    }
                    int n7 = 16;
                    long l2 = 0L;
                    VideoComponentEvents.logVideoPlayEvent$default(videoComponentEvents, false, false, string2, bl3, l2, n7, null);
                }
                return;
            }
            case 0: 
        }
        zd0_2 zd0_22 = (zd0_2)this.b;
        Intrinsics.checkNotNullParameter(zd0_22, "this$0");
        zd0_22.c.S();
    }
}

