/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from I92$g
 */
public final class i92$g_0
extends I92 {
    public static final i92$g_0 c;

    static {
        i92$g_0 i92$g_0;
        c = i92$g_0 = new I92(0, 2, 1);
    }

    public final void a(R92$a object, mp mp2, q73 q732, F30$a f30$a) {
        int n3;
        int[] nArray;
        int n4;
        boolean bl2 = false;
        Xi1 xi1 = (Xi1)((R92$a)object).b(0);
        int n7 = 1;
        object = (Ae)((R92$a)object).b(n7);
        Object object2 = "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>";
        Intrinsics.checkNotNull(mp2, (String)object2);
        int n8 = q732.c((Ae)object);
        int n10 = q732.t;
        if (n10 < n8) {
            n10 = 1;
        } else {
            n10 = 0;
            object2 = null;
        }
        p30_0.h(n10 != 0);
        P92.a(q732, mp2, n8);
        n10 = q732.t;
        int n14 = q732.v;
        while (n14 >= 0 && (n4 = n73.h(nArray = q732.b, n3 = q732.p(n14))) == 0) {
            nArray = q732.b;
            n14 = q732.A(nArray, n14);
        }
        n14 += n7;
        n4 = 0;
        nArray = null;
        while (n14 < n10) {
            int n15;
            int[] nArray2;
            n3 = (int)(q732.r(n10, n14) ? 1 : 0);
            if (n3 != 0) {
                nArray2 = q732.b;
                n15 = q732.p(n14);
                n3 = (int)(n73.h(nArray2, n15) ? 1 : 0);
                if (n3 != 0) {
                    n4 = 0;
                    nArray = null;
                }
                ++n14;
                continue;
            }
            nArray2 = q732.b;
            n15 = q732.p(n14);
            n3 = (int)(n73.h(nArray2, n15) ? 1 : 0);
            if (n3 != 0) {
                n3 = 1;
            } else {
                nArray2 = q732.b;
                n15 = q732.p(n14);
                n3 = n73.j(nArray2, n15);
            }
            n4 += n3;
            n3 = q732.q(n14);
            n14 += n3;
        }
        while ((n10 = q732.t) < n8) {
            if ((n10 = (int)(q732.r(n8, n10) ? 1 : 0)) != 0) {
                n10 = q732.t;
                n14 = q732.u;
                if (n10 < n14) {
                    int[] nArray3 = q732.b;
                    n10 = q732.p(n10);
                    if ((n10 = (int)(n73.h(nArray3, n10) ? 1 : 0)) != 0) {
                        n10 = q732.t;
                        object2 = q732.z(n10);
                        mp2.g(object2);
                        n4 = 0;
                        nArray = null;
                    }
                }
                q732.L();
                continue;
            }
            n10 = q732.G();
            n4 += n10;
        }
        if (n10 == n8) {
            bl2 = true;
        }
        p30_0.h(bl2);
        xi1.a = n4;
    }

    public final String c(int n3) {
        boolean bl2 = I92$t.a(n3, 0);
        String string2 = bl2 ? "effectiveNodeIndexOut" : ((bl2 = I92$t.a(n3, 1)) ? "anchor" : super.c(n3));
        return string2;
    }
}

