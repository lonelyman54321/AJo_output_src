/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Matrix
 *  android.graphics.Rect
 */
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class HB1 {
    public static final void a(QB1 qB1, float f5, LP1 lP1, boolean bl2, boolean bl3, boolean bl4, boolean bl5, UI2 uI2, boolean bl6, zc1_1 zc1_12, Nc nc, i70_0 i70_02, boolean bl7, boolean bl8, Hq hq, b30_0 b30_02, int n3, int n4) {
        float f6 = f5;
        int n7 = n3;
        int n8 = n4;
        int n10 = 1170781710;
        Object object = b30_02;
        Object object2 = b30_02.g(n10);
        UI2 uI22 = UI2.AUTOMATIC;
        Gx gx = Nc$a.e;
        i70$a$e i70$a$e = i70$a.b;
        Hq hq2 = Hq.AUTOMATIC;
        ((j30_0)object2).u(185155711);
        int n14 = n3 & 0x70 ^ 0x30;
        int n15 = 0;
        Object object3 = null;
        int n16 = 32;
        if (n14 > n16 && (n14 = (int)(((j30_0)object2).b(f5) ? 1 : 0)) != 0 || (n14 = n7 & 0x30) == n16) {
            n14 = 1;
        } else {
            n14 = 0;
            object = null;
        }
        Object object4 = ((j30_0)object2).v();
        if (n14 != 0 || object4 == (object = b30$a.a)) {
            object4 = new ib1_0(f6);
            ((j30_0)object2).o(object4);
        }
        Object object5 = object4;
        object5 = (Function0)object4;
        ((j30_0)object2).T(false);
        n14 = n7 & 0x380 | 0x40000008;
        n15 = n7 & 0x1C00;
        n14 |= n15;
        n15 = 0xE000 & n7;
        n14 |= n15;
        n15 = 458752;
        n16 = n7 & n15;
        n14 |= n16;
        n16 = 0x380000;
        int n17 = n7 & n16;
        n14 |= n17;
        n17 = 0x1C00000 & n7;
        n14 |= n17;
        n17 = 0xE000000 & n7;
        int n18 = n14 | n17;
        n14 = n8 & 0x3FE;
        n17 = n8 << 3;
        n15 = n8 << 9 & n16;
        int n19 = (n14 |= (n15 &= n17)) | n15;
        n16 = 0;
        object4 = null;
        n17 = 0;
        boolean bl9 = true;
        boolean bl10 = true;
        int n20 = 24576;
        HB1.b(qB1, (Function0)object5, lP1, false, false, bl9, false, uI22, false, null, gx, i70$a$e, bl10, false, null, hq2, false, (b30_0)object2, n18, n19, n20);
        object3 = ((j30_0)object2).X();
        if (object3 != null) {
            object2 = object;
            Object object6 = object;
            object = qB1;
            f6 = f5;
            CF2 cF2 = object3;
            object3 = lP1;
            n8 = 0;
            ((jb1_0)object2)(qB1, f5, lP1, false, false, bl9, false, uI22, false, null, gx, i70$a$e, bl10, false, hq2, n3, n4);
            object = object2;
            object2 = cF2;
            cF2.d = object6;
        }
    }

    public static final void b(QB1 qB1, Function0 function0, LP1 lP1, boolean n3, boolean bl2, boolean bl3, boolean bl4, UI2 uI2, boolean bl5, zc1_1 zc1_12, Nc nc, i70_0 i70_02, boolean n4, boolean bl6, Map map2, Hq hq, boolean bl7, b30_0 b30_02, int n7, int n8, int n10) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5 = qB1;
        Object object6 = lP1;
        int n14 = n10;
        Object object7 = "progress";
        Intrinsics.checkNotNullParameter(function0, object7);
        float f5 = 3.4047094E-25f;
        Object object8 = b30_02;
        Object object9 = b30_02.g(382909894);
        int n15 = n10 & 8;
        int n16 = n15 != 0 ? 0 : n3;
        n15 = n14 & 0x10;
        boolean bl8 = n15 != 0 ? false : bl2;
        n15 = n14 & 0x20;
        boolean bl9 = n15 != 0 ? true : bl3;
        n15 = n14 & 0x40;
        boolean bl10 = n15 != 0 ? false : bl4;
        n15 = n14 & 0x80;
        if (n15 != 0) {
            object7 = UI2.AUTOMATIC;
            object4 = object7;
        } else {
            object4 = uI2;
        }
        n15 = n14 & 0x100;
        boolean bl11 = n15 != 0 ? false : bl5;
        n15 = n14 & 0x200;
        zc1_1 zc1_13 = n15 != 0 ? null : zc1_12;
        n15 = n14 & 0x400;
        if (n15 != 0) {
            object7 = Nc$a.e;
            object3 = object7;
        } else {
            object3 = nc;
        }
        n15 = n14 & 0x800;
        if (n15 != 0) {
            object7 = i70$a.b;
            object2 = object7;
        } else {
            object2 = i70_02;
        }
        n15 = n14 & 0x1000;
        int n17 = n15 != 0 ? 1 : n4;
        f5 = 4.5918E-41f;
        n15 = 0x8000 & n14;
        if (n15 != 0) {
            object7 = Hq.AUTOMATIC;
            object = object7;
        } else {
            object = hq;
        }
        f5 = 9.1835E-41f;
        n15 = 0x10000 & n14;
        boolean bl12 = n15 != 0 ? false : bl7;
        n15 = 185152185;
        f5 = 2.64234E-32f;
        ((j30_0)object9).u(n15);
        object7 = ((j30_0)object9).v();
        object8 = b30$a.a;
        if (object7 == object8) {
            object7 = new yc1_1();
            ((j30_0)object9).o(object7);
        }
        Object object10 = object7;
        object10 = (yc1_1)((Object)object7);
        ((j30_0)object9).T(false);
        n15 = 185152232;
        f5 = 2.6423538E-32f;
        ((j30_0)object9).u(n15);
        object7 = ((j30_0)object9).v();
        if (object7 == object8) {
            object7 = new Matrix();
            ((j30_0)object9).o(object7);
        }
        Object object11 = object7;
        object11 = (Matrix)object7;
        ((j30_0)object9).T(false);
        f5 = 2.6423773E-32f;
        ((j30_0)object9).u(185152312);
        n15 = ((j30_0)object9).J(object5) ? 1 : 0;
        Object object12 = ((j30_0)object9).v();
        if (n15 != 0 || object12 == object8) {
            object12 = J83.g(null);
            ((j30_0)object9).o(object12);
        }
        Object object13 = object12;
        object13 = (tr1_0)object12;
        ((j30_0)object9).T(false);
        n15 = 185152364;
        f5 = 2.6423926E-32f;
        ((j30_0)object9).u(n15);
        if (object5 != null) {
            f5 = qB1.b();
            object8 = null;
            float f6 = f5 - 0.0f;
            n15 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (n15 == 0) {
            } else {
                Object object14;
                ((j30_0)object9).T(false);
                object8 = ((QB1)object5).k;
                object7 = AndroidCompositionLocals_androidKt.b;
                Object object15 = object7 = ((j30_0)object9).j((H30)object7);
                object15 = (Context)object7;
                n15 = object8.width();
                int n18 = object8.height();
                Intrinsics.checkNotNullParameter(object6, "<this>");
                Object object16 = new LottieAnimationSizeElement(n15, n18);
                Object object17 = object6.then((LP1)object16);
                object7 = object14;
                object12 = object2;
                object16 = object3;
                HB1$b hB1$b = object14;
                object14 = object4;
                LP1 lP12 = object17;
                object17 = object;
                Object object18 = object9;
                object9 = null;
                n14 = n16;
                object7 = new HB1$b((Rect)object8, (i70_0)object2, (Nc)object3, (Matrix)object11, (yc1_1)((Object)object10), bl10, bl12, (UI2)((Object)object4), (Hq)((Object)object), qB1, null, zc1_13, n16 != 0, bl8, bl9, bl11, n17 != 0, false, (Context)object15, function0, (tr1_0)object13);
                object16 = object7;
                object12 = lP12;
                object7 = object18;
                object8 = null;
                AL.a(lP12, hB1$b, (b30_0)object18, 0);
                object5 = ((j30_0)object18).X();
                if (object5 != null) {
                    object7 = object6;
                    object8 = qB1;
                    object12 = function0;
                    object16 = lP1;
                    object9 = object3;
                    n14 = n17;
                    Object object19 = object6;
                    object6 = null;
                    Object object20 = object5;
                    object5 = null;
                    object7 = new HB1$c(qB1, function0, lP1, n16 != 0, bl8, bl9, bl10, (UI2)((Object)object4), bl11, zc1_13, (Nc)object3, (i70_0)object2, n17 != 0, false, null, (Hq)((Object)object), bl12, n7, n8, n10);
                    object8 = object7;
                    object7 = object20;
                    ((CF2)object20).d = object19;
                }
                return;
            }
        }
        object7 = object9;
        object8 = null;
        int n19 = n7 >> 6 & 0xE;
        LP1 lP13 = lP1;
        HA.a(lP1, (b30_0)object9, n19);
        ((j30_0)object9).T(false);
        object5 = ((j30_0)object9).X();
        if (object5 != null) {
            object7 = object6;
            object8 = qB1;
            object12 = function0;
            Object object21 = object4;
            object9 = object3;
            n14 = n17;
            Object object22 = object6;
            object6 = null;
            Object object23 = object5;
            object5 = null;
            object7 = new HB1$a(qB1, function0, lP1, n16 != 0, bl8, bl9, bl10, (UI2)((Object)object4), bl11, zc1_13, (Nc)object3, (i70_0)object2, n17 != 0, false, null, (Hq)((Object)object), bl12, n7, n8, n10);
            object8 = object7;
            object7 = object23;
            ((CF2)object23).d = object22;
        }
    }
}

