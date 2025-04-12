/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;

public final class V4 {
    public static String a(CartDeliveryAddress object) {
        Object object2 = "";
        if (object != null) {
            String string2 = ((CartDeliveryAddress)object).getLine1();
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            if (!bl2) {
                object2 = ((CartDeliveryAddress)object).getLine1();
            }
            string2 = ((CartDeliveryAddress)object).getLine2();
            bl2 = TextUtils.isEmpty((CharSequence)string2);
            String string3 = ", ";
            if (!bl2) {
                string2 = ((CartDeliveryAddress)object).getLine2();
                object2 = nb0_0.a((String)object2, string3, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getLandmark())))) {
                string2 = ((CartDeliveryAddress)object).getLandmark();
                object2 = nb0_0.a((String)object2, string3, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getTown())))) {
                string2 = ((CartDeliveryAddress)object).getTown();
                object2 = nb0_0.a((String)object2, string3, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getDistrict())))) {
                string2 = ((CartDeliveryAddress)object).getDistrict();
                object2 = nb0_0.a((String)object2, string3, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getState())))) {
                string2 = ((CartDeliveryAddress)object).getState();
                object2 = nb0_0.a((String)object2, string3, string2);
            }
            if (!(bl2 = TextUtils.isEmpty((CharSequence)(string2 = ((CartDeliveryAddress)object).getPostalCode())))) {
                object = ((CartDeliveryAddress)object).getPostalCode();
                string2 = "-";
                object2 = object = nb0_0.a((String)object2, string2, (String)object);
            }
        }
        return object2;
    }
}

