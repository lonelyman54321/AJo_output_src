/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class Tu0 {
    public static final float a;
    public static final float b;
    public static final float c;
    public static final Qs3 d;

    static {
        Qs3 qs3;
        float f5;
        a = f5 = (float)56;
        b = f5;
        c = 400;
        d = qs3 = new Qs3(256, null, 6);
    }

    /*
     * WARNING - void declaration
     */
    public static final void a(gx0_2 gx0_22, LP1 lP1, yu0_0 yu0_02, boolean n3, i13 i132, float f5, long l2, long l3, long l4, u10 u102, b30_0 b30_02, int n4) {
        Object object;
        int n7;
        Object object2;
        int n8;
        int n10;
        Object object3 = lP1;
        int n14 = n4;
        int n15 = 1305806945;
        Object object4 = b30_02;
        Object object5 = b30_02.g(n15);
        int n16 = n4 & 6;
        if (n16 == 0) {
            object4 = gx0_22;
            n10 = ((j30_0)object5).x(gx0_22) ? 1 : 0;
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n14;
        } else {
            object4 = gx0_22;
            n10 = n4;
        }
        int n17 = n14 & 0x30;
        if (n17 == 0) {
            n17 = ((j30_0)object5).J(object3) ? 1 : 0;
            n17 = n17 != 0 ? 32 : 16;
            n10 |= n17;
        }
        if ((n17 = n14 & 0x180) == 0) {
            n17 = ((j30_0)object5).J(yu0_02) ? 1 : 0;
            n17 = n17 != 0 ? 256 : 128;
            n10 |= n17;
        }
        if ((n17 = n14 & 0xC00) == 0) {
            n17 = ((j30_0)object5).a(n3 != 0) ? 1 : 0;
            n17 = n17 != 0 ? 2048 : 1024;
            n10 |= n17;
        }
        if ((n17 = n14 & 0x6000) == 0) {
            n17 = ((j30_0)object5).J(i132) ? 1 : 0;
            n17 = n17 != 0 ? 16384 : 8192;
            n10 |= n17;
        }
        if ((n17 = 0x30000 & n14) == 0) {
            n17 = ((j30_0)object5).b(f5) ? 1 : 0;
            n17 = n17 != 0 ? 131072 : 65536;
            n10 |= n17;
        }
        if ((n17 = 0x180000 & n14) == 0) {
            n17 = ((j30_0)object5).d(l2) ? 1 : 0;
            n17 = n17 != 0 ? 0x100000 : 524288;
            n10 |= n17;
        }
        if ((n17 = 0xC00000 & n14) == 0) {
            n17 = ((j30_0)object5).d(l3) ? 1 : 0;
            n17 = n17 != 0 ? 0x800000 : 0x400000;
            n10 |= n17;
        }
        if ((n17 = 0x6000000 & n14) == 0) {
            void var23_23;
            boolean n84 = ((j30_0)object5).d(l4);
            if (n84) {
                int n18 = 0x4000000;
            } else {
                int n19 = 0x2000000;
            }
            n10 |= var23_23;
        }
        if ((n8 = 0x30000000 & n14) == 0) {
            object2 = u102;
            n7 = ((j30_0)object5).x(u102) ? 1 : 0;
            n7 = n7 != 0 ? 0x20000000 : 0x10000000;
            n10 |= n7;
        } else {
            object2 = u102;
        }
        n7 = 306783379;
        n16 = 306783378;
        if ((n10 &= n7) == n16 && (n16 = (int)(((j30_0)object5).h() ? 1 : 0)) != 0) {
            ((j30_0)object5).D();
        } else {
            ((j30_0)object5).r0();
            n16 = n14 & 1;
            if (n16 != 0 && (n16 = (int)(((j30_0)object5).c0() ? 1 : 0)) == 0) {
                ((j30_0)object5).D();
            }
            ((j30_0)object5).U();
            object4 = ((j30_0)object5).v();
            object = b30$a.a;
            if (object4 == object) {
                object4 = Qx2.a(ly0_0.f(f.a, (b30_0)object5), (j30_0)object5);
            }
            object4 = ((Q30)object4).a;
            object = j.c;
            object = object3.then((LP1)object);
            Object object6 = object4;
            object6 = (c80)object4;
            object2 = object3;
            int n20 = n3;
            object3 = new ku0_1(yu0_02, n3 != 0, (c80)object6, l4, i132, l2, l3, f5, u102, gx0_22);
            n16 = 816674999;
            object4 = v10.c(n16, (fx0_2)object3, (b30_0)object5);
            object3 = null;
            boolean bl2 = false;
            object2 = null;
            n7 = 3072;
            n20 = 6;
            n17 = 0;
            OA.a((LP1)object, null, false, (u10)object4, (b30_0)object5, n7, n20);
        }
        object2 = ((j30_0)object5).X();
        if (object2 != null) {
            lu0_1 lu0_12;
            object5 = lu0_12;
            object4 = gx0_22;
            object3 = lP1;
            object = yu0_02;
            n17 = n3;
            n14 = n4;
            lu0_12 = new lu0_1(gx0_22, lP1, yu0_02, n3 != 0, i132, f5, l2, l3, l4, u102, n4);
            ((CF2)object2).d = lu0_12;
        }
    }

    public static final void b(boolean bl2, Function0 function0, Function0 function02, long l2, b30_0 b30_02, int n3) {
        Object object;
        int n4;
        boolean bl3 = bl2;
        Function0 function03 = function0;
        Function0 function04 = function02;
        long l3 = l2;
        int n7 = n3;
        int n8 = 1983403750;
        Object object2 = b30_02;
        Object object3 = b30_02.g(n8);
        int n10 = n3 & 6;
        if (n10 == 0) {
            n10 = ((j30_0)object3).a(bl2) ? 1 : 0;
            n10 = n10 != 0 ? 4 : 2;
            n10 |= n7;
        } else {
            n10 = n3;
        }
        int n14 = n7 & 0x30;
        int n15 = 32;
        if (n14 == 0) {
            n14 = ((j30_0)object3).x(function03) ? 1 : 0;
            n14 = n14 != 0 ? 32 : 16;
            n10 |= n14;
        }
        if ((n14 = n7 & 0x180) == 0) {
            n14 = ((j30_0)object3).x(function04) ? 1 : 0;
            n14 = n14 != 0 ? 256 : 128;
            n10 |= n14;
        }
        if ((n14 = n7 & 0xC00) == 0) {
            n14 = ((j30_0)object3).d(l3) ? 1 : 0;
            n14 = n14 != 0 ? 2048 : 1024;
            n10 |= n14;
        }
        if ((n14 = n10 & 0x493) == (n4 = 1170) && (n14 = (int)(((j30_0)object3).h() ? 1 : 0)) != 0) {
            ((j30_0)object3).D();
        } else {
            int n16;
            Object object4;
            int n17;
            Object object5;
            n14 = 1;
            String string2 = Me3.a((b30_0)object3, n14);
            LP1 lP1 = LP1$a.b;
            b30$a$a b30$a$a = b30$a.a;
            if (bl3) {
                ((j30_0)object3).K(487729414);
                int n18 = n10 & 0x70;
                boolean bl4 = n18 == n15;
                object5 = ((j30_0)object3).v();
                n17 = 0;
                if (bl4 || object5 == b30$a$a) {
                    object5 = new ou0_2(function03, null);
                    ((j30_0)object3).o(object5);
                }
                object5 = (Function2)object5;
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(function03, null, (Function2)object5, 6);
                n14 = ((j30_0)object3).J(string2) ? 1 : 0;
                if (n18 == n15) {
                    n15 = 1;
                } else {
                    n15 = 0;
                    object4 = null;
                }
                object4 = ((j30_0)object3).v();
                if ((n14 |= n15) != 0 || object4 == b30$a$a) {
                    object4 = new qu0_2(string2, function03);
                    ((j30_0)object3).o(object4);
                }
                object4 = (Function1)object4;
                n14 = 1;
                lP1 = CY2.b(suspendPointerInputElement, n14 != 0, (Function1)object4);
                n15 = 0;
                object4 = null;
                ((j30_0)object3).T(false);
            } else {
                n15 = 0;
                object4 = null;
                n16 = 487978282;
                ((j30_0)object3).K(n16);
                ((j30_0)object3).T(false);
            }
            object4 = j.c.then(lP1);
            n16 = n10 & 0x1C00;
            n17 = 2048;
            if (n16 == n17) {
                n16 = 1;
            } else {
                n16 = 0;
                object5 = null;
            }
            n17 = 256;
            if ((n10 &= 0x380) != n17) {
                n14 = 0;
                object = null;
            }
            n10 = n16 | n14;
            object = ((j30_0)object3).v();
            if (n10 != 0 || object == b30$a$a) {
                object = new mu0_2(l3, function04);
                ((j30_0)object3).o(object);
            }
            object = (Function1)object;
            n10 = 0;
            object2 = null;
            AL.a((LP1)object4, (Function1)object, (b30_0)object3, 0);
        }
        object2 = ((j30_0)object3).X();
        if (object2 != null) {
            object3 = object;
            bl3 = bl2;
            function03 = function0;
            function04 = function02;
            l3 = l2;
            n7 = n3;
            object = new nu0_0(bl2, function0, function02, l2, n3);
            ((CF2)object2).d = object;
        }
    }

    public static final yu0_0 c(zu0_0 zu0_02, b30_0 b30_02) {
        ru0_0 ru0_02 = ru0_0.c;
        Object[] objectArray = new Object[]{};
        Object object = new xu0_2(ru0_02, 0);
        ds2_0 ds2_02 = CS2.a;
        Object object2 = wu0_2.c;
        ds2_02 = new ds2_0((Function2)object2, (Function1)object);
        boolean bl2 = b30_02.J(ru0_02);
        object2 = b30_02.v();
        if (bl2 || object2 == (object = b30$a.a)) {
            object2 = new su0_2(zu0_02, ru0_02);
            b30_02.o(object2);
        }
        object2 = (Function0)object2;
        object = ds2_02;
        return (yu0_0)wi2_0.b(objectArray, ds2_02, (Function0)object2, b30_02, 0, 4);
    }
}

