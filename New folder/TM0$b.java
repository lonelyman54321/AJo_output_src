/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class TM0$b
implements gx0_2 {
    public final /* synthetic */ OO2 a;

    public TM0$b(OO2 oO2) {
        this.a = oO2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$OutlinedButton";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            object4 = this;
        } else {
            object4 = this;
            object6 = this.a;
            object7 = ((OO2)object6).a;
            Object object8 = Boolean.TRUE;
            object6 = ((OO2)object6).b;
            n3 = (int)(Intrinsics.areEqual(object6, object8) ? 1 : 0);
            long l2 = n3 != 0 ? OX.f : xx_1.e;
            tv0_0 tv0_02 = tv0_0.m;
            long l3 = Em3.f(12);
            int n7 = 27648;
            int n8 = 97;
            long l4 = 0L;
            mm3_0.a(null, (String)object7, l2, tv0_02, l3, null, l4, (b30_0)object5, n7, n8);
            n3 = R$drawable.gold_star_small;
            object6 = km2.a(n3, (b30_0)object5, 0);
            object7 = LP1$a.b;
            int n10 = 4;
            float f5 = n10;
            object8 = h.i((LP1)object7, f5, 0.0f, 0.0f, 0.0f, 14);
            int n14 = 440;
            int n15 = 120;
            object7 = "";
            tv0_02 = null;
            Pd1.a((im2)object6, (String)object7, (LP1)object8, null, null, 0.0f, null, (b30_0)object5, n14, n15);
        }
        return Unit.a;
    }
}

