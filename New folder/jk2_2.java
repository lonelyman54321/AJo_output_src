/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jk2
 */
public final class jk2_2
implements gx0_2 {
    public final /* synthetic */ la2_0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;

    public jk2_2(la2_0 la2_02, fe2_1 fe2_12, String string2) {
        this.a = la2_02;
        this.b = fe2_12;
        this.c = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            LP1 lP1 = j.c(LP1$a.b, 1.0f);
            object2 = (fe2_1)this.b;
            object3 = this.a;
            String string2 = this.c;
            object = new ik2_1((la2_0)object3, (fe2_1)object2, string2);
            n3 = 205095213;
            u10 u102 = v10.c(n3, (fx0_2)object, (b30_0)object4);
            int n7 = 1572870;
            int n8 = 62;
            string2 = null;
            long l2 = 0L;
            JL.a(lP1, null, l2, null, 0.0f, u102, (b30_0)object4, n7, n8);
        }
        return Unit.a;
    }
}

