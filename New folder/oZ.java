/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class oZ {
    public static final qz_0 a;

    static {
        qz_0 qz_02;
        zp$k zp$k = zp.c;
        Gx$a gx$a = Nc$a.m;
        a = qz_02 = new qz_0(zp$k, gx$a);
    }

    public static final qz_0 a(zp$l object, Gx$a gx$a, b30_0 b30_02, int n3) {
        Object object2 = zp.c;
        int n4 = Intrinsics.areEqual(object, object2);
        if (n4 != 0 && (n4 = Intrinsics.areEqual(gx$a, object2 = Nc$a.m)) != 0) {
            int n7 = 345962472;
            b30_02.K(n7);
            b30_02.E();
            object = a;
        } else {
            b30$a$a b30$a$a;
            b30_02.K(346016319);
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
            if (n10 > n14 && (n10 = (int)(b30_02.J(gx$a) ? 1 : 0)) != 0 || (n3 &= 0x30) == n14) {
                n8 = 1;
            }
            n3 = n4 | n8;
            object2 = b30_02.v();
            if (n3 != 0 || object2 == (b30$a$a = b30$a.a)) {
                object2 = new qz_0((zp$l)object, gx$a);
                b30_02.o(object2);
            }
            object = object2;
            object = (qz_0)object2;
            b30_02.E();
        }
        return object;
    }
}

