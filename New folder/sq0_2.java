/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SQ0
 */
public final class sq0_2
implements gx0_2 {
    public final /* synthetic */ boolean a;

    public sq0_2(boolean bl2) {
        this.a = bl2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (KA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BadgedBox";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            object = LP1$a.b;
            f5 = 10;
            object = j.h((LP1)object, f5);
            n3 = -7;
            f5 = n3;
            int n7 = 4;
            float f6 = n7;
            LP1 lP1 = g.c((LP1)object, f5, f6);
            n4 = (int)(this.a ? 1 : 0);
            long l2 = n4 != 0 ? nz_1.d : OX.k;
            u10 u102 = u10_0.a;
            long l3 = 0L;
            int n8 = 3078;
            int n10 = 4;
            Iu.a(lP1, l2, l3, u102, (b30_0)object4, n8, n10);
        }
        return Unit.a;
    }
}

