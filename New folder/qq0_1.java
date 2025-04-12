/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.g;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QQ0
 */
public final class qq0_1
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;

    public qq0_1(boolean bl2, int n3) {
        this.a = bl2;
        this.b = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
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
            return Unit.a;
        }
        object = LP1$a.b;
        n3 = -16;
        f5 = n3;
        int n7 = 4;
        float f6 = n7;
        LP1 lP1 = g.c((LP1)object, f5, f6);
        n4 = (int)(this.a ? 1 : 0);
        long l2 = n4 != 0 ? nz_1.d : OX.k;
        long l3 = l2;
        long l4 = n4 != 0 ? OX.f : OX.k;
        n3 = this.b;
        object = new pq0_1(n3);
        n3 = -199891528;
        f5 = -4.7504363E31f;
        u10 u102 = v10.c(n3, (fx0_2)object, (b30_0)object4);
        int n8 = 3078;
        Iu.a(lP1, l3, l4, u102, (b30_0)object4, n8, 0);
        return Unit.a;
    }
}

