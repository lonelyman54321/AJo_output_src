/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;

public final class GF3
implements eI0 {
    public final Xm2 a;
    public final m63 b;

    public GF3() {
        Object object = new Xm2(4);
        this.a = object;
        int n3 = -1;
        this.b = object = new m63(n3, n3, "image/webp");
    }

    public final int a(fi0_0 fi0_02, Pw2 pw2) {
        return this.b.a(fi0_02, pw2);
    }

    public final boolean b(fi0_0 fi0_02) {
        Xm2 xm2 = this.a;
        int n3 = 4;
        xm2.F(n3);
        byte[] byArray = xm2.a;
        fi0_02 = (il0_0)fi0_02;
        boolean bl2 = false;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        long l2 = xm2.y();
        long l3 = 1380533830L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 != false) {
            return false;
        }
        ((il0_0)fi0_02).l(n3, false);
        xm2.F(n3);
        byArray = xm2.a;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        long l7 = xm2.y();
        l2 = 1464156752L;
        long l8 = l7 == l2 ? 0 : (l7 < l2 ? -1 : 1);
        if (l8 == false) {
            bl2 = true;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        this.b.c(l2, l3);
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        this.b.k(gi0_02);
    }

    public final void release() {
    }
}

