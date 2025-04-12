/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.Metadata;
import java.util.Arrays;

/*
 * Renamed from CO0
 */
public final class co0_0
extends zd3_0 {
    public EO0 n;
    public CO0$a o;

    public final long b(Xm2 xm2) {
        byte[] byArray = xm2.a;
        int n3 = byArray[0];
        int n4 = -1;
        if (n3 == n4) {
            int n7 = byArray[2] & 0xFF;
            n3 = 4;
            n4 = 6;
            if ((n7 >>= n3) == n4 || n7 == (n4 = 7)) {
                xm2.J(n3);
                xm2.D();
            }
            n7 = AO0.b(n7, xm2);
            xm2.I(0);
            return n7;
        }
        return -1;
    }

    public final boolean c(Xm2 xm2, long l2, Zd3$a zd3$a) {
        Object object = xm2;
        Object object2 = zd3$a;
        Object object3 = xm2.a;
        EO0 eO0 = this.n;
        boolean bl2 = true;
        if (eO0 == null) {
            this.n = eO0 = new EO0((byte[])object3, 17);
            int n3 = xm2.c;
            object = Arrays.copyOfRange(object3, 9, n3);
            zd3$a.a = object = eO0.c((byte[])object, null);
            return bl2;
        }
        byte by2 = object3[0];
        int n4 = by2 & 0x7F;
        int n7 = 3;
        if (n4 == n7) {
            long l3;
            object = BO0.a(xm2);
            long l4 = eO0.j;
            object3 = eO0.l;
            int n8 = eO0.a;
            int n10 = eO0.b;
            int n14 = eO0.c;
            int n15 = eO0.d;
            int n16 = eO0.e;
            int n17 = eO0.g;
            int n18 = eO0.h;
            this.n = object2 = new EO0(n8, n10, n14, n15, n16, n17, n18, l4, (EO0$a)object, (Metadata)object3);
            object3 = new CO0$a;
            object3();
            object3.a = object2;
            object3.b = object;
            object3.c = l3 = (long)-1;
            object3.d = l3;
            this.o = object3;
            return bl2;
        }
        byte by4 = -1;
        if (by2 == by4) {
            object = this.o;
            if (object != null) {
                ((CO0$a)object).c = l2;
                zd3$a.b = object;
            }
            ((Zd3$a)object2).a.getClass();
            return false;
        }
        return bl2;
    }

    public final void d(boolean bl2) {
        super.d(bl2);
        if (bl2) {
            bl2 = false;
            this.n = null;
            this.o = null;
        }
    }
}

