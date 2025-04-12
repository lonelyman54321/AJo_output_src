/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Rg0 {
    public static final void a(int n3, b30_0 object, yi2_1 yi2_12, hd2_0 hd2_02) {
        Object object2 = "rateReviewsClick";
        Intrinsics.checkNotNullParameter(hd2_02, (String)object2);
        object = object.g(-357624465);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(((j30_0)object).J(yi2_12) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n3;
        } else {
            n4 = n3;
        }
        int n7 = n3 & 0x70;
        if (n7 == 0) {
            n7 = (int)(((j30_0)object).J(hd2_02) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n4 &= 0x5B) == (n7 = 18) && (n4 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            object2 = bg0_2.a;
            zg0_2 zg0_22 = new zg0_2(yi2_12, hd2_02);
            Aj.a((gx0_2)object2, null, zg0_22, (b30_0)object, 0);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new ag0_1(n3, yi2_12, hd2_02);
        }
    }

    public static final void b(yh0_0 yh0_02, yi2_1 yi2_12, hd2_0 hd2_02, Function0 function0, pg0_1 pg0_12, b30_0 b30_02, int n3) {
        xg0_1 xg0_12;
        yh0_0 yh0_03 = yh0_02;
        Intrinsics.checkNotNullParameter(yh0_02, "viewModel");
        Intrinsics.checkNotNullParameter(hd2_02, "rateReviewsClick");
        Intrinsics.checkNotNullParameter(pg0_12, "imgClicked");
        float f5 = -2.9066986E34f;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(-122477666);
        rz3_0.Companion.getClass();
        Object object2 = Rz3$a.d(yi2_12);
        object2 = yh0_02.c((String)object2);
        object = Boolean.FALSE;
        object = qt1.a(yh0_02.d((HashMap)object2, (Boolean)object), j30_02);
        object2 = (Boolean)yh0_02.i.getValue();
        boolean bl2 = (Boolean)object2;
        if (!bl2 && !(bl2 = ((Boolean)(object2 = (Boolean)yh0_02.h.getValue())).booleanValue())) {
            bl2 = false;
            f5 = 0.0f;
            object2 = null;
        } else {
            bl2 = true;
            f5 = Float.MIN_VALUE;
        }
        object2 = bl2;
        Object object3 = new cg0_2(yh0_03, yi2_12, null);
        ly0_0.d(j30_02, object2, (Function2)object3);
        f5 = 40;
        int n4 = 7;
        nk2_0 nk2_02 = h.a(0.0f, 0.0f, f5, n4);
        object2 = xg0_12;
        object3 = yi2_12;
        xg0_12 = new xg0_1((lt1)object, yi2_12, hd2_02, function0, pg0_12, yh0_02);
        yg0_1 yg0_12 = null;
        bl2 = false;
        f5 = 0.0f;
        object = null;
        int n7 = 384;
        int n8 = 251;
        object2 = j30_02;
        j30_02 = null;
        xq1_0.a(null, null, nk2_02, false, null, null, null, false, xg0_12, (b30_0)object2, n7, n8);
        CF2 cF2 = ((j30_0)object2).X();
        if (cF2 != null) {
            object2 = yg0_12;
            object = yh0_02;
            yg0_12 = new yg0_1(yh0_02, yi2_12, hd2_02, function0, pg0_12, n3);
            cF2.d = yg0_12;
        }
    }

    public static final void c(ah0_1 ah0_12, yh0_0 yh0_02, yi2_1 yi2_12, hd2_0 hd2_02, Function0 function0, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(ah0_12, "onClick");
        Intrinsics.checkNotNullParameter(yh0_02, "viewModel");
        Intrinsics.checkNotNullParameter(hd2_02, "rateReviewsClick");
        int n4 = -267664351;
        Object object = b30_02;
        Object object2 = b30_02.g(n4);
        object = new lg0_0(ah0_12);
        Object object3 = v10.c(-1055495962, (fx0_2)object, (b30_0)object2);
        object = new og0_1(ah0_12, yh0_02);
        Function2 function2 = v10.c(-2095787801, (fx0_2)object, (b30_0)object2);
        object = new qg0_1(yh0_02, yi2_12, hd2_02, function0);
        u10 u102 = v10.c(1954784479, (fx0_2)object, (b30_0)object2);
        long l2 = 0L;
        int n7 = 3456;
        object = null;
        long l3 = 0L;
        long l4 = 0L;
        long l7 = 0L;
        long l8 = 0L;
        int n8 = 0xC00000;
        int n10 = 131059;
        HS2.a(null, null, (Function2)object3, function2, null, null, 0, false, null, false, null, 0.0f, l3, l4, l7, l8, l2, u102, (b30_0)object2, n7, n8, n10);
        object3 = ((j30_0)object2).X();
        if (object3 != null) {
            object2 = function2;
            object = yi2_12;
            function2 = new wg0_1(ah0_12, yh0_02, yi2_12, hd2_02, function0, n3);
            ((CF2)object3).d = function2;
        }
    }
}

