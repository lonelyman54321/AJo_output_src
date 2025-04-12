/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ub2
 */
public final class ub2_1 {
    public static final void a(qz1_2 qz1_22, yT1 yT12, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(qz1_22, "viewModel");
        Intrinsics.checkNotNullParameter(yT12, "navController");
        int n4 = 1953355093;
        object = object.g(n4);
        Object object2 = AndroidCompositionLocals_androidKt.b;
        object2 = ((j30_0)object).j((H30)object2);
        int n7 = object2 instanceof Activity;
        if (n7 != 0) {
            object2 = (Activity)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        boolean bl2 = (Boolean)qz1_22.c.getValue();
        n7 = R$string.order;
        String string2 = nk_0.f((b30_0)object, n7);
        rb2_1 rb2_12 = new rb2_1(yT12);
        sb2_1 sb2_12 = new sb2_1((Activity)object2, qz1_22);
        n4 = 1;
        b7_0 b7_02 = new b7_0(qz1_22, n4);
        object2 = new ub2$a_0(qz1_22, yT12);
        n7 = 1255455550;
        u10 u102 = v10.c(n7, (fx0_2)object2, (b30_0)object);
        int n8 = 196616;
        qf2_0.a(qz1_22, string2, rb2_12, sb2_12, b7_02, u102, (b30_0)object, n8);
        if (bl2) {
            n4 = 0;
            object2 = null;
            qt_0.k((b30_0)object, 0);
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new tb2_1(qz1_22, yT12, n3);
        }
    }
}

