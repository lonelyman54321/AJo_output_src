/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class iQ2 {
    public static final kQ2 a;

    static {
        kQ2 kQ22;
        zp$j zp$j = zp.a;
        Gx$b gx$b = Nc$a.j;
        a = kQ22 = new kQ2(zp$j, gx$b);
    }

    public static final kQ2 a(zp$e object, Gx$b gx$b, b30_0 b30_02, int n3) {
        Object object2 = zp.a;
        int n4 = Intrinsics.areEqual(object, object2);
        if (n4 != 0 && (n4 = Intrinsics.areEqual(gx$b, object2 = Nc$a.j)) != 0) {
            int n7 = -849081669;
            b30_02.K(n7);
            b30_02.E();
            object = a;
        } else {
            b30$a$a b30$a$a;
            b30_02.K(-849030798);
            n4 = n3 & 0xE ^ 6;
            int n8 = 0;
            int n10 = 4;
            if (n4 > n10 && (n4 = (int)(b30_02.J(object) ? 1 : 0)) != 0 || (n4 = n3 & 6) == n10) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            n10 = n3 & 0x70 ^ 0x30;
            int n14 = 32;
            if (n10 > n14 && (n10 = (int)(b30_02.J(gx$b) ? 1 : 0)) != 0 || (n3 &= 0x30) == n14) {
                n8 = 1;
            }
            n3 = n4 | n8;
            object2 = b30_02.v();
            if (n3 != 0 || object2 == (b30$a$a = b30$a.a)) {
                object2 = new kQ2((zp$e)object, gx$b);
                b30_02.o(object2);
            }
            object = object2;
            object = (kQ2)object2;
            b30_02.E();
        }
        return object;
    }
}

