/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from oa0
 */
public final class oa0_1
implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ List b;

    public /* synthetic */ oa0_1(float f5, List list) {
        this.a = f5;
        this.b = list;
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Kt0)object;
        List list = this.b;
        Intrinsics.checkNotNullParameter(list, "$colors");
        Intrinsics.checkNotNullParameter(object2, "$this$drawBehind");
        double d2 = (double)(this.a / 180.0f) * Math.PI;
        float f5 = (float)Math.cos(d2);
        float f6 = (float)Math.sin(d2);
        d2 = C63.d(object2.l());
        double d5 = 2;
        float f7 = (float)Math.pow(d2, d5);
        float f8 = (float)Math.pow(C63.b(object2.l()), d5);
        f7 = (float)Math.sqrt(f7 + f8) / 2.0f;
        long l2 = object2.X0();
        long l3 = h72.a(f5 *= f7, f6 *= f7);
        long l4 = e72.i(l2, l3);
        f5 = f.a(e72.d(l4), 0.0f);
        float f11 = C63.d(object2.l());
        f5 = Math.min(f5, f11);
        f11 = C63.b(object2.l());
        f6 = f.a(e72.e(l4), 0.0f);
        f7 = C63.b(object2.l());
        f6 = Math.min(f6, f7);
        long l7 = h72.a(f5, f11 -= f6);
        f5 = C63.d(object2.l());
        f6 = C63.b(object2.l());
        l4 = e72.h(h72.a(f5, f6), l7);
        object = new cu1_0(list, l4, l7, 0);
        l2 = object2.l();
        Jt0.i((Kt0)object2, (ZD)object, 0L, l2, 0.0f, null, 122);
        return Unit.a;
    }
}

