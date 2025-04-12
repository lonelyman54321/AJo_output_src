/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function2;

public final class Tk3 {
    /*
     * WARNING - void declaration
     */
    public static final void a(boolean bl2, uk2_0 uk2_02, Sk3 sk3, b30_0 object, int n3) {
        int n4;
        object = object.g(-1344558920);
        int n7 = n3 & 6;
        int n8 = 4;
        if (n7 == 0) {
            n7 = ((j30_0)object).a(bl2) ? 1 : 0;
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n3;
        } else {
            n7 = n3;
        }
        int n10 = n3 & 0x30;
        if (n10 == 0) {
            n10 = ((j30_0)object).J((Object)uk2_02) ? 1 : 0;
            n10 = n10 != 0 ? 32 : 16;
            n7 |= n10;
        }
        if ((n10 = n3 & 0x180) == 0) {
            n10 = ((j30_0)object).x(sk3) ? 1 : 0;
            n10 = n10 != 0 ? 256 : 128;
            n7 |= n10;
        }
        if ((n10 = n7 & 0x93) == (n4 = 146) && (n10 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            void var11_13;
            n10 = n7 & 0xE;
            n4 = 0;
            Object object2 = null;
            boolean bl3 = true;
            if (n10 == n8) {
                boolean n14 = true;
            } else {
                boolean bl4 = false;
            }
            int n14 = ((j30_0)object).J(sk3);
            int n15 = var11_13 | n14;
            Object object3 = ((j30_0)object).v();
            Object object4 = b30$a.a;
            if (n15 != 0 || object3 == object4) {
                object3 = new Rk3(sk3, bl2);
                ((j30_0)object).o(object3);
            }
            object3 = (Sj3)object3;
            int n16 = ((j30_0)object).x(sk3);
            if (n10 == n8) {
                n4 = 1;
            }
            n8 = n16 | n4;
            Object object5 = ((j30_0)object).v();
            if (n8 != 0 || object5 == object4) {
                object5 = new Tk3$a(sk3, bl2);
                ((j30_0)object).o(object5);
            }
            Object object6 = object5;
            object6 = (k72)object5;
            object5 = sk3.l();
            long l2 = ((ql3_0)object5).b;
            bl3 = mm3.f(l2);
            n10 = ((j30_0)object).x(object3) ? 1 : 0;
            object2 = ((j30_0)object).v();
            boolean bl5 = false;
            if (n10 != 0 || object2 == object4) {
                object2 = new Tk3$b((Sj3)object3, null);
                ((j30_0)object).o(object2);
            }
            object2 = (Function2)object2;
            object4 = new SuspendPointerInputElement(object3, null, (Function2)object2, 6);
            int n17 = (n7 <<= 3) & 0x3F0;
            long l3 = 0L;
            n10 = bl2 ? 1 : 0;
            object2 = uk2_02;
            bj_0.b((k72)object6, bl2, uk2_02, bl3, l3, (SuspendPointerInputElement)object4, (b30_0)object, n17);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            Tk3$c tk3$c = new Tk3$c(bl2, uk2_02, sk3, n3);
            ((CF2)object).d = tk3$c;
        }
    }

    public static final boolean b(Sk3 sk3, boolean n3) {
        Object object = sk3.d;
        boolean bl2 = false;
        if (object != null && (object = ((Vt1)object).c()) != null) {
            float f5;
            float f6;
            float f7;
            float f8;
            float f11;
            float f12;
            float f14;
            object = qY2.a((zp1)object);
            float f15 = ((aG2)object).a;
            long l2 = sk3.k(n3 != 0);
            float f16 = e72.d(l2);
            float f17 = f15 - f16;
            float f18 = f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1);
            if (f18 <= 0 && (f14 = (f12 = f16 - (f15 = ((aG2)object).c)) == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1)) <= 0 && (n3 = (f11 = (f8 = ((aG2)object).b) - (f7 = e72.e(l2))) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) <= 0 && (f6 = (f5 = f7 - (f8 = ((aG2)object).d)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) <= 0) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

