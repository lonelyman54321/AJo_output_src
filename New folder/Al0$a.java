/*
 * Decompiled with CFR 0.152.
 */
public final class Al0$a
extends LP1$c
implements it0_0 {
    public final wr1_1 n;
    public boolean o;
    public boolean p;
    public boolean q;

    public Al0$a(wr1_1 wr1_12) {
        this.n = wr1_12;
    }

    public final /* synthetic */ void C0() {
    }

    public final void j1() {
        i90_0 i90_02 = this.f1();
        Al0$a$a al0$a$a = new Al0$a$a(this, null);
        Ae3.d(i90_02, null, null, al0$a$a, 3);
    }

    public final void n(E60 e60) {
        e60.e1();
        boolean bl2 = this.o;
        if (bl2) {
            long l2 = OX.b;
            float f5 = 0.3f;
            long l3 = OX.b(l2, f5);
            long l4 = e60.l();
            int n3 = 122;
            Jt0.j(e60, l3, l4, 0.0f, null, n3);
        } else {
            bl2 = this.p;
            if (bl2 || (bl2 = this.q)) {
                long l7 = OX.b;
                float f6 = 0.1f;
                long l8 = OX.b(l7, f6);
                long l12 = e60.l();
                int n4 = 122;
                Jt0.j(e60, l8, l12, 0.0f, null, n4);
            }
        }
    }
}

