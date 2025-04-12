/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;

public final class l$a
implements DF0 {
    public final DF0 a;
    public final qp3 b;

    public l$a(DF0 dF0, qp3 qp32) {
        this.a = dF0;
        this.b = qp32;
    }

    public final d a(int n3) {
        n3 = this.a.b(n3);
        return this.b.d[n3];
    }

    public final int b(int n3) {
        return this.a.b(n3);
    }

    public final int c(int n3) {
        return this.a.c(n3);
    }

    public final qp3 d() {
        return this.b;
    }

    public final void e() {
        this.a.e();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof l$a;
        if (!bl4) {
            return false;
        }
        object = (l$a)object;
        DF0 dF0 = this.a;
        Object object2 = ((l$a)object).a;
        bl4 = dF0.equals(object2);
        if (!bl4 || !(bl2 = ((qp3)(object2 = this.b)).equals(object = ((l$a)object).b))) {
            bl3 = false;
        }
        return bl3;
    }

    public final void f(float f5) {
        this.a.f(f5);
    }

    public final void g() {
        this.a.g();
    }

    public final void h(boolean bl2) {
        this.a.h(bl2);
    }

    public final int hashCode() {
        int n3 = (this.b.hashCode() + 527) * 31;
        return this.a.hashCode() + n3;
    }

    public final void i() {
        this.a.i();
    }

    public final int j() {
        return this.a.j();
    }

    public final d k() {
        int n3 = this.a.j();
        return this.b.d[n3];
    }

    public final void l() {
        this.a.l();
    }

    public final int length() {
        return this.a.length();
    }
}

