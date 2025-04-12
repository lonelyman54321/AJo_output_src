/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from sc2
 */
public final class sc2_2
implements gx0_2 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ List b;
    public final /* synthetic */ CartOrder c;

    public sc2_2(Ref$IntRef ref$IntRef, ArrayList arrayList, CartOrder cartOrder) {
        this.a = ref$IntRef;
        this.b = arrayList;
        this.c = cartOrder;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            int n7;
            object = this.a;
            n3 = ((Ref$IntRef)object).element;
            ((Ref$IntRef)object).element = n7 = n3 + 1;
            String string2 = this.c.getCode();
            object = "getCode(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            String string3 = "";
            int n8 = 70;
            List list = this.b;
            jd2_1.d(string3, list, n7, string2, false, (b30_0)object4, n8);
        }
        return Unit.a;
    }
}

