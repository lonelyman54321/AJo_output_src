/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QW1
 */
public final class qw1_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qw1_0(Object object, int n3) {
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
                xj2_0 xj2_02 = (xj2_0)this.b;
                Intrinsics.checkNotNullParameter(xj2_02, "this$0");
                long l12 = xj2_02.o;
                long l14 = 1L;
                xj2_02.o = l12 += l14;
                Object object = xj2_02.q;
                qw1_0 qw1_02 = xj2_02.r;
                object.postDelayed((Runnable)qw1_02, 1000L);
                long l15 = xj2_02.o;
                long l16 = 3;
                long l17 = l16 == l15 ? 0 : (l16 < l15 ? -1 : 1);
                if (l17 <= 0 && (l8 = (l7 = l15 - (l4 = (long)5)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0) {
                    object.removeCallbacks((Runnable)qw1_02);
                }
                if ((bl2 = km_1.b((cp$a)(object = cp_1.Companion))) && (l3 = (l2 = (l12 = xj2_02.o) - l16) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0 && !(bl2 = xj2_02.p)) {
                    xj2_02.p = bl2 = true;
                    xj2_02.w(bl2);
                }
                return;
            }
            case 0: 
        }
        Object object = (ex1_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((ex1_0)object).I;
        if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
            ai0_2.a((View)object2);
        }
        if ((object = ((ex1_0)object).J) != null) {
            ai0_2.a((View)object);
        }
    }
}

