/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.math.RoundingMode;

public final class bF3$c
implements bF3$b {
    public final gi0_0 a;
    public final wp3 b;
    public final cf3_0 c;
    public final d d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public bF3$c(gi0_0 object, wp3 object2, cf3_0 cf3_02, String string2, int n3) {
        this.a = object;
        this.b = object2;
        this.c = cf3_02;
        int n4 = cf3_02.d;
        int n7 = cf3_02.a;
        n4 = n4 * n7 / 8;
        int n8 = cf3_02.c;
        if (n8 == n4) {
            int n10 = cf3_02.b;
            n8 = n10 * n4;
            int n14 = n8 * 8;
            this.e = n4 = Math.max(n4, n8 /= 10);
            d$a d$a = new d$a();
            d$a.n = string2 = ip1_0.l(string2);
            d$a.h = n14;
            d$a.i = n14;
            d$a.o = n4;
            d$a.C = n7;
            d$a.D = n10;
            d$a.E = n3;
            this.d = object = new d(d$a);
            return;
        }
        object2 = new StringBuilder("Expected block size: ");
        ((StringBuilder)object2).append(n4);
        ((StringBuilder)object2).append("; got: ");
        ((StringBuilder)object2).append(n8);
        throw ParserException.a(((StringBuilder)object2).toString(), null);
    }

    public final boolean a(il0_0 il0_02, long l2) {
        int n3;
        Object object;
        long l3;
        int n4;
        bF3$c bF3$c = this;
        long l4 = l2;
        while (true) {
            int n7;
            int n8;
            n4 = 1;
            l3 = 0L;
            long l7 = l4 - l3;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0 || (n8 = bF3$c.g) >= (n7 = bF3$c.e)) break;
            wp3 wp32 = bF3$c.b;
            long l8 = Math.min((long)(n7 -= n8), l4);
            n4 = wp32.c(il0_02, n8 = (int)l8, n4 != 0);
            if (n4 == (object = (Object)-1)) {
                l4 = l3;
                continue;
            }
            bF3$c.g = n3 = bF3$c.g + n4;
            long l12 = n4;
            l4 -= l12;
        }
        cf3_0 cf3_02 = bF3$c.c;
        int n10 = cf3_02.c;
        n3 = bF3$c.g / n10;
        if (n3 > 0) {
            long l14 = bF3$c.f;
            long l15 = bF3$c.h;
            long l16 = cf3_02.b;
            int n14 = gz3.a;
            RoundingMode roundingMode = RoundingMode.DOWN;
            long l17 = 1000000L;
            l15 = gz3.O(l15, l17, l16, roundingMode);
            long l18 = l14 + l15;
            int n15 = n3 * n10;
            n14 = bF3$c.g - n15;
            wp3 wp33 = bF3$c.b;
            int n16 = 1;
            wp33.a(l18, n16, n15, n14, null);
            l14 = bF3$c.h;
            l3 = n3;
            bF3$c.h = l14 += l3;
            bF3$c.g = n14;
        }
        if (object > 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public final void b(int n3, long l2) {
        long l3 = n3;
        cf3_0 cf3_02 = this.c;
        ef3_1 ef3_12 = new ef3_1(cf3_02, 1, l3, l2);
        this.a.h(ef3_12);
        wp3 wp32 = this.b;
        d d2 = this.d;
        wp32.d(d2);
    }

    public final void c(long l2) {
        this.f = l2;
        this.g = 0;
        this.h = 0L;
    }
}

