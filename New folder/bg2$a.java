/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;

public final class bg2$a {
    public static bg2_1 a(bg2$a object, String string2, String string3, String string4, String string5, boolean bl2, boolean bl3, int n3) {
        boolean bl4;
        int n4 = n3 & 4;
        if (n4 != 0) {
            bl4 = false;
            string4 = null;
        }
        if ((n4 = n3 & 8) != 0) {
            string5 = null;
        }
        if ((n4 = n3 & 0x10) != 0) {
            bl2 = false;
        }
        if ((n3 &= 0x20) != 0) {
            bl3 = false;
        }
        object.getClass();
        object = new bg2_1();
        String string6 = "order_detail_code";
        String string7 = "exchange_id";
        string2 = px1_2.b(string6, string2, string7, string4);
        string4 = "RETURN_ID";
        string2.putString(string4, string5);
        bl4 = TextUtils.isEmpty((CharSequence)string3);
        if (!bl4) {
            string4 = "clicked_item_code";
            string2.putString(string4, string3);
        }
        string2.putBoolean("is_from_customer_care_page", bl2);
        string2.putBoolean("IS_RETURN_ID_REDIRECTION", bl3);
        ((Fragment)object).setArguments((Bundle)string2);
        return object;
    }
}

