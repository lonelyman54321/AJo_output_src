/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from xc2
 */
public final class xc2_1
implements Function2 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ Ref$IntRef b;

    public xc2_1(CartOrder cartOrder, Ref$IntRef ref$IntRef) {
        this.a = cartOrder;
        this.b = ref$IntRef;
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
            object2 = this.a;
            Ref$IntRef ref$IntRef = this.b;
            object = new wc2_1((CartOrder)object2, ref$IntRef);
            n4 = -1535177871;
            f5 = -5.5304002E-17f;
            u10 u102 = v10.c(n4, (fx0_2)object, (b30_0)object3);
            int n7 = 3078;
            int n8 = 6;
            ref$IntRef = null;
            OA.a(lP1, null, false, u102, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

