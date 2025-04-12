/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

public final class Xj3
extends Lambda
implements Function1 {
    public final /* synthetic */ wf0_0 c;
    public final /* synthetic */ i72 d;
    public final /* synthetic */ ql3_0 e;
    public final /* synthetic */ Vt1 f;
    public final /* synthetic */ ZD g;

    public Xj3(wf0_0 wf0_02, i72 i722, ql3_0 ql3_02, Vt1 vt1, ZD zD) {
        this.c = wf0_02;
        this.d = i722;
        this.e = ql3_02;
        this.f = vt1;
        this.g = zD;
        super(1);
    }

    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (E60)object;
        object2.e1();
        float f5 = this.c.b.c();
        float f6 = 0.0f;
        object = null;
        float f7 = f5 - 0.0f;
        float f8 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (f8 != false) {
            long l2 = this.e.b;
            int n3 = mm3.c;
            n3 = 32;
            float f11 = 4.5E-44f;
            int n4 = (int)(l2 >>= n3);
            Object object3 = this.d;
            f8 = object3.b(n4);
            Object object4 = this.f.d();
            object = object4 != null && (object4 = ((Ul3)object4).a) != null ? ((Tl3)object4).c((int)f8) : (object3 = new aG2(0.0f, 0.0f, 0.0f, 0.0f));
            float f12 = Zj3.a;
            float f14 = object2.J0(f12);
            f8 = 2;
            f12 = f8;
            f12 = f14 / f12;
            float f15 = ((aG2)object).a + f12;
            long l3 = object2.l();
            f11 = C63.d(l3) - f12;
            f12 = kotlin.ranges.f.a(kotlin.ranges.f.c(f15, f11), f12);
            f15 = ((aG2)object).b;
            long l4 = h72.a(f12, f15);
            f6 = ((aG2)object).d;
            long l7 = h72.a(f12, f6);
            int n7 = 3;
            object3 = this.g;
            object2.l0((ZD)object3, l4, l7, f14, 0, null, f5, null, n7);
        }
        return Unit.a;
    }
}

