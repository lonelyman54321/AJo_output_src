/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class Zw {
    public final ArrayList a;
    public final Zw$a b;
    public final Z50 c;

    public Zw(Z50 z50) {
        Object object = new ArrayList();
        this.a = object;
        this.b = object = new Object();
        this.c = z50;
    }

    public final boolean a(int n3, Zw$b zw$b, Y50 y50) {
        float f5;
        float f6;
        float f7;
        float f8;
        int n4;
        Object object = y50.W;
        Y50$b y50$b = object[0];
        Zw$a zw$a = this.b;
        zw$a.a = y50$b;
        int n7 = 1;
        zw$a.b = object = object[n7];
        zw$a.c = n4 = y50.v();
        zw$a.d = n4 = y50.p();
        zw$a.i = false;
        zw$a.j = n3;
        Y50$b y50$b2 = zw$a.a;
        object = Y50$b.MATCH_CONSTRAINT;
        if (y50$b2 == object) {
            n3 = 1;
            f8 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f8 = 0.0f;
            y50$b2 = null;
        }
        Y50$b y50$b3 = zw$a.b;
        if (y50$b3 == object) {
            n4 = 1;
            f7 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f7 = 0.0f;
            object = null;
        }
        int n8 = 0;
        y50$b3 = null;
        if (n3 != 0 && (n3 = (int)((f6 = (f8 = y50.a0) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0) {
            n3 = 1;
            f8 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f8 = 0.0f;
            y50$b2 = null;
        }
        if (n4 != 0 && (n4 = (int)((f5 = (f7 = y50.a0) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) > 0) {
            n4 = 1;
            f7 = Float.MIN_VALUE;
        } else {
            n4 = 0;
            f7 = 0.0f;
            object = null;
        }
        n8 = 4;
        int[] nArray = y50.v;
        if (n3 != 0 && (n3 = nArray[0]) == n8) {
            zw$a.a = y50$b2 = Y50$b.FIXED;
        }
        if (n4 != 0 && (n3 = nArray[n7]) == n8) {
            zw$a.b = y50$b2 = Y50$b.FIXED;
        }
        zw$b.b(y50, zw$a);
        n3 = zw$a.e;
        y50.W(n3);
        n3 = zw$a.f;
        y50.R(n3);
        n3 = (int)(zw$a.h ? 1 : 0);
        y50.G = n3;
        n3 = zw$a.g;
        y50.N(n3);
        zw$a.j = 0;
        return zw$a.i;
    }

    public final void b(Z50 z50, int n3, int n4, int n7) {
        z50.getClass();
        int n8 = z50.f0;
        int n10 = z50.g0;
        z50.f0 = 0;
        z50.g0 = 0;
        z50.W(n4);
        z50.R(n7);
        z50.f0 = n8 < 0 ? 0 : n8;
        z50.g0 = n10 < 0 ? 0 : n10;
        z50 = this.c;
        z50.A0 = n3;
        z50.Z();
    }

    public final void c(Z50 z50) {
        int n3;
        ArrayList arrayList = this.a;
        arrayList.clear();
        ArrayList arrayList2 = z50.x0;
        int n4 = arrayList2.size();
        int n7 = 0;
        while (true) {
            Y50$b y50$b;
            n3 = 1;
            if (n7 >= n4) break;
            Y50 y50 = (Y50)z50.x0.get(n7);
            Y50$b[] y50$bArray = y50.W;
            Y50$b y50$b2 = y50$bArray[0];
            Y50$b y50$b3 = Y50$b.MATCH_CONSTRAINT;
            if (y50$b2 == y50$b3 || (y50$b = y50$bArray[n3]) == y50$b3) {
                arrayList.add(y50);
            }
            ++n7;
        }
        z50.z0.b = n3;
    }
}

