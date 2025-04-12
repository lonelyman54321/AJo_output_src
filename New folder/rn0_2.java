/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from rN0
 */
public final class rn0_2
implements Function2 {
    public final /* synthetic */ la2_0 a;

    public rn0_2(la2_0 la2_02) {
        this.a = la2_02;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = j.c(LP1$a.b, 1.0f);
            f5 = 8;
            LP1 lP1 = h.e((LP1)object, f5);
            object2 = this.a;
            object = new qn0_2((la2_0)object2);
            n4 = -269413700;
            f5 = -1.4921707E29f;
            u10 u102 = v10.c(n4, (fx0_2)object, (b30_0)object3);
            int n7 = 3078;
            int n8 = 6;
            OA.a(lP1, null, false, u102, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

