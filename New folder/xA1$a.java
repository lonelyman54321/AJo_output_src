/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class xA1$a {
    public static xA1 a(String string2, String string3, String string4, String string5, boolean bl2) {
        String string6 = "param1";
        Intrinsics.checkNotNullParameter(string2, string6);
        String string7 = "param2";
        Intrinsics.checkNotNullParameter(string3, string7);
        xA1 xA12 = new xA1();
        string2 = px1_2.b(string6, string2, string7, string3);
        if (string4 != null) {
            string3 = "param3";
            string2.putString(string3, string4);
        }
        string2.putBoolean("ISINPUTMOBILENUMBER", bl2);
        string2.putString("INPUT_MOBILE_EMAILID", string5);
        xA12.setArguments((Bundle)string2);
        return xA12;
    }
}

