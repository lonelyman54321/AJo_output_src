/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from rW
 */
public final class rw_1 {
    public static void a(int n3, String string2) {
        int n4;
        String string3 = "format(...)";
        int n7 = 1;
        if (string2 != null && (n4 = string2.length()) != 0) {
            Object object = StringCompanionObject.INSTANCE;
            n3 = R$string.acc_alert_message;
            object = hv3_0.K(n3);
            Object[] objectArray = new Object[n7];
            objectArray[0] = string2;
            object = xh2_0.a(objectArray, n7, (String)object, string3);
            hv3_0.o0(0, string2, (String)object);
        } else {
            int n8;
            n3 = n3 != n7 ? (n3 != (n8 = 2) ? (n3 != (n8 = 3) ? (n3 != (n8 = 4) ? (n3 != (n8 = 5) ? R$string.something_wrong_msg : R$string.remove_wish_list_alert) : R$string.removed_wishlist_refresh) : R$string.wishlist_success) : R$string.wishlist_already_part) : R$string.wishlist_error;
            string2 = hv3_0.K(n3);
            Object object = StringCompanionObject.INSTANCE;
            n4 = R$string.acc_alert_message;
            object = hv3_0.K(n4);
            String string4 = hv3_0.K(n3);
            Object[] objectArray = new Object[n7];
            objectArray[0] = string4;
            string4 = xh2_0.a(objectArray, n7, (String)object, string3);
            hv3_0.o0(0, string2, string4);
        }
    }
}

