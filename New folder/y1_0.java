/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;

/*
 * Renamed from y1
 */
public final class y1_0
implements qy0_0 {
    public final Vm2 a;
    public final Xm2 b;
    public final String c;
    public final int d;
    public String e;
    public wp3 f;
    public int g;
    public int h;
    public boolean i;
    public long j;
    public d k;
    public int l;
    public long m;

    public y1_0(String string2, int n3) {
        Xm2 xm2;
        int n4 = 16;
        byte[] byArray = new byte[n4];
        Object object = new Vm2(byArray, n4);
        this.a = object;
        object = ((Vm2)object).a;
        this.b = xm2 = new Xm2((byte[])object);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.m = -9223372036854775807L;
        this.c = string2;
        this.d = n3;
    }

    public final void a(Xm2 xm2) {
        int n3;
        Object object = this.f;
        ct3.h(object);
        block0: while ((n3 = xm2.a()) > 0) {
            int n4;
            int n7;
            int n8;
            Object object2;
            n3 = this.g;
            Object object3 = this.b;
            int n10 = 2;
            int n14 = 1;
            if (n3 != 0) {
                int n15;
                Object object4;
                if (n3 != n14) {
                    if (n3 != n10) continue;
                    n3 = xm2.a();
                    int n16 = this.l;
                    n10 = this.h;
                    n3 = Math.min(n3, n16 -= n10);
                    object3 = this.f;
                    object3.f(n3, xm2);
                    this.h = n16 = this.h + n3;
                    n3 = this.l;
                    if (n16 != n3) continue;
                    long l2 = this.m;
                    long l3 = -9223372036854775807L;
                    long l4 = l2 - l3;
                    n10 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                    if (n10 == 0) {
                        n14 = 0;
                        object4 = null;
                    }
                    ct3.f(n14 != 0);
                    object2 = this.f;
                    long l7 = this.m;
                    int n17 = this.l;
                    n15 = 1;
                    object2.a(l7, n15, n17, 0, null);
                    l2 = this.m;
                    long l8 = this.j;
                    this.m = l2 += l8;
                    this.g = 0;
                    continue;
                }
                object = ((Xm2)object3).a;
                n14 = xm2.a();
                n8 = this.h;
                n7 = 16;
                n8 = 16 - n8;
                n14 = Math.min(n14, n8);
                n8 = this.h;
                xm2.g(n8, (byte[])object, n14);
                this.h = n3 = this.h + n14;
                if (n3 != n7) continue;
                object = this.a;
                ((Vm2)object).m(0);
                object = z1_0.b((Vm2)object);
                object4 = this.k;
                object2 = "audio/ac4";
                n4 = ((z1$b)object).a;
                if (object4 == null || n10 != (n15 = ((d)object4).D) || n4 != (n15 = ((d)object4).E) || (n14 = (int)(((String)object2).equals(object4 = ((d)object4).o) ? 1 : 0)) == 0) {
                    String string2;
                    object4 = new d$a();
                    ((d$a)object4).a = string2 = this.e;
                    ((d$a)object4).n = object2 = ip1_0.l((String)object2);
                    ((d$a)object4).C = n10;
                    ((d$a)object4).D = n4;
                    ((d$a)object4).d = object2 = this.c;
                    ((d$a)object4).f = n8 = this.d;
                    this.k = object2 = new d((d$a)object4);
                    object4 = this.f;
                    object4.d((d)object2);
                }
                this.l = n14 = ((z1$b)object).b;
                long l12 = (long)((z1$b)object).c * 1000000L;
                n3 = this.k.E;
                long l14 = n3;
                this.j = l12 /= l14;
                ((Xm2)object3).I(0);
                object = this.f;
                object.f(n7, (Xm2)object3);
                this.g = n10;
                continue;
            }
            while ((n3 = xm2.a()) > 0) {
                n3 = (int)(this.i ? 1 : 0);
                n8 = 172;
                if (n3 == 0) {
                    n3 = xm2.w();
                    if (n3 == n8) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    this.i = n3;
                    continue;
                }
                n3 = xm2.w();
                if (n3 == n8) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object2 = null;
                }
                this.i = n8;
                n8 = 65;
                n7 = 64;
                if (n3 != n7 && n3 != n8) continue;
                if (n3 == n8) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object = null;
                }
                this.g = n14;
                object3 = ((Xm2)object3).a;
                n4 = -84;
                object3[0] = n4;
                if (n3 == 0) {
                    n8 = 64;
                }
                n3 = (byte)n8;
                object3[n14] = n3;
                this.h = n10;
                continue block0;
            }
        }
    }

    public final void c() {
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    public final void d(boolean bl2) {
    }

    public final void e(gi0_0 object, Gs3$d gs3$d) {
        String string2;
        gs3$d.a();
        gs3$d.b();
        this.e = string2 = gs3$d.e;
        gs3$d.b();
        int n3 = gs3$d.d;
        this.f = object = object.n(n3, 1);
    }

    public final void f(int n3, long l2) {
        this.m = l2;
    }
}

