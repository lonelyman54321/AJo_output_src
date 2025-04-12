/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class Yz2$a {
    public static Yz2 a(int n3, boolean bl2, boolean bl3, Boolean bl4) {
        Yz2 yz2 = new Yz2();
        Bundle bundle = new Bundle();
        String string2 = "VIEW_TYPE";
        bundle.putInt(string2, n3);
        bundle.putBoolean("IS_TAG_MISSING", bl2);
        String string3 = "HIDE_BACK_BUTTON";
        bundle.putBoolean(string3, bl3);
        if (bl4 != null) {
            n3 = (int)(bl4.booleanValue() ? 1 : 0);
        } else {
            n3 = 0;
            string3 = null;
        }
        bundle.putBoolean("extra_tag_Details_submitted", n3 != 0);
        yz2.setArguments(bundle);
        return yz2;
    }
}

