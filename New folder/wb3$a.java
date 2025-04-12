/*
 * Decompiled with CFR 0.152.
 */
public final class wb3$a
extends nv0_0 {
    public final /* synthetic */ dx2_1 b;
    public final /* synthetic */ wb3_1 c;

    public wb3$a(wb3_1 wb3_12, dx2_1 dx2_12, dx2_1 dx2_13) {
        this.c = wb3_12;
        this.b = dx2_13;
        super(dx2_12);
    }

    public final dX2$a d(long l2) {
        Object object = this.b.d(l2);
        fx2_0 fx2_02 = ((dX2$a)object).a;
        long l3 = fx2_02.a;
        long l4 = fx2_02.b;
        long l7 = this.c.a;
        fx2_0 fx2_03 = new fx2_0(l3, l4 += l7);
        object = ((dX2$a)object).b;
        l3 = ((fx2_0)object).a;
        l4 = ((fx2_0)object).b + l7;
        fx2_02 = new fx2_0(l3, l4);
        dX2$a dX2$a = new dX2$a(fx2_03, fx2_02);
        return dX2$a;
    }
}

