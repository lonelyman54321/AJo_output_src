/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import com.google.common.collect.ImmutableList;

public final class m63
implements eI0 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public gi0_0 f;
    public wp3 g;

    public m63(int n3, int n4, String string2) {
        this.a = n3;
        this.b = n4;
        this.c = string2;
    }

    public final int a(fi0_0 object, Pw2 object2) {
        int n3 = this.e;
        int n4 = -1;
        int n7 = 2;
        int n8 = 1;
        if (n3 != n8) {
            if (n3 == n7) {
                return n4;
            }
            object = new IllegalStateException();
            throw object;
        }
        object2 = this.g;
        object2.getClass();
        int n10 = 1024;
        int n14 = object2.c((mi0_0)object, n10, n8 != 0);
        n3 = 0;
        object2 = null;
        if (n14 == n4) {
            this.e = n7;
            wp3 wp32 = this.g;
            int n15 = this.d;
            long l2 = 0L;
            int n16 = 1;
            wp32.a(l2, n16, n15, 0, null);
            this.d = 0;
        } else {
            this.d = n4 = this.d + n14;
        }
        return 0;
    }

    public final boolean b(fi0_0 fi0_02) {
        Xm2 xm2;
        boolean bl2 = true;
        int n3 = this.b;
        int n4 = this.a;
        int n7 = -1;
        if (n4 != n7 && n3 != n7) {
            n7 = 1;
        } else {
            n7 = 0;
            xm2 = null;
        }
        ct3.f(n7 != 0);
        xm2 = new Xm2(n3);
        byte[] byArray = xm2.a;
        fi0_02 = (il0_0)fi0_02;
        ((il0_0)fi0_02).b(byArray, 0, n3, false);
        int n8 = xm2.C();
        if (n8 != n4) {
            bl2 = false;
        }
        return bl2;
    }

    public final void c(long l2, long l3) {
        int n3;
        l3 = 0L;
        int n4 = 1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object == false || (n3 = this.e) == n4) {
            this.e = n4;
            n3 = 0;
            this.d = 0;
        }
    }

    public final eI0 e() {
        return this;
    }

    public final ImmutableList i() {
        return ImmutableList.of();
    }

    public final void k(gi0_0 object) {
        this.f = object;
        this.g = object = object.n(1024, 4);
        Object object2 = new d$a();
        Object object3 = ip1_0.l(this.c);
        ((d$a)object2).n = object3;
        object3 = new d((d$a)object2);
        object.d((d)object3);
        this.f.j();
        object = this.f;
        object2 = new Object();
        object.h((dx2_1)object2);
        this.e = 1;
    }

    public final void release() {
    }
}

