/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jd3
 */
public final class jd3_1 {
    public static final jd3$a_0 a;
    public static volatile jd3_1 b;

    static {
        jd3$a_0 jd3$a_0;
        a = jd3$a_0 = new Object();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "deviceId");
        String string4 = "accountId";
        Intrinsics.checkNotNullParameter(string3, string4);
        int n4 = 1;
        char c2 = ':';
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                String string5;
                int n7 = 3;
                string4 = "WizRocket";
                if (n3 == n7) return string4;
                n7 = 4;
                if (n3 != n7) {
                    n7 = 5;
                    if (n3 != n7) return string4;
                    string5 = "ct_files:";
                    return kp1_0.c(string5, string3);
                }
                string5 = "inapp_assets:";
                return kp1_0.c(string5, string3);
            }
            StringBuilder stringBuilder = new StringBuilder("counts_per_inapp:");
            stringBuilder.append(string2);
            stringBuilder.append(c2);
            stringBuilder.append(string3);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder("inApp:");
        stringBuilder.append(string2);
        stringBuilder.append(c2);
        stringBuilder.append(string3);
        return stringBuilder.toString();
    }

    public static /* synthetic */ String b(int n3, int n4, String string2) {
        String string3 = "";
        if ((n4 &= 4) != 0) {
            string2 = string3;
        }
        return jd3_1.a(n3, string3, string2);
    }

    public static vi_2 c(Context context, String string2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "prefName");
        vi_2 vi_22 = new vi_2(context, string2);
        return vi_22;
    }

    public static rg1_2 d(Context object, ae0_1 ae0_12, String string2, String object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(ae0_12, "cryptHandler");
        Intrinsics.checkNotNullParameter(string2, "deviceId");
        Intrinsics.checkNotNullParameter(object2, "accountId");
        string2 = jd3_1.a(1, string2, (String)object2);
        object = jd3_1.c(object, string2);
        object2 = new rg1_2((vi_2)object, ae0_12);
        return object2;
    }
}

