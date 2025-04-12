/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class rR2$E
implements Cloneable {
    public Boolean A;
    public Boolean B;
    public rR2$O C;
    public Float D;
    public String E;
    public rR2$E$a F;
    public String G;
    public rR2$O H;
    public Float I;
    public rR2$O J;
    public Float K;
    public rR2$E$i L;
    public rR2$E$e M;
    public long a = 0L;
    public rR2$O b;
    public rR2$E$a c;
    public Float d;
    public rR2$O e;
    public Float f;
    public rR2$p g;
    public rR2$E$c h;
    public rR2$E$d i;
    public Float j;
    public rR2$p[] k;
    public rR2$p l;
    public Float m;
    public rR2$f n;
    public List o;
    public rR2$p p;
    public Integer q;
    public rR2$E$b r;
    public rR2$E$g s;
    public rR2$E$h t;
    public rR2$E$f u;
    public Boolean v;
    public rR2.c w;
    public String x;
    public String y;
    public String z;

    public static rR2$E b() {
        rR2$p rR2$p;
        Float f5;
        rR2$E$a rR2$E$a;
        rR2$E rR2$E = new rR2$E();
        rR2$E.a = -1;
        Object object = rR2$f.b;
        rR2$E.b = object;
        rR2$E.c = rR2$E$a = rR2$E$a.NonZero;
        float f6 = 1.0f;
        rR2$E.d = f5 = Float.valueOf(f6);
        rR2$E.e = null;
        rR2$E.f = f5;
        rR2$E.g = rR2$p = new rR2$p(f6);
        Object object2 = rR2$E$c.Butt;
        rR2$E.h = object2;
        object2 = rR2$E$d.Miter;
        rR2$E.i = object2;
        rR2$E.j = object2 = Float.valueOf(4.0f);
        rR2$E.k = null;
        rR2$E.l = object2 = new rR2$p(0.0f);
        rR2$E.m = f5;
        rR2$E.n = object;
        rR2$E.o = null;
        rR2$d0 rR2$d0 = rR2$d0.pt;
        rR2$E.p = object2 = new rR2$p(12.0f, rR2$d0);
        rR2$E.q = object2 = Integer.valueOf(400);
        object2 = rR2$E$b.Normal;
        rR2$E.r = object2;
        object2 = rR2$E$g.None;
        rR2$E.s = object2;
        object2 = rR2$E$h.LTR;
        rR2$E.t = object2;
        object2 = rR2$E$f.Start;
        rR2$E.u = object2;
        object2 = Boolean.TRUE;
        rR2$E.v = object2;
        rR2$E.w = null;
        rR2$E.x = null;
        rR2$E.y = null;
        rR2$E.z = null;
        rR2$E.A = object2;
        rR2$E.B = object2;
        rR2$E.C = object;
        rR2$E.D = f5;
        rR2$E.E = null;
        rR2$E.F = rR2$E$a;
        rR2$E.G = null;
        rR2$E.H = null;
        rR2$E.I = f5;
        rR2$E.J = null;
        rR2$E.K = f5;
        object = rR2$E$i.None;
        rR2$E.L = object;
        object = rR2$E$e.auto;
        rR2$E.M = object;
        return rR2$E;
    }

    public final Object clone() {
        rR2$E rR2$E = (rR2$E)super.clone();
        rR2$p[] rR2$pArray = this.k;
        if (rR2$pArray != null) {
            rR2$E.k = rR2$pArray = (rR2$p[])rR2$pArray.clone();
        }
        return rR2$E;
    }
}

