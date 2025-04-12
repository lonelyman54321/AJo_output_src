/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Sc2
 */
public final class sc2_1
implements Function2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Function0 d;

    public sc2_1(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, md2_2 md2_22, nb_1 nb_12) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
        this.c = md2_22;
        this.d = nb_12;
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
            object2 = (md2_2)this.c;
            nb_1 nb_12 = (nb_1)this.d;
            qz1_2 qz1_22 = this.a;
            Object object4 = this.b;
            object = new rc2_0(qz1_22, (SelectedOrderItem)object4, (md2_2)object2, nb_12);
            n4 = -802658728;
            f5 = -1.1301118E10f;
            object4 = v10.c(n4, (fx0_2)object, (b30_0)object3);
            int n7 = 3078;
            int n8 = 6;
            nb_12 = null;
            qz1_22 = null;
            OA.a(lP1, null, false, (u10)object4, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

