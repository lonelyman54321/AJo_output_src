/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import in.juspay.hypersdk.analytics.LogManager$Companion;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kw1
 */
public final class kw1_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kw1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                long l2;
                long l3;
                boolean bl2;
                long l4;
                long l7;
                long l8;
                li2_2 li2_22 = (li2_2)this.b;
                Intrinsics.checkNotNullParameter(li2_22, "this$0");
                long l12 = li2_22.j;
                long l14 = 1L;
                li2_22.j = l12 += l14;
                Object object = li2_22.C;
                kw1_2 kw1_22 = li2_22.D;
                object.postDelayed((Runnable)kw1_22, 1000L);
                long l15 = li2_22.j;
                long l16 = 3;
                long l17 = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1);
                if (l17 <= 0 && (l8 = (l7 = l15 - (l4 = (long)5)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
                    object.removeCallbacks((Runnable)kw1_22);
                    VideoComponentEvents videoComponentEvents = VideoComponentEvents.Companion.getInstance();
                    object = li2_22.l;
                    String string2 = String.valueOf(object);
                    String string3 = "pdp_video_interactions";
                    String string4 = "pdp_screen_interaction";
                    long l18 = 0L;
                    videoComponentEvents.logVideoWatchEvent(false, string2, false, l18, string3, string4);
                }
                if ((bl2 = km_1.b((cp$a)(object = cp_1.Companion))) && (l3 = (l2 = (l12 = li2_22.j) - l16) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0 && !(bl2 = li2_22.J)) {
                    li2_22.J = bl2 = true;
                    li2_22.A(bl2);
                }
                return;
            }
            case 0: 
        }
        LogManager$Companion.a((Context)this.b);
    }
}

