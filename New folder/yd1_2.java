/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yd1
 */
public final class yd1_2 {
    public static final long a = f60.i(0, 0, 0, 0);
    public static final /* synthetic */ int b;

    public static final void a(Object object, Function1 function1, LP1 lP1, he1_2 he1_22, s50_0 s50_02, u10 u102, b30_0 b30_02, int n3) {
        Object object2;
        Object object3;
        Object object4;
        Object object5 = object;
        Function1 function12 = function1;
        LP1 lP12 = lP1;
        he1_2 he1_23 = he1_22;
        u10 u103 = u102;
        int n4 = n3;
        Intrinsics.checkNotNullParameter(function1, "executeImageRequest");
        Object object6 = "imageOptions";
        Intrinsics.checkNotNullParameter(he1_22, (String)object6);
        Object object7 = "content";
        Intrinsics.checkNotNullParameter(u102, (String)object7);
        Object object8 = b30_02;
        j30_0 j30_02 = b30_02.g(-751886323);
        int n7 = n3 & 6;
        int n8 = 4;
        if (n7 == 0) {
            n7 = n3 & 8;
            n7 = n7 == 0 ? (int)(j30_02.J(object) ? 1 : 0) : (int)(j30_02.x(object) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n7 |= n4;
        } else {
            n7 = n3;
        }
        int n10 = n4 & 0x30;
        if (n10 == 0) {
            n10 = (int)(j30_02.x(function12) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n7 |= n10;
        }
        if ((n10 = n4 & 0x180) == 0) {
            n10 = (int)(j30_02.J(lP12) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n7 |= n10;
        }
        n10 = n4 & 0xC00;
        int n14 = 2048;
        if (n10 == 0) {
            n10 = (int)(j30_02.J(he1_23) ? 1 : 0);
            n10 = n10 != 0 ? 2048 : 1024;
            n7 |= n10;
        }
        n10 = n4 & 0x6000;
        Object object9 = s50_02;
        if (n10 == 0) {
            n10 = (int)(j30_02.J(s50_02) ? 1 : 0);
            n10 = n10 != 0 ? 16384 : 8192;
            n7 |= n10;
        }
        if ((n10 = 0x30000 & n4) == 0) {
            n10 = (int)(j30_02.x(u103) ? 1 : 0);
            n10 = n10 != 0 ? 131072 : 65536;
            n7 |= n10;
        }
        int n15 = n7;
        n10 = 74898;
        if ((n7 = 0x12493 & n7) == n10 && (n7 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
            object6 = j30_02;
        } else {
            j30_02.K(1017494444);
            n7 = n15 & 0xE;
            n10 = 0;
            int n16 = 1;
            if (n7 != n8 && ((n7 = n15 & 8) == 0 || (n7 = (int)(j30_02.J(object5) ? 1 : 0)) == 0)) {
                n7 = 0;
                object7 = null;
            } else {
                n7 = 1;
            }
            n8 = n15 & 0x1C00;
            if (n8 != n14) {
                n16 = 0;
                object4 = null;
            }
            object8 = j30_02.v();
            object3 = b30$a.a;
            if ((n7 |= n16) != 0 || object8 == object3) {
                object7 = zd1$c_0.a;
                object8 = J83.g(object7);
                j30_02.o(object8);
            }
            object4 = object8;
            object4 = (tr1_0)object8;
            j30_02.T(false);
            j30_02.K(1017499517);
            n7 = (int)(j30_02.x(function12) ? 1 : 0);
            n8 = (int)(j30_02.J(object4) ? 1 : 0);
            object8 = j30_02.v();
            if ((n7 |= n8) != 0 || object8 == object3) {
                n7 = 0;
                object7 = null;
                object8 = new td1_2(null, (tr1_0)object4, function12);
                j30_02.o(object8);
            }
            object8 = (Function2)object8;
            j30_02.T(false);
            ly0_0.e(object5, he1_23, (Function2)object8, j30_02);
            object7 = "<this>";
            Intrinsics.checkNotNullParameter(lP12, (String)object7);
            Intrinsics.checkNotNullParameter(he1_23, (String)object6);
            object6 = he1_23.b;
            if (object6 != null) {
                n7 = 1;
                object6 = new s4(he1_23, n7);
                object2 = object6 = CY2.b(lP12, false, (Function1)object6);
            } else {
                object2 = lP12;
            }
            object6 = object3;
            object7 = object;
            object8 = he1_22;
            object5 = object3;
            n14 = n15;
            object3 = new vd1_2(object, he1_22, s50_02, n15, u102, (tr1_0)object4);
            u10 u104 = v10.c(-906212105, (fx0_2)object3, j30_02);
            n7 = 1;
            int n17 = 3456;
            int n18 = 2;
            object9 = null;
            object6 = j30_02;
            OA.a((LP1)object2, null, n7 != 0, u104, j30_02, n17, n18);
        }
        object2 = ((j30_0)object6).X();
        if (object2 != null) {
            object6 = object9;
            object7 = object;
            object8 = function1;
            object3 = he1_22;
            object4 = u102;
            ((CF2)object2).d = object9 = new sd1_2(object, function1, lP1, he1_22, s50_02, u102, n3);
        }
    }
}

