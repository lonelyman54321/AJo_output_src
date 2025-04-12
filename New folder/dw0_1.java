/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from Dw0
 */
public final class dw0_1
implements qy0_0 {
    public final List a;
    public final wp3[] b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public dw0_1(List wp3Array) {
        this.a = wp3Array;
        wp3Array = new wp3[wp3Array.size()];
        this.b = wp3Array;
        this.f = -9223372036854775807L;
    }

    public final void a(Xm2 xm2) {
        int n3 = this.c;
        if (n3 != 0) {
            int n4;
            n3 = this.d;
            int n7 = 2;
            int n8 = 0;
            int n10 = 1;
            if (n3 == n7) {
                n3 = xm2.a();
                if (n3 == 0) {
                    n3 = 0;
                } else {
                    n3 = xm2.w();
                    if (n3 != (n7 = 32)) {
                        this.c = false;
                    }
                    this.d = n3 = this.d - n10;
                    n3 = (int)(this.c ? 1 : 0);
                }
                if (n3 == 0) {
                    return;
                }
            }
            if ((n3 = this.d) == n10) {
                n3 = xm2.a();
                if (n3 == 0) {
                    n3 = 0;
                } else {
                    n3 = xm2.w();
                    if (n3 != 0) {
                        this.c = false;
                    }
                    this.d = n3 = this.d - n10;
                    n3 = (int)(this.c ? 1 : 0);
                }
                if (n3 == 0) {
                    return;
                }
            }
            n3 = xm2.b;
            n7 = xm2.a();
            wp3[] wp3Array = this.b;
            int n14 = wp3Array.length;
            while (n8 < n14) {
                wp3 wp32 = wp3Array[n8];
                xm2.I(n3);
                wp32.f(n7, xm2);
                ++n8;
            }
            this.e = n4 = this.e + n7;
        }
    }

    public final void c() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    public final void d(boolean bl2) {
        bl2 = this.c;
        if (bl2) {
            boolean bl3;
            long l2 = this.f;
            long l3 = -9223372036854775807L;
            bl2 = false;
            Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object != false) {
                bl3 = true;
            } else {
                bl3 = false;
                wp3[] wp3Array = null;
            }
            ct3.f(bl3);
            for (wp3 wp32 : this.b) {
                long l4 = this.f;
                int n3 = this.e;
                int n4 = 1;
                wp32.a(l4, n4, n3, 0, null);
            }
            this.c = false;
        }
    }

    public final void e(gi0_0 gi0_02, Gs3$d gs3$d) {
        wp3[] wp3Array;
        int n3;
        for (int i3 = 0; i3 < (n3 = (wp3Array = this.b).length); ++i3) {
            Object object = (Gs3$a)this.a.get(i3);
            gs3$d.a();
            gs3$d.b();
            int n4 = gs3$d.d;
            int n7 = 3;
            wp3 wp32 = gi0_02.n(n4, n7);
            d$a d$a = new d$a();
            gs3$d.b();
            Object object2 = gs3$d.e;
            d$a.a = object2;
            object2 = ip1_0.l("application/dvbsubs");
            d$a.n = object2;
            d$a.q = object2 = Collections.singletonList(((Gs3$a)object).b);
            d$a.d = object = ((Gs3$a)object).a;
            object = new d(d$a);
            wp32.d((d)object);
            wp3Array[i3] = wp32;
        }
    }

    public final void f(int n3, long l2) {
        if ((n3 &= 4) == 0) {
            return;
        }
        this.c = true;
        this.f = l2;
        this.e = 0;
        this.d = 2;
    }
}

