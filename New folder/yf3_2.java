/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.io.EOFException;

/*
 * Renamed from Yf3
 */
public final class yf3_2
implements wp3 {
    public final wp3 a;
    public final vf3$a_0 b;
    public final Te0 c;
    public final Xm2 d;
    public int e;
    public int f;
    public byte[] g;
    public vf3_0 h;
    public d i;

    public yf3_2(wp3 object, vf3$a_0 vf3$a_0) {
        this.a = object;
        this.b = vf3$a_0;
        this.c = object = new Object();
        this.e = 0;
        this.f = 0;
        object = gz3.f;
        this.g = (byte[])object;
        this.d = object = new Xm2();
    }

    public final void a(long l2, int n3, int n4, int n7, wp3$a wp3$a) {
        int n8;
        vf3_0 vf3_02 = this.h;
        if (vf3_02 == null) {
            this.a.a(l2, n3, n4, n7, wp3$a);
            return;
        }
        vf3_02 = null;
        if (wp3$a == null) {
            n8 = 1;
        } else {
            n8 = 0;
            wp3$a = null;
        }
        ct3.b(n8 != 0, "DRM on subtitles is not supported");
        n8 = this.f - n7 - n4;
        vf3_0 vf3_03 = this.h;
        byte[] byArray = this.g;
        Vf3$b vf3$b = Vf3$b.c;
        xf3_0 xf3_02 = new xf3_0(this, l2, n3);
        vf3_03.b(byArray, n8, n4, vf3$b, xf3_02);
        this.e = n8 += n4;
        int n10 = this.f;
        if (n8 == n10) {
            this.e = 0;
            this.f = 0;
        }
    }

    public final void b(Xm2 xm2, int n3, int n4) {
        int n7;
        vf3_0 vf3_02 = this.h;
        if (vf3_02 == null) {
            this.a.b(xm2, n3, n4);
            return;
        }
        this.g(n3);
        byte[] byArray = this.g;
        int n8 = this.f;
        xm2.g(n8, byArray, n3);
        this.f = n7 = this.f + n3;
    }

    public final int c(mi0_0 mi0_02, int n3, boolean bl2) {
        return this.e(mi0_02, n3, bl2);
    }

    /*
     * WARNING - void declaration
     */
    public final void d(d d2) {
        void var3_6;
        Object object;
        d2.o.getClass();
        String string2 = d2.o;
        int bl2 = ip1_0.g(string2);
        int n3 = 3;
        if (bl2 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        ct3.a((boolean)var3_6);
        object = this.i;
        boolean bl5 = d2.equals(object);
        vf3$a_0 vf3$a_0 = this.b;
        if (!bl5) {
            this.i = d2;
            boolean bl6 = vf3$a_0.a(d2);
            if (bl6) {
                object = vf3$a_0.c(d2);
            } else {
                boolean bl7 = false;
                object = null;
            }
            this.h = object;
        }
        object = this.h;
        wp3 wp32 = this.a;
        if (object == null) {
            wp32.d(d2);
        } else {
            int n4;
            long l2;
            String string3;
            object = d2.a();
            ((d$a)object).n = string3 = ip1_0.l("application/x-media3-cues");
            ((d$a)object).j = string2;
            ((d$a)object).s = l2 = Long.MAX_VALUE;
            ((d$a)object).I = n4 = vf3$a_0.b(d2);
            d2 = new d((d$a)object);
            wp32.d(d2);
        }
    }

    public final int e(mi0_0 object, int n3, boolean bl2) {
        Object object2 = this.h;
        if (object2 == null) {
            return this.a.e((mi0_0)object, n3, bl2);
        }
        this.g(n3);
        object2 = this.g;
        int n4 = this.f;
        int n7 = object.read((byte[])object2, n4, n3);
        n3 = -1;
        if (n7 == n3) {
            if (bl2) {
                return n3;
            }
            object = new EOFException();
            throw object;
        }
        this.f = n3 = this.f + n7;
        return n7;
    }

    public final void f(int n3, Xm2 xm2) {
        this.b(xm2, n3, 0);
    }

    public final void g(int n3) {
        int n4;
        byte[] byArray = this.g;
        int n7 = byArray.length;
        int n8 = this.f;
        if ((n7 -= n8) >= n3) {
            return;
        }
        n7 = this.e;
        n8 -= n7;
        n7 = n8 * 2;
        n3 += n8;
        byte[] byArray2 = (n3 = Math.max(n7, n3)) <= (n4 = (byArray = this.g).length) ? byArray : new byte[n3];
        n4 = this.e;
        System.arraycopy(byArray, n4, byArray2, 0, n8);
        this.e = 0;
        this.f = n8;
        this.g = byArray2;
    }
}

