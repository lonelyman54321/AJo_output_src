/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;

/*
 * Renamed from DQ1
 */
public final class dq1_0
implements qy0_0 {
    public final Xm2 a;
    public final EQ1$a b;
    public final String c;
    public final int d;
    public wp3 e;
    public String f;
    public int g = 0;
    public int h;
    public boolean i;
    public boolean j;
    public long k;
    public int l;
    public long m;

    public dq1_0(String string2, int n3) {
        EQ1$a eQ1$a;
        Xm2 xm2;
        this.a = xm2 = new Xm2(4);
        xm2.a[0] = -1;
        this.b = eQ1$a;
        this.m = -9223372036854775807L;
        this.c = string2;
        this.d = n3;
    }

    public final void a(Xm2 object) {
        int n3;
        Object object2 = this.e;
        ct3.h(object2);
        block0: while ((n3 = ((Xm2)object).a()) > 0) {
            String string2;
            int n4;
            int n7;
            int n8;
            Object object3;
            int n10;
            n3 = this.g;
            int n14 = 1;
            Object object4 = this.a;
            int n15 = 2;
            if (n3 != 0) {
                if (n3 != n14) {
                    if (n3 == n15) {
                        n3 = ((Xm2)object).a();
                        int n16 = this.l;
                        n15 = this.h;
                        n3 = Math.min(n3, n16 -= n15);
                        object4 = this.e;
                        object4.f(n3, (Xm2)object);
                        this.h = n16 = this.h + n3;
                        n3 = this.l;
                        if (n16 < n3) continue;
                        long l2 = this.m;
                        long l3 = -9223372036854775807L;
                        long l4 = l2 - l3;
                        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                        if (n3 == 0) {
                            n14 = 0;
                        }
                        ct3.f(n14 != 0);
                        wp3 wp32 = this.e;
                        long l7 = this.m;
                        n10 = this.l;
                        object3 = true;
                        n8 = 0;
                        wp32.a(l7, (int)object3, n10, 0, null);
                        long l8 = this.m;
                        l2 = this.k;
                        this.m = l8 += l2;
                        this.h = 0;
                        this.g = 0;
                        continue;
                    }
                    object = new IllegalStateException();
                    throw object;
                }
                n3 = ((Xm2)object).a();
                n7 = this.h;
                n4 = 4;
                n7 = 4 - n7;
                n3 = Math.min(n3, n7);
                Object object5 = ((Xm2)object4).a;
                object3 = this.h;
                ((Xm2)object).g((int)object3, (byte[])object5, n3);
                this.h = n7 = this.h + n3;
                if (n7 < n4) continue;
                ((Xm2)object4).I(0);
                n3 = ((Xm2)object4).i();
                object5 = this.b;
                n3 = (int)(((EQ1$a)object5).a(n3) ? 1 : 0);
                if (n3 == 0) {
                    this.h = 0;
                    this.g = n14;
                    continue;
                }
                this.l = n3 = ((EQ1$a)object5).c;
                n3 = (int)(this.i ? 1 : 0);
                if (n3 == 0) {
                    long l12 = (long)((EQ1$a)object5).g * 1000000L;
                    n3 = ((EQ1$a)object5).d;
                    long l14 = n3;
                    this.k = l12 /= l14;
                    object2 = new d$a();
                    ((d$a)object2).a = string2 = this.f;
                    ((d$a)object2).n = string2 = ip1_0.l(((EQ1$a)object5).b);
                    ((d$a)object2).o = 4096;
                    object3 = ((EQ1$a)object5).e;
                    ((d$a)object2).C = (int)object3;
                    ((d$a)object2).D = n7 = ((EQ1$a)object5).d;
                    ((d$a)object2).d = object5 = this.c;
                    ((d$a)object2).f = n7 = this.d;
                    object5 = new d((d$a)object2);
                    object2 = this.e;
                    object2.d((d)object5);
                    this.i = n14;
                }
                ((Xm2)object4).I(0);
                object2 = this.e;
                object2.f(n4, (Xm2)object4);
                this.g = n15;
                continue;
            }
            object2 = ((Xm2)object).a;
            n4 = ((Xm2)object).c;
            for (n7 = ((Xm2)object).b; n7 < n4; ++n7) {
                object3 = object2[n7];
                n10 = object3 & 0xFF;
                n8 = 255;
                n10 = n10 == n8 ? 1 : 0;
                n8 = (int)(this.j ? 1 : 0);
                if (n8 != 0 && (object3 = (Object)(object3 & 0xE0)) == (n8 = 224)) {
                    object3 = true;
                } else {
                    object3 = false;
                    string2 = null;
                }
                this.j = n10;
                if (object3 == false) continue;
                n4 = n7 + 1;
                ((Xm2)object).I(n4);
                this.j = false;
                object4 = ((Xm2)object4).a;
                n3 = object2[n7];
                object4[n14] = n3;
                this.h = n15;
                this.g = n14;
                continue block0;
            }
            ((Xm2)object).I(n4);
        }
    }

    public final void c() {
        this.g = 0;
        this.h = 0;
        this.j = false;
        this.m = -9223372036854775807L;
    }

    public final void d(boolean bl2) {
    }

    public final void e(gi0_0 object, Gs3$d gs3$d) {
        String string2;
        gs3$d.a();
        gs3$d.b();
        this.f = string2 = gs3$d.e;
        gs3$d.b();
        int n3 = gs3$d.d;
        this.e = object = object.n(n3, 1);
    }

    public final void f(int n3, long l2) {
        this.m = l2;
    }
}

