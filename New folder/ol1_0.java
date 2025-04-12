/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from oL1
 */
public final class ol1_0
extends Lambda
implements Function1 {
    public final /* synthetic */ nl1_0 c;
    public final /* synthetic */ float d;

    public ol1_0(nl1_0 nl1_02, float f5) {
        this.c = nl1_02;
        this.d = f5;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Kt0)object;
        Object object3 = this.c.b;
        float f5 = ((Y50)object3).v();
        float f6 = this.d;
        float f7 = f5 * f6;
        float f8 = (float)((Y50)object3).p() * f6;
        float f11 = C63.d(object2.l()) - f7;
        f5 = 2.0f;
        float f12 = f11 / f5;
        float f14 = (C63.b(object2.l()) - f8) / f5;
        long l2 = OX.f;
        long l3 = h72.a(f12, f14);
        float f15 = f12 + f7;
        long l4 = h72.a(f15, f14);
        object3 = object2;
        Jt0.f((Kt0)object2, l2, l3, l4);
        l3 = h72.a(f15, f14);
        float f16 = f14 + f8;
        long l7 = h72.a(f15, f16);
        float f17 = f16;
        l4 = l7;
        Jt0.f((Kt0)object2, l2, l3, l7);
        l3 = h72.a(f15, f16);
        l4 = h72.a(f12, f16);
        Jt0.f((Kt0)object2, l2, l3, l4);
        l3 = h72.a(f12, f16);
        l4 = h72.a(f12, f14);
        Jt0.f((Kt0)object2, l2, l3, l4);
        f17 = 1.0f;
        l2 = OX.b;
        l3 = h72.a(f12 += f17, f14 += f17);
        l4 = h72.a(f7 += f12, f14);
        Jt0.f((Kt0)object2, l2, l3, l4);
        l3 = h72.a(f7, f14);
        l4 = h72.a(f7, f8 += f14);
        Jt0.f((Kt0)object2, l2, l3, l4);
        l3 = h72.a(f7, f8);
        l4 = h72.a(f12, f8);
        Jt0.f((Kt0)object2, l2, l3, l4);
        l3 = h72.a(f12, f8);
        l4 = h72.a(f12, f14);
        Jt0.f((Kt0)object2, l2, l3, l4);
        return Unit.a;
    }
}

