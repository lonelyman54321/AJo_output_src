/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.focus.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from lf2
 */
public final class lf2_2
implements Function2 {
    public final /* synthetic */ ou0_0 a;
    public final /* synthetic */ qz1_2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;

    public lf2_2(ou0_0 ou0_02, qz1_2 qz1_22, String string2, sb2_1 sb2_12, b7_0 b7_02, rb2_1 rb2_12) {
        this.a = ou0_02;
        this.b = qz1_22;
        this.c = string2;
        this.d = sb2_12;
        this.e = b7_02;
        this.f = rb2_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = LP1$a.b;
            Object object4 = this.a;
            object = FocusableKt.b(androidx.compose.ui.focus.c.a((LP1)object, (ou0_0)object4), true, n3);
            object4 = this.b;
            object2 = new if2_2(object4, 0);
            LP1 lP1 = CY2.b((LP1)object, false, (Function1)object2);
            long l2 = OX.f;
            n4 = 12;
            float f5 = n4;
            sb2_1 sb2_12 = (sb2_1)this.d;
            b7_0 b7_02 = (b7_0)this.e;
            String string2 = this.c;
            object2 = new jf2_2((qz1_2)object4, string2, sb2_12, b7_02);
            u10 u102 = v10.c(-789671729, (fx0_2)object2, (b30_0)object3);
            object4 = (rb2_1)this.f;
            object2 = new kf2_2((rb2_1)object4);
            int n7 = -241131507;
            u10 u103 = v10.c(n7, (fx0_2)object2, (b30_0)object3);
            int n8 = 0x186186;
            int n10 = 40;
            long l3 = 0L;
            Km.c(f5, n8, n10, l2, l3, u102, (b30_0)object3, null, lP1, u103);
        }
        return Unit.a;
    }
}

