/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.user.UserInformation;

/*
 * Renamed from aP
 */
public final class ap_0 {
    public static final UserInformation a;
    public static final jo_2 b;
    public static String c;

    static {
        jo_2 jo_22;
        a = VX0.a(AJIOApplication.Companion);
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        b = jo_22 = new jo_2((Context)aJIOApplication);
    }

    public static String a(boolean bl2) {
        String string2 = bl2 ? c : a.getGuId();
        return string2;
    }

    public static boolean b() {
        int n3;
        String string2 = c;
        if (string2 != null && (n3 = string2.length()) != 0) {
            string2 = c;
        } else {
            jo_2 jo_22 = b;
            String string3 = "cart_id";
            string2 = jo_22.getPreference(string3, "");
        }
        int n4 = 1;
        if (string2 != null && (n3 = string2.length()) != 0) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = 1;
        }
        return (n3 ^ n4) != 0;
    }

    public static boolean c() {
        int n3;
        String string2 = a.getGuId();
        int n4 = 1;
        if (string2 != null && (n3 = string2.length()) != 0) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = 1;
        }
        return (n3 ^ n4) != 0;
    }
}

