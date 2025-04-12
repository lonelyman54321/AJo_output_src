/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class IV {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(Sl sl, LP1 lP1, xm3 xm32, boolean bl2, int n3, int n4, Function1 function1, Function1 function12, b30_0 b30_02, int n7, int n8) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        int n10;
        int n14;
        Object object5;
        int n15;
        int n16;
        int n17;
        Object object6;
        int n18;
        Function1 function13;
        LP1 lP12;
        block17: {
            lP12 = lP1;
            function13 = function12;
            n18 = n7;
            int n19 = -246609449;
            object6 = b30_02.g(n19);
            int n20 = n7 & 6;
            if (n20 == 0) {
                n17 = ((j30_0)object6).J(sl) ? 1 : 0;
                n17 = n17 != 0 ? 4 : 2;
                n17 |= n18;
            } else {
                n17 = n7;
            }
            n16 = n18 & 0x30;
            if (n16 == 0) {
                n16 = ((j30_0)object6).J(lP12) ? 1 : 0;
                n16 = n16 != 0 ? 32 : 16;
                n17 |= n16;
            }
            if ((n16 = n8 & 4) != 0) {
                n17 |= 0x180;
            } else {
                n15 = n18 & 0x180;
                if (n15 == 0) {
                    object5 = xm32;
                    n14 = ((j30_0)object6).J(xm32);
                    n14 = n14 != 0 ? 256 : 128;
                }
            }
            object5 = xm32;
            break block17;
            n17 |= n14;
        }
        n17 |= 0x1B6C00;
        n14 = 0xC00000 & n18;
        int n21 = 0x800000;
        if (n14 == 0) {
            n14 = ((j30_0)object6).x(function13) ? 1 : 0;
            n14 = n14 != 0 ? 0x800000 : 0x400000;
            n17 |= n14;
        }
        if ((n14 = 0x492493 & n17) == (n10 = 0x492492) && (n14 = (int)(((j30_0)object6).h() ? 1 : 0)) != 0) {
            ((j30_0)object6).D();
            n16 = bl2 ? 1 : 0;
            n14 = n4;
            object4 = function1;
            object3 = object5;
            n15 = n3;
        } else {
            Object object7;
            Object object8;
            if (n16 != 0) {
                object5 = object8 = xm3.d;
            }
            object8 = iv$a_0.c;
            Object object9 = ((j30_0)object6).v();
            Object object10 = b30$a.a;
            object2 = null;
            if (object9 == object10) {
                object9 = J83.g(null);
                ((j30_0)object6).o(object9);
            }
            object9 = (tr1_0)object9;
            int n22 = 0x1C00000 & n17;
            boolean bl3 = true;
            if (n22 == n21) {
                n21 = 1;
            } else {
                n21 = 0;
                object4 = null;
            }
            object = ((j30_0)object6).v();
            if (n21 != 0 || object == object10) {
                object = new IV$d(null, (tr1_0)object9, function13);
                ((j30_0)object6).o(object);
            }
            object = (Function2)object;
            object4 = new SuspendPointerInputElement(function13, null, (Function2)object, 6);
            object2 = lP12.then((LP1)object4);
            n21 = 0x380000;
            n22 = n17 & n21;
            int n24 = 0x100000;
            if (n22 != n24) {
                bl3 = false;
                object7 = null;
            }
            object = ((j30_0)object6).v();
            if (bl3 || object == object10) {
                object = new IV$b((tr1_0)object9, (Function1)object8);
                ((j30_0)object6).o(object);
            }
            object7 = object;
            object7 = (Function1)object;
            n14 = 0xE38E & n17;
            n10 = n17 << 6;
            n22 = 458752;
            n17 = n17 << 3 & n21;
            int n25 = (n14 |= (n10 &= n22)) | n17;
            n17 = 1;
            n21 = -1 >>> 1;
            int n26 = 896;
            object10 = sl;
            object = object5;
            n24 = 1;
            dx.a(sl, (LP1)object2, (xm3)object5, (Function1)object7, n17, n24 != 0, n21, 0, null, null, (b30_0)object6, n25, n26);
            object4 = object8;
            object3 = object5;
            n16 = 1;
            n15 = 1;
            n14 = -1 >>> 1;
        }
        object2 = ((j30_0)object6).X();
        if (object2 != null) {
            object6 = object;
            lP12 = lP1;
            function13 = function12;
            n18 = n7;
            n10 = n8;
            ((CF2)object2).d = object = new IV$c(sl, lP1, (xm3)object3, n16 != 0, n15, n14, (Function1)object4, function12, n7, n8);
        }
    }
}

