/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class C70 {
    /*
     * WARNING - void declaration
     */
    public static final void a(P70 p70, Function0 function0, LP1 lP1, Yk3 yk3, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        LP1 lP12;
        boolean bl2;
        int n4;
        int n7;
        P70 p702 = p70;
        int n10 = n3;
        int n14 = 645832757;
        Object object3 = b30_02.g(n14);
        int n15 = n3 & 6;
        if (n15 == 0) {
            n15 = ((j30_0)object3).J(p70) ? 1 : 0;
            n15 = n15 != 0 ? 4 : 2;
            n15 |= n10;
        } else {
            n15 = n3;
        }
        int n16 = n10 & 0x30;
        if (n16 == 0) {
            void var12_15;
            boolean n8 = ((j30_0)object3).x(function0);
            if (n8) {
                int n17 = 32;
            } else {
                int n18 = 16;
            }
            n15 |= var12_15;
        }
        n15 |= 0x180;
        int n19 = n10 & 0xC00;
        if (n19 == 0) {
            void var13_20;
            boolean bl3 = ((j30_0)object3).x(yk3);
            if (bl3) {
                int n20 = 2048;
            } else {
                int n21 = 1024;
            }
            n15 |= var13_20;
        }
        if ((n7 = n15 & 0x493) == (n4 = 1170) && (bl2 = ((j30_0)object3).h())) {
            ((j30_0)object3).D();
            lP12 = lP1;
        } else {
            lP12 = LP1$a.b;
            object2 = (P70$a)p702.a.getValue();
            n4 = object2 instanceof P70$a$b;
            if (n4 == 0) {
                object2 = ((j30_0)object3).X();
                if (object2 != null) {
                    z70_0 z70_02;
                    object3 = z70_02;
                    p702 = p70;
                    n10 = n3;
                    z70_02 = new z70_0(p70, function0, lP12, yk3, n3);
                    ((CF2)object2).d = z70_02;
                }
                return;
            }
            n4 = ((j30_0)object3).J(object2) ? 1 : 0;
            Object object4 = ((j30_0)object3).v();
            if (n4 != 0 || object4 == (object = b30$a.a)) {
                object2 = (P70$a$b)object2;
                long l2 = Ti1.b(((P70$a$b)object2).a);
                object4 = new K70(l2);
                ((j30_0)object3).o(object4);
            }
            object2 = object4;
            object2 = (K70)object4;
            int n22 = n15 & 0x1FF0;
            object = function0;
            object4 = lP12;
            X70.d((K70)object2, function0, lP12, yk3, (b30_0)object3, n22);
        }
        object2 = ((j30_0)object3).X();
        if (object2 != null) {
            object3 = object;
            p702 = p70;
            n10 = n3;
            ((CF2)object2).d = object = new A70(p70, function0, lP12, yk3, n3);
        }
    }

    public static final void b(P70 p70, Function0 function0, Yk3 yk3, LP1 lP1, boolean n3, u10 u102, b30_0 b30_02, int n4) {
        block17: {
            int n7;
            Object object;
            Object object2;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            int n8;
            Object object7;
            block16: {
                Object object8;
                int n10;
                int n14;
                int n15;
                int n16;
                u10 u103;
                block15: {
                    object7 = p70;
                    n8 = n3;
                    u103 = u102;
                    int n17 = n4;
                    n16 = 6;
                    object6 = b30_02;
                    object5 = b30_02.g(-84584070);
                    n15 = n4 & 6;
                    if (n15 == 0) {
                        n15 = ((j30_0)object5).J(p70) ? 1 : 0;
                        n15 = n15 != 0 ? 4 : 2;
                        n15 |= n17;
                    } else {
                        n15 = n4;
                    }
                    n14 = n17 & 0x30;
                    if (n14 == 0) {
                        n14 = ((j30_0)object5).x(function0) ? 1 : 0;
                        n14 = n14 != 0 ? 32 : 16;
                        n15 |= n14;
                    }
                    if ((n14 = n17 & 0x180) == 0) {
                        n14 = ((j30_0)object5).x(yk3) ? 1 : 0;
                        n14 = n14 != 0 ? 256 : 128;
                        n15 |= n14;
                    }
                    n15 |= 0xC00;
                    n14 = n17 & 0x6000;
                    if (n14 == 0) {
                        n14 = ((j30_0)object5).a(n8 != 0) ? 1 : 0;
                        n14 = n14 != 0 ? 16384 : 8192;
                        n15 |= n14;
                    }
                    if ((n14 = 0x30000 & n17) == 0) {
                        n14 = ((j30_0)object5).x(u103) ? 1 : 0;
                        n14 = n14 != 0 ? 131072 : 65536;
                        n15 |= n14;
                    }
                    if ((n14 = 0x12493 & n15) != (n10 = 74898) || (n14 = (int)(((j30_0)object5).h() ? 1 : 0)) == 0) break block15;
                    ((j30_0)object5).D();
                    object4 = lP1;
                    break block16;
                }
                object3 = LP1$a.b;
                n14 = 0;
                object6 = null;
                if (n8 != 0) {
                    object2 = J70.a;
                    object4 = new G70((P70)object7, null);
                    object8 = tg3_0.a;
                    object8 = new SuspendPointerInputElement(object2, null, (Function2)object4, n16);
                } else {
                    object8 = object3;
                }
                object = Nc$a.a;
                boolean bl2 = true;
                object = HA.e((Nc)object, bl2);
                n10 = ((j30_0)object5).P;
                object4 = ((j30_0)object5).P();
                object8 = a30_0.c((b30_0)object5, (LP1)object8);
                N20.W.getClass();
                Xp1$a xp1$a = N20$a.b;
                object6 = ((j30_0)object5).a;
                n14 = object6 instanceof mp;
                if (n14 == 0) break block17;
                ((j30_0)object5).A();
                n14 = ((j30_0)object5).O ? 1 : 0;
                if (n14 != 0) {
                    ((j30_0)object5).C(xp1$a);
                } else {
                    ((j30_0)object5).n();
                }
                object6 = N20$a.e;
                Ow3.a((b30_0)object5, object, (Function2)object6);
                object = N20$a.d;
                Ow3.a((b30_0)object5, object4, (Function2)object);
                object = N20$a.f;
                n14 = ((j30_0)object5).O ? 1 : 0;
                if (n14 != 0 || (n14 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object5).v(), object4 = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                    rk_0.a(n10, (j30_0)object5, n10, (N20$a$a)object);
                }
                object = N20$a.c;
                Ow3.a((b30_0)object5, object8, (Function2)object);
                object = n15 >> 15 & 0xE;
                u103.invoke(object5, object);
                n16 = n15 & 0x7E;
                n15 = n15 << 3 & 0x1C00;
                n7 = n16 | n15;
                n14 = 0;
                object6 = null;
                object = p70;
                object2 = yk3;
                object4 = object5;
                C70.a(p70, function0, null, yk3, (b30_0)object5, n7);
                ((j30_0)object5).T(bl2);
                object4 = object3;
            }
            object5 = ((j30_0)object5).X();
            if (object5 != null) {
                object = object3;
                object6 = function0;
                object2 = yk3;
                n7 = n3;
                object7 = u102;
                n8 = n4;
                ((CF2)object5).d = object3 = new B70(p70, function0, yk3, (LP1)object4, n3 != 0, u102, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

