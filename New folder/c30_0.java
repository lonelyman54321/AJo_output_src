/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from c30
 */
public class c30_0 {
    public final wj1_2 a;
    public boolean b;

    public c30_0(lm1_2 lm1_22) {
        Intrinsics.checkNotNullParameter(lm1_22, "writer");
        this.a = lm1_22;
        this.b = true;
    }

    public void a() {
        this.b = true;
    }

    public void b() {
        this.b = false;
    }

    public void c() {
        this.b = false;
    }

    public void d(byte by2) {
        wj1_2 wj1_22 = this.a;
        long l2 = by2;
        wj1_22.writeLong(l2);
    }

    public final void e(char c2) {
        this.a.a(c2);
    }

    public void f(int n3) {
        wj1_2 wj1_22 = this.a;
        long l2 = n3;
        wj1_22.writeLong(l2);
    }

    public void g(long l2) {
        this.a.writeLong(l2);
    }

    public final void h(String string2) {
        Intrinsics.checkNotNullParameter(string2, "v");
        this.a.c(string2);
    }

    public void i(short s7) {
        wj1_2 wj1_22 = this.a;
        long l2 = s7;
        wj1_22.writeLong(l2);
    }

    public void j(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.a.b(string2);
    }

    public void k() {
    }

    public void l() {
    }
}

