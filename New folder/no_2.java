/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.orderhistory.OrderItemLine;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nO
 */
public final class no_2 {
    public static final String a(OrderItemLine orderItemLine) {
        Intrinsics.checkNotNullParameter(orderItemLine, "<this>");
        String string2 = orderItemLine.getNewDisplayStatus();
        if (string2 == null && (string2 = orderItemLine.getDisplayStatus()) == null) {
            string2 = "";
        }
        return string2;
    }

    public static final String b(CartEntry cartEntry) {
        Intrinsics.checkNotNullParameter(cartEntry, "<this>");
        String string2 = cartEntry.getNewEntryStatus();
        if (string2 == null && (string2 = cartEntry.getEntryStatus()) == null) {
            string2 = "";
        }
        return string2;
    }

    public static final String c(CartOrder cartOrder) {
        Intrinsics.checkNotNullParameter(cartOrder, "<this>");
        String string2 = cartOrder.getNewOrderStatus();
        if (string2 == null && (string2 = cartOrder.getOrderStatus()) == null) {
            string2 = "";
        }
        return string2;
    }

    public static final String d(OrderItemLine orderItemLine) {
        Intrinsics.checkNotNullParameter(orderItemLine, "<this>");
        String string2 = orderItemLine.getNewStatus();
        if (string2 == null && (string2 = orderItemLine.getStatus()) == null) {
            string2 = "";
        }
        return string2;
    }

    public static final String e(OrderItemLine orderItemLine) {
        Intrinsics.checkNotNullParameter(orderItemLine, "<this>");
        String string2 = orderItemLine.getNewStatusDescription();
        if (string2 == null && (string2 = orderItemLine.getStatusDescription()) == null) {
            string2 = "";
        }
        return string2;
    }

    public static final String f(CartOrder cartOrder) {
        Intrinsics.checkNotNullParameter(cartOrder, "<this>");
        String string2 = cartOrder.getNewStatusDisplay();
        if (string2 == null && (string2 = cartOrder.getStatusDisplay()) == null) {
            string2 = "";
        }
        return string2;
    }

    public static final String g(OrderItemLine orderItemLine) {
        Intrinsics.checkNotNullParameter(orderItemLine, "<this>");
        String string2 = orderItemLine.getNewStatusLongDescription();
        if (string2 == null && (string2 = orderItemLine.getStatusLongDescription()) == null) {
            string2 = "";
        }
        return string2;
    }

    public static final boolean h(CartOrder object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("enable_order_cancelltaion_reasons");
    }

    public static final boolean i(OrderItemLine object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("enable_order_cancelltaion_reasons");
    }
}

