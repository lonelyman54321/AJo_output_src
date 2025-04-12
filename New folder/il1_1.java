/*
 * Decompiled with CFR 0.152.
 */
import com.google.common.collect.ImmutableList;

/*
 * Renamed from Il1
 */
public final class il1_1
implements eI0 {
    public final eI0 a;

    public il1_1(int n3) {
        if ((n3 &= 1) != 0) {
            int n4 = 2;
            String string2 = "image/jpeg";
            char c2 = (char)-40;
            m63 m632 = new m63(c2, n4, string2);
            this.a = m632;
        } else {
            jl1_1 jl1_12 = new jl1_1();
            this.a = jl1_12;
        }
    }

    public final int a(fi0_0 fi0_02, Pw2 pw2) {
        return this.a.a(fi0_02, pw2);
    }

    public final boolean b(fi0_0 fi0_02) {
        return this.a.b(fi0_02);
    }

    public final void c(long l2, long l3) {
        this.a.c(l2, l3);
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 gi0_02) {
        this.a.k(gi0_02);
    }

    public final void release() {
        this.a.release();
    }
}

