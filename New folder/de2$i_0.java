/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from De2$i
 */
public final class de2$i_0
implements gx0_2 {
    public final /* synthetic */ CartDeliveryAddress a;
    public final /* synthetic */ qz1_2 b;

    public de2$i_0(CartDeliveryAddress cartDeliveryAddress, qz1_2 qz1_22) {
        this.a = cartDeliveryAddress;
        this.b = qz1_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$item";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = this.a;
            if (object == null || (object3 = ((CartDeliveryAddress)object).getPhone()) == null) {
                object3 = "NA";
            }
            if (object != null) {
                this.b.getClass();
                string2 = qz1_2.m((CartDeliveryAddress)object);
                object = V4.a((CartDeliveryAddress)object);
                de2_0.g(string2, (String)object, (String)object3, (b30_0)object2, 0);
                n4 = 8;
                float f5 = n4;
                n3 = 6;
                vb2.h(f5, (b30_0)object2, n3);
            }
        }
        return Unit.a;
    }
}

