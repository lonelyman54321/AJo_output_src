/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from gd2
 */
public final class gd2_1
implements Function2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ String c;

    public gd2_1(o8_0 o8_02, n8_0 n8_02, String string2) {
        this.a = o8_02;
        this.b = n8_02;
        this.c = string2;
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
            object = LP1$a.b;
            f5 = 16;
            LP1 lP1 = j.c(h.e((LP1)object, f5), 1.0f);
            object2 = (o8_0)this.a;
            n8_0 n8_02 = (n8_0)this.b;
            String string2 = this.c;
            object = new fd2_2((o8_0)object2, n8_02, string2);
            n4 = 785414441;
            f5 = 9.480267E-11f;
            u10 u102 = v10.c(n4, (fx0_2)object, (b30_0)object3);
            int n7 = 3078;
            int n8 = 6;
            n8_02 = null;
            string2 = null;
            OA.a(lP1, null, false, u102, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

