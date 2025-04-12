/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import androidx.navigation.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from jQ0
 */
public final class jq0_2
implements Function2 {
    public final /* synthetic */ fq0_2 a;

    public jq0_2(fq0_2 fq0_22) {
        this.a = fq0_22;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n4 = 0;
            object2 = CT1.b(new p[0], (b30_0)object3);
            Object object4 = this.a;
            ((fq0_2)object4).n = object2;
            ((fq0_2)object4).o = object = CT1.b(new p[0], (b30_0)object3);
            object = j.c;
            long l2 = nz_1.a;
            object2 = fg2_1.a;
            object = androidx.compose.foundation.a.b((LP1)object, l2, (i13)object2);
            object2 = new iq0_2((fq0_2)object4);
            int n7 = -29458187;
            u10 u102 = v10.c(n7, (fx0_2)object2, (b30_0)object3);
            int n8 = 0x180000;
            int n10 = 58;
            long l3 = 0L;
            object4 = object;
            jg3_0.a((LP1)object, null, l2, l3, null, 0.0f, u102, (b30_0)object3, n8, n10);
        }
        return Unit.a;
    }
}

