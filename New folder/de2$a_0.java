/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from De2$a
 */
public final class de2$a_0
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public de2$a_0(String string2, String string3, String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            LP1$a lP1$a = LP1$a.b;
            n4 = 16;
            float f5 = n4;
            int n7 = 2;
            LP1 lP1 = h.i(lP1$a, f5, 0.0f, f5, f5, n7);
            object2 = this.a;
            String string2 = this.b;
            String string3 = this.c;
            object = new ce2_0((String)object2, string2, string3);
            n3 = -287867665;
            u10 u102 = v10.c(n3, (fx0_2)object, (b30_0)object3);
            int n8 = 3078;
            int n10 = 6;
            string2 = null;
            string3 = null;
            OA.a(lP1, null, false, u102, (b30_0)object3, n8, n10);
        }
        return Unit.a;
    }
}

