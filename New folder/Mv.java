/*
 * Decompiled with CFR 0.152.
 */
public final class Mv
extends D41 {
    public Fb3$c n0;
    public int o0;
    public Lv p0;

    public Mv(Fb3 fb3) {
        Fb3$d fb3$d = Fb3$d.BARRIER;
        super(fb3, fb3$d);
    }

    public final void apply() {
        int n3;
        this.s();
        Object object = Mv$a.a;
        Fb3$c fb3$c = this.n0;
        int n4 = fb3$c.ordinal();
        int n7 = object[n4];
        n4 = 3;
        if (n7 != n4 && n7 != (n3 = 4)) {
            n3 = 5;
            if (n7 != n3) {
                n3 = 6;
                if (n7 != n3) {
                    n4 = 0;
                    fb3$c = null;
                }
            } else {
                n4 = 2;
            }
        } else {
            n4 = 1;
        }
        object = this.p0;
        object.z0 = n4;
        object.B0 = n4 = this.o0;
    }

    public final G50 k(int n3) {
        this.o0 = n3;
        return this;
    }

    public final G50 l(Float f5) {
        int n3;
        this.o0 = n3 = this.k0.c(f5);
        return this;
    }

    public final F41 s() {
        Lv lv = this.p0;
        if (lv == null) {
            this.p0 = lv = new Lv();
        }
        return this.p0;
    }
}

