/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class VS$a
extends Lambda
implements Function1 {
    public final /* synthetic */ qs_1 c;
    public final /* synthetic */ ib3_0 d;
    public final /* synthetic */ ib3_0 e;
    public final /* synthetic */ ib3_0 f;
    public final /* synthetic */ ib3_0 g;
    public final /* synthetic */ ib3_0 h;

    public VS$a(qs_1 qs_12, ib3_0 ib3_02, ib3_0 ib3_03, ib3_0 ib3_04, gr3$d gr3$d, gr3$d gr3$d2) {
        this.c = qs_12;
        this.d = ib3_02;
        this.e = ib3_03;
        this.f = ib3_04;
        this.g = gr3$d;
        this.h = gr3$d2;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        re3_1 re3_12;
        Qt0 qt0;
        VS$a vS$a = this;
        Object object2 = object;
        object2 = (Kt0)object;
        float f6 = VS.d;
        double d2 = Math.floor(object2.J0(f6));
        float f7 = (float)d2;
        long l2 = ((OX)this.d.getValue()).a;
        Object object3 = (OX)this.e.getValue();
        long l3 = ((OX)object3).a;
        f6 = VS.e;
        float f8 = object2.J0(f6);
        f6 = f7 / 2.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        qs_1 qs_12 = null;
        float f14 = 0.0f;
        Object object4 = qt0;
        float f15 = f7;
        qt0 = new re3_1(f7, 0.0f, 0, 0, null, 30);
        long l4 = object2.l();
        float f16 = C63.d(l4);
        int n3 = OX.c(l2, l3);
        gn2 gn22 = null;
        if (n3 != 0) {
            long l7 = bo1_1.a(f16, f16);
            l3 = s90.a(f8, f8);
            qt0 = rM0.a;
            long l8 = 0L;
            int n4 = 226;
            object3 = object2;
            long l12 = l3;
            re3_12 = null;
            int n7 = n4;
            Jt0.l((Kt0)object2, l2, l8, l7, l3, qt0, n4);
        } else {
            long l14 = h72.a(f7, f7);
            n3 = 2;
            f5 = (float)n3 * f7;
            f5 = f16 - f5;
            long l15 = bo1_1.a(f5, f5);
            f5 = f8 - f7;
            f5 = Math.max(0.0f, f5);
            long l16 = s90.a(f5, f5);
            rM0 rM02 = rM0.a;
            int n8 = 224;
            f5 = f6;
            object3 = object2;
            long l17 = l16;
            int n10 = n8;
            Jt0.l((Kt0)object2, l2, l14, l15, l16, rM02, n8);
            l14 = h72.a(f6, f6);
            l15 = bo1_1.a(f16 -= f7, f16);
            l17 = s90.a(f8 -= f6, f8);
            n10 = 224;
            Jt0.l((Kt0)object2, l3, l14, l15, l17, qt0, n10);
        }
        l2 = ((OX)vS$a.f.getValue()).a;
        f6 = ((Number)vS$a.g.getValue()).floatValue();
        f8 = ((Number)vS$a.h.getValue()).floatValue();
        object4 = re3_12;
        f15 = f7;
        re3_12 = new re3_1(f7, 0.0f, 2, 0, null, 26);
        f5 = C63.d(object2.l());
        f12 = 0.5f;
        f15 = LK1.c(0.4f, f12, f8);
        f11 = LK1.c(0.7f, f12, f8);
        f14 = LK1.c(f12, f12, f8);
        f8 = LK1.c(0.3f, f12, f8);
        qs_12 = vS$a.c;
        qs_12.a.reset();
        f16 = 0.2f * f5;
        gn22 = qs_12.a;
        gn22.a(f16, f14 *= f5);
        gn22.d(f15 *= f5, f11 *= f5);
        f15 = 0.8f * f5;
        gn22.d(f15, f5 *= f8);
        Object object5 = qs_12.b;
        object5.b(gn22);
        object4 = qs_12.c;
        object4.reset();
        f15 = object5.getLength() * f6;
        object5.a(0.0f, f15, (gn2)object4);
        object5 = qs_12.c;
        object3 = object2;
        l4 = l2;
        Jt0.h((Kt0)object2, (gn2)object5, l2, 0.0f, re3_12, 52);
        return Unit.a;
    }
}

