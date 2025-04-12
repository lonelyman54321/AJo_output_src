/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class Nc3$a {
    public static nc3_2 a(String string2, String string3, String string4, String string5, boolean bl2, boolean bl3) {
        nc3_2 nc3_22 = new nc3_2();
        Bundle bundle = new Bundle();
        if (string2 == null) {
            string2 = "Select A Store";
        }
        String string6 = "data_header_title";
        bundle.putString(string6, string2);
        if (string3 == null) {
            string3 = "Tap on any of the options and start shopping";
        }
        bundle.putString("data_header_sub_title", string3);
        bundle.putBoolean("is_from_fleek", bl2);
        bundle.putBoolean("is_interstitial", bl3);
        bundle.putString("data_akamai_personalisation", string4);
        bundle.putString("data_current_experience", string5);
        nc3_22.setArguments(bundle);
        return nc3_22;
    }
}

