/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.analytics.events.VideoComponentEvents;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KW1
 */
public final class kw1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ kw1_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Long)object;
                dj2_2 dj2_22 = (dj2_2)this.b;
                Intrinsics.checkNotNullParameter(dj2_22, "this$0");
                Object object2 = TimeUnit.MILLISECONDS;
                Intrinsics.checkNotNull(object);
                long l2 = (Long)object;
                long l3 = ((TimeUnit)((Object)object2)).toSeconds(l2);
                long l4 = 2;
                long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (l7 > 0 && (l7 = (long)dj2_22.a) == false) {
                    dj2_22.a = true;
                    object = cp_1.Companion;
                    l7 = (long)km_1.b((cp$a)object);
                    if (l7 != false && (l7 = (long)dj2_22.z) == false) {
                        l7 = 0;
                        object = null;
                        dj2_22.p = false;
                        dj2_22.Qa();
                    }
                    object2 = VideoComponentEvents.Companion.getInstance();
                    object = dj2_22.l;
                    String string2 = ai0_2.h((String)object);
                    long l8 = dj2_22.s;
                    boolean bl2 = true;
                    String string3 = "video_banner_interactions";
                    String string4 = "video_screen_interaction";
                    ((VideoComponentEvents)object2).logVideoWatchEvent(bl2, string2, false, l8, string3, string4);
                }
                return Unit.a;
            }
            case 0: 
        }
        ((Boolean)object).booleanValue();
        ex1_0 ex1_02 = (ex1_0)this.b;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        ex1_02.onNavigationClick();
        return Unit.a;
    }
}

