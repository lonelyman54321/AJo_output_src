/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;

/*
 * Renamed from Wc1
 */
public final class wc1_0
implements qy0_0 {
    public final Xm2 a;
    public wp3 b;
    public boolean c;
    public long d;
    public int e;
    public int f;

    public wc1_0() {
        Xm2 xm2;
        this.a = xm2 = new Xm2(10);
        this.d = -9223372036854775807L;
    }

    public final void a(Xm2 xm2) {
        int n3;
        wp3 wp32 = this.b;
        ct3.h(wp32);
        int n4 = this.c;
        if (n4 == 0) {
            return;
        }
        n4 = xm2.a();
        int n7 = this.f;
        int n8 = 10;
        if (n7 < n8) {
            n7 = 10 - n7;
            n7 = Math.min(n4, n7);
            byte[] byArray = xm2.a;
            int n10 = xm2.b;
            Xm2 xm22 = this.a;
            byte[] byArray2 = xm22.a;
            int n14 = this.f;
            System.arraycopy(byArray, n10, byArray2, n14, n7);
            int n15 = this.f + n7;
            if (n15 == n8) {
                n7 = 0;
                xm22.I(0);
                n15 = 73;
                n10 = xm22.w();
                if (n15 == n10 && (n15 = 68) == (n10 = xm22.w()) && (n15 = 51) == (n10 = xm22.w())) {
                    xm22.J(3);
                    this.e = n7 = xm22.v() + n8;
                } else {
                    Cx.f("Discarding invalid ID3 tag");
                    this.c = false;
                    return;
                }
            }
        }
        n7 = this.e;
        n8 = this.f;
        n4 = Math.min(n4, n7 -= n8);
        this.b.f(n4, xm2);
        this.f = n3 = this.f + n4;
    }

    public final void c() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    public final void d(boolean bl2) {
        boolean bl3;
        wp3 wp32 = this.b;
        ct3.h(wp32);
        bl2 = this.c;
        if (bl2 && (bl2 = this.e) && (bl3 = this.f) == bl2) {
            long l2 = this.d;
            long l3 = -9223372036854775807L;
            bl2 = false;
            wp32 = null;
            Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            bl3 = object != false;
            ct3.f(bl3);
            wp3 wp33 = this.b;
            l3 = this.d;
            int n3 = this.e;
            object = 1;
            wp33.a(l3, (int)object, n3, 0, null);
            this.c = false;
        }
    }

    public final void e(gi0_0 object, Gs3$d object2) {
        ((Gs3$d)object2).a();
        ((Gs3$d)object2).b();
        int n3 = ((Gs3$d)object2).d;
        this.b = object = object.n(n3, 5);
        d$a d$a = new d$a();
        ((Gs3$d)object2).b();
        d$a.a = object2 = ((Gs3$d)object2).e;
        d$a.n = object2 = ip1_0.l("application/id3");
        object2 = new d(d$a);
        object.d((d)object2);
    }

    public final void f(int n3, long l2) {
        if ((n3 &= 4) == 0) {
            return;
        }
        this.c = true;
        this.d = l2;
        this.e = 0;
        this.f = 0;
    }
}

