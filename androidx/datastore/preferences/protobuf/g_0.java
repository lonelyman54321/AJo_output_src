/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.p;

/*
 * Renamed from androidx.datastore.preferences.protobuf.g
 */
public final class g_0
implements L {
    public final CodedOutputStream a;

    public g_0(CodedOutputStream codedOutputStream) {
        p.a(codedOutputStream, "output");
        this.a = codedOutputStream;
        codedOutputStream.a = this;
    }

    public final void a(int n3, boolean bl2) {
        this.a.E(n3, bl2);
    }

    public final void b(int n3, DF dF) {
        this.a.G(n3, dF);
    }

    public final void c(int n3, double d2) {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.getClass();
        long l2 = Double.doubleToRawLongBits(d2);
        codedOutputStream.K(n3, l2);
    }

    public final void d(int n3) {
        this.a.U(n3, 4);
    }

    public final void e(int n3, int n4) {
        this.a.M(n3, n4);
    }

    public final void f(int n3, int n4) {
        this.a.I(n3, n4);
    }

    public final void g(int n3, long l2) {
        this.a.K(n3, l2);
    }

    public final void h(int n3, float f5) {
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.getClass();
        int n4 = Float.floatToRawIntBits(f5);
        codedOutputStream.I(n3, n4);
    }

    public final void i(int n3, Object object, st2_0 st2_02) {
        object = (wo1_1)object;
        CodedOutputStream codedOutputStream = this.a;
        codedOutputStream.U(n3, 3);
        g_0 g_02 = codedOutputStream.a;
        st2_02.b(object, g_02);
        codedOutputStream.U(n3, 4);
    }

    public final void j(int n3, int n4) {
        this.a.M(n3, n4);
    }

    public final void k(int n3, long l2) {
        this.a.X(n3, l2);
    }

    public final void l(int n3, Object object, st2_0 st2_02) {
        CodedOutputStream codedOutputStream = this.a;
        object = (wo1_1)object;
        codedOutputStream.O(n3, (wo1_1)object, st2_02);
    }

    public final void m(int n3, Object object) {
        boolean bl2 = object instanceof DF;
        CodedOutputStream codedOutputStream = this.a;
        if (bl2) {
            object = (DF)object;
            codedOutputStream.R(n3, (DF)object);
        } else {
            object = (wo1_1)object;
            codedOutputStream.Q(n3, (wo1_1)object);
        }
    }

    public final void n(int n3, int n4) {
        this.a.I(n3, n4);
    }

    public final void o(int n3, long l2) {
        this.a.K(n3, l2);
    }

    public final void p(int n3, int n4) {
        int n7 = n4 << 1;
        n4 = n4 >> 31 ^ n7;
        this.a.V(n3, n4);
    }

    public final void q(int n3, long l2) {
        long l3 = l2 << 1;
        l2 = l2 >> 63 ^ l3;
        this.a.X(n3, l2);
    }

    public final void r(int n3) {
        this.a.U(n3, 3);
    }

    public final void s(int n3, int n4) {
        this.a.V(n3, n4);
    }

    public final void t(int n3, long l2) {
        this.a.X(n3, l2);
    }
}

