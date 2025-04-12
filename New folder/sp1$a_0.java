/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sp1$a
 */
public final class sp1$a_0
extends xb1_0 {
    public final /* synthetic */ sp1_1 s;

    public sp1$a_0(sp1_1 sp1_12) {
        this.s = sp1_12;
        super(sp1_12);
    }

    public final int I(int n3) {
        tb1_0 tb1_02 = this.s;
        rp1_1 rp1_12 = tb1_02.P;
        tb1_02 = tb1_02.p;
        Intrinsics.checkNotNull(tb1_02);
        tb1_02 = ((w32_0)tb1_02).h1();
        Intrinsics.checkNotNull(tb1_02);
        return rp1_12.minIntrinsicHeight(this, (Qj1)((Object)tb1_02), n3);
    }

    public final int N(int n3) {
        tb1_0 tb1_02 = this.s;
        rp1_1 rp1_12 = tb1_02.P;
        tb1_02 = tb1_02.p;
        Intrinsics.checkNotNull(tb1_02);
        tb1_02 = ((w32_0)tb1_02).h1();
        Intrinsics.checkNotNull(tb1_02);
        return rp1_12.minIntrinsicWidth(this, (Qj1)((Object)tb1_02), n3);
    }

    public final int P(int n3) {
        tb1_0 tb1_02 = this.s;
        rp1_1 rp1_12 = tb1_02.P;
        tb1_02 = tb1_02.p;
        Intrinsics.checkNotNull(tb1_02);
        tb1_02 = ((w32_0)tb1_02).h1();
        Intrinsics.checkNotNull(tb1_02);
        return rp1_12.maxIntrinsicWidth(this, (Qj1)((Object)tb1_02), n3);
    }

    public final Ns2 Q(long l2) {
        this.n0(l2);
        Object object = new c60(l2);
        tb1_0 tb1_02 = this.s;
        tb1_02.Q = object;
        object = tb1_02.P;
        tb1_02 = tb1_02.p;
        Intrinsics.checkNotNull(tb1_02);
        tb1_02 = ((w32_0)tb1_02).h1();
        Intrinsics.checkNotNull(tb1_02);
        bl1_0 bl1_02 = object.measure-3p2s80s(this, (xk1_0)((Object)tb1_02), l2);
        xb1_0.L0(this, bl1_02);
        return this;
    }

    public final int o0(Oc oc) {
        int n3 = tp1_0.a(this, oc);
        Integer n4 = n3;
        this.r.put(oc, n4);
        return n3;
    }

    public final int v(int n3) {
        tb1_0 tb1_02 = this.s;
        rp1_1 rp1_12 = tb1_02.P;
        tb1_02 = tb1_02.p;
        Intrinsics.checkNotNull(tb1_02);
        tb1_02 = ((w32_0)tb1_02).h1();
        Intrinsics.checkNotNull(tb1_02);
        return rp1_12.maxIntrinsicHeight(this, (Qj1)((Object)tb1_02), n3);
    }
}

