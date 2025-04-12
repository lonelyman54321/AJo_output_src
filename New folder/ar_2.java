/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aR
 */
public final class ar_2 {
    public final CartOrder a;

    public ar_2(CartOrder cartOrder) {
        this.a = cartOrder;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ar_2;
        if (!bl3) {
            return false;
        }
        object = (ar_2)object;
        CartOrder cartOrder = this.a;
        object = ((ar_2)object).a;
        boolean bl4 = Intrinsics.areEqual(cartOrder, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        CartOrder cartOrder = this.a;
        if (cartOrder == null) {
            n3 = 0;
            cartOrder = null;
        } else {
            n3 = cartOrder.hashCode();
        }
        return n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CcItemListData(cartOrder=");
        CartOrder cartOrder = this.a;
        stringBuilder.append(cartOrder);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

