/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.FrameLayout
 */
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from pa3$a
 */
public final class pa3$a_0
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ na3_2 b;

    public pa3$a_0(na3_2 na3_22, f80_0 f80_02) {
        this.b = na3_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        na3_2 na3_22 = this.b;
        pa3$a_0 pa3$a_0 = new pa3$a_0(na3_22, f80_02);
        pa3$a_0.a = object;
        return pa3$a_0;
    }

    public final Object invoke(Object object, Object object2) {
        object = (wZ)object;
        object2 = (f80_0)object2;
        object = (pa3$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pa3$a_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (wZ)this.a;
        object2 = ((wZ)object).a;
        boolean bl2 = object2 instanceof Ov1$b;
        na3_2 na3_22 = this.b;
        if (bl2) {
            object = na3_2.Companion;
            object = na3_22.Oa().spShimmerView;
            object2 = na3_22.Oa().spShimmerViewParent;
            hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)object2);
        } else {
            object2 = na3_2.Companion;
            object2 = na3_22.Oa().spShimmerView;
            FrameLayout frameLayout = na3_22.Oa().spShimmerViewParent;
            hv3_0.t0((ShimmerFrameLayout)((Object)object2), (View)frameLayout);
            object = ((wZ)object).a;
            boolean bl3 = object instanceof Ov1$a;
            if (bl3) {
                na3_22.x0();
            }
        }
        return Unit.a;
    }
}

