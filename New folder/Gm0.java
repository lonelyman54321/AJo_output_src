/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.ranges.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class Gm0
implements oU1 {
    public final Cl2 a;
    public final pg2_0 b;

    public Gm0(hm0_0 hm0_02, pg2_0 pg2_02) {
        this.a = hm0_02;
        this.b = pg2_02;
    }

    public final Object onPostFling-RZ2iAVY(long l2, long l3, f80_0 f80_02) {
        pg2_0 pg2_02 = this.b;
        pg2_0 pg2_03 = pg2_0.Vertical;
        if (pg2_02 == pg2_03) {
            int n3 = 2;
            l2 = WA3.a(0.0f, 0.0f, n3, l3);
        } else {
            int n4 = 1;
            l2 = WA3.a(0.0f, 0.0f, n4, l3);
        }
        WA3 wA3 = new WA3(l2);
        return wA3;
    }

    public final long onPostScroll-DzOQY0M(long l2, long l3, int n3) {
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4) {
            Object object = this.b;
            pg2_0 pg2_02 = pg2_0.Horizontal;
            f5 = object == pg2_02 ? e72.d(l3) : e72.e(l3);
            pg2_02 = null;
            float f6 = f5 - 0.0f;
            n4 = (int)(f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1));
            if (n4 != 0) {
                object = new CancellationException("Scroll cancelled");
                throw object;
            }
        }
        return 0L;
    }

    public final Object onPreFling-QWom1Mo(long l2, f80_0 f80_02) {
        WA3 wA3 = new WA3(0L);
        return wA3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long onPreScroll-OzD1aCk(long l2, int n3) {
        pg2_0 pg2_02;
        int n4 = 1;
        float f5 = Float.MIN_VALUE;
        if (n3 != n4) return 0L;
        dU2 dU22 = this.a;
        f5 = Math.abs(((Cl2)dU22).k());
        double d2 = f5;
        long l3 = 4517329193108106637L;
        double d5 = 1.0E-6;
        double d7 = d2 - d5;
        Object object = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
        if (object <= 0) return 0L;
        f5 = ((Cl2)dU22).k();
        float f6 = ((Cl2)dU22).n();
        f5 *= f6;
        kl2_1 kl2_12 = ((Cl2)dU22).l();
        int n7 = kl2_12.getPageSize();
        kl2_1 kl2_13 = ((Cl2)dU22).l();
        f6 = kl2_13.i() + n7;
        float f7 = -Math.signum(((Cl2)dU22).k());
        f6 = f6 * f7 + f5;
        f7 = ((Cl2)dU22).k();
        pg2_0 pg2_03 = null;
        float f8 = f7 - 0.0f;
        Object object2 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
        if (object2 > 0) {
            float f11 = f6;
            f6 = f5;
            f5 = f11;
        }
        float f12 = (pg2_03 = this.b) == (pg2_02 = pg2_0.Horizontal) ? e72.d(l2) : e72.e(l2);
        f5 = -f.f(f12, f5, f6);
        dU22 = ((Cl2)dU22).j;
        float f14 = -((xm0_0)dU22).e(f5);
        f5 = pg2_03 == pg2_02 ? f14 : e72.d(l2);
        pg2_0 pg2_04 = pg2_0.Vertical;
        if (pg2_03 != pg2_04) {
            f14 = e72.e(l2);
        }
        int n8 = Float.floatToRawIntBits(f5);
        l2 = n8;
        long l4 = Float.floatToRawIntBits(f14);
        n3 = 32;
        f14 = 4.5E-44f;
        l2 <<= n3;
        l3 = 0xFFFFFFFFL;
        d5 = 2.1219957905E-314;
        l2 |= (l4 &= l3);
        return l2;
    }
}

