/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class S10$a
implements gx0_2 {
    public static final S10$a a;

    static {
        S10$a s10$a;
        a = s10$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        String string2 = "$this$OutlinedButton";
        Intrinsics.checkNotNullParameter(object4, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            object4 = AndroidCompositionLocals_androidKt.b;
            object4 = ((Context)object5.j((H30)object4)).getResources();
            n3 = R$string.reset;
            string2 = object4.getString(n3);
            object4 = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object4);
            long l2 = xx_1.e;
            n4 = 14;
            long l3 = Em3.f(n4);
            int n7 = 24960;
            int n8 = 105;
            n3 = 0;
            object6 = null;
            long l4 = 0L;
            mm3_0.a(null, string2, l2, null, l3, null, l4, (b30_0)object5, n7, n8);
        }
        return Unit.a;
    }
}

