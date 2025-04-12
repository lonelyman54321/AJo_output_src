/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import java.io.EOFException;

public final class p72 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final Xm2 g;

    public p72() {
        int n3 = 255;
        Object object = new int[n3];
        this.f = object;
        object = new Xm2;
        super(n3);
        this.g = object;
    }

    public final boolean a(il0_0 il0_02, boolean bl2) {
        EOFException byArray4;
        block9: {
            long l2;
            long l3;
            long l4;
            long l7;
            byte[] byArray2;
            long l8;
            int n3 = 0;
            this.a = 0;
            this.b = l8 = 0L;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            Xm2 xm2 = this.g;
            int n4 = 27;
            xm2.F(n4);
            byte[] byArray3 = xm2.a;
            try {
                n4 = (int)(il0_02.b(byArray3, 0, n4, bl2) ? 1 : 0);
            }
            catch (EOFException byArray4) {
                if (!bl2) break block9;
                n4 = 0;
                byArray2 = null;
            }
            if (n4 != 0 && (l7 = (l4 = (l3 = xm2.y()) - (l2 = 1332176723L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
                EOFException eOFException322;
                block10: {
                    int n7;
                    int n8;
                    n4 = xm2.w();
                    if (n4 != 0) {
                        if (bl2) {
                            return false;
                        }
                        throw ParserException.b("unsupported bit stream revision");
                    }
                    this.a = n4 = xm2.w();
                    this.b = l3 = xm2.l();
                    xm2.n();
                    xm2.n();
                    xm2.n();
                    this.c = n4 = xm2.w();
                    this.d = n8 = n4 + 27;
                    xm2.F(n4);
                    byArray2 = xm2.a;
                    n8 = this.c;
                    try {
                        n7 = il0_02.b(byArray2, 0, n8, bl2);
                    }
                    catch (EOFException eOFException322) {
                        if (!bl2) break block10;
                        n7 = 0;
                        il0_02 = null;
                    }
                    if (n7 == 0) {
                        return false;
                    }
                    while (n3 < (n7 = this.c)) {
                        int n10;
                        n7 = xm2.w();
                        int[] nArray = this.f;
                        nArray[n3] = n7;
                        this.e = n10 = this.e + n7;
                        ++n3;
                    }
                    return true;
                }
                throw eOFException322;
            }
            return false;
        }
        throw byArray4;
    }

    public final boolean b(il0_0 il0_02, long l2) {
        long l3;
        int n3;
        Xm2 xm2;
        int n4;
        long l4 = il0_02.d;
        long l7 = il0_02.h();
        boolean bl2 = true;
        Object object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (object == false) {
            n4 = 1;
        } else {
            n4 = 0;
            xm2 = null;
        }
        ct3.a(n4 != 0);
        xm2 = this.g;
        int n7 = 4;
        xm2.F(n7);
        while (true) {
            long l8;
            if ((object = (l8 = l2 - (l7 = (long)-1)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
                l7 = il0_02.d;
                long l12 = 4;
                long l14 = (l7 += l12) - l2;
                Object object2 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (object2 >= 0) break;
            }
            byte[] byArray = xm2.a;
            try {
                n3 = il0_02.b(byArray, 0, n7, bl2);
            }
            catch (EOFException eOFException) {
                n3 = 0;
                byArray = null;
            }
            if (n3 == 0) break;
            xm2.I(0);
            l7 = xm2.y();
            long l15 = 1332176723L;
            long l16 = l7 == l15 ? 0 : (l7 < l15 ? -1 : 1);
            if (l16 == false) {
                il0_02.f = 0;
                return bl2;
            }
            il0_02.j((int)(bl2 ? 1 : 0));
        }
        while ((object == false || (n3 = (l3 = (l4 = il0_02.d) - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1)) < 0) && (n4 = il0_02.p((int)(bl2 ? 1 : 0))) != (n7 = -1)) {
        }
        return false;
    }
}

