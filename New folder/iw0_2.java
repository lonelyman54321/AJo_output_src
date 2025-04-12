/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from iW0
 */
public final class iw0_2 {
    public static final void a(FragmentManager fragmentManager, LP1 lP1, Function2 function2, b30_0 object, int n3) {
        int n4;
        int n7 = 1;
        fw0_1 fw0_12 = null;
        Intrinsics.checkNotNullParameter(function2, "fragentContainerFunc");
        int n8 = 1598284940;
        object = object.g(n8);
        Object object2 = AndroidCompositionLocals_androidKt.f;
        object2 = (View)((j30_0)object).j((H30)object2);
        Object object3 = new Object[]{};
        Object object4 = new dw0_2(0);
        int n10 = 6;
        int n14 = 3080;
        object3 = (tr1_0)wi2_0.b((Object[])object3, null, (Function0)object4, (b30_0)object, n14, n10);
        int n15 = -1548017788;
        ((j30_0)object).K(n15);
        Object object5 = ((j30_0)object).v();
        b30$a$a b30$a$a = b30$a.a;
        if (object5 == b30$a$a) {
            n15 = 0;
            object5 = J83.g(null);
            ((j30_0)object).o(object5);
        }
        Object object6 = object5;
        object6 = (tr1_0)object5;
        ((j30_0)object).T(false);
        object5 = (Number)object3.getValue();
        long l2 = ((Number)object5).longValue();
        p50_0.d = n4 = (int)l2;
        p50_0.e = n7;
        ((j30_0)object).K(-1548012370);
        n15 = (int)(((j30_0)object).J(object2) ? 1 : 0);
        object4 = ((j30_0)object).v();
        if (n15 != 0 || object4 == b30$a$a) {
            object4 = new ew0_2((tr1_0)object6, fragmentManager, function2, (tr1_0)object3);
            ((j30_0)object).o(object4);
        }
        object3 = object4;
        object3 = (Function1)object4;
        ((j30_0)object).T(false);
        object4 = new mt0_1(n7);
        n14 = n3 & 0x70 | 0x180;
        n10 = 0;
        object5 = lP1;
        b.a((Function1)object3, lP1, (Function1)object4, (b30_0)object, n14, 0);
        Object object7 = AndroidCompositionLocals_androidKt.b;
        object7 = (Context)((j30_0)object).j((H30)object7);
        fw0_12 = new fw0_1(fragmentManager, (tr1_0)object6);
        object3 = ly0_0.a;
        n8 = (int)(((j30_0)object).J(object2) ? 1 : 0);
        n7 = ((j30_0)object).J(object7) | n8;
        n8 = (int)(((j30_0)object).J(object6) ? 1 : 0);
        object2 = ((j30_0)object).v();
        if ((n7 |= n8) != 0 || object2 == b30$a$a) {
            object2 = new br0_0(fw0_12);
            ((j30_0)object).o(object2);
        }
        object2 = (br0_0)object2;
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object7 = new gw0_2(fragmentManager, lP1, function2, n3);
        }
    }
}

