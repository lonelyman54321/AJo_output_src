/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;

/*
 * Renamed from xP2
 */
public abstract class xp2_0
extends LP1$c
implements J30,
it0_0,
xp1_1 {
    public final wr1_1 n;
    public final boolean o;
    public final float p;
    public final gy_1 q;
    public final Function0 r;
    public nb3_0 s;
    public float t;
    public long u;
    public boolean v;
    public final hr1_0 w;

    public xp2_0(wr1_1 object, boolean bl2, float f5, qo0_0 qo0_02, ro0 ro02) {
        this.n = object;
        this.o = bl2;
        this.p = f5;
        this.q = qo0_02;
        this.r = ro02;
        this.u = 0L;
        this.w = object = new hr1_0(null);
    }

    public final /* synthetic */ void C0() {
    }

    public final boolean g1() {
        return false;
    }

    public final void j1() {
        i90_0 i90_02 = this.f1();
        xp2$a_0 xp2$a_0 = new xp2$a_0(this, null);
        Ae3.d(i90_02, null, null, xp2$a_0, 3);
    }

    public final void n(E60 e60) {
        e60.e1();
        nb3_0 nb3_02 = this.s;
        if (nb3_02 != null) {
            float f5 = this.t;
            gy_1 gy_12 = this.q;
            long l2 = gy_12.a();
            nb3_02.a(e60, f5, l2);
        }
        this.s1(e60);
    }

    public final /* synthetic */ void o0(zp1 zp12) {
    }

    public abstract void r1(Ey2$b var1, long var2, float var4);

    public abstract void s1(Kt0 var1);

    public final void t1(ey2_0 ey2_02) {
        boolean bl2 = ey2_02 instanceof Ey2$b;
        if (bl2) {
            ey2_02 = (Ey2$b)ey2_02;
            long l2 = this.u;
            float f5 = this.t;
            this.r1((Ey2$b)ey2_02, l2, f5);
        } else {
            bl2 = ey2_02 instanceof Ey2$c;
            if (bl2) {
                ey2_02 = ((Ey2$c)ey2_02).a;
                this.u1((Ey2$b)ey2_02);
            } else {
                bl2 = ey2_02 instanceof Ey2$a;
                if (bl2) {
                    ey2_02 = ((Ey2$a)ey2_02).a;
                    this.u1((Ey2$b)ey2_02);
                }
            }
        }
    }

    public abstract void u1(Ey2$b var1);

    public final void x(long l2) {
        int n3;
        this.v = n3 = 1;
        Vo0 vo0 = go0.f((fo0)this).r;
        this.u = l2 = dj1.b(l2);
        float f5 = this.p;
        boolean bl2 = Float.isNaN(f5);
        if (bl2) {
            boolean bl3 = this.o;
            long l3 = this.u;
            f5 = op2_0.a(vo0, bl3, l3);
        } else {
            f5 = vo0.J0(f5);
        }
        this.t = f5;
        hr1_0 hr1_02 = this.w;
        Object[] objectArray = hr1_02.a;
        n3 = hr1_02.b;
        for (int i3 = 0; i3 < n3; ++i3) {
            ey2_0 ey2_02 = (ey2_0)objectArray[i3];
            this.t1(ey2_02);
        }
        objectArray = hr1_02.a;
        n3 = hr1_02.b;
        rp_1.n(0, n3, null, objectArray);
        hr1_02.b = 0;
    }
}

