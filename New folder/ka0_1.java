/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.bonanza.model.CouponBonanzaBenefits;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from ka0
 */
public final class ka0_1 {
    public static final void a(LP1 lP1, String string2, String string3, int n3, b30_0 b30_02, int n4) {
        Object object;
        Object object2;
        int n7;
        String string4 = string2;
        String string5 = string3;
        int n8 = n3;
        int n10 = n4;
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(string2, "step");
        Object object3 = "desc";
        Intrinsics.checkNotNullParameter(string3, (String)object3);
        Object object4 = b30_02;
        j30_0 j30_02 = b30_02.g(1102204839);
        int n14 = n4 & 0xE;
        if (n14 == 0) {
            n14 = (int)(j30_02.J(lP1) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n10;
        } else {
            n14 = n4;
        }
        int n15 = n10 & 0x70;
        if (n15 == 0) {
            n15 = (int)(j30_02.J(string4) ? 1 : 0);
            n15 = n15 != 0 ? 32 : 16;
            n14 |= n15;
        }
        if ((n15 = n10 & 0x380) == 0) {
            n15 = (int)(j30_02.J(string5) ? 1 : 0);
            n15 = n15 != 0 ? 256 : 128;
            n14 |= n15;
        }
        if ((n15 = n10 & 0x1C00) == 0) {
            n15 = (int)(j30_02.c(n8) ? 1 : 0);
            n15 = n15 != 0 ? 2048 : 1024;
            n14 |= n15;
        }
        if ((n15 = n14 & 0x16DB) == (n7 = 1170) && (n15 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            float f5 = 8;
            object4 = new ka0$a(n8, string4, string5);
            n7 = 2128105188;
            object2 = v10.c(n7, (fx0_2)object4, j30_02);
            int n16 = (n14 &= 0xE) | 0x1B0000;
            long l2 = 0L;
            n15 = 0;
            object4 = null;
            int n17 = 30;
            object3 = lP1;
            object = j30_02;
            JL.a(lP1, null, l2, null, f5, (u10)object2, j30_02, n16, n17);
        }
        object2 = j30_02.X();
        if (object2 != null) {
            object3 = object;
            object4 = lP1;
            object = new ja0_1(lP1, string2, string3, n3, n4);
            ((CF2)object2).d = object;
        }
    }

    public static final void b(ob0_1 ob0_12, b30_0 b30_02, int n3) {
        int n4 = 1;
        Intrinsics.checkNotNullParameter(ob0_12, "viewModel");
        int n7 = -1172013804;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(n7);
        object = LP1$a.b;
        float f5 = 8;
        object = c.a(h.e((LP1)object, f5), 0.9f);
        ob0_12.getClass();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n8 = R$string.step_1_str;
        Application application = ob0_12.a;
        String string2 = application.getString(n8);
        String string3 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        Object object2 = StringCompanionObject.INSTANCE;
        int n10 = R$string.step_1_desc;
        object2 = application.getString(n10);
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        z40_0.Companion.getClass();
        String string4 = z40$a.a((Context)application).a.b("coupon_bonanza_coin_balance");
        Object[] objectArray = new Object[n4];
        objectArray[0] = string4;
        Object object3 = xh2_0.a(objectArray, n4, (String)object2, "format(...)");
        n10 = R$drawable.ic_step_1;
        Object object4 = new CouponBonanzaBenefits(string2, (String)object3, n10);
        arrayList.add(object4);
        int n14 = R$string.step_2_str;
        object4 = application.getString(n14);
        Intrinsics.checkNotNullExpressionValue(object4, string3);
        n8 = R$string.step_2_desc;
        string2 = application.getString(n8);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        n10 = R$drawable.ic_step_2;
        object3 = new CouponBonanzaBenefits((String)object4, string2, n10);
        arrayList.add(object3);
        n14 = R$string.step_3_str;
        object4 = application.getString(n14);
        Intrinsics.checkNotNullExpressionValue(object4, string3);
        n8 = R$string.step_3_desc;
        string2 = application.getString(n8);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        n10 = R$drawable.ic_step_3;
        object3 = new CouponBonanzaBenefits((String)object4, string2, n10);
        arrayList.add(object3);
        n14 = R$string.step_4_str;
        object4 = application.getString(n14);
        Intrinsics.checkNotNullExpressionValue(object4, string3);
        n8 = R$string.step_4_desc;
        string2 = application.getString(n8);
        Intrinsics.checkNotNullExpressionValue(string2, string3);
        int n15 = R$drawable.ic_step_4;
        object3 = new CouponBonanzaBenefits((String)object4, string2, n15);
        arrayList.add(object3);
        object3 = new G11$a(2);
        ha0_1 ha0_12 = new ha0_1(0, arrayList, object);
        string4 = null;
        objectArray = null;
        f5 = 0.0f;
        arrayList = null;
        n14 = 0;
        object4 = null;
        n8 = 0;
        string2 = null;
        n15 = 0;
        application = null;
        string3 = null;
        n10 = 0;
        object2 = null;
        int n16 = 510;
        object = object3;
        Cq1.a((G11$a)object3, null, null, null, false, null, null, null, false, ha0_12, j30_02, 0, n16);
        CF2 cF2 = j30_02.X();
        if (cF2 != null) {
            n7 = n3;
            cF2.d = object3 = new ia0_1(ob0_12, n3);
        }
    }
}

