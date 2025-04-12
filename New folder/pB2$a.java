/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class pB2$a
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ re3_1 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ long f;
    public final /* synthetic */ ib3_0 g;
    public final /* synthetic */ ib3_0 h;
    public final /* synthetic */ ib3_0 i;
    public final /* synthetic */ ib3_0 j;

    public pB2$a(long l2, re3_1 re3_12, float f5, long l3, Vg1$a vg1$a, Vg1$a vg1$a2, Vg1$a vg1$a3, Vg1$a vg1$a4) {
        this.c = l2;
        this.d = re3_12;
        this.e = f5;
        this.f = l3;
        this.g = vg1$a;
        this.h = vg1$a2;
        this.i = vg1$a3;
        this.j = vg1$a4;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Kt0)object;
        float f5 = 360.0f;
        long l2 = this.c;
        re3_1 re3_12 = this.d;
        Object object2 = object;
        pB2.b((Kt0)object, 0.0f, f5, l2, re3_12);
        int n3 = ((Number)this.g.getValue()).intValue();
        float f6 = (float)n3 * 216.0f % 360.0f;
        Number number = (Number)this.h.getValue();
        float f7 = number.floatValue();
        Vg1$a vg1$a = (Vg1$a)this.i;
        float f8 = ((Number)vg1$a.d.getValue()).floatValue();
        f7 = Math.abs(f7 - f8);
        f8 = ((Number)this.j.getValue()).floatValue() + (f6 += -90.0f);
        object2 = (Number)vg1$a.d.getValue();
        f6 = ((Number)object2).floatValue() + f8;
        re3_12 = this.d;
        int n4 = re3_12.c;
        f8 = 0.0f;
        n4 = (int)(Se3.a(n4, 0) ? 1 : 0);
        if (n4 != 0) {
            n4 = 0;
            f5 = 0.0f;
            vg1$a = null;
        } else {
            n4 = 2;
            f5 = n4;
            f8 = pB2.a / f5;
            f5 = this.e / f8 * 57.29578f;
            f8 = 2.0f;
            f5 /= f8;
        }
        f8 = Math.max(f7, 0.1f);
        long l3 = this.f;
        object2 = object;
        f7 = f5 += f6;
        f5 = f8;
        l2 = l3;
        pB2.b((Kt0)object, f7, f8, l3, re3_12);
        return Unit.a;
    }
}

