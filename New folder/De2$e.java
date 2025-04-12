/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class De2$e
implements gx0_2 {
    public final /* synthetic */ qz1_2 a;
    public final /* synthetic */ SelectedOrderItem b;
    public final /* synthetic */ Ref$ObjectRef c;

    public De2$e(qz1_2 qz1_22, SelectedOrderItem selectedOrderItem, Ref$ObjectRef ref$ObjectRef) {
        this.a = qz1_22;
        this.b = selectedOrderItem;
        this.c = ref$ObjectRef;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            float f5 = -1.04153645E-14f;
            object2.K(-1472487324);
            object = h40_0.a;
            n4 = (int)(h40_0.Z1() ? 1 : 0);
            n3 = 8;
            if (n4 != 0) {
                Object object5;
                float f6;
                object = this.a;
                object4 = this.b;
                Serializable serializable = ((qz1_2)object).s((SelectedOrderItem)object4);
                if (serializable != null) {
                    f6 = serializable.rating;
                    serializable = Float.valueOf(f6);
                } else {
                    object5 = 0;
                    f6 = 0.0f;
                    serializable = null;
                }
                if (serializable != null) {
                    f6 = ((qz1_2)object).r((SelectedOrderItem)object4);
                    int n7 = 584;
                    Ref$ObjectRef ref$ObjectRef = this.c;
                    float f7 = f6 - 0.0f;
                    object5 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
                    if (object5 == 0) {
                        object5 = 1597700428;
                        f6 = 1.3472883E19f;
                        object2.K((int)object5);
                        de2_0.A((qz1_2)object, (b30_0)object2, n3);
                        serializable = (Product)ref$ObjectRef.element;
                        de2_0.B((qz1_2)object, (Product)serializable, (SelectedOrderItem)object4, (b30_0)object2, n7);
                        object2.E();
                    } else {
                        object5 = 1597859396;
                        f6 = 1.364767E19f;
                        object2.K((int)object5);
                        serializable = (Product)ref$ObjectRef.element;
                        de2_0.z((qz1_2)object, (Product)serializable, (SelectedOrderItem)object4, (b30_0)object2, n7);
                        object2.E();
                    }
                }
            }
            object2.E();
            f5 = n3;
            n3 = 6;
            vb2.h(f5, (b30_0)object2, n3);
        }
        return Unit.a;
    }
}

