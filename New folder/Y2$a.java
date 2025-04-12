/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Y2$a
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ w2_0 b;

    public Y2$a(w2_0 w2_02, f80_0 f80_02) {
        this.b = w2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        w2_0 w2_02 = this.b;
        Y2$a y2$a = new Y2$a(w2_02, f80_02);
        y2$a.a = object;
        return y2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (wZ)object;
        object2 = (f80_0)object2;
        object = (Y2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Y2$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = (wZ)this.a;
        object2 = ((wZ)object).a;
        boolean bl2 = object2 instanceof Ov1$b;
        String string2 = "shimmerContainer";
        String string3 = "shimmerLayout";
        Object object3 = null;
        w2_0 w2_02 = this.b;
        if (bl2) {
            object = w2_02.g;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                boolean bl3 = false;
                object = null;
            }
            if ((object2 = w2_02.f) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)object3);
        } else {
            object2 = w2_02.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                object2 = null;
            }
            if ((string3 = w2_02.f) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = string3;
            }
            hv3_0.t0((ShimmerFrameLayout)((Object)object2), (View)object3);
            object = ((wZ)object).a;
            boolean bl4 = object instanceof Ov1$a;
            if (bl4) {
                w2_02.x0();
            }
        }
        return Unit.a;
    }
}

