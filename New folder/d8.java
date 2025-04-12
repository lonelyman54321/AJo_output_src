/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.jio.jioads.videomodule.renderer.e;
import kotlin.jvm.internal.Intrinsics;

public final class d8
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        long l2;
        long l3;
        long l4;
        Object object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (e)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((e)object).d.w;
                if (object != null) {
                    object.requestFocus();
                }
                return;
            }
            case 0: 
        }
        Object object3 = q9_0.Companion;
        object = (q9_0)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ((q9_0)object).k1 = l4 = ((q9_0)object).k1 + 1L;
        object2 = ((q9_0)object).i1;
        object3 = ((q9_0)object).j1;
        long l7 = 1000L;
        object2.postDelayed((Runnable)object3, l7);
        object2 = cp_1.Companion;
        boolean bl2 = km_1.b((cp$a)object2);
        if (bl2 && (l3 = (l2 = (l4 = ((q9_0)object).k1) - (l7 = (long)3)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0 && !(bl2 = ((q9_0)object).l1) && !(bl2 = ((q9_0)object).m1)) {
            ((q9_0)object).l1 = true;
            bl2 = false;
            ((q9_0)object).q1 = false;
            object2 = ((q9_0)object).f1;
            if (object2 != null) {
                ai0_2.a((View)object2);
            }
            ((q9_0)object).zb();
        }
    }
}

