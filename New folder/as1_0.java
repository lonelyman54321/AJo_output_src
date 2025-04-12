/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from As1
 */
public final class as1_0
implements zs1_0 {
    public final /* synthetic */ Cl2 a;
    public final /* synthetic */ boolean b;

    public as1_0(hm0_0 hm0_02, boolean bl2) {
        this.a = hm0_02;
        this.b = bl2;
    }

    public final int a() {
        Cl2 cl2 = this.a;
        int n3 = cl2.l().e();
        return cl2.l().c() + n3;
    }

    public final float b() {
        Cl2 cl2 = this.a;
        kl2_1 kl2_12 = cl2.l();
        int n3 = cl2.m();
        return El2.a(kl2_12, n3);
    }

    public final qX c() {
        qX qX2;
        boolean bl2 = this.b;
        int n3 = 1;
        Cl2 cl2 = this.a;
        if (bl2) {
            int n4 = cl2.m();
            qX2 = new qX(n4, n3);
        } else {
            int n7 = cl2.m();
            qX2 = new qX(n3, n7);
        }
        return qX2;
    }

    public final Object d(int n3, f80_0 object) {
        hm0_0 hm0_02 = (hm0_0)this.a;
        Object object2 = Cl2.t(hm0_02, n3, object);
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
        pg2_0 pg2_03 = ((Cl2)object).l().a();
        if (pg2_03 == (pg2_02 = pg2_0.Vertical)) {
            object = ((Cl2)object).l();
            l2 = object.b();
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
            return (int)l2;
        }
        object = ((Cl2)object).l();
        l2 = object.b();
        int n3 = 32;
        l2 >>= n3;
        return (int)l2;
    }

    public final float f() {
        Cl2 cl2 = this.a;
        long l2 = cl2.j();
        long l3 = cl2.o();
        float f5 = cl2.k();
        float f6 = cl2.o();
        return ok1_1.c(f5 * f6) + (l2 *= l3);
    }
}

