/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Bs1
 */
public final class bs1_1
implements zs1_0 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ boolean b;

    public bs1_1(ft1_2 ft1_22, boolean bl2) {
        this.a = ft1_22;
        this.b = bl2;
    }

    public final int a() {
        ft1_2 ft1_22 = this.a;
        int n3 = ft1_22.j().e();
        return ft1_22.j().c() + n3;
    }

    public final float b() {
        float f5;
        ft1_2 ft1_22 = this.a;
        int n3 = ft1_22.h();
        int n4 = ft1_22.i();
        boolean bl2 = ft1_22.d();
        if (bl2) {
            f5 = n3 * 500 + n4;
            n3 = 100;
            float f6 = n3;
            f5 += f6;
        } else {
            n3 = n3 * 500 + n4;
            f5 = n3;
        }
        return f5;
    }

    public final qX c() {
        boolean bl2 = this.b;
        int n3 = 1;
        int n4 = -1;
        qX qX2 = bl2 ? new qX(n4, n3) : new qX(n3, n4);
        return qX2;
    }

    public final Object d(int n3, f80_0 object) {
        ft1_2 ft1_22 = this.a;
        Object object2 = ft1_2.k(ft1_22, n3, object);
        if (object2 == (object = j90_0.COROUTINE_SUSPENDED)) {
            return object2;
        }
        return Unit.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int e() {
        long l2;
        pg2_0 pg2_02;
        Object object = this.a;
        pg2_0 pg2_03 = ((ft1_2)object).j().a();
        if (pg2_03 == (pg2_02 = pg2_0.Vertical)) {
            object = ((ft1_2)object).j();
            l2 = object.b();
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
            return (int)l2;
        }
        object = ((ft1_2)object).j();
        l2 = object.b();
        int n3 = 32;
        l2 >>= n3;
        return (int)l2;
    }

    public final float f() {
        ft1_2 ft1_22 = this.a;
        int n3 = ft1_22.h();
        int n4 = ft1_22.i();
        return n3 * 500 + n4;
    }
}

