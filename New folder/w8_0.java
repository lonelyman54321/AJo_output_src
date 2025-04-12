/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from w8
 */
public final class w8_0
implements View.OnClickListener {
    public final /* synthetic */ q9_0 a;

    public /* synthetic */ w8_0(q9_0 q9_02) {
        this.a = q9_02;
    }

    public final void onClick(View object) {
        object = q9_0.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((q9_0)object).Ob();
        Object object2 = ((q9_0)object).p0;
        Object object3 = ((q9_0)object).q0;
        hv3_0.t0((ShimmerFrameLayout)((Object)object2), (View)object3);
        object2 = ((q9_0)object).s0;
        if (object2 != null) {
            ai0_2.i((View)object2);
        }
        object2 = ((q9_0)object).X;
        object3 = "ajiohomeViewModel";
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        ((x9_0)object2).g();
        object2 = ((q9_0)object).k;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("homeListener");
            object2 = null;
        }
        object2.O0();
        object = ((q9_0)object).X;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
        } else {
            object4 = object;
        }
        ((x9_0)object4).f();
    }
}

