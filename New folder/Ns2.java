/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

public abstract class Ns2
implements el1_1 {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    public Ns2() {
        long l2;
        this.c = l2 = dj1.a(0, 0);
        this.d = l2 = Os2.b;
        this.e = 0L;
    }

    public /* synthetic */ Object B() {
        return null;
    }

    public final int c0() {
        return (int)(this.c >> 32);
    }

    public final void i0() {
        long l2 = this.c;
        int n3 = 32;
        int n4 = (int)(l2 >> n3);
        int n7 = c60.k(this.d);
        int n8 = c60.i(this.d);
        this.a = n7 = f.g(n4, n7, n8);
        l2 = this.c;
        long l3 = 0xFFFFFFFFL;
        n4 = (int)(l2 & l3);
        n7 = c60.j(this.d);
        int n10 = c60.h(this.d);
        this.b = n7 = f.g(n4, n7, n10);
        n4 = this.a;
        long l4 = this.c;
        n3 = (int)(l4 >> n3);
        n4 = (n4 - n3) / 2;
        n8 = (int)(l4 & l3);
        n7 = (n7 - n8) / 2;
        this.e = l2 = Ti1.a(n4, n7);
    }

    public void j0(long l2, float f5, W01 w01) {
        this.k0(l2, f5, null);
    }

    public abstract void k0(long var1, float var3, Function1 var4);

    public final void m0(long l2) {
        long l3 = this.c;
        boolean bl2 = bj1.b(l3, l2);
        if (!bl2) {
            this.c = l2;
            this.i0();
        }
    }

    public final void n0(long l2) {
        long l3 = this.d;
        boolean bl2 = c60.c(l3, l2);
        if (!bl2) {
            this.d = l2;
            this.i0();
        }
    }
}

