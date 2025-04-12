/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class ih {
    public static final float a;
    public static final float b;

    static {
        float f5;
        a = f5 = (float)25;
        b = f5 * 2.0f / 2.4142137f;
    }

    public static final void a(k72 k722, LP1 lP1, long l2, b30_0 b30_02, int n3) {
        Lambda lambda;
        int n4;
        b30_02 = b30_02.g(1776202187);
        int n7 = n3 & 6;
        int n8 = 4;
        if (n7 == 0) {
            n7 = n3 & 8;
            n7 = n7 == 0 ? (int)(((j30_0)b30_02).J(k722) ? 1 : 0) : (int)(((j30_0)b30_02).x(k722) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x30;
        if (n10 == 0) {
            n10 = (int)(((j30_0)b30_02).J(lP1) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n7 |= n10;
        }
        if ((n10 = n3 & 0x180) == 0) {
            n7 |= 0x80;
        }
        if ((n10 = n7 & 0x93) == (n4 = 146) && (n10 = (int)(((j30_0)b30_02).h() ? 1 : 0)) != 0) {
            ((j30_0)b30_02).D();
        } else {
            Object object;
            ((j30_0)b30_02).r0();
            n10 = n3 & 1;
            if (n10 != 0 && (n10 = (int)(((j30_0)b30_02).c0() ? 1 : 0)) == 0) {
                ((j30_0)b30_02).D();
                n7 &= 0xFFFFFC7F;
            } else {
                n7 &= 0xFFFFFC7F;
                l2 = 9205357640488583168L;
            }
            ((j30_0)b30_02).U();
            n10 = n7 & 0xE;
            n4 = 0;
            lambda = null;
            if (n10 != n8 && ((n7 &= 8) == 0 || (n7 = (int)(((j30_0)b30_02).x(k722) ? 1 : 0)) == 0)) {
                n7 = 0;
                object = null;
            } else {
                n7 = 1;
            }
            Object object2 = ((j30_0)b30_02).v();
            if (n7 != 0 || object2 == (object = b30$a.a)) {
                object2 = new dh_0(k722);
                ((j30_0)b30_02).o(object2);
            }
            object2 = (Function1)object2;
            object = CY2.b(lP1, false, (Function1)object2);
            object2 = Nc$a.b;
            lambda = new bh_1(l2, (LP1)object);
            n7 = -1653527038;
            object = v10.c(n7, lambda, b30_02);
            bj_0.a(k722, (Nc)object2, (u10)object, b30_02, n10 |= 0x1B0);
        }
        CF2 cF2 = ((j30_0)b30_02).X();
        if (cF2 != null) {
            ch_1 ch_12;
            lambda = ch_12;
            ch_12 = new ch_1(k722, lP1, l2, n3);
            cF2.d = ch_12;
        }
    }

    public static final void b(int n3, int n4, b30_0 object, LP1 lP1) {
        Object object2;
        int n7;
        float f5 = 5.005578E-14f;
        object = object.g(694251107);
        int n8 = n4 & 1;
        int n10 = 2;
        float f6 = 2.8E-45f;
        if (n8 != 0) {
            n7 = n3 | 6;
        } else {
            n7 = n3 & 6;
            if (n7 == 0) {
                n7 = (int)(((j30_0)object).J(lP1) ? 1 : 0);
                n7 = n7 != 0 ? 4 : 2;
                n7 |= n3;
            } else {
                n7 = n3;
            }
        }
        if ((n7 &= 3) == n10 && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            if (n8 != 0) {
                lP1 = LP1$a.b;
            }
            f5 = b;
            f6 = a;
            object2 = j.i(lP1, f5, f6);
            ji1$a ji1$a = ji1.a;
            hh_0 hh_02 = hh_0.c;
            object2 = a30_0.a((LP1)object2, ji1$a, hh_02);
            Q93.b((b30_0)object, (LP1)object2);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new eh_0(lP1, n3, n4);
        }
    }
}

